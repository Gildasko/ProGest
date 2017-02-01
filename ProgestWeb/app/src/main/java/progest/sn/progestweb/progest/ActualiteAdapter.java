package progest.sn.progestweb.progest;
import progest.sn.progestweb.R;
import progest.sn.progestweb.entity.Actualite;
import progest.sn.progestweb.entity.Programme;
import progest.sn.progestweb.webmethod.WebMethod;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.zip.Inflater;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import progest.sn.progestweb.entity.Utilisateur;
import retrofit.RestAdapter;

import static android.R.attr.path;

public class ActualiteAdapter extends ArrayAdapter<Actualite>
 implements View.OnTouchListener {
    private ArrayList<Actualite> actualites = new ArrayList<Actualite>();
    private int layoutResourceId;
    private Activity activity;
    private Actualite actualite;
    private Utilisateur utilisateur;

    private final String EXTRA_WHAT = "";
    private final String EXTRA_ID = "";
    private Intent intent;
    private RestAdapter restAdapter;
    private WebMethod webMethod;
    private String sleep = "20";
    private String Slogin, Spassword;
    private Long Sid, Sidgroupe;
    private boolean findUserInMembre = false;
    private View Vconnect;
    private LayoutInflater inflater;
    private static String EXTRA_ACTUALITE = "extra_actualite";
    private static String EXTRA_MEMBRE = "extra_membre";
    //private Spinner spinGenre;
    //private EditText Eddatenais,EdAnonyme;
    private android.support.v7.app.AlertDialog.Builder adb;
    private Calendar dateAndTime = Calendar.getInstance();
    /*DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            updateLabelDate(Eddatenais, year, monthOfYear, dayOfMonth);

        }

    };*/



    public ActualiteAdapter(Activity activity, int layoutResourceId,
                            ArrayList<Actualite> actualites, Utilisateur utilisateur) {
        // TODO Auto-generated constructor stub
        super(activity, layoutResourceId, actualites);
        this.layoutResourceId = layoutResourceId;
        this.activity = activity;
        this.actualites = actualites;
        this.utilisateur = utilisateur;
        notifyDataSetChanged();
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View row = convertView;
        ActualiteHolder actualiteHolder = null;

        if (row == null)
        {
            LayoutInflater inflater = LayoutInflater.from(activity);
            row = inflater.inflate(layoutResourceId, parent, false);
            actualiteHolder = new ActualiteHolder(row);
            row.setTag(actualiteHolder);

        }
        else
        {
            actualiteHolder = (ActualiteHolder) row.getTag();
        }

        if (actualites.size() > 0) {
            actualite = actualites.get(position);
            if (actualite != null) {
                actualiteHolder.getActualite().setText(actualite.getInformation());

                actualiteHolder.getActualiteId().setTag(actualite);
              /*  try {
                    Bitmap bitmap = BitmapFactory.decodeByteArray(actualite.getImage(), 0, actualite.getImage().length);

                    String path = MediaStore.Images.Media.insertImage(activity.getContentResolver(), bitmap, "image" + position, null);
                }
                catch (Exception e)
                {

                }*/



               Picasso
                        .with(activity)
                        .load(R.drawable.logo_cesag)
                        .into(actualiteHolder.getImageActualite());

                }


            }

         else {

              }

        actualiteHolder.getBase().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // final AccueilHolder holder1 = (AccueilHolder) v.getTag();
               /* Sid = ((Groupe) holder1.getGrpeId().getTag()).getUser().getId();
                Sidgroupe = ((Groupe) holder1.getGrpeId().getTag()).getId();*/

  		/*System.out.println("user id "+user.getId()+ " - "+membre.getUser().getId());
				System.out.println("holder groupe id "+((Groupe)holder1.getGrpeId().getTag()).getId()+ " - "+membre.getGroupe().getId());
				findUserInMembre=false;
				Iterator<Membre> it2=membres.iterator();
				while(it2.hasNext())
				{	membre=it2.next();

					if(user.getId()==membre.getUser().getId() && ((Groupe)holder1.getGrpeId().getTag()).getId()==membre.getGroupe().getId())
						findUserInMembre=true;
				}
*/


              /*  findUserInMembre = false;
                membrefind = null;
                AsynfindMemberByUserGroupe asynfindMemberByUserGroupe = new AsynfindMemberByUserGroupe();
                asynfindMemberByUserGroupe.execute(sleep);*/


            }
        });

		/*holder.getNom().setText(salle.getNom());
		
		holder.getEdit().setTag(String.valueOf(salle.getNom()));
		holder.getDelete().setTag(String.valueOf(salle.getNom()));

		holder.getEdit().setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent(activity, AjoutSalle.class);
				
				 intent.putExtra(EXTRA_WHAT, "update");
				 intent.putExtra(EXTRA_ID, v.getTag().toString());
				 
				activity.startActivity(intent);

			}
		});*/
		/*holder.getDelete().setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(final View v) {
				// TODO Auto-generated method stub
				DatabaseSkedule dB = new DatabaseSkedule(activity
						.getApplicationContext());
				// Salle salle = dB.getSalleById(v.getTag()
				// .toString());

				AlertDialog.Builder adb = new AlertDialog.Builder(activity);

				adb.setTitle("Suppression");

				adb.setMessage("Voulez vous vraiment supprimer la salle "
						+ v.getTag().toString() + " ?");

				final String salle_nom = v.getTag().toString();

				adb.setNegativeButton("Non", null);
				adb.setPositiveButton("Oui", new AlertDialog.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						DatabaseSkedule dB = new DatabaseSkedule(activity
								.getApplicationContext());
						dB.deleteSalle(salle_nom);
						Toast.makeText(activity.getApplicationContext(),
								"Suppression effectu�e avec succ�s ", 2000)
								.show();
						Intent intent = new Intent(activity, ListeSalle.class);
						activity.startActivity(intent);
					}
				});
				adb.show();
			}

		});*/
        return row;

    }

    public void connecter() {
        AsynConnecter asynConnecter = new AsynConnecter();
        asynConnecter.execute(sleep);

    }

    private class AsynConnecter extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... params) {
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {


        }

        @Override
        protected void onPreExecute() {

        }

        @Override
        protected void onProgressUpdate(Void... values) {
        }

    }


    private TextWatcher txtWatcher = new TextWatcher() {
        private Activity act;


        @Override
        public void onTextChanged(CharSequence s, int start, int before,
                                  int count) {

        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count,
                                      int after) {
			/*try {



				EdAnonyme = (EditText)Vconnect.findFocus();
			} catch (Exception e) {

			}

			if (EdAnonyme != null)
				if (EdAnonyme.equals(Eddatenais)==true
						&& EdAnonyme.getText().toString().length() > 0)
				{
					EdAnonyme.removeTextChangedListener(txtWatcher);
					EdAnonyme.setText("");
					EdAnonyme.addTextChangedListener(txtWatcher);

					new DatePickerDialog(
							activity.getWindow().getContext(), d,
							dateAndTime.get(Calendar.YEAR),
							dateAndTime.get(Calendar.MONTH),
							dateAndTime.get(Calendar.DAY_OF_MONTH)).show();
				}*/

        }

        @Override
        public void afterTextChanged(Editable arg0) {
            // TODO Auto-generated method stub


        }

    };


    public String chgeforme(int m) {
        String min;
        if (m < 10)
            min = "0" + m;
        else
            min = String.valueOf(m);
        return min;

    }


    private void updateLabelDate(EditText ed, int year, int monthOfYear,
                                 int dayOfMonth) {
        ed.removeTextChangedListener(txtWatcher);
        ed.setText(String.valueOf(year) + "-"
                + String.valueOf(chgeforme(monthOfYear + 1)) + "-"
                + String.valueOf(chgeforme(dayOfMonth)));
        ed.addTextChangedListener(txtWatcher);

    }

    public boolean onTouchEvent(MotionEvent event){
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                intent = new Intent();
                intent.putExtra(webMethod.UTILISATEUR,utilisateur);
                intent.setClass(activity, progest.sn.progestweb.progest.ConnexionActivity.class);
                activity.startActivity(intent);
                break;

           /* case MotionEvent.ACTION_UP:
                Toast.makeText(this,"",Toast.LENGTH_LONG).show();
                break;

            case MotionEvent.ACTION_MOVE:
                Toast.makeText(this,"",Toast.LENGTH_LONG).show();
                break;*/
        }
       // return super.onTouchEvent(event) ;

        return activity.onTouchEvent(event);
    }


    @Override
   public boolean onTouch(View view, MotionEvent event )
   {
       switch(event.getAction()){
           case MotionEvent.ACTION_DOWN:
               intent = new Intent();
               intent.putExtra(webMethod.UTILISATEUR,utilisateur);
               intent.setClass(activity, progest.sn.progestweb.progest.ConnexionActivity.class);
               activity.startActivity(intent);
               break;

           /* case MotionEvent.ACTION_UP:
                Toast.makeText(this,"",Toast.LENGTH_LONG).show();
                break;

            case MotionEvent.ACTION_MOVE:
                Toast.makeText(this,"",Toast.LENGTH_LONG).show();
                break;*/
       }

       return true;
   }



}
