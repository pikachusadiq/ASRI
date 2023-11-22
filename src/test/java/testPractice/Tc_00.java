package testPractice;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePagePom;

public class Tc_00 extends BaseClass{
@Test
public void calendarMod() {
	  HomePagePom HP=new HomePagePom(driver);
	  HP.clickCalendar();
}
}


