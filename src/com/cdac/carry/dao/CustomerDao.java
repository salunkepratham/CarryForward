package com.cdac.carry.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.carry.model.Consignment;
import com.cdac.carry.model.Customer;

@Repository
public class CustomerDao implements ICustomerDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Integer addConsignment(Consignment consignment) {
		Session session=this.sessionFactory.openSession();
		Integer id=(Integer) session.save(consignment);
		session.close();
		return id;
	}
	@Override
	public Integer addCustomer(Customer customer) {
		Session session=this.sessionFactory.getCurrentSession();
		Integer id=(Integer) session.save(customer);
		session.close();
		return id;
	}
	@Override
	public boolean loginCheck(String custEmail,String password) {
		Session session=this.sessionFactory.getCurrentSession();
		boolean isValid=false;
		String sqlQuery = "from customer u where u.name='"+custEmail+"' and u.password='"+password+"'";
		try {
			Query query = session.createQuery(sqlQuery);
	        List results = query.list();
	        if((results != null) && (results.size()>0)) {
	        	isValid=true;
	        	System.out.println(results);
	        }
		}
		catch(Exception e) {
            isValid = false;
               
        }
		session.close();
		return isValid;
	}

	

}
