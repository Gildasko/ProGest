/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progest.sn.progestweb.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


/**
 *
 * @author Pray
 */

public class Actualite implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String information;

    private byte[] image;
    

    private Date dateDebut;

    private Date dateFin;
    

    private Boolean afficherActualite;
    

    private Collection<Profil> profilCollection;
    


    private Collection<Programme> programmeCollection;
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    

    public Collection<Profil> getProfilCollection() {
        return profilCollection;
    }

    public void setProfilCollection(Collection<Profil> profilCollection) {
        this.profilCollection = profilCollection;
    }


    public Collection<Programme> getProgrammeCollection() {
        return programmeCollection;
    }

    public void setProgrammeCollection(Collection<Programme> programmeCollection) {
        this.programmeCollection = programmeCollection;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Boolean getAfficherActualite() {
        return afficherActualite;
    }

    public void setAfficherActualite(Boolean afficherActualite) {
        this.afficherActualite = afficherActualite;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actualite)) {
            return false;
        }
        Actualite other = (Actualite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.progest.entity.Actualite[ id=" + id + " ]";
    }
    
}
