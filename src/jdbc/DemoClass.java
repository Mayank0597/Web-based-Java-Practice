package jdbc;

import java.sql.*;


/*
1. import ----> java.sql.*
2. load and register the driver --> com.mysql.cj.jdbc.Driver
3. Create Connection ---> Connection
4. create statement ---> Statement
5. execute the query
6. process the result
7. close
 
*/

public class DemoClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/mayank_practice";
		String uname = "root";
		String password = "Mayank@0506";
		//String query = " select username from student ";
		String query = "insert into student values (4,'Mohini')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,uname,password);
		Statement st = conn.createStatement();
		//ResultSet rs = st.executeQuery(query);
		int count = st.executeUpdate(query);
		
//		while(rs.next()) {
//		String name = rs.getString("username");
//		System.out.println(name);
//		}
		System.out.println(count+" rows affected");
		
		st.close();
		conn.close();
		
	}

}
