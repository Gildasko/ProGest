/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progest.sn.progestweb.entity;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Pray
 */

public class Matiere implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String annee;

    private Integer credit;

    private String nom;

    private Integer nombreheure;

    private Collection<EtudiantMatiere> etudiantMatiereCollection;

    private Collection<ProgrammationCours> programmationCoursCollection;

    public Matiere() {
    }

    public Matiere(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNombreheure() {
        return nombreheure;
    }

    public void setNombreheure(Integer nombreheure) {
        this.nombreheure = nombreheure;
    }


    public Collection<EtudiantMatiere> getEtudiantMatiereCollection() {
        return etudiantMatiereCollection;
    }

    public void setEtudiantMatiereCollection(Collection<EtudiantMatiere> etudiantMatiereCollection) {
        this.etudiantMatiereCollection = etudiantMatiereCollection;
    }

    public Collection<ProgrammationCours> getProgrammationCoursCollection() {
        return programmationCoursCollection;
    }

    public void setProgrammationCoursCollection(Collection<ProgrammationCours> programmationCoursCollection) {
        this.programmationCoursCollection = programmationCoursCollection;
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
        if (!(object instanceof Matiere)) {
            return false;
        }
        Matiere other = (Matiere) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.progest.entity.Matiere[ id=" + id + " ]";
    }
    
}
