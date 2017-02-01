/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progest.sn.progestweb.entity;

import java.io.Serializable;
import java.util.Date;



public class ProgrammationCours implements Serializable {

    private static final long serialVersionUID = 1L;

    protected ProgrammationCoursPK programmationCoursPK;

    private Date dateDebut;

    private Date dateFin;

    private Date heureDebut;

    private Date heureFin;

    private String nature;

    private ClasseProgramme classeProgramme;

    private Matiere matiere;

    private Professeur idProfesseur;

    public ProgrammationCours() {
    }

    public ProgrammationCours(ProgrammationCoursPK programmationCoursPK) {
        this.programmationCoursPK = programmationCoursPK;
    }

    public ProgrammationCours(long idMatiere, long idClasseprogramme) {
        this.programmationCoursPK = new ProgrammationCoursPK(idMatiere, idClasseprogramme);
    }

    public ProgrammationCoursPK getProgrammationCoursPK() {
        return programmationCoursPK;
    }

    public void setProgrammationCoursPK(ProgrammationCoursPK programmationCoursPK) {
        this.programmationCoursPK = programmationCoursPK;
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

    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public ClasseProgramme getClasseProgramme() {
        return classeProgramme;
    }

    public void setClasseProgramme(ClasseProgramme classeProgramme) {
        this.classeProgramme = classeProgramme;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Professeur getIdProfesseur() {
        return idProfesseur;
    }

    public void setIdProfesseur(Professeur idProfesseur) {
        this.idProfesseur = idProfesseur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programmationCoursPK != null ? programmationCoursPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgrammationCours)) {
            return false;
        }
        ProgrammationCours other = (ProgrammationCours) object;
        if ((this.programmationCoursPK == null && other.programmationCoursPK != null) || (this.programmationCoursPK != null && !this.programmationCoursPK.equals(other.programmationCoursPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.progest.entity.ProgrammationCours[ programmationCoursPK=" + programmationCoursPK + " ]";
    }
    
}
