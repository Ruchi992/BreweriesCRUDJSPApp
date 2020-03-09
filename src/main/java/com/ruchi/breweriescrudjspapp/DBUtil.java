/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruchi.breweriescrudjspapp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Ruchi Devi
 */
    
    public class DBUtil {
     
    private static final EntityManagerFactory EMF = 
            Persistence.createEntityManagerFactory("taste");
     
    public static EntityManagerFactory getEMF() { return EMF; }

    
}
  
    

