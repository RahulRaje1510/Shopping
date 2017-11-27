package com.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.HelloWorldDao;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Autowired
	HelloWorldDao helloWorldDao;

	public void save(String name, String pass) {

		
		helloWorldDao.save(name, pass);

	}

	

}
