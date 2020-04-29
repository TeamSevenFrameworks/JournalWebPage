/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team.seven.journalwebpageapp;

import com.team.seven.journalwebpageapp.model.Students;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author T440
 */
@Stateless
@ManagedBean
public class StudentsBean {

    @PersistenceContext
    EntityManager em;
    
    public StudentsBean() {
    }
    
    public List<Students> getList(){
        return em.createNamedQuery("Students.findAll").getResultList();
    } 
}
