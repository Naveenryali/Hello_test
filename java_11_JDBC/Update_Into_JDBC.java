package java_11_JDBC;
import java.sql.*;
public class Update_Into_JDBC {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/demo";
			String user="root";
			String pswd="M1racle@123";
			Connection c=DriverManager.getConnection(url,user,pswd);
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from EMPLOYEE");
			ResultSetMetaData rsd= rs.getMetaData();
			int count =rsd.getColumnCount();
			while(rs.next())
			{
				for(int i=1;i<=count;i++)
				{
					System.out.print(rs.getString(i)+" ");
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
