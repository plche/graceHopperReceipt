package com.codingdojo.peru.full_time_2022.grace_hopper_receipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Alambre de cobre";
        double price = 5.25;
        String description = "Tiras de metal, otra ilustración de nanosegundos.";
        String vendor = "Tienda de la esquina Pequeñas Cosas";
        
        String name2 = "Percy Che";
        String itemName2 = "Java Stack";
        double price2 = 1500.00;
        String description2 = "Course to acquire Java Spring Development skills";
        String vendor2 = "Coding Dojo";
    
    	model.addAttribute("name", name);
    	model.addAttribute("itemName", itemName);
    	model.addAttribute("price", price);
    	model.addAttribute("description", description);
    	model.addAttribute("vendor", vendor);
    
        model.addAttribute("name2", name2);
        model.addAttribute("itemName2", itemName2);
        model.addAttribute("price2", price2);
        model.addAttribute("description2", description2);
        model.addAttribute("vendor2", vendor2);
        
        return "index.jsp";
	}
}
