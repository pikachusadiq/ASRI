package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPomPage {
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement salutation ;
	
	@FindBy(xpath = "//input[@name='firstname']")
     private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyname;
	@FindBy(xpath = "//input[@name='designation']")
	private WebElement title;//designation
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSource ;
	
	@FindBy(xpath = "//select[@name='industry']")
     private WebElement industry;
	
	@FindBy(xpath = "//input[@name='annualrevenue']")
	private WebElement anlRevenue;
	@FindBy(xpath = "//input[@name='noofemployees']")
	private WebElement noemp;
	@FindBy(xpath = "//input[@name='secondaryemail']")
	private WebElement secEmail;
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobno ;
	
	@FindBy(xpath = "//input[@name='email']")
     private WebElement email;
	
	@FindBy(xpath = "//input[@name='website']")
	private WebElement website;
	@FindBy(xpath = "//select[@name='leadstatus']")
	private WebElement leadSts;
	@FindBy(xpath = "//select[@name='rating']")
    private WebElement rating ;
	
	@FindBy(xpath = "//textarea[@name='lane']")
	private WebElement street;
	@FindBy(xpath = "//input[@name='code']")
	private WebElement pCode;
	@FindBy(xpath = "//input[@name='country']")
	private WebElement country;
	@FindBy(xpath = "//input[@name='pobox']")
	private WebElement poBox ;
	
	@FindBy(xpath = "//input[@name='city']")
    private WebElement city;
	
	@FindBy(xpath = "//input[@name='state']")
	private WebElement state;
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement desc;
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement savebtn;
	
	public CreateLeadPomPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public WebElement getSalutation() {
		return salutation;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getCompanyname() {
		return companyname;
	}
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public WebElement getTitle() {
		return title;
	}
	public WebElement getLeadSource() {
		return leadSource;
	}
	public WebElement getIndustry() {
		return industry;
	}
	public WebElement getAnlRevenue() {
		return anlRevenue;
	}
	public WebElement getNoemp() {
		return noemp;
	}
	public WebElement getSecEmail() {
		return secEmail;
	}
	public WebElement getMobno() {
		return mobno;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getWebsite() {
		return website;
	}
	public WebElement getLeadSts() {
		return leadSts;
	}
	public WebElement getRating() {
		return rating;
	}
	public WebElement getStreet() {
		return street;
	}
	public WebElement getpCode() {
		return pCode;
	}
	public WebElement getCountry() {
		return country;
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
	public WebElement getDesc() {
		return desc;
	}
	/**
	 * business logic for create lead by mandatory field
	 * @param fname
	 * @param lname
	 * @param comname
	 */
	public void createLead(String fname, String lname, String comname) {
		getFirstname().sendKeys(fname);
		getLastname().sendKeys(lname);
		getCompanyname().sendKeys(comname);
		getSavebtn().click();
	}

}