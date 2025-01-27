package java_11_JDBC;
import java.sql.*;
import java.util.Scanner;
public class Example_of_CRUD_operations {
	public static void main(String[] args) throws SQLException{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/details";
			String user="root";
			String pswd="M1racle@123";
			Connection c=DriverManager.getConnection(url,user,pswd);
			Statement st=c.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your username");
			String username=sc.nextLine();
			String query="select user_name from account where user_name='"+username+"'";
			ResultSet rs=st.executeQuery(query);
			if(rs.next()&&rs.getString("user_name").equals(username))
			{
				System.out.println("Enter your password");
				String password=sc.nextLine();
				query ="SELECT password from account where user_name='"+username+"' and password='"+password+"'";
				rs=st.executeQuery(query);
				if(rs.next()&& rs.getString("password").equals(password))
				{
					System.out.println("Login successfull");
					System.out.println();
					System.out.println("Select the option to perform\n 1 to insert data\n 2 to update data\n 3 to delete data\n 4 to retrive data");
					int n=sc.nextInt();
				switch(n){
				case 1:
					System.out.println("Enter account number");
					int accno=	sc.nextInt();
					sc.nextLine();
					System.out.println("Enter account name");
					String accname =sc.nextLine();
					System.out.println("Enter phone number");
					int phno=sc.nextInt();
					sc.nextLine();
						query ="insert into AccountDetails values(?,?,?)";
						PreparedStatement pst=c.prepareStatement(query);
						pst.setInt(1,accno);
						pst.setString(2, accname);
						pst.setInt(3, phno);
						int i=pst.executeUpdate();
						if(i>0)
						{
							System.out.println("updated successfully");
						}
						else
						{
							System.out.println("Failed to update");
						}
					break ;
				case 2:
					
					break;
				case 4:
						query="select * from AccountDetails";
						rs=st.executeQuery(query);
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
						}
						break;
						default :
							System.out.println("Select valid option");
						break;
					}
					c.close();
					sc.close();
				}
				else
				{
					System.out.println("Incorrect Password"); 
				}
			}
			else {
				System.out.println("User not found");
			}	
		}
		catch(Exception e)
		{
				System.out.println(e);	
		}
	}
}
