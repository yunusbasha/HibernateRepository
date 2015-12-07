package com.abc.set;

import java.util.HashSet;
import java.util.Set;

public class CoreJavaSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		set.add("Yunus");					
		set.add("Irshad");
		set.add("Yunus");				// SET does not allow duplicate values
		set.add(" ");							// SET allow null values
		
		System.out.println(set);
	}

}
