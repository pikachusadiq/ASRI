package testRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;
import objectRepository.CreateOpportunityPom;
import objectRepository.HomePagePom;
import objectRepository.OpportunityListPagePom;

public class Opportnity extends BaseClass {
	@Test
    public void createOpportunity() throws Exception {
    	JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber();
	ExcelUtility EUTIL=new ExcelUtility();
	String ONAME=	EUTIL.getDataFromExcel("Opportunity", 3, 1);
	
	HomePagePom HP=new HomePagePom(driver);
	  HP.getOppourtunity();
	  OpportunityListPagePom OLP=new OpportunityListPagePom(driver);
	  OLP.clickCreateOpportunity();
	    CreateOpportunityPom COP=new CreateOpportunityPom(driver);
	    COP.createOpportunity(ONAME+num);
    }
}