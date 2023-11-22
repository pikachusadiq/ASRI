package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePagePom;
import objectRepository.LoginPagePom;

public class BaseClass {
	public DataBaseUtility DUTIL = new DataBaseUtility();
	public PropertiesUtility PUTIL = new PropertiesUtility();
	public WebDriverUtility WUTIL = new WebDriverUtility();
	public static WebDriver driver = null;
  
	/*
	 * @BeforeSuite(alwaysRun = true) public void dbConnectionEstablish() throws
	 * Exception { DUTIL.establishConnection(); }
	 */
  
  @BeforeClass(alwaysRun = true)
  public void launchBrowser() throws Exception
  {
	  String URL =PUTIL.getDataFromProperties("url");
	  WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver", "./\\src\\main\\resources\\chromedriver.exe/");
	  
	  driver = new ChromeDriver();
	  driver.get(URL);
	  WUTIL.implicitWaitinScript(driver);
	  WUTIL.maximizeWindow(driver);
  }
  @BeforeMethod(alwaysRun = true)
  public void loginOperation() throws Exception 
  {
	  String USERNAME =PUTIL.getDataFromProperties("username");
	  String PASSWORD = PUTIL.getDataFromProperties("password");
	  LoginPagePom LP= new LoginPagePom(driver);
	  LP.loginOperation(USERNAME, PASSWORD);
  }
  @AfterMethod(alwaysRun = true)
  public void logoutOperation() 
  {
	HomePagePom HP = new  HomePagePom(driver);
	HP.clickSignout();
  }
  @AfterClass(alwaysRun = true)
  public void closeWindow() 
  {
	  driver.close();
  }
	/*
	 * @AfterSuite(alwaysRun = true) public void dbconnectionClosed() throws
	 * Exception { DUTIL.closeConnection(); }
	 */
}