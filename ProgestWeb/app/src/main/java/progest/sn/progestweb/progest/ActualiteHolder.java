package progest.sn.progestweb.progest;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import progest.sn.progestweb.R;

/**
 * Created by Pray on 06/01/2017.
 */

public class ActualiteHolder {
    private View base;
    private Button edit;
    private Button delete;


    private ImageView imageActualite;
    private TextView actualite , actualiteId;
    private Button afficherPlus;



    public ActualiteHolder(View base) {

        this.base = base;
    }
    public View getBase() {
        return base;
    }
    public Button getEdit() {
        return edit;
    }
    public Button getDelete() {
        return delete;
    }


    public ImageView getImageActualite() {
        if(imageActualite==null)
            imageActualite = (ImageView) base.findViewById(R.id.imageActualite);
        return imageActualite;
    }

    public void setImageActualite(ImageView imageActualite) {
        if(this.imageActualite == null)
            getImageActualite();
        else
        this.imageActualite = imageActualite;
    }

    public TextView getActualite() {
        if(actualite==null)
            actualite = (TextView) base.findViewById(R.id.actualite);
        return actualite;
    }

    public void setActualite(TextView actualite) {
        if(this.actualite == null)
            getActualite();
        else
        this.actualite = actualite;
    }

    public Button getAfficherPlus() {
        if(afficherPlus==null)
            afficherPlus = (Button) base.findViewById(R.id.afficherPlus);
        return afficherPlus;
    }

    public void setAfficherPlus(Button afficherPlus) {
        if(this.afficherPlus == null)
            getAfficherPlus();
        else
        this.afficherPlus = afficherPlus;
    }

    public TextView getActualiteId() {
        if(actualiteId==null)
            actualiteId = (TextView) base.findViewById(R.id.actualiteId);
        return actualiteId;
    }

    public void setActualiteId(TextView actualiteId) {
        if(this.actualiteId == null)
            getActualiteId();
        else
        this.actualiteId = actualiteId;
    }
}

