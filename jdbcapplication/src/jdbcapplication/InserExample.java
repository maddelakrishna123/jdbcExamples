package jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InserExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		// Register The Driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		// Establish Connection
		
		Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ripon", "root", "root");

		
		
		/*
		 * DDL -->create ----execute(query)-boolean select , create ,upate , delete
		 * 
		 * DML ---> Update -executeUpadte(query)  -int- insert , upadte
		 * 
		 *  DRL----SElect   -executeQuary()-- ResultSet --select
		 */
		
		// Create Statement
		
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter User Name");
		String uname=s.next();
		
		System.out.println("Enter Password");
		String password=s.next();
		System.out.println("Enter Email");
		String email=s.next();
		System.out.println("Enter Mobile");
		String mobile=s.next();*/
		
		/*Statement st=connection.createStatement();
		
		PreparedStatement ps=connection.prepareStatement("insert into user values(?,?,?,?)");
		ps.setString(1, uname);
		ps.setString(2, password);

		ps.setString(3, email);
		ps.setString(4, mobile);
		int res=ps.executeUpdate();

		
		//int res=st.executeUpdate("insert into user values('"+uname+"','"+password+"','"+email+"','"+mobile+"')");
		System.out.println(res+" Rows Inserted");
		*/
		
		
		
		/*PreparedStatement pst=connection.prepareStatement("create table employee122(uname varchar(2),password varchar(20))");
		
		boolean status=pst.execute();
		System.out.println(status);
		if(!status)
		{
			System.out.println("Table is created");
		}
		*/
		
		PreparedStatement pst=connection.prepareStatement("select * from user");
		
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
		
		connection.close();
		
		
		
	}

}
