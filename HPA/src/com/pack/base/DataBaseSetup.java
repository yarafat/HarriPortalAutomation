package com.pack.base;

import java.sql.*;

public class DataBaseSetup {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "";
	Connection conn = null;
	Statement stmt = null;
	static final String USER = "";
	static final String PASS = "";

	public void InitiateConnection() {

		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

		}
		 catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
	}

	public void ExcuteQuery(String sql) {
		System.out.println("Creating statement...");
		try {
			stmt = conn.createStatement();
			ResultSet rs;

			rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set

			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				String first = rs.getString("first_name");
				String last = rs.getString("last_name");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
			}
			rs.close();
			stmt.close();
			conn.close();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}// end try
		System.out.println("Goodbye!");

	}
}
