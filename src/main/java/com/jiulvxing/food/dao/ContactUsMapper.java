package com.jiulvxing.food.dao;

import org.springframework.transaction.annotation.Transactional;

import com.jiulvxing.food.bean.ContactUs;

@Transactional
public interface ContactUsMapper {
	
	public int agentInsert(ContactUs contactUs);
	
   
}
