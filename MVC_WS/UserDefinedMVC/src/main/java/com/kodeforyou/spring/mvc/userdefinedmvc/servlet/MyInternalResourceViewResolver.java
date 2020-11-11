package com.kodeforyou.spring.mvc.userdefinedmvc.servlet;
import org.springframework.web.servlet.ModelAndView;

public class MyInternalResourceViewResolver {
	private String prefix;
	private String suffix;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getRedirectableView(ModelAndView mav) {
		
		String redirectableView = prefix+mav.getViewName()+suffix;
		return redirectableView;
	}

}
