package testRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;
import objectRepository.ContactListPagePom;
import objectRepository.CreateContactPagePom;
import objectRepository.HomePagePom;

public class CreateContactBYOrganization extends BaseClass  {
   @Test
   public void createContact() throws Exception {
	   JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber();
		ExcelUtility EUTIL=new ExcelUtility();
	String FNAME=	EUTIL.getDataFromExcel("Contacts", 3, 1);
	String LNAME=EUTIL.getDataFromExcel("Contacts",3 , 2);
	
	HomePagePom HP=new HomePagePom(driver);
	HP.clickContacts();
	ContactListPagePom CLP=new ContactListPagePom(driver);
	CLP.createContact();
	CreateContactPagePom CCP=new CreateContactPagePom(driver);
	CCP.createContact(LNAME, FNAME+num, driver,"dinga");
	Thread.sleep(3000);
	   }
}