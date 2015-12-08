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
/*		System.out.println("By using QueryForList...........\n");
		List list = jdbctemp.queryForList("select * from student");
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj.toString());
		}
		
		// In JDBC we use ResultSet === Spring we use RowSet
		
		System.out.println("By using QueryForRowSet...........\n");
		
		SqlRowSet rowset = jdbctemp.queryForRowSet("select * from student");
		
		while(rowset.next())
		{
			System.out.println(rowset.getInt(1));			// Getting the First column
		}
		*/
		System.out.println("By using QueryForMap...........\n");
		
		// QueryForMap: It will retrieve only one record, It will retrieve very fast
		
		// Ex: In passport office, we get the application very fast using passport id
		
		Map map = jdbctemp.queryForMap("select * from student where id=102");
		Set set = map.entrySet();
		
		Iterator itr2 = set.iterator();
		
		while(itr2.hasNext())
		{
			Map.Entry entry = (Map.Entry) itr2.next();
			System.out.println("Key: "+entry.getKey());			// Column name
			System.out.println("Value: "+entry.getValue());			// Row value
		}
		
		/*Drawbacks of queryForMap:
		 * 1. If same ID contains 4 records, it may display Exception
		 * IncorrectResultSizeDataAccessException: 
		 * Solution: we use QueryForMap
		 */
	}
	
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
}
