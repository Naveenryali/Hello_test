package java_11_JDBC;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class Example2 {
public static void main(String[] args) throws SQLException {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/office";
		String user="root";
		String psw="M1racle@123";
		Connection c=DriverManager.getConnection(url,user,psw);
		Statement st=c.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your username :");
		String user1=sc.nextLine();
		String query="select count(*) as count from cridentials where user_name='"+user1+"'";
		ResultSet rs=st.executeQuery(query);
		if(rs.next()&&rs.getInt("count")>0)
		{
			query="select user_name from cridentials where user_name='"+user1+"'";
			rs=st.executeQuery(query);
			if(rs.next()&&rs.getString("user_name").equals(user1))
			{
				System.out.println("Enter your password :");
				String pass=sc.nextLine();
				query="select password from cridentials where user_name='"+user1+"' and password='"+pass+"'";
				rs=st.executeQuery(query);
				if(rs.next()&&rs.getString("password").equals(pass))
				{
					System.out.println("Successfully loginned");
				}
				else
				{
					System.out.println("password incorrect");
				}
			}
			else
			{
				System.out.println("Username invalid");
		    }
		}
		else
		{
			System.out.println("Invalid username");
		}
//		System.out.println("Enter your ID");
//		int ID=sc.nextInt();
//		String query ="SELECT COUNT(*) AS count FROM cridentials where ID="+ID+" ";
//		ResultSet rs=st.executeQuery(query);
//		rs.next();
//		int i=rs.getInt("count");
//		System.out.println(i);
//		if(i==1) 
//		{
//			System.out.println("Enter Admin name");
//			String username=sc.nextLine();
//			sc.nextLine();
//			System.out.println("Enter your password");
//			String pswd=sc.nextLine();
//		query ="SELECT user_name FROM cridentials where user_name ='"+username+"' and ID="+ID;
//        rs=st.executeQuery(query);
//        if(rs.next()&&rs.getString("user_name").equals(username))
//        {
//        	
//        	query="select password from cridentials where user_name='"+username+"' and password='"+pswd+"'";
//        	rs=st.executeQuery(query);
//        	if(rs.next()&&rs.getString("password").equals(pswd))
//        	{
//        		System.out.println("Loggined successfully");
//        	}
//        	else
//        	{
//        		System.out.println("Password incorrect");
//        	}
//        }
////		rs=st.executeQuery(query);
////		rs.next();
////		int j=rs.getInt("count");
////		System.out.println(j);	
////		if(j==1)
////		{
////			System.out.println("Login successfully");
////			
////		}
////		else
////		{
////			System.out.println("Incorrect cridentials");
////		}
//
//		
//		}
//		else {
//			System.out.println("Incorrect ID");
//		}
//		
//		
		sc.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}
