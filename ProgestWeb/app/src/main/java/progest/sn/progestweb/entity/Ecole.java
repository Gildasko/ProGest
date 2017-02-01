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
public class Ecole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String description;

    private String nom;

    private Integer nombreprogramme;

    private Collection<Programme> programmeCollection;

    public Ecole() {
    }

    public Ecole(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNombreprogramme() {
        return nombreprogramme;
    }

    public void setNombreprogramme(Integer nombreprogramme) {
        this.nombreprogramme = nombreprogramme;
    }


    public Collection<Programme> getProgrammeCollection() {
        return programmeCollection;
    }

    public void setProgrammeCollection(Collection<Programme> programmeCollection) {
        this.programmeCollection = programmeCollection;
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
        if (!(object instanceof Ecole)) {
            return false;
        }
        Ecole other = (Ecole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.progest.entity.Ecole[ id=" + id + " ]";
    }
    
}
