package java_11_JDBC;

import java.sql.Connection;
import java.sql.*;

public class Create_Statement {
public static void main(String[] args) {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","M1racle@123");
		Statement st=c.createStatement();
		ResultSet rs=st.executeQuery("Select * from EMPLOYEE ");
		ResultSetMetaData rsd=rs.getMetaData();
		int count =rsd.getColumnCount(); 
//		String query="insert into EMPLOYEE values(101,'Sai','chinta','Miracle city','Vizag')";
//		int j=st.executeUpdate(query);
//		if (j!=-1)
//		{
//			System.out.println("updated successfully");
//		}
//		else
//		{
//			System.out.println("not updated");
//		}
		while(rs.next())
		{
			for(int i=1;i<=count;i++)
			{
				System.out.print(rs.getString(i)+" ");
			}
			System.out.println();
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+ " "+rs.getString(4)+" "+rs.getString(5));
		
	//	System.out.println(rs.getString("EmployeeID"));	
			
		}
			
		c.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}
