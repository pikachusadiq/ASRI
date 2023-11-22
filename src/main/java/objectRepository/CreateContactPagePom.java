package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class CreateContactPagePom extends WebDriverUtility {
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement salutation ;
	
	@FindBy(xpath = "//input[@name='firstname']")
     private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	@FindBy(xpath = "//input[@name='department']")
	private WebElement dptname;
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mob ;
	
	@FindBy(xpath = "//input[@name='email']")
     private WebElement email;
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement addOrganizationbtn;
	
	@FindBy(xpath = "//input[@name='support_start_date']")
	private WebElement startDate;
	@FindBy(xpath = "//input[@name='support_end_date']")
	private WebElement endDate;
	@FindBy(xpath = "//input[@name='description']")
	private WebElement desc;
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement savebtn;
	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement searchbox;
	@FindBy(xpath = "//input[@name='search']")
	private WebElement serchbtn;
	@FindBy(xpath = "//select[@name='search_field']")
	private WebElement searchField;
	@FindBy(xpath = "//a[text()='cie']")
	private WebElement searchPdt;
	
	@FindBy(xpath = "//input[@name='title']")
	private WebElement title ;
	
	@FindBy(xpath = "//input[@name='assistant']")
     private WebElement asstName;
	
	@FindBy(xpath = "//input[@name='assistantphone']")
	private WebElement asstMob;
	@FindBy(xpath = "//input[@name='birthday']")
	private WebElement dob;
	@FindBy(xpath = "(//img[@title='Select'])[2]")
	private WebElement addReports ;
	
	@FindBy(xpath = "(//input[@name='cpy'])[2]")
     private WebElement cpyAdress;
	@FindBy(xpath = "//input[@name='mailingpobox']")
	private WebElement poBox;
	
	@FindBy(xpath = "//input[@name='mailingcity']")
	private WebElement city;
	@FindBy(xpath = "//input[@name='mailingstate']")
	private WebElement state;
	@FindBy(xpath = "//input[@name='mailingzip']")
	private WebElement pCode;
	@FindBy(xpath = "//input[@name='mailingcountry']")
	private WebElement country;
	@FindBy(xpath = "//textarea[@name='mailingstreet']")
	private WebElement street;
	
	
	
	public CreateContactPagePom(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	public WebElement getSalutation() {
		return salutation;
	}


	public WebElement getAddOrganizationbtn() {
		return addOrganizationbtn;
	}


	public WebElement getSearchbox() {
		return searchbox;
	}


	public WebElement getSerchbtn() {
		return serchbtn;
	}

    public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getDptname() {
		return dptname;
	}


	public WebElement getMob() {
		return mob;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getStartDate() {
		return startDate;
	}


	public WebElement getEndDate() {
		return endDate;
	}


	public WebElement getDesc() {
		return desc;
	}


	public WebElement getSavebtn() {
		return savebtn;
	}
	


	public WebElement getSearchField() {
		return searchField;
	}


	public WebElement getSearchPdt() {
		return searchPdt;
	}


	public WebElement getTitle() {
		return title;
	}


	public WebElement getAsstName() {
		return asstName;
	}


	public WebElement getAsstMob() {
		return asstMob;
	}


	public WebElement getDob() {
		return dob;
	}


	public WebElement getAddReports() {
		return addReports;
	}


	public WebElement getCpyAdress() {
		return cpyAdress;
	}


	public WebElement getPoBox() {
		return poBox;
	}


	public WebElement getCity() {
		return city;
	}


	public WebElement getState() {
		return state;
	}


	public WebElement getpCode() {
		return pCode;
	}


	public WebElement getCountry() {
		return country;
	}


	public WebElement getStreet() {
		return street;
	}


	/**
	 * business logic for create contact by mandatory field
	 * @param firstname
	 * @param lastname
	 */
	public void createContact(String firstname,String lastname)  {
		getFirstname().sendKeys(firstname);
		getLastname().sendKeys(lastname);
		
		
		getSavebtn().click();
	}
	/**
	 * business logic for create contact by industry type
	 * @param firstname
	 * @param lastname
	 * @param value
	 * @param driver 
	 * @throws Exception 
	 */
	public void createContact(String firstname,String lastname, WebDriver driver,String search) throws Exception  {
		getFirstname().sendKeys(firstname);
		getLastname().sendKeys(lastname);
		Thread.sleep(3000);
		getAddOrganizationbtn().click();
		String id=driver.getWindowHandle();
		switchToWindoe(driver,id );
		Thread.sleep(3000);
		getSearchbox().sendKeys(search);
		getSerchbtn().click();
		getSearchPdt().click();
		switchToWindoe(driver, id);
		//
		//switchToMainFrame(driver);
		/*
		 * String id1=driver.getWindowHandle(); 
		 * switchToWindow(driver, id1);
		 */
		Thread.sleep(3000);
		getSavebtn().click();
	}
}