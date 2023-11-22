package testRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;
import objectRepository.CreateOrganizationPagePom;
import objectRepository.HomePagePom;
import objectRepository.OrganizationListPagePom;

public class CreateOrganization extends BaseClass{
	@Test
     public void createOrganization() throws Exception {
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber();
		ExcelUtility EUTIL=new ExcelUtility();
		String OrgName=EUTIL.getDataFromExcel("Organization",3, 1);
		
			HomePagePom HP=new HomePagePom(driver);
	    	  HP.clickOrganization();
	    	   OrganizationListPagePom OLP=new OrganizationListPagePom(driver);
	    	   OLP.clickCreateOrganization();
	    	   
	    	   CreateOrganizationPagePom COP=new CreateOrganizationPagePom(driver);
	    	   
	    	   COP.CreateOrganization(OrgName+num);
	    	   Thread.sleep(3000);
	      }
		
     }