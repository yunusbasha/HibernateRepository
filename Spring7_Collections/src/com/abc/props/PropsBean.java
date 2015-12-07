package com.abc.props;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropsBean {

	private Properties props;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "PropsBean [props=" + props + "]";
	}
}
