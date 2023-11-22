package testPractice;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import objectRepository.CreateLeadPomPage;
import objectRepository.HomePagePom;
import objectRepository.LeadListPagePom;

public class Tc_04  extends BaseClass{
@Test
public void createLead() throws Exception {
ExcelUtility Eutil=new ExcelUtility();
String fname=Eutil.getDataFromExcel("Sheet1", 3, 1);
String lname=Eutil.getDataFromExcel("Sheet1", 3, 2);
String cname=Eutil.getDataFromExcel("Sheet1", 3, 3);
	  HomePagePom HP=new HomePagePom(driver);
	  HP.clickLeads();
	  LeadListPagePom LPM=new LeadListPagePom(driver);
	  LPM.clickcreateLeadbutton();
	  CreateLeadPomPage CLP=new CreateLeadPomPage(driver);
	  CLP.createLead(fname, lname, cname);
}
}