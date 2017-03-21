package com.dobryden.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
	
	@RequestMapping(value={"/","","/index"})
	public String gotoindex()
	{
		return "index";
	}

	@RequestMapping("/first")
	public String gotofirst()
	{
		return "FIRST";
	}

     @RequestMapping("/login")
    public String gotologin()
    {
	return "login";
    }
    
    @RequestMapping("/SellerRegistration")
    public String gotSellerRegestration()
    {
	return "SellerRegistration";
    }
    }