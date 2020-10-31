package com.serverside.validation.spbootmv.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.serverside.validation.spbootmv.entities.UserData;

@Controller
public class MyController {

	@GetMapping("/form")
	public String openForm(Model model) 
	{
		System.out.println("Opening form");
		model.addAttribute("userData", new UserData());
		
		return "form";
	}
	// handler for process form
	@PostMapping("/process")
	public String processForm(@Valid  @ModelAttribute("userData") UserData userData, BindingResult result)
	   {
		
		if(result.hasErrors())
			
		{
			
			System.out.println(result);
			return "form";
		}

		System.out.println(userData);
		return "success";
	  }
	
}
