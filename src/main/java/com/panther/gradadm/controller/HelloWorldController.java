package com.panther.gradadm.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//Creating a jdbc template
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
    public void setJdbcTemplate(@Qualifier("orclDataSource") DataSource orclDataSource) {
        this.jdbcTemplate = new JdbcTemplate(orclDataSource);
    }
	
	
	
	
	@RequestMapping("/Apply")
	public String helloWorld() {
		String lastName = (String) this.jdbcTemplate.queryForObject(
		        "select last_name from student_master where student_id = ?", 
		        new Object[]{new Long(1)}, String.class);
		
		String firstName = (String) this.jdbcTemplate.queryForObject(
		        "select first_name from student_master where student_id = ?", 
		        new Object[]{new Long(1)}, String.class);
		
		System.out.println("The Student in registered is "+firstName+" "+" "+lastName);
		
	
		
		return "<h2>Hello Shubham Welcome to the application</h2>";
	}
}
