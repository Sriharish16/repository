package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Product;
import com.example.demo.repos.*;

@Controller
public class ProductController {
	
	@Autowired
	private Product entity;
	
	@Autowired
	private ProductRepositry repo;
	

	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String initForm(Model model) {
		model.addAttribute("title","Add Products");
		model.addAttribute("command",entity);
		return "addProduct";
		
		
	}
	
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command")Product entity) {
		int rowAdded;
		try {
			rowAdded=this.repo.add(entity);
		return "success";
		
			
		}catch(Exception e) {
			e.printStackTrace();
		return "failure";
	}
	
		
	}
	@RequestMapping(value=("/product/{id}"),method=RequestMethod.GET)
    public String findById(@PathVariable(value="id") Integer id, Model model) {              
          

        
		model.addAttribute("userAttribute", repo.findById(id));  
       
        return "findById";
    }
	
	@RequestMapping(value=("/product/remove/{id}"),method=RequestMethod.GET)
    public String remove(@PathVariable(value="id") Integer id, Model model) {              
          

        
		
		model.addAttribute("remove", repo.remove(id));  
       
        return "remove";
    }

}