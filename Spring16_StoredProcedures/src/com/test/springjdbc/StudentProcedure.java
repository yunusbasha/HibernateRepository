package com.test.springjdbc;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class StudentProcedure extends StoredProcedure

{
	public StudentProcedure(DataSource ds) {
		super(ds,"Sprocedure");						//name of the procedure
		System.out.println("Constructor starts.......... \n");
		
		/*declareParameter -- predefined method
		  * SQLParameter -- we are passing some value into procedure
		  * SQLOUT -- we are retrieving value from procedure
		  * 
		  * Java  				(broker class)			DB
		  * -------														-----
		  * int				TYPES.INTEGER 			number
		  * String		TYPES.STRING				varchar
		
		  */
		
		declareParameter(new SqlParameter("id",Types.INTEGER));
		declareParameter(new SqlOutParameter("name",Types.VARCHAR));
		System.out.println("Constructor ends....");
	}
	
	public void executeMyProcedure(int studentid) //102
	{
		System.out.println("Execute my procedure");
		Map map = new HashMap();
		
		map.put("id", new Integer(studentid));   // id=102
		
		Map executemap = execute(map);			// executing the map
		
		String obj = (String) executemap.get("name");
		
		System.out.println("The name is "+obj);
		
	}
	
}
