package com.in28minutes.microservices.netflixzuulapigetwayserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.*;

@Component
public class ZullLoggingFilter extends ZuulFilter{

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//for filter apply or not/ return as true or false
	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	@Override
	public Object run() {
		
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("request -> {} request uri -> {}"+request,request.getRequestURI());
		return null;
	}

	//this can use for filter before execution -> "pre" , after -> "post" or when error ->"error"
	@Override
	public String filterType() {
		
		return "pre";
	}

	//for set filter order
	@Override
	public int filterOrder() {
		
		return 1;
	}

}
