package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * this class is for common data stored in properties file
 * @author Assu
 */
public class PropertiesUtility {
	/**
	 * this is generic method to fetch data from properties file
	 * @param data
	 * @return
	 * @throws Exception
	 */
public String getDataFromProperties(String data) throws Exception {
	FileInputStream fis =new FileInputStream(IconstantUtility.propertiesPath);
	Properties pobj=new Properties();
	pobj.load(fis);
	
	String propertiesData=pobj.getProperty(data);
	return propertiesData;
	
}
}