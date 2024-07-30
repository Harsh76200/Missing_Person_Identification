package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static Connection connect()
	{
		 
		
        Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Connection Loaded Now");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/missingperson","root","");
			
			System.out.println("Connection Established now");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}

}

