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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author i1zol
 */
@Entity
@Table(name = "SEMESTERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Semesters.findAll", query = "SELECT s FROM Semesters s"),
    @NamedQuery(name = "Semesters.findBySemesterId", query = "SELECT s FROM Semesters s WHERE s.semesterId = :semesterId"),
    @NamedQuery(name = "Semesters.findByTitle", query = "SELECT s FROM Semesters s WHERE s.title = :title")})
public class Semesters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEMESTER_ID")
    private Integer semesterId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TITLE")
    private String title;

    public Semesters() {
    }

    public Semesters(Integer semesterId) {
        this.semesterId = semesterId;
    }

    public Semesters(Integer semesterId, String title) {
        this.semesterId = semesterId;
        this.title = title;
    }

    public Integer getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(Integer semesterId) {
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
        hash += (semesterId != null ? semesterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semesters)) {
            return false;
        }
        Semesters other = (Semesters) object;
        if ((this.semesterId == null && other.semesterId != null) || (this.semesterId != null && !this.semesterId.equals(other.semesterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.team.seven.journalwebpageapp.model.Semesters[ semesterId=" + semesterId + " ]";
    }
    
}
