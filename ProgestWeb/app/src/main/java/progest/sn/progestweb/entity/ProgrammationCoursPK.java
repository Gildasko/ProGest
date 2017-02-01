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

public class ProgrammationCoursPK implements Serializable {


    private long idMatiere;

    private long idClasseprogramme;

    public ProgrammationCoursPK() {
    }

    public ProgrammationCoursPK(long idMatiere, long idClasseprogramme) {
        this.idMatiere = idMatiere;
        this.idClasseprogramme = idClasseprogramme;
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
        hash += (int) idMatiere;
        hash += (int) idClasseprogramme;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgrammationCoursPK)) {
            return false;
        }
        ProgrammationCoursPK other = (ProgrammationCoursPK) object;
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
        return "sn.progest.entity.ProgrammationCoursPK[ idMatiere=" + idMatiere + ", idClasseprogramme=" + idClasseprogramme + " ]";
    }
    
}
