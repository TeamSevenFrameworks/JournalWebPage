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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author i1zol
 */
@Entity
@Table(name = "ACT_SCORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActScores.getSemesters", query = "SELECT DISTINCT a.semester FROM ActScores a"),
    @NamedQuery(name = "ActScores.getModules", query = "SELECT DISTINCT a.module FROM ActScores a"),
    @NamedQuery(name = "ActScores.findAll", query = "SELECT a FROM ActScores a"),
    @NamedQuery(name = "ActScores.findById", query = "SELECT a FROM ActScores a WHERE a.id = :id"),
    @NamedQuery(name = "ActScores.findByStudentAndSubjectId", query = "SELECT a FROM ActScores a JOIN a.studentId st JOIN a.activityId act JOIN act.subjectId sub WHERE st.id = :student_id AND sub.id = :subject_id"),
    //@NamedQuery(name = "ActScores.findByStudentAndSubjectId", query = "SELECT a.id, a.activityId, a.score, a.studentId FROM ActScores a JOIN Students st on (a.student_id = st.id) JOIN Activities act on (a.activity_id = act.id) WHERE st.id = :student_id AND act.subject_id = :subject_id"),
    @NamedQuery(name = "ActScores.findByScore", query = "SELECT a FROM ActScores a WHERE a.score = :score")})
public class ActScores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCORE")
    private int score;
    @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Activities activityId;
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Students studentId;

    public ActScores() {
    }

    public ActScores(Integer id) {
        this.id = id;
    }

    public ActScores(Integer id, int score) {
        this.id = id;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Activities getActivityId() {
        return activityId;
    }

    public void setActivityId(Activities activityId) {
        this.activityId = activityId;
    }

    public Students getStudentId() {
        return studentId;
    }

    public void setStudentId(Students studentId) {
        this.studentId = studentId;
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
        if (!(object instanceof ActScores)) {
            return false;
        }
        ActScores other = (ActScores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.team.seven.journalwebpageapp.model.ActScores[ id=" + id + " ]";
    }
    
}
