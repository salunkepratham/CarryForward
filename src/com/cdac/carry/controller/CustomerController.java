package com.cdac.carry.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.carry.model.Consignment;
import com.cdac.carry.model.Customer;

import com.cdac.carry.service.ICustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
	@RequestMapping("/")
	public String Home(Model model) {
//		Customer customer =new Customer();
//		model.addAttribute("customer", customer);
		return "index";
	}
	@RequestMapping(value="/login")
	public String Login1(Model model) {
		Customer customer =new Customer();
		return "login";
	}
	
	@RequestMapping(value="/custlogin",method=RequestMethod.POST)
	public String CustLogin(@ModelAttribute("customer") @Valid Customer p,
			BindingResult result, Model model) {
		String msg="";
		String email=p.getCustEmail();
		String password=p.getPassword();
		System.out.println(p.getCustEmail());
		System.out.println(p.getPassword());

		//boolean isValid=this.customerService.loginCheck(custEmail,password);
		if(email.equals("Pratham") && password.equals("1234")) {
			System.out.println("hii");
			return "Welcome";
		}
		return "login";
	}
	
	@RequestMapping(value="/register")
	public String Register(Model model) {
		//Consignment consignment=new Consignment();
		//model.addAttribute("consignment", consignment);
		Customer customer =new Customer();
		model.addAttribute("customer", customer);
		return "customer_registration";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String Add(@ModelAttribute("customer") @Valid Customer p,
			BindingResult result, Model model) {
		Integer id=this.customerService.addCustomer(p);
		model.addAttribute("id", id);
		return "login";
	}
	
	@RequestMapping(value="/consignment",method=RequestMethod.POST)
	public String AddConsignment(@ModelAttribute("consignment") @Valid Consignment consignment,
			BindingResult result, Model model) {
		Integer id=this.customerService.addConsigment(consignment);
		model.addAttribute("id", id);
		return "Add";
	}
}
