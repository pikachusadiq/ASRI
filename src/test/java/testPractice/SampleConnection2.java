package testPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;



import genericUtility.IconstantUtility;

public class SampleConnection2
{
	Connection c =null;
  @Test
  public void database() throws Exception {
	c=  DriverManager.getConnection(IconstantUtility.dburl ,IconstantUtility.dbUsername,
			  IconstantUtility.dbpassword);
	Statement s = c.createStatement();
	ResultSet rs = s.executeQuery("select * from students");
	while(rs.next())
	{
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	c.close();
  }
  
}
