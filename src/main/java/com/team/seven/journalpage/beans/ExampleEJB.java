/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team.seven.journalpage.beans;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author T440
 */
@Stateless
@Named
public class ExampleEJB {

    @PersistenceContext
    EntityManager em;
   
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
     
    public List getList(){
        return em.createNamedQuery("Example.findAll").getResultList();
    }
}
