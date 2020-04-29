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
@Table(name = "FINAL_SCORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FinalScores.findAll", query = "SELECT f FROM FinalScores f"),
    @NamedQuery(name = "FinalScores.findByScoreId", query = "SELECT f FROM FinalScores f WHERE f.scoreId = :scoreId"),
    @NamedQuery(name = "FinalScores.findByStudentId", query = "SELECT f FROM FinalScores f WHERE f.studentId = :studentId"),
    @NamedQuery(name = "FinalScores.findBySubjectId", query = "SELECT f FROM FinalScores f WHERE f.subjectId = :subjectId"),
    @NamedQuery(name = "FinalScores.findByScore", query = "SELECT f FROM FinalScores f WHERE f.score = :score")})
public class FinalScores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCORE_ID")
    private Integer scoreId;
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
    @Column(name = "SCORE")
    private int score;

    public FinalScores() {
    }

    public FinalScores(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public FinalScores(Integer scoreId, int studentId, int subjectId, int score) {
        this.scoreId = scoreId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.score = score;
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scoreId != null ? scoreId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinalScores)) {
            return false;
        }
        FinalScores other = (FinalScores) object;
        if ((this.scoreId == null && other.scoreId != null) || (this.scoreId != null && !this.scoreId.equals(other.scoreId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.team.seven.journalwebpageapp.model.FinalScores[ scoreId=" + scoreId + " ]";
    }
    
}
