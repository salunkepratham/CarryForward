package com.cdac.carry.dao;

import com.cdac.carry.model.Consignment;
import com.cdac.carry.model.Customer;

public interface ICustomerDao {
	public Integer addCustomer(Customer customer);
	public Integer addConsignment(Consignment consignment);
	public boolean loginCheck(String custEmail,String password);
}
