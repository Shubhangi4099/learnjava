import java.sql.*;

public class DataBaseConnection {
	public static void main(String[] args) {
		System.out.println("Welcome to JDBC");
		Connection con = null;

		String url = "jdbc:mysql//localhost:3306";
		String dbName = "ObjectTechDB";
		String drvName = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";

		try {
			Class.forName(drvName);
			con = DriverManager.getConnection(url + dbName, userName, password);
			try {
				Statement st = con.createStatement();
				String table = "CREATE TABLE Employee11 (Emp_code integer,Emp_name varchar(10))";
				st.executeUpdate(table);
				System.out.println("Table creation process successful!");
			} catch(SQLException s) {
				System.out.println(s.getMessage());
			}
			con.close();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

