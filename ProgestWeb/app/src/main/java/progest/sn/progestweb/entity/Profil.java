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

public class Profil implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nom;

    private Collection<Module> moduleCollection;

    private Collection<Utilisateur> utilisateurCollection;

    private Collection<Actualite> actualiteCollection;

    public Profil() {
    }

    public Profil(Long id) {
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


    public Collection<Module> getModuleCollection() {
        return moduleCollection;
    }

    public void setModuleCollection(Collection<Module> moduleCollection) {
        this.moduleCollection = moduleCollection;
    }


    public Collection<Utilisateur> getUtilisateurCollection() {
        return utilisateurCollection;
    }

    public void setUtilisateurCollection(Collection<Utilisateur> utilisateurCollection) {
        this.utilisateurCollection = utilisateurCollection;
    }

    public Collection<Actualite> getActualiteCollection() {
        return actualiteCollection;
    }

    public void setActualiteCollection(Collection<Actualite> actualiteCollection) {
        this.actualiteCollection = actualiteCollection;
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
        if (!(object instanceof Profil)) {
            return false;
        }
        Profil other = (Profil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sn.progest.entity.Profil[ id=" + id + " ]";
    }
    
}
