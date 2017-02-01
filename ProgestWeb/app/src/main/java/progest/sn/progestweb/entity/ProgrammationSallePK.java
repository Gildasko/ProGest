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

public class ProgrammationSallePK implements Serializable {


    private long idSalle;

    private long idMatiere;

    private long idClasseprogramme;

    public ProgrammationSallePK() {
    }

    public ProgrammationSallePK(long idSalle, long idMatiere, long idClasseprogramme) {
        this.idSalle = idSalle;
        this.idMatiere = idMatiere;
        this.idClasseprogramme = idClasseprogramme;
    }

    public long getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(long idSalle) {
        this.idSalle = idSalle;
    }

    public long getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(long idMatiere) {
        this.idMatiere = idMatiere;
    }

    public long getIdClasseprogramme() {
        return idClasseprogramme;
    }

    public void setIdClasseprogramme(long idClasseprogramme) {
        this.idClasseprogramme = idClasseprogramme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idSalle;
        hash += (int) idMatiere;
        hash += (int) idClasseprogramme;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgrammationSallePK)) {
            return false;
        }
        ProgrammationSallePK other = (ProgrammationSallePK) object;
        if (this.idSalle != other.idSalle) {
            return false;
        }
        if (this.idMatiere != other.idMatiere) {
            return false;
        }
        if (this.idClasseprogramme != other.idClasseprogramme) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.progest.entity.ProgrammationSallePK[ idSalle=" + idSalle + ", idMatiere=" + idMatiere + ", idClasseprogramme=" + idClasseprogramme + " ]";
    }
    
}
