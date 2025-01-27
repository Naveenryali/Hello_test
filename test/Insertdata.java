package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root", "M1racle@123");

		//Statement st = con.createStatement();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first name");
		String fn = sc.nextLine();
		System.out.println("Enter last name");
		String ln = sc.nextLine();
		System.out.println("Enter gender");
		String gn = sc.nextLine();
		System.out.println("Enter mobile number");
		String mn = sc.nextLine();
		System.out.println("Enter salary");
		int salary = sc.nextInt();
		sc.close();
		String username = fn.substring(0, 1) + ln;
		String password = fn.substring(0, 2) + ln.substring(ln.length() - 2) + mn.substring(4);

		PreparedStatement ps = con.prepareStatement(
				"INSERT into employee (firstname,lastname,gender,mobilenumber,salary,username,password ) values(?,?,?,?,?,?,?)");
		
		
		ps.setString(1, fn);
		ps.setString(2, ln);

		ps.setString(3, gn);
		ps.setString(4, mn);
		ps.setInt(5, salary);
		ps.setString(6, username);

		ps.setString(7, password);
		int status=ps.executeUpdate();
		
		if(status!=-1)
		{
			System.out.println("Inserted successfully");
		}
		else
		{
			System.out.println("Failed to insert");
		}

		
		
		
		
	}
}
