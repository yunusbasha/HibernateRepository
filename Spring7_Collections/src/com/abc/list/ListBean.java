package com.abc.list;

import java.util.List;

public class ListBean {

	//List can store different data type
	private List list;   //we must use generic's <String> data type

	// In java every class is also its own data type
	public List getList() {							//Remove the <String> data type because we are going to use different data types
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ListBean [list=" + list + "]";
	}

}
