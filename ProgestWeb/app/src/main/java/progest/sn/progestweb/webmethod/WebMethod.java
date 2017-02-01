package progest.sn.progestweb.webmethod;


import java.util.List;

import progest.sn.progestweb.entity.Actualite;
import progest.sn.progestweb.entity.Programme;
import progest.sn.progestweb.entity.Utilisateur;
import retrofit.http.GET;
import retrofit.http.Path;
//import retrofit.http.

/**
 * Created.
 */
public interface WebMethod {

    //public static String weblien = "http://192.168.56.1:8080/Progest/rest";

    public static String weblien = "http://192.168.1.15:8080/Progest/rest";

    public static String weblienUtilisateur="/utilisateur/";

    public static String weblienProgramme="/programme/";

    public static String weblienActualite="/actualite/";

    public final static String UTILISATEUR = "utilisateur";

    @GET(weblienUtilisateur+"login/{login}")
    Utilisateur getUtilisateurByLogin(@Path("login") String login);

    @GET(weblienProgramme)
    List<Programme> getAllProgramme();

    @GET(weblienActualite)
    List<Actualite> getAllActualite();


                            }
