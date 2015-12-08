package com.test.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentService {

	private JdbcTemplate jdbctemp;

	public void listData()
	{
		//jdbctemp.execute("create table student(id number, name varchar2(10));");
		
		//jdbctemp.update("insert into student(id, name) values (102, 'Yunus');");
		// OR
		
		jdbctemp.update("insert into student(id,name) values (?,?);",new Object[] {103,"New Yunus"});
		
		// count == number of rows available in table
		
		//QueryforInt has 2 types:
		//int k = jdbctemp.queryForInt("select count(*) from student");
		
		int k = jdbctemp.queryForInt("select count(*) from student where id=?", new Object[] {103});
	
		
		//Queryforlong we will be using to get the sum of employee salaries.
		//QueryforObject used to retrieve the JAVA API class from select statement
		
		/* JDBCTemplate class is divided into 3 types
		 * 1. execute() method -- execute DDL operations (create, drop)
		 * 2. update() method -- execute DML operations (insert,delete, update)
		 * 3. query() method 
		 */
		
		System.out.println("Table is created successfully");
	}
	
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
}
