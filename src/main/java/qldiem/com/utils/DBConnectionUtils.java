package qldiem.com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtils {

	public static Connection getConnection() {
		Connection conn = null;
		final String url = "jdbc:mysql://localhost:3306/qldsv";
		final String user = "root" ;
		final String pass = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public static void main(String[] args) {
		if (getConnection()!=null) 
			System.out.println("thanh cong");
		
		else System.out.println("ket noi that bai");
	}
}
