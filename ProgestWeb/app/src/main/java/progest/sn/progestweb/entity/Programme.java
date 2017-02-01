/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progest.sn.progestweb.entity;

import java.io.Serializable;
import java.util.Collection;

public class Programme implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nom;

    private Collection<Ue> ueCollection;

    private Collection<Ecole> ecoleCollection;

    private Collection<ClasseProgramme> classeProgrammeCollection;

    private Collection<Actualite> actualiteCollection;

    private Cursus idCursus;

    private Type idType;

    public Programme() {
    }

    public Programme(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public Collection<Ue> getUeCollection() {
        return ueCollection;
    }

    public void setUeCollection(Collection<Ue> ueCollection) {
        this.ueCollection = ueCollection;
    }


    public Collection<Ecole> getEcoleCollection() {
        return ecoleCollection;
    }

    public void setEcoleCollection(Collection<Ecole> ecoleCollection) {
        this.ecoleCollection = ecoleCollection;
    }


    public Collection<ClasseProgramme> getClasseProgrammeCollection() {
        return classeProgrammeCollection;
    }

    public void setClasseProgrammeCollection(Collection<ClasseProgramme> classeProgrammeCollection) {
        this.classeProgrammeCollection = classeProgrammeCollection;
    }

    public Collection<Actualite> getActualiteCollection() {
        return actualiteCollection;
    }

    public void setActualiteCollection(Collection<Actualite> actualiteCollection) {
        this.actualiteCollection = actualiteCollection;
    }

    public Cursus getIdCursus() {
        return idCursus;
    }

    public void setIdCursus(Cursus idCursus) {
        this.idCursus = idCursus;
    }

    public Type getIdType() {
        return idType;
    }

    public void setIdType(Type idType) {
        this.idType = idType;
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
        if (!(object instanceof Programme)) {
            return false;
        }
        Programme other = (Programme) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.progest.entity.Programme[ id=" + id + " ]";
    }
    
}
