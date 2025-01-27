package java_10_serialization;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Msql {

	public static void main(String[] args) throws  Exception{
		
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
	Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","M1racle@123");
	
	Statement s=c.createStatement();
	ResultSet rs=s.executeQuery("select * from student where id=3");
	
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	c.close();
		
	}
	
	catch(Exception e){
		System.out.println(e);
	}
		
	}
	
	
	
	
	
}
