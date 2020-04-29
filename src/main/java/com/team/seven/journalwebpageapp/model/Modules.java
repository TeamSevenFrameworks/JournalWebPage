/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team.seven.journalwebpageapp.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author i1zol
 */
@Entity
@Table(name = "MODULES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modules.findAll", query = "SELECT m FROM Modules m"),
    @NamedQuery(name = "Modules.findByModuleId", query = "SELECT m FROM Modules m WHERE m.moduleId = :moduleId"),
    @NamedQuery(name = "Modules.findBySemesterId", query = "SELECT m FROM Modules m WHERE m.semesterId = :semesterId"),
    @NamedQuery(name = "Modules.findByTitle", query = "SELECT m FROM Modules m WHERE m.title = :title")})
public class Modules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODULE_ID")
    private Integer moduleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEMESTER_ID")
    private int semesterId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TITLE")
    private String title;
    //@ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "SEMESTER_ID")
    //private Semesters semester;

    public Modules() {
    }

    public Modules(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Modules(Integer moduleId, int semesterId, String title) {
        this.moduleId = moduleId;
        this.semesterId = semesterId;
        this.title = title;
//        this.semester = semester;
    }
    
//    public Semesters getSemester() {
//        return semester;
//    }
//
//    public void setActivity(Semesters semester) {
//        this.semester = semester;
//    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public int getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
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
        hash += (moduleId != null ? moduleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modules)) {
            return false;
        }
        Modules other = (Modules) object;
        if ((this.moduleId == null && other.moduleId != null) || (this.moduleId != null && !this.moduleId.equals(other.moduleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.team.seven.journalwebpageapp.model.Modules[ moduleId=" + moduleId + " ]";
    }
    
}
