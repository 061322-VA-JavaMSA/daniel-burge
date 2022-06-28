package com.revature.connectionutil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUse{

	private static Connection c;


	
	

	public static Connection getConnectionFromFile() {
		Properties file = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		try {
			file.load(loader.getResourceAsStream("connection.properties"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String url = file.getProperty("url");
		String username = file.getProperty("username");
		String password = file.getProperty("password");

		try {
			if (c == null || c.isClosed()) {
				
					c = DriverManager.getConnection(url, username, password);
				

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}}

//	//public static Connection getConnectionFromEnv() throws SQLException {
//
//		//String url = System.getenv("DB_URL");
//	//	String username = System.getenv("DB_USER");
//
//	//	String password = System.getenv("DB_PASS");
//
//	//	if (c == null || c.isClosed()) {
//			c = DriverManager.getConnection(url, username, password);
//
//	/	}
//	//return c;
//
//	}}



	

