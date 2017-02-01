/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  progest.sn.progestweb.entity;

import java.io.Serializable;


/**
 *
 * @author Pray
 */
public class ProgrammationSalle implements Serializable {

    private static final long serialVersionUID = 1L;

    protected ProgrammationSallePK programmationSallePK;

    public ProgrammationSalle() {
    }

    public ProgrammationSalle(ProgrammationSallePK programmationSallePK) {
        this.programmationSallePK = programmationSallePK;
    }

    public ProgrammationSalle(long idSalle, long idMatiere, long idClasseprogramme) {
        this.programmationSallePK = new ProgrammationSallePK(idSalle, idMatiere, idClasseprogramme);
    }

    public ProgrammationSallePK getProgrammationSallePK() {
        return programmationSallePK;
    }

    public void setProgrammationSallePK(ProgrammationSallePK programmationSallePK) {
        this.programmationSallePK = programmationSallePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programmationSallePK != null ? programmationSallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgrammationSalle)) {
            return false;
        }
        ProgrammationSalle other = (ProgrammationSalle) object;
        if ((this.programmationSallePK == null && other.programmationSallePK != null) || (this.programmationSallePK != null && !this.programmationSallePK.equals(other.programmationSallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.progest.entity.ProgrammationSalle[ programmationSallePK=" + programmationSallePK + " ]";
    }
    
}
