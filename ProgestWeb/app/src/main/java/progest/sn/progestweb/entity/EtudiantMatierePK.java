/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progest.sn.progestweb.entity;

import java.io.Serializable;


/**
 *
 * @author Pray
 */

public class EtudiantMatierePK implements Serializable {


    private long idMatiere;

    private long idEtudiant;

    public EtudiantMatierePK() {
    }

    public EtudiantMatierePK(long idMatiere, long idEtudiant) {
        this.idMatiere = idMatiere;
        this.idEtudiant = idEtudiant;
    }

    public long getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(long idMatiere) {
        this.idMatiere = idMatiere;
    }

    public long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idMatiere;
        hash += (int) idEtudiant;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtudiantMatierePK)) {
            return false;
        }
        EtudiantMatierePK other = (EtudiantMatierePK) object;
        if (this.idMatiere != other.idMatiere) {
            return false;
        }
        if (this.idEtudiant != other.idEtudiant) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.progest.entity.EtudiantMatierePK[ idMatiere=" + idMatiere + ", idEtudiant=" + idEtudiant + " ]";
    }
    
}
