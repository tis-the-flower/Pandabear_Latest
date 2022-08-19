package com.parik.pandabear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


	
    @RequestMapping("/index")
    public String home(){
    	
    	//sendSimpleMessage("chudasma@gmail.com","Test Subject", "Test");
        return "index";
    }

    @RequestMapping("/header")
    public String header(){

        return "header";
    }


    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/pricings")
    public String pricings(){
        return "pricings";
    }

    @RequestMapping("/pricing")
    public String pricing(){
        return "pricing";
    }
    
    @RequestMapping("/contact")
    public String contact(ModelMap modelmap){
    	
	    modelmap.addAttribute("ContactName", "Hello There");
        return "contact";
    }

 
    
    @RequestMapping("/trainers")
	public String trainers(){
    	return "trainers";
	}    
    
    @RequestMapping("/events")
	public String events(){
    	return "events";
	}
   
    @RequestMapping("/enroll")
	public String courses(){
    	return "enroll";
	}    
    
    
    
    /*
    @RequestMapping("/contact")
    	public String contact(){
        	return "contact";
    	}

      
     * 
     */
    
    

}
