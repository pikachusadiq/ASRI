package testPractice;

import org.testng.annotations.Test;
import genericUtility.BaseClass;
import objectRepository.HomePagePom;

public class Tc_03 extends BaseClass {

    @Test
    public void organisationMod() {
        HomePagePom HP = new HomePagePom(driver);
        HP.clickOrganization();
    }
}
