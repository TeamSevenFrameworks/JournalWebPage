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
@Table(name = "ACTIVITIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Activities.findAll", query = "SELECT a FROM Activities a"),
    @NamedQuery(name = "Activities.findById", query = "SELECT a FROM Activities a WHERE a.id = :id"),
    @NamedQuery(name = "Activities.findByTitle", query = "SELECT a FROM Activities a WHERE a.title = :title")})
public class Activities implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "activityId")
    private Collection<ActScores> actScoresCollection;
    @JoinColumn(name = "MODULE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Modules moduleId;
    @JoinColumn(name = "SUBJECT_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Subjects subjectId;

    public Activities() {
    }

    public Activities(Integer id) {
        this.id = id;
    }

    public Activities(Integer id, String title) {
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
    public Collection<ActScores> getActScoresCollection() {
        return actScoresCollection;
    }

    public void setActScoresCollection(Collection<ActScores> actScoresCollection) {
        this.actScoresCollection = actScoresCollection;
    }

    public Modules getModuleId() {
        return moduleId;
    }

    public void setModuleId(Modules moduleId) {
        this.moduleId = moduleId;
    }

    public Subjects getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Subjects subjectId) {
        this.subjectId = subjectId;
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
        if (!(object instanceof Activities)) {
            return false;
        }
        Activities other = (Activities) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.team.seven.journalwebpageapp.model.Activities[ id=" + id + " ]";
    }
    
}
