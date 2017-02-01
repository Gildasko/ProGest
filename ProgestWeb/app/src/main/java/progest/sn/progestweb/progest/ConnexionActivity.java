package progest.sn.progestweb.progest;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import progest.sn.progestweb.*;
import progest.sn.progestweb.entity.Utilisateur;
import progest.sn.progestweb.webmethod.WebMethod;
import retrofit.RestAdapter;

public class ConnexionActivity extends AppCompatActivity {

    private Button connecter;

    private String email, password;

    private WebMethod webMethod;

    private Utilisateur utilisateur;

    private Intent intent;

    private ImageView logoConnexion;

    private RestAdapter restAdapter;

    private final static String sleep = "1000";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        logoConnexion = (ImageView) findViewById(R.id.logoConnexion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Picasso
                .with(ConnexionActivity.this)
                .load(R.mipmap.ic_launcher)

                .into(logoConnexion);


        if(recupererComposant())
        {   intent = new Intent();
            restAdapter = new RestAdapter.Builder().setEndpoint(webMethod.weblien).build();
            webMethod = restAdapter.create(WebMethod.class);

            connecter.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick (View v){

                    if(!verifierDonneeComposantEstVide())
                    {

                        connecter();

                    }
                    else
                    {
                        Toast.makeText(ConnexionActivity.this,"Veuillez saisir les informations d'identification",Toast.LENGTH_SHORT).show();

                    }


                }


            });

        }


    }


    public  void connecter()
    {

        GetUtilisateurbyWebService getUtilisateurbyWebService = new GetUtilisateurbyWebService();
        getUtilisateurbyWebService.execute(sleep);

    }

    public Boolean recupererComposant() {
        try {

            connecter= (Button)findViewById(R.id.connecter);
            return true;
        } catch (Exception e) {

            return false;
        }
    }


    public Boolean verifierDonneeComposantEstVide() {
        email = ((EditText)findViewById(R.id.email)).getText().toString().trim();
        password =((EditText)findViewById(R.id.password)).getText().toString().trim();
        return (email.isEmpty()  || password.isEmpty() ? true : false);

    }


    private class GetUtilisateurbyWebService extends AsyncTask<String,Void,Void>
    {

        ProgressDialog progressDialog;
        @Override
        protected Void doInBackground(String... params) {
            try {
                utilisateur = webMethod.getUtilisateurByLogin(email);
            }
            catch(Exception e)
            {   e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            if(utilisateur!=null && utilisateur.getPassword().equals(password))
            {   progressDialog.dismiss();
                intent.putExtra(webMethod.UTILISATEUR,utilisateur);
                intent.setClass(ConnexionActivity.this, progest.sn.progestweb.progest.ActualiteActivity.class);
                startActivity(intent);


            }
            else {
                progressDialog.dismiss();
                Toast.makeText(ConnexionActivity.this, "Impossible de se connecter, veuillez reessayez...", Toast.LENGTH_SHORT).show();
                 }

        }

        @Override
        protected void onPreExecute() {
            progressDialog = ProgressDialog.show(ConnexionActivity.this, "", "Operation en cours" + "...", true);
            progressDialog.show();

        }

        @Override
        protected void onProgressUpdate(Void... values) {
        }

    }







}
