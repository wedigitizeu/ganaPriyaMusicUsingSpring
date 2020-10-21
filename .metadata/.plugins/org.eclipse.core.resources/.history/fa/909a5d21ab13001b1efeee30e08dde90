package com.wdu.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.wdu.dao.RegisterFormDAO;
import com.wdu.model.RegisterForm;

public class RegisterFormServiceImpl implements StudentRegisterFormService {

	@Autowired
	RegisterFormDAO studentRegisterFormDAO;
	
	@Override
	public void save(RegisterForm sf) {

		studentRegisterFormDAO.save(sf);

	}

}
