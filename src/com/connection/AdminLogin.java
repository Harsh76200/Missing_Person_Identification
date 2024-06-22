package com.connection;

import java.io.*;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.operation.UserInfo2;

/**
 * Servlet implementation class login1
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//int accnumber = Integer.parseInt(request.getParameter("accnumber"));
		String email = request.getParameter("email");
	    String Password = request.getParameter("password");
	
	    if(email.equals("admin@gmail.com") && Password.equals("admin"))
	    {
	    	response.sendRedirect("dashboard.html");
	    	//String email2 = rs.getString(2);
	    	//UserInfo2.setEmail(email);
	    }
	    else
	    {
	    	response.sendRedirect("index.html");
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
