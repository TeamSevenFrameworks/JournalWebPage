/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team.seven.journalwebpageapp.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author i1zol
 */
@Entity
@Table(name = "SEMESTERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semesters.findAll", query = "SELECT s FROM Semesters s"),
    @NamedQuery(name = "Semesters.findById", query = "SELECT s FROM Semesters s WHERE s.id = :id"),
    @NamedQuery(name = "Semesters.findBySubjectId", query = "SELECT DISTINCT s FROM Activities a JOIN a.moduleId m JOIN a.subjectId su JOIN m.semesterId s WHERE su.id = :id ORDER BY s.id"),
    @NamedQuery(name = "Semesters.findByTitle", query = "SELECT s FROM Semesters s WHERE s.title = :title")})
public class Semesters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TITLE")
    private String title;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "semesterId")
    private Collection<Modules> modulesCollection;

    public Semesters() {
    }

    public Semesters(Integer id) {
        this.id = id;
    }

    public Semesters(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlTransient
    public Collection<Modules> getModulesCollection() {
        return modulesCollection;
    }

    public void setModulesCollection(Collection<Modules> modulesCollection) {
        this.modulesCollection = modulesCollection;
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
        if (!(object instanceof Semesters)) {
            return false;
        }
        Semesters other = (Semesters) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.team.seven.journalwebpageapp.model.Semesters[ id=" + id + " ]";
    }
    
}
