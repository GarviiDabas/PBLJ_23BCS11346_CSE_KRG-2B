package EST;
import java.sql.*;
import java.util.*;

public class Q02 {
public static void main(String args[]) {
	Scanner br = new Scanner(System.in);
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/dummy";
	String uName = "root";
	String uPass = "@Bijnor123";
	String sql = "insert into Employee values (150, 'krg2b', 99999)";

	try {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, uName, uPass);
		Statement st = conn.createStatement();
		st.executeUpdate(sql);
		conn.close();
        System.out.println("Operation successful");
	}
	catch(ClassNotFoundException e){
			e.printStackTrace();
	}
	catch(SQLException err) {
		err.printStackTrace();
	}
}
}
