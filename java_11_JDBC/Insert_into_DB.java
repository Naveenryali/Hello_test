package java_11_JDBC;

import java.sql.*
;
import java.util.Scanner;

public class Insert_into_DB {
public static void main(String[] args) {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/First","root","M1racle@123");
		//Statement  s=c.createStatement();
		String query="insert into student values(?,?,?,?,?)";
		PreparedStatement ps=c.prepareStatement(query);
//		Statement  s=c.createStatement();	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno");
		int rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter age of student");
		int age=sc.nextInt();
		System.out.println("Enter avg of student");
		int avg=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter parent name");
		String pname=sc.nextLine();
			ps.setInt(1,rollno);
			ps.setString(2,name);
			ps.setInt(3,age);
			ps.setInt(4,avg);
			ps.setString(5,pname);
			
			int i=ps.executeUpdate();
		if(i>0)
		{
			System.out.println("Updated sucessfully");
		}
		else	
		{
			System.out.println("Failed to update");
		}
		ps.close();
		c.close();
		sc.close();
	}
	catch (Exception e)
	
	{
		System.out.println(e);
	}
}
}
