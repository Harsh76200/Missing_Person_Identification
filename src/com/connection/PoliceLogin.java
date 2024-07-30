package com.connection;
import com.operation.UserInfo;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operation.UserInfo;

//import com.operation.UserInfo;

/**
 * Servlet implementation class Login
 */
public class PoliceLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PoliceLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  
		
		
//	    
//	    	    if (accnumber.equals("12345678") && Password.equals("Harsh143"))
//	    {
//	    	response.sendRedirect("dashboard.html");
//	    }
//		else
//		{
//			response.sendRedirect("index.html");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Connection con = DbConnection.connect();
		try {
			
		//int accnumber = Integer.parseInt(request.getParameter("accnumber"));
			String email = request.getParameter("email");
		    String Password = request.getParameter("password");
	
	    PreparedStatement pstmt = con.prepareStatement("select * from policestation where email=? and p_password=?");
	    pstmt.setString(1, email);
	    pstmt.setString(2, Password);
	    
	    
	    ResultSet rs = pstmt.executeQuery();
	    if(rs.next())
	    {
	    	response.sendRedirect("dashboardpolice.html");
	    	String email2= rs.getString(6);
	    	UserInfo.setEmail2(email2);
	    }
	    else
	    {
	    	response.sendRedirect("index.html");
	    }
	    
	    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
