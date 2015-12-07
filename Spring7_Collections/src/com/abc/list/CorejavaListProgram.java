package com.abc.list;

import java.util.ArrayList;
import java.util.List;

public class CorejavaListProgram {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();  // we must use generics as <String> data type

		list.add("Yunus");
		list.add("Irshad");
		
		System.out.println(list);
	}

}
