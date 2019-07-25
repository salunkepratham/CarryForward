package com.cdac.carry.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="consignment")
public class Consignment {
	
	@Id
	@GeneratedValue
	private int consId;
	private String sourceFname;
	private String sourceLname;
	private String sourceMobile;
	private String sourceAddress;
	private String destFname;
	private String destLname;
	private String destMobile;
	private String destAddress;
	private String conServiceBranch;
	private String deliveryType;
	private String consEmail;
	
	
	public int getConsId() {
		return consId;
	}
	public void setConsId(int consId) {
		this.consId = consId;
	}
	public String getSourceFname() {
		return sourceFname;
	}
	public void setSourceFname(String sourceFname) {
		this.sourceFname = sourceFname;
	}
	public String getSourceLname() {
		return sourceLname;
	}
	public void setSourceLname(String sourceLname) {
		this.sourceLname = sourceLname;
	}
	public String getSourceMobile() {
		return sourceMobile;
	}
	public void setSourceMobile(String sourceMobile) {
		this.sourceMobile = sourceMobile;
	}
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public String getDestFname() {
		return destFname;
	}
	public void setDestFname(String destFname) {
		this.destFname = destFname;
	}
	public String getDestLname() {
		return destLname;
	}
	public void setDestLname(String destLname) {
		this.destLname = destLname;
	}
	public String getDestMobile() {
		return destMobile;
	}
	public void setDestMobile(String destMobile) {
		this.destMobile = destMobile;
	}
	public String getDestAddress() {
		return destAddress;
	}
	public void setDestAddress(String destAddress) {
		this.destAddress = destAddress;
	}
	public String getConServiceBranch() {
		return conServiceBranch;
	}
	public void setConServiceBranch(String conServiceBranch) {
		this.conServiceBranch = conServiceBranch;
	}
	public String getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public String getConsEmail() {
		return consEmail;
	}
	public void setConsEmail(String consEmail) {
		this.consEmail = consEmail;
	}
	public Consignment(String sourceFname, String sourceLname, String sourceMobile, String sourceAddress,
			String destFname, String destLname, String destMobile, String destAddress, String conServiceBranch,
			String deliveryType, String consEmail) {
		super();
		this.sourceFname = sourceFname;
		this.sourceLname = sourceLname;
		this.sourceMobile = sourceMobile;
		this.sourceAddress = sourceAddress;
		this.destFname = destFname;
		this.destLname = destLname;
		this.destMobile = destMobile;
		this.destAddress = destAddress;
		this.conServiceBranch = conServiceBranch;
		this.deliveryType = deliveryType;
		this.consEmail = consEmail;
	}
	public Consignment() {
		super();
	}
	@Override
	public String toString() {
		return "Consignment [consId=" + consId + ", sourceFname=" + sourceFname + ", sourceLname=" + sourceLname
				+ ", sourceMobile=" + sourceMobile + ", sourceAddress=" + sourceAddress + ", destFname=" + destFname
				+ ", destLname=" + destLname + ", destMobile=" + destMobile + ", destAddress=" + destAddress
				+ ", conServiceBranch=" + conServiceBranch + ", deliveryType=" + deliveryType + ", consEmail="
				+ consEmail + "]";
	}
	
	
	
}
