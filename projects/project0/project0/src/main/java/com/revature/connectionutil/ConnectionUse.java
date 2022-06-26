package com.revature.connectionutil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUse{

	private static Connection c;


	
	

	public static Connection getConnectionFromFile() throws SQLException, IOException {
		Properties file = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		file.load(loader.getResourceAsStream("connection.properties"));
		
		String url = file.getProperty("url");
		String username = file.getProperty("username");
		String password = file.getProperty("password");

		if (c == null || c.isClosed()) {
			c = DriverManager.getConnection(url, username, password);

		}
		return c;

	}

	public static Connection getConnectionFromEnv() throws SQLException {

		String url = System.getenv("DB_URL");
		String username = System.getenv("DB_USER");

		String password = System.getenv("DB_PASS");

		if (c == null || c.isClosed()) {
			c = DriverManager.getConnection(url, username, password);

		}
		return c;

	}}



	

