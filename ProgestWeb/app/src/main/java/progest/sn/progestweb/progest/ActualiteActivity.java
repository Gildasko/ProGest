package progest.sn.progestweb.progest;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import progest.sn.progestweb.R;
import progest.sn.progestweb.entity.Actualite;
import progest.sn.progestweb.entity.Utilisateur;
import progest.sn.progestweb.webmethod.WebMethod;
import retrofit.RestAdapter;
import retrofit.client.OkClient;


public class ActualiteActivity extends AppCompatActivity {

    private ListView listeActualite;
    private RestAdapter restAdapter;
    private WebMethod webMethod;
    private Intent intent;
    private Utilisateur utilisateur;
    private static String sleep = "1000";
    private ArrayList<Actualite> actualites;
    private ActualiteAdapter actualiteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualite);

        listeActualite=(ListView)findViewById(R.id.listactualite);
        restAdapter = new RestAdapter.Builder()
                .setEndpoint(webMethod.weblien).build();



        webMethod = restAdapter.create(WebMethod.class);
        intent=getIntent();
        utilisateur=(Utilisateur) intent.getSerializableExtra(webMethod.UTILISATEUR);
        AsynGetAllProgramme asynGetAllProgramme=new AsynGetAllProgramme();
        asynGetAllProgramme.execute(sleep);
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
    }

    private class AsynGetAllProgramme extends AsyncTask<String, Void, Void>
    {

        @Override
        protected Void doInBackground(String... params) {
            try
                {
                actualites= (ArrayList<Actualite>) webMethod.getAllActualite();
                }
            catch( Exception e )
            {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            if(actualites!=null && !actualites.isEmpty())
                {
                    actualiteAdapter=new ActualiteAdapter(ActualiteActivity.this,R.layout.occurence_actualite
                            ,actualites,utilisateur);
                    listeActualite.setAdapter(actualiteAdapter);

                }

        }
        @Override
        protected void onPreExecute() {

        }

        @Override
        protected void onProgressUpdate(Void... values) {
        }

    }

}
