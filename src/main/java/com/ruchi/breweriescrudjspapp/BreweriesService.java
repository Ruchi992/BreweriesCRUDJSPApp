/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruchi.breweriescrudjspapp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ruchi Devi
 */
@Service
public class BreweriesService {

    @Autowired
    BreweriesService breweriesService;

    public static List<Breweries> getAllBreweries() {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        System.out.println("BreweriesDB Breweries");
        String query = "SELECT b FROM Breweries b";

        TypedQuery<Breweries> typedQuery = em.createQuery(query, Breweries.class);

        List<Breweries> list = null;

        try {
            list = typedQuery.getResultList();
            for (Breweries brewery : list) {
                System.out.println(brewery);

            }

            if (list == null || list.isEmpty()) {
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
        System.out.println("end");
        return list;
    }
    
    //    @GetMapping("/View")
    @RequestMapping(value="/View")
    public ModelAndView getAllBreweriesModel() {
        List<Breweries> list = BreweriesService.getAllBreweries();
        return new ModelAndView("/Displaybreweries", "breweriesList", list);
    }


}
