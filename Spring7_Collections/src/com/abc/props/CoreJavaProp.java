package com.abc.props;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.abc.map.MapBean;

public class CoreJavaProp {

	public static void main(String[] args) {

		Properties props = new Properties();
		
		props.put("101", "Yunus");					// value must be string only
		props.put("102", "Irshad");				// PROPS won't allow any other data type 
		
		System.out.println(props);
	}

}
