package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * This class is use to perform all the java related operation
 */
public class JavaUtility {
	/**
	 * This method is a generic method to generate random number
	 * @return
	 */
   public int getRandomNumber() {
	   Random r=new Random();
	   int randomNumber=r.nextInt(1000);
	return randomNumber;
   }
   public String getDataCalender()
   {
	Calendar cal = Calendar.getInstance();
    Date d = cal.getTime();
    SimpleDateFormat sdf  = new SimpleDateFormat("MM/dd/YYYY");
    String modifiedDate =sdf.format(d);
   	return modifiedDate;   
   }
}