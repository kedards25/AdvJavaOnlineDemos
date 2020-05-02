package com.learning.ipfilterdemo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class IPFilter
 */
@WebFilter(
		urlPatterns = { "/IPServlet" }, 
		initParams = { 
				@WebInitParam(name = "valid_IP", value = "10.16.69.133")
		})
public class IPFilter implements Filter {

	FilterConfig config;
    /**
     * Default constructor. 
     */
    public IPFilter() {
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
		String ipVal=request.getRemoteAddr().toString();
		if (ipVal.equals(config.getInitParameter("valid_IP"))) {
			chain.doFilter(request, response);
		}
		else
		{
			System.out.println("Request from invalid IP");
			RequestDispatcher dispatcher=request.getRequestDispatcher("index.html");
			dispatcher.forward(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		config=fConfig;
	}

}
