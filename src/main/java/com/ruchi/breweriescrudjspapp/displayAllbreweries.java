/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruchi.breweriescrudjspapp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ruchi Devi
 */

@Controller
@RequestMapping("/breweries")
public class displayAllbreweries {

    @Autowired
    BreweriesService service;

    @GetMapping("/View")
    public ModelAndView getAllBreweries() {
        List<Breweries> list = BreweriesService.getAllBreweries();
        return new ModelAndView("/Displaybreweries", "breweriesList", list);
    }

}
