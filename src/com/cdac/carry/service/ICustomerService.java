package com.cdac.carry.service;

import com.cdac.carry.model.Consignment;
import com.cdac.carry.model.Customer;

public interface ICustomerService {
	public Integer addCustomer(Customer customer);
	public Integer addConsigment(Consignment consignment);
	public boolean loginCheck(String custEmail,String password);
}
