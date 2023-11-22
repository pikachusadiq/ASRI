package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
/**
 * this class contains all thengeneric method regarding database
 * @author SAMIR KUMAR BEHARA
 */
public class DataBaseUtility {

Connection c = null;
/**
 * this method is use to establish the connection
 * @throws Exception  
 */
public void establishConnection() throws Exception
{
	DriverManager.getConnection(IconstantUtility.dburl ,
			IconstantUtility.dbUsername , IconstantUtility.dbpassword);
}
/**
 * this method is use to close the connection
 * @throws Exception
 */
	public void closeConnection() throws Exception 
	{
		c.close();
	}
/**
 * this method is use to execute querry
 * @param querry
 * @param colIndex
 * @param exData
 * @return
 * @throws Exception
 */
public String executeQuereyOperation(String querry , int colIndex,String exData) throws Exception
{
	boolean flag =false;
	ResultSet rs = c.createStatement().executeQuery(querry);
	
	while(rs.next())
	{
		String actualData = rs.getString(colIndex);
		if(actualData.equals(exData))
		{
			flag = true;
			break;
		}
	}
		if(flag)
		{
			System.out.println("expected data is : "+exData);
			return exData;
		}
		else
		{
			System.out.println("data is not present");
			return"";
		}
			
}
}
