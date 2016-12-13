package com.victommasi.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victommasi.eshop.dao.ProductDao;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private ProductDao productDao;
	

	@RequestMapping
	public String adminPage(){
		return "admin/admin";
	}
	
	@RequestMapping("/inventory")
	public ModelAndView viewInventory(){
		ModelAndView mv = new ModelAndView("admin/inventory");
		mv.addObject("products", productDao.findAll());
		return mv;
	}
	
	/*@RequestMapping("/inventory")
	public ModelAndView viewCustomer(){
		ModelAndView mv = new ModelAndView("admin/customer");
		//mv.addObject("customers", customersDao.findAll());
		return mv;
	}*/
}
