package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
	@FindBy(xpath = "//img[@src='themes/softed/images/Home.PNG']")
	private WebElement home;
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calendar;
	
	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leads;
	
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement organisation;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contacts;
	
	@FindBy(xpath = "(//a[text()='Opportunities'])[1]")
	private WebElement oppourtunity;
	
	@FindBy(xpath = "(//a[text()='Products'])[1]")
	private WebElement products;
	
	@FindBy(xpath = "(//td[@class='small'])[2]")
	private WebElement administrator;
    
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;
	
	
	
	                         //Constructor
	public HomePagePom(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
                             //Getters 
	public WebElement getHome() {
		return home;
	}

	public WebElement getOrganisation() {
		return organisation;
	}
	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getOppourtunity() {
		return oppourtunity;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getAdministrator() {
		return administrator ;
	}
	
	
	public WebElement getSignout() {
		return signout;
	}
	//Business Library for Add new button
	public void clickonHome() {
		getHome().click();
	}
	public void clickCalendar() {
		getCalendar().click();
	}
	public void clickLeads() {
		getLeads().click();
	}
	public void clickOrganization() {
		getOrganisation().click();
	}
	public void clickContacts() {
		getContacts().click();
	}
	public void clickOppourtunity() {
		getOppourtunity().click();
	}
	public void clickProduct() {
		getProducts().click();
	}
	public void clickSignout() {
		getAdministrator().click();
		getSignout().click();
		
	}
	
}