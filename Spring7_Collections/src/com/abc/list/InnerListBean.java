package com.abc.list;

import java.util.List;

public class InnerListBean {

	private List<String> innerlist;

	public List<String> getInnerlist() {
		return innerlist;
	}

	public void setInnerlist(List<String> innerlist) {
		this.innerlist = innerlist;
	}

	@Override
	public String toString() {
		return "InnerListBean [innerlist=" + innerlist + "]";
	}
	
	
}
