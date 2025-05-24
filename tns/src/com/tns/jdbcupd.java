package com.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcupd{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/library";
		String username="postgres";
		String password="123456";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		String query1="UPDATE Author SET bookname='tarun' where bookname='varun'";
		String query2="select * from Author";
		boolean result=st.execute(query1);
		ResultSet res=st.executeQuery(query2);
		while(res.next())			{
				System.out.println(res.getString(1)+" "+(res.getInt(2)));
		}

	}
	
}
