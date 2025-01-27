package java_11_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program_of_connection {
	public static void main(String[] args) {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","M1racle@123");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from student");
//	rs.next();
//	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	con.close();
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	}
}
