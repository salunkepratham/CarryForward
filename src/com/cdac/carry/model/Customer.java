package com.cdac.carry.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue
	private int custId;
	
	private String custFname;
	private String custLname;
	private String custMobile;
	private String custAddress;
	private int custPincode;
	@Column(unique=true)
	private String custEmail;
	private String password;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustFname() {
		return custFname;
	}
	public void setCustFname(String custFname) {
		this.custFname = custFname;
	}
	public String getCustLname() {
		return custLname;
	}
	public void setCustLname(String custLname) {
		this.custLname = custLname;
	}
	public String getCustMobile() {
		return custMobile;
	}
	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public int getCustPincode() {
		return custPincode;
	}
	public void setCustPincode(int custPincode) {
		this.custPincode = custPincode;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(String custFname, String custLname, String custMobile, String custAddress, int custPincode,
			String custEmail, String password) {
		super();
		this.custFname = custFname;
		this.custLname = custLname;
		this.custMobile = custMobile;
		this.custAddress = custAddress;
		this.custPincode = custPincode;
		this.custEmail = custEmail;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custFname=" + custFname + ", custLname=" + custLname + ", custMobile="
				+ custMobile + ", custAddress=" + custAddress + ", custPincode=" + custPincode + ", custEmail="
				+ custEmail + ", password=" + password + "]";
	}
	public Customer() {
		super();
	}
	
	
}
