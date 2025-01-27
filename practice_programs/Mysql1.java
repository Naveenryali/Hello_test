package practice_programs;
import java.sql.*;

public class Mysql1 {

	
	public static void main(String[] args) {
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/demo";
		String user="root";
		String pswd="M1racle@123";
//		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","M1racle@123");
		Connection cn=DriverManager.getConnection(url,user,pswd);
		Statement smt=cn.createStatement();
	//	String query="CREATE TABLE  Airlines (flight VARCHAR(50),no INT)";
	//	int result =smt.executeUpdate(query);
		String query="INSERT INTO Airlines values(?,?)";
		PreparedStatement ps=cn.prepareStatement(query);
		ps.setString(1, "AirIndia");
		ps.setInt(2, 1);
	//	int result=ps.executeUpdate();
		ResultSet rs=smt.executeQuery("select * from Airlines");
//		int result=ps.executeUpdate();
//		ps.setInt(1,12);
//		ps.setString(2,"vasu");
//		ps.setString(3, "sharma");
//		ps.setInt(4, 101);
//		if(rs>0)
//		{
//		System.out.println("successfully inserted");
//		}
//		else
//		{
//			System.out.println("Not inserted");
//		}
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}
		cn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
