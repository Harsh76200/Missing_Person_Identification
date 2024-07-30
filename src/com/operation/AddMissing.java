package com.operation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.connection.DbConnection;

/**
 * Servlet implementation class AddPolice
 */
@MultipartConfig(maxFileSize = 1024*1024*10,//10MB
fileSizeThreshold=1024*1024*2,	//2MB
maxRequestSize=1024*1024*50) //50MB
public class AddMissing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMissing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Connection con = DbConnection.connect();
		int id = 0;
	    String name = request.getParameter("name");
	    int age = Integer.parseInt(request.getParameter("age"));
		String city = request.getParameter("city");
		String lastseen = request.getParameter("lastseen");
	    String idmark = request.getParameter("idmark");
	    String height = request.getParameter("height");
	    String gender = request.getParameter("gender");
		String color = request.getParameter("color");
		String email1 = UserInfo.getEmail2();
		
		Part file=request.getPart("photo");
		String filename=getSubmittedFileName(file);
		System.out.println(filename);
		String foldername=name;
		System.out.println(foldername);
		String dpath="C:/Users/ADMIN/Desktop/New folder/Missing Person Identification/WebContent/missingpeopleimg/";
		
		String fpath=dpath+foldername;
		System.out.println(fpath);
		
		 File f1 = new File(fpath);  
		 boolean bool = f1.mkdir();  
	      if(bool)
	      {  
	         System.out.println("Folder is created successfully");  
	      }
	      else
	      {  
	         System.out.println("Error Found!");  
	      }  
		
		String path=fpath+"/"+filename;
		try
		{
			FileOutputStream fos=new FileOutputStream(path);
			InputStream is =file.getInputStream();
			byte[] data=new byte[is.available()];
			is.read(data);
			fos.write(data);
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	    
	    PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement("insert into missingdata values (?,?,?,?,?,?,?,?,?,?,?)");
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setString(4, city);
			pstmt.setString(5, lastseen);
			pstmt.setString(6, idmark);
			pstmt.setString(7, height);
			pstmt.setString(8, gender);
			pstmt.setString(9, color);
			pstmt.setString(10, filename);
			pstmt.setString(11, email1);
			
			int i = pstmt.executeUpdate();
			    if(i>0)
			    {
			    	response.sendRedirect("addedpolice.html");
			    }
			   
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
private String getSubmittedFileName(Part file) {
        
        for(String cd:file.getHeader("content-disposition").split(";"))
        {
        	if(cd.trim().startsWith("filename"))
        	{
        		String filename=cd.substring(cd.indexOf('=')+1).trim().replace("\"", "");
        				return filename.substring(filename.lastIndexOf('/')+1).substring(filename.lastIndexOf('\\')+1);
        	}
        }
        	return null;
        }
}
