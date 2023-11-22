package testPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.PropertiesUtility;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePagePom;
import objectRepository.LoginPagePom;

public class Tc_01 {
	@Test
	public void checklogin() throws Exception {

		PropertiesUtility PUTIL = new PropertiesUtility();
		String URL = PUTIL.getDataFromProperties("url");
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		WebDriverUtility WUTIL = new WebDriverUtility();

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WUTIL.implicitWaitinScript(driver);

		driver.get(URL);
		WUTIL.maximizeWindow(driver);
		LoginPagePom LPM = new LoginPagePom(driver);
		LPM.loginOperation(USERNAME, PASSWORD);
     HomePagePom hpm=new HomePagePom(driver);
     hpm.getSignout();
		
		/*
		 * driver.findElement(By.xpath("//a[text()='More']")).click(); Robot r=new
		 * Robot(); r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
		 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
		 */


	}
}
