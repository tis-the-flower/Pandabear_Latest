package com.parik.pandabear.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parik.model.Contact;



@Controller
public class ContactController {

	@Autowired
    private JavaMailSender emailSender;
	
	 @RequestMapping("/contactus")
	    public String index(
	    		//	        @RequestParam(value = "name", required = false) String name,
	    		//@RequestParam(value = "email", required = false) String email,
	    		//@RequestParam(value = "subject", required = false) String subject,
	    		//@RequestParam(value = "mesage", required = false) Integer message,
	    		//Model model
	    		ModelMap model, 
	    	@ModelAttribute Contact contact
	    ) {
//	        model.addAttribute("name", name);
//	        model.addAttribute("email", email );
//	        model.addAttribute("subject",subject );
//	        model.addAttribute("message", message );
	        System.out.println("MY name is :"+ contact.getName());
	        model.addAttribute("contactName",  contact.getName() + ", Your message has been sent.Thank you!");
	        
	        
	        try {
	        	sendSimpleMessage("chudasma@gmail.com",contact.getEmail(),"Internet Inquiry from "+ contact.getName()+" ::: " +contact.getSubject(), contact.getMessage());
	        }catch(Exception ex) {
	        	System.out.println("Exception Occured..." + ex);
	        }
	        return "contact";
	    }
	 
	   public void sendSimpleMessage(
	    	      String to,String cc, String subject, String text) {
	    	        
	    	        SimpleMailMessage message = new SimpleMailMessage(); 
	    	        message.setFrom("parik.chudasma@gmail.com");
	    	        message.setTo(to); 
	    	        message.setCc(cc);
	    	        message.setSubject(subject); 
	    	        message.setText(text);
	    	        emailSender.send(message);
	    	    }
}