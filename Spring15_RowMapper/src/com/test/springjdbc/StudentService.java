package com.test.springjdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class StudentService {

	private JdbcTemplate jdbctemp;
	
	public void listData()	{
		
		// 
		
		List list = jdbctemp.query("select * from student", new StudentMapper());
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Student stu = (Student) itr.next();
			System.out.println(stu.toString());
		}
	}
	
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
}
