package practice_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Practice_JDBC {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","M1racle@123");
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("SELECT * FROM employee");
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
		int i=rsmd.getColumnCount();
		
		while(rs.next()) {
		
			for(int j=1;j<=i;j++)
			{
				
			
		System.out.print(rs.getString(j)+" ");
			}
System.out.println();		
		}
	}
}
