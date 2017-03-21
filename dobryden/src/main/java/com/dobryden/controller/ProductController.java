package com.dobryden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dobryden.DAO.ProductDAO;
import com.dobryden.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDAO prod;
	
	@RequestMapping("/productt")
	public ModelAndView productpage()
	{
		ModelAndView mv=new ModelAndView("productt","addsell",new Product());
		return mv;
	}

	@RequestMapping(value="/productreg",method = RequestMethod.POST)
	public String Prodregpage(@ModelAttribute("addsell")Product p)
	{
		prod.insert_product(p);
		return "productt";
	}
}
