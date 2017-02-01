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
public class EtudiantMatiere implements Serializable {

    private static final long serialVersionUID = 1L;

    protected EtudiantMatierePK etudiantMatierePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    private Double note;

    private Etudiant etudiant;

    private Matiere matiere;

    public EtudiantMatiere() {
    }

    public EtudiantMatiere(EtudiantMatierePK etudiantMatierePK) {
        this.etudiantMatierePK = etudiantMatierePK;
    }

    public EtudiantMatiere(long idMatiere, long idEtudiant) {
        this.etudiantMatierePK = new EtudiantMatierePK(idMatiere, idEtudiant);
    }

    public EtudiantMatierePK getEtudiantMatierePK() {
        return etudiantMatierePK;
    }

    public void setEtudiantMatierePK(EtudiantMatierePK etudiantMatierePK) {
        this.etudiantMatierePK = etudiantMatierePK;
    }

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etudiantMatierePK != null ? etudiantMatierePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtudiantMatiere)) {
            return false;
        }
        EtudiantMatiere other = (EtudiantMatiere) object;
        if ((this.etudiantMatierePK == null && other.etudiantMatierePK != null) || (this.etudiantMatierePK != null && !this.etudiantMatierePK.equals(other.etudiantMatierePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.progest.entity.EtudiantMatiere[ etudiantMatierePK=" + etudiantMatierePK + " ]";
    }
    
}
