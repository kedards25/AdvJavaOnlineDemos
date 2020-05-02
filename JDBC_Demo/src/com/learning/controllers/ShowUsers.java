package com.learning.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.models.DemoModel;
import com.learning.services.DemoService;
import com.learning.services.DemoServiceImpl;

/**
 * Servlet implementation class AddNew
 */
@WebServlet("/ShowUsers")
public class ShowUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		DemoService service=new DemoServiceImpl();
		List<DemoModel> dataList= service.getModelData();
		if(dataList.size()>0)
		{
			for(DemoModel demoObj:dataList)
			{
				response.getWriter().print(demoObj.getId()+" "
						+ ""+demoObj.getUserName()+" "+demoObj.getUserPwd()+"	");
				response.getWriter().print("<a href=''>View</a>  <a href=''>Edit</a> <a href=''>Delete</a><br/>");
				
			
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
