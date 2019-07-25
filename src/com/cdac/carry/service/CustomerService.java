package com.cdac.carry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.carry.dao.ICustomerDao;
import com.cdac.carry.model.Consignment;
import com.cdac.carry.model.Customer;

@Service
public class CustomerService implements ICustomerService{
	
	
	@Autowired
	private ICustomerDao dao;
	
	
	@Override
	@Transactional
	public Integer addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}


	@Override
	public Integer addConsigment(Consignment consignment) {
		return dao.addConsignment(consignment);
	}


	@Override
	public boolean loginCheck(String custEmail,String password) {
		
		return dao.loginCheck(custEmail,password);
	}
	
}
