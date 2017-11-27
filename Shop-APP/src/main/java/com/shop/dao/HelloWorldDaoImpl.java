package com.shop.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldDaoImpl implements HelloWorldDao{
	
	@Autowired
	DataSource dataSource;
	
	
	public void save(String name, String pass) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		try{
			
			jdbcTemplate.execute("insert into login(name,pass) values('" + name + pass +"')");
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

	
}
