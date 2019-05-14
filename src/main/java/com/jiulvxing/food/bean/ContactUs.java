package com.jiulvxing.food.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class ContactUs implements Serializable {
 
	private Integer cId;
	private String cName;
	private String cEmail;
	private String cNumber;
	private String cIdea;
	
	
	
	public ContactUs() {
	
		
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	public String getcNumber() {
		return cNumber;
	}
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public String getcIdea() {
		return cIdea;
	}
	public void setcIdea(String cIdea) {
		this.cIdea = cIdea;
	}
	public ContactUs(Integer cId, String cName, String cEmail, String cNumber, String cIdea) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cNumber = cNumber;
		this.cIdea = cIdea;
	}
	@Override
	public String toString() {
		return "ContactUs [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", cNumber=" + cNumber + ", cIdea="
				+ cIdea + "]";
	}
	
	
	
	
	 
}
