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
		logIn("swp1234", "park12");
	}

	// ID �ߺ� üũ
	public static boolean idCheck(String id) throws SQLException
	{
		rs = stat.executeQuery("select id from customer where id = '" + id
				+ "'");
		// �ߺ��̶�� true
		while (rs.next())
		{
			if (rs.getString("id") != null)
			{
				return true;
			}
		}
		// �ߺ��� �ƴ϶�� false
		return false;
	}

	// ȸ�� ����
	public static void register(String id, String pw, char sex)
			throws SQLException
	{
		stat.executeQuery("insert into customer values('" + id + "','" + pw
				+ "','" + sex + "')");
	}

	public static int logIn(String id, String pw) throws SQLException
	{
		rs = stat.executeQuery("select id from customer where id = '" + id
				+ "'");
		while (rs.next())
		{
			rs = stat.executeQuery("select password from customer where id = '"
					+ id + "'");
			while (rs.next())
			{
				if (rs.getString("password").equals(pw))
				{
					System.out.println("�α��� ����");
					// �α��� �����̶�� 1��ȯ
					return 1;
				}
			}
			// password�� �ٸ��� 0 ��ȯ
			System.out.println("��й�ȣ�� �ٸ��ϴ�");
			return 0;
		}
		// ���̵� ���������ʴ´ٸ� -1 ��ȯ
		System.out.println("���̵� �������� �ʽ��ϴ�");
		return -1;
	}
}
