package com.test.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
/*
 * * From DB we are getting raw data (we cannot do any operation).  so inorder to get data from DB we use rowmapper

Files need: 	1. Student.java (POJO class)
						2. StudentMapper class (implement rowmapper interface)
						3. StudentService class (configure studentmapper object into list)
						4. TestClass (configure StudentService object)
						5. bean.xml
 */
public class StudentMapper implements RowMapper

{
	// RowMapper contains only one method == mapRow()
	
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Student student = new Student();
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			
			System.out.println("Row count: "+rowNum);
			return student;
		}
}
