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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author T440
 */
@Entity
@Table(name = "ACT_SCORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActScores.getSemesters", query = "SELECT DISTINCT a.semester FROM ActScores a"),
    @NamedQuery(name = "ActScores.getModules", query = "SELECT DISTINCT a.module FROM ActScores a"),
    @NamedQuery(name = "ActScores.findAll", query = "SELECT a FROM ActScores a"),
    @NamedQuery(name = "ActScores.findByActScoreId", query = "SELECT a FROM ActScores a WHERE a.actScoreId = :actScoreId"),
    @NamedQuery(name = "ActScores.findByStudentId", query = "SELECT a FROM ActScores a WHERE a.studentId = :studentId"),
    @NamedQuery(name = "ActScores.findBySubjectId", query = "SELECT a FROM ActScores a WHERE a.subjectId = :subjectId"),
    @NamedQuery(name = "ActScores.findByStudentAndSubjectId", query = "SELECT a FROM ActScores a WHERE a.studentId = :studentId and a.subjectId = :subjectId"),
    @NamedQuery(name = "ActScores.findByStudentSubjectSemesterModule", query = "SELECT a FROM ActScores a WHERE a.studentId = :studentId and a.subjectId = :subjectId and a.module = :module and a.semester = :semester"),
    @NamedQuery(name = "ActScores.findByActId", query = "SELECT a FROM ActScores a WHERE a.actId = :actId"),
    @NamedQuery(name = "ActScores.findByScore", query = "SELECT a FROM ActScores a WHERE a.score = :score"),
    @NamedQuery(name = "ActScores.findByModule", query = "SELECT a FROM ActScores a WHERE a.module = :module"),
    @NamedQuery(name = "ActScores.findBySemester", query = "SELECT a FROM ActScores a WHERE a.semester = :semester")})
public class ActScores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACT_SCORE_ID")
    private Integer actScoreId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STUDENT_ID")
    private int studentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUBJECT_ID")
    private int subjectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACT_ID")
    private int actId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCORE")
    private int score;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MODULE")
    private int module;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEMESTER")
    private int semester;

    public ActScores() {
    }

    public ActScores(Integer actScoreId) {
        this.actScoreId = actScoreId;
    }

    public ActScores(Integer actScoreId, int studentId, int subjectId, int actId, int score, int module, int semester) {
        this.actScoreId = actScoreId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.actId = actId;
        this.score = score;
        this.module = module;
        this.semester = semester;
    }

    public Integer getActScoreId() {
        return actScoreId;
    }

    public void setActScoreId(Integer actScoreId) {
        this.actScoreId = actScoreId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getActId() {
        return actId;
    }

    public void setActId(int actId) {
        this.actId = actId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actScoreId != null ? actScoreId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActScores)) {
            return false;
        }
        ActScores other = (ActScores) object;
        if ((this.actScoreId == null && other.actScoreId != null) || (this.actScoreId != null && !this.actScoreId.equals(other.actScoreId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.team.seven.journalwebpageapp.model.ActScores[ actScoreId=" + actScoreId + " ]";
    }
    
}
