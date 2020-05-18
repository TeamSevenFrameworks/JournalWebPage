/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team.seven.journalwebpageapp;

import com.team.seven.journalwebpageapp.model.ActScores;
import com.team.seven.journalwebpageapp.model.Activities;
import com.team.seven.journalwebpageapp.model.Modules;
import com.team.seven.journalwebpageapp.model.Semesters;
import com.team.seven.journalwebpageapp.model.Students;
import com.team.seven.journalwebpageapp.model.Subjects;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author T440
 */
@Stateless
@ManagedBean
@SessionScoped
public class JournalBean implements Serializable {

    @PersistenceContext
    EntityManager em;

    private Students student;
    private Subjects subject;

    private Semesters currentSemester;
    private Modules currentModule;
    
    private int finalScore = 0;

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public JournalBean() {

    }

    public String goToSubjects(Students student) {
        this.setStudent(student);
        return "subjects";
    }

    public String goToJournal(Subjects subject) {
        this.setSubject(subject);
        this.currentModule = (Modules) em.createNamedQuery("Modules.findById")
                .setParameter("id", 1)
                .getSingleResult();
        this.currentSemester = (Semesters) em.createNamedQuery("Semesters.findById")
                .setParameter("id", 1)
                .getSingleResult();
        
        int fScore = 0;
        
        List<Activities> activities = em.createNamedQuery("Activities.findBySubjectId")
                .setParameter("subjectId", this.subject)
                .getResultList();
        
        for(Activities act: activities) {
            List<ActScores> actScores = em.createNamedQuery("ActScores.findByStudentAndActivitytId")
                .setParameter("studentId", this.student)
                .setParameter("activityId", act)
                .getResultList();
            
            ActScores actScore = new ActScores(-1,0);
            
            if(actScores.size() > 0) {
                fScore += actScores.get(0).getScore();
            }
        }
        
        this.finalScore = fScore;
        
        return "journal";
    }

    public Map<Activities, ActScores> getScoreList() {
        List<Activities> activities = em.createNamedQuery("Activities.findByModuleAndSubjectId")
                .setParameter("moduleId", this.currentModule)
                .setParameter("subjectId", this.subject)
                .getResultList();
        
        Map<Activities, ActScores> scoreList = new HashMap<>();
        
        for(Activities act: activities) {
            List<ActScores> actScores = em.createNamedQuery("ActScores.findByStudentAndActivitytId")
                .setParameter("studentId", this.student)
                .setParameter("activityId", act)
                .getResultList();
            
            ActScores actScore = new ActScores(-1,0);
            
            if(actScores.size() > 0) {
                actScore = actScores.get(0);
            }
            scoreList.put(act, actScore);
        }
        
        return scoreList;
    }

    public Modules getModuleById(int moduleId) {
        return ((Modules) em.createNamedQuery("Modules.findById")
                .setParameter("id", moduleId)
                .getSingleResult());
    }

    public List<Integer> getSemesterList() {
        return em.createNamedQuery("Semesters.findAll").getResultList();
    }

    public List<Integer> getModuleList() {
        return em.createNamedQuery("Modules.findBySemesterId")
                .setParameter("semesterId", this.currentSemester)
                .getResultList();
    }

    public void setCurrentSemester(Semesters currentSemester) {
        this.currentSemester = currentSemester;
        this.currentModule = (Modules)em.createNamedQuery("Modules.findBySemesterIdAndTitle")
                .setParameter("semesterId", this.currentSemester)
                .setParameter("title", this.currentModule.getTitle())
                .getSingleResult();
    }

    public void setCurrentModule(Modules currentModule) {
        this.currentModule = currentModule;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    
}
