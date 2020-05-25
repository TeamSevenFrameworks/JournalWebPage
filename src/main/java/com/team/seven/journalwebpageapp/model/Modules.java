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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "MODULES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modules.findAll", query = "SELECT m FROM Modules m"),
    @NamedQuery(name = "Modules.findById", query = "SELECT m FROM Modules m WHERE m.id = :id"),
    @NamedQuery(name = "Modules.findByTitle", query = "SELECT m FROM Modules m WHERE m.title = :title"),
    @NamedQuery(name = "Modules.findBySemesterId", query = "SELECT m FROM Modules m WHERE m.semesterId = :semesterId"),
    @NamedQuery(name = "Modules.findBySemesterIdAndSubject", query = "SELECT DISTINCT m FROM Activities a JOIN a.moduleId m JOIN a.subjectId su WHERE m.semesterId = :semesterId and a.subjectId.id = :subId ORDER BY m.id"),
    @NamedQuery(name = "Modules.findBySemesterIdAndTitle", query = "SELECT m FROM Modules m WHERE m.semesterId = :semesterId and m.title = :title")
})
public class Modules implements Serializable {

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
    @JoinColumn(name = "SEMESTER_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Semesters semesterId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "moduleId")
    private Collection<Activities> activitiesCollection;

    public Modules() {
    }

    public Modules(Integer id) {
        this.id = id;
    }

    public Modules(Integer id, String title) {
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

    public Semesters getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Semesters semesterId) {
        this.semesterId = semesterId;
    }

    @XmlTransient
    public Collection<Activities> getActivitiesCollection() {
        return activitiesCollection;
    }

    public void setActivitiesCollection(Collection<Activities> activitiesCollection) {
        this.activitiesCollection = activitiesCollection;
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
        if (!(object instanceof Modules)) {
            return false;
        }
        Modules other = (Modules) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.team.seven.journalwebpageapp.model.Modules[ id=" + id + " ]";
    }
    
}
