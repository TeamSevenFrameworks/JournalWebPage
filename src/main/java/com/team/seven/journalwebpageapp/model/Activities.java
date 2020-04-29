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
 * @author T440
 */
@Entity
@Table(name = "ACTIVITIES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Activities.findAll", query = "SELECT a FROM Activities a"),
    @NamedQuery(name = "Activities.findByActId", query = "SELECT a FROM Activities a WHERE a.actId = :actId"),
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
    @Size(min = 1, max = 100)
    @Column(name = "TITLE")
    private String title;

    public Activities() {
    }

    public Activities(Integer actId) {
        this.actId = actId;
    }

    public Activities(Integer actId, String title) {
        this.actId = actId;
        this.title = title;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
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
