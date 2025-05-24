package com.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcins{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/library";
		String username="postgres";
		String password="123456";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		String query="insert into Author values('varun',200)";
		boolean result=st.execute(query);
	}
}