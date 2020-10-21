package com.wdu.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wdu.model.RegisterForm;

@Repository
public class RegisterFormDAOImpl {
	
	@Autowired
	private SessionFactory sessionFactory;
	public void save(RegisterForm sf) {
		sessionFactory.getCurrentSession().saveOrUpdate(sf);
		System.out.println("Record Updated");
		
	}

}
