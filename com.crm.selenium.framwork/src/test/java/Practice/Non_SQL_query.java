package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Non_SQL_query {

	public static void main(String[] args) throws Throwable  {
		Driver driverRef=new Driver();
		//DriverManager.registerDriver(driverRef);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra", "root","root");
		Statement stat=conn.createStatement();
		String selectQuery="insert into student(frist_name,last_name,address)value('raju','bn','India')";
		int result=stat.executeUpdate(selectQuery);
		if(result==1)
		{
			System.out.println("user is created");
		}
		else {
			System.out.println("user is not created");
		}
		conn.close();
	}
}
