package com.operation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.DbConnection;

/**
 * Servlet implementation class AddPolice
 */
public class AddPolice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPolice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection con = DbConnection.connect();
		int id = 0;
		int code = Integer.parseInt(request.getParameter("code"));
	    String name = request.getParameter("name");
	    String location = request.getParameter("location");
		int mobile = Integer.parseInt(request.getParameter("mobile"));
		String email = request.getParameter("email");
	    String password = request.getParameter("password");
	    
	    PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement("insert into policestation values (?,?,?,?,?,?,?)");
			
			pstmt.setInt(1, id);
			pstmt.setInt(2, code);
			pstmt.setString(3, name);
			pstmt.setString(4, location);
			pstmt.setInt(5, mobile);
			pstmt.setString(6, email);
			pstmt.setString(7, password);
			
			int i = pstmt.executeUpdate();
			    if(i>0)
			    {
			    	response.sendRedirect("addedadmin.html");
			    }
			   
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
