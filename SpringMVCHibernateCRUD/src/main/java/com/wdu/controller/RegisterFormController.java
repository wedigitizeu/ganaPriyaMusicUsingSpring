
package com.wdu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdu.service.RegisterFormService;

@Controller
public class RegisterFormController {

	@Autowired
	private RegisterFormService studentRegisterFormService;

	@RequestMapping("/register")
	public String getDashboard(Model model) {

		com.wdu.model.RegisterForm sf = new com.wdu.model.RegisterForm();
		sf.setName("Prakash");
		sf.setEmail("pk@gmail.com");
		sf.setPhone("7090565991");
		sf.setMusicCategory("Music");
		studentRegisterFormService.save(sf);

		return "applicationForm";
	}

}
