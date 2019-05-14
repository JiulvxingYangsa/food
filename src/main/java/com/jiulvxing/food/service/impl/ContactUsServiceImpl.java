package com.jiulvxing.food.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiulvxing.food.bean.ContactUs;
import com.jiulvxing.food.dao.ContactUsMapper;
import com.jiulvxing.food.service.ContactUsService;
@Service
public class ContactUsServiceImpl implements ContactUsService {
    
	@Autowired
	ContactUsMapper contactUsMapper;
 	
	@Override
	public int insertAgent(ContactUs contactUs) {
		
		return contactUsMapper.agentInsert(contactUs);
	}

}
