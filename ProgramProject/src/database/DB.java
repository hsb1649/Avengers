package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB
{

	static Statement stat;
	static ResultSet rs;

	public static void Access() throws SQLException
	{
		String driverName = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/project";
		String id = "root";
		String password = "park123";
		// TODO Auto-generated method stub
		try
		{
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, id, password);
			stat = con.createStatement();
			stat.executeQuery("use project");
		} catch (Exception e)
		{
			System.out.println("Connection Failed");
			e.printStackTrace();
		}

	}

	public static boolean idCheck(String id) throws SQLException
	{
		rs = stat.executeQuery("select id from customer where id = '" + id
				+ "'");

		if (rs != null)
		{
			return true;
		} else
		{
			return false;
		}
	}

}
