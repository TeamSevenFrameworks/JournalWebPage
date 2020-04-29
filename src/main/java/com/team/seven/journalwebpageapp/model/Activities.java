/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team.seven.journalwebpageapp.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author T440
 */
@Entity
@Table(name = "ACTIVITIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Activities.findAll", query = "SELECT a FROM Activities a"),
    @NamedQuery(name = "Activities.findByActId", query = "SELECT a FROM Activities a WHERE a.actId = :actId"),
    @NamedQuery(name = "Activities.findBySubjectId", query = "SELECT a FROM Activities a WHERE a.subjectId = :subjectId"),
    @NamedQuery(name = "Activities.findByModuleId", query = "SELECT a FROM Activities a WHERE a.moduleId = :moduleId"),
    @NamedQuery(name = "Activities.findByTitle", query = "SELECT a FROM Activities a WHERE a.title = :title")})
public class Activities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACT_ID")
    private Integer actId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUBJECT_ID")
    private int subjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODULE_ID")
    private int moduleId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TITLE")
    private String title;
    //@ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "MODULE_ID")
    //private Modules module;
    //@OneToMany(fetch = FetchType.EAGER, mappedBy = "activities")
    //private List<ActScores> actScores;

    public Activities() {
    }

    public Activities(Integer actId) {
        this.actId = actId;
    }

    public Activities(Integer actId, String title) {
        this.actId = actId;
        this.title = title;
//        this.module = module;
    }
    
//    public Modules getModule() {
//        return module;
//    }
//
//    public void setModule(Modules module) {
//        this.module = module;
//    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actId != null ? actId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activities)) {
            return false;
        }
        Activities other = (Activities) object;
        if ((this.actId == null && other.actId != null) || (this.actId != null && !this.actId.equals(other.actId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.team.seven.journalwebpageapp.model.Activities[ actId=" + actId + " ]";
    }
    
}
