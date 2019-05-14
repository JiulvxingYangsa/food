package com.jiulvxing.food.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jiulvxing.food.bean.ContactUs;
import com.jiulvxing.food.bean.Msg;
import com.jiulvxing.food.service.ContactUsService;

@Controller
public class AgentController {

	
	
	@Autowired
	ContactUsService contactUsService;
	
	@RequestMapping("/insertAgent")
	public Msg insertAgent(@RequestParam("cName")String cName,@RequestParam("cEmail")String cEmail,@RequestParam("cNumber")String cNumber,@RequestParam("cIdea")String cIdea) {
		
		ContactUs contactUs = new ContactUs();
		contactUs.setcName(cName);
		contactUs.setcEmail(cEmail);
		contactUs.setcNumber(cNumber);
		contactUs.setcIdea(cIdea);
	    contactUsService.insertAgent(contactUs);
		return Msg.success();
	}
	
	
}
