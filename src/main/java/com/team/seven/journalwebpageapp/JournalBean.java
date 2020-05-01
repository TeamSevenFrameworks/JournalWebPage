/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team.seven.journalwebpageapp;

import com.team.seven.journalwebpageapp.model.ActScores;
import com.team.seven.journalwebpageapp.model.Students;
import com.team.seven.journalwebpageapp.model.Subjects;
import java.io.Serializable;
import java.util.List;
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
public class JournalBean implements Serializable{
    
    @PersistenceContext
    EntityManager em;
    
    private Students student;
    private Subjects subject;
    
    private int currentSemester = 1;
    private int currentModule = 1;

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
    
    public String goToSubjects(Students student){
        this.setStudent(student);
        return "subjects";
    }
    
    public String goToJournal(Subjects subject){
        this.setSubject(subject);
        this.currentModule = 1;
        this.currentSemester = 1;
        return "journal";
    }
    
    public List<ActScores> getScoreList(){
        return em.createNamedQuery("ActScores.findByStudentSubjectSemesterModule").
                setParameter("studentId", student.getStudentId()).
                setParameter("subjectId", subject.getSubjectId()).
                setParameter("module", this.currentModule).
                setParameter("semester", this.currentSemester).
                getResultList();
    }
    
    public List<Integer> getSemesterList(){
        return em.createNamedQuery("ActScores.getSemesters").getResultList();
    }
    
    public List<Integer> getModuleList(){
        return em.createNamedQuery("ActScores.getModules").getResultList();
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public void setCurrentModule(int currentModule) {
        this.currentModule = currentModule;
    }
    
    
}
