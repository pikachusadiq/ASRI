package testRepo;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;
import objectRepository.CreateLeadPomPage;
import objectRepository.HomePagePom;
import objectRepository.LeadListPagePom;

public class CreateLead  extends BaseClass{
	
	@Test
	public void createLead() throws Exception {
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber();
	ExcelUtility EUTIL=new ExcelUtility();
	String FNAME=	EUTIL.getDataFromExcel("Leads", 3, 2);
	String LNAME=EUTIL.getDataFromExcel("Leads",3 , 3);
	String CNAME=EUTIL.getDataFromExcel("Leads", 3, 4);
	HomePagePom HP=new HomePagePom(driver);
	HP.clickLeads();
	LeadListPagePom LLP=new LeadListPagePom(driver);
	LLP.clickcreateLeadbutton();
	CreateLeadPomPage CLP=new CreateLeadPomPage(driver);
	CLP.createLead(FNAME+num, LNAME, CNAME);
	
	
	
	
	

}
}