package com.learning.perffilterdemo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class PerformanceFilter
 */
@WebFilter("/PerformanceServlet")
public class PerformanceFilter implements Filter {

	FilterConfig config;
    /**
     * Default constructor. 
     */
    public PerformanceFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		long reqRecvdTime=System.currentTimeMillis();
		try {
			Thread.sleep(500);
			chain.doFilter(request, response);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long respRecvdTime=System.currentTimeMillis();
		
		long performanceTime=respRecvdTime-reqRecvdTime;
		//System.out.println("Performance Time :"+performanceTime+" miliseconds(s)");
		config.getServletContext().log("Performance Time :"+performanceTime+" miliseconds(s)");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		config=fConfig;
		// TODO Auto-generated method stub
	}

}
