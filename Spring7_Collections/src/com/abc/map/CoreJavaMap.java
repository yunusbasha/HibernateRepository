package com.abc.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CoreJavaMap {

	public static void main(String[] args) {

		ObjectMapbean omb = new ObjectMapbean();
		
		Map map = new HashMap();
		
		map.put("101", "Yunus");
		map.put("102", "Irshad");
		map.put("103", omb);					// ERROR: while passing object into map it shows NULL
		
		System.out.println(map);
		
		
		System.out.println(map.keySet());			// displays only keys
		
		Collection values = map.values();
		System.out.println(values);		// displays only values
		
	}

}
