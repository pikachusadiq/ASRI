package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOpportunityPom {
	@FindBy(xpath = "//input[@name='potentialname']")
	private WebElement oppName ;
	
	@FindBy(xpath = "//select[@name='sales_stage']")
     private WebElement salesStage;
	@FindBy(xpath = "//select[@name='related_to_type']")
	private WebElement relatedType ;
	
	@FindBy(xpath = "(//img[@alt='Select'])[1]")
     private WebElement addOrgConBtn;
	@FindBy(xpath = "(//img[@alt='Select'])[2]")
    private WebElement addcampBtn;
	@FindBy(xpath = "//input[@name='amount']")
    private WebElement amt;
	@FindBy(xpath = "//input[@id='probability']")
     private WebElement probability;
	@FindBy(xpath = "//input[@name='closingdate']")
	private WebElement closeDate;
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement desc;
	@FindBy(xpath = "(//input[@value='  Save  '])[1]")
	private WebElement savebtn;
	@FindBy(xpath = "(//input[@value='  Cancel  '])[1]")
	private WebElement cancelbtn;
	
	public CreateOpportunityPom(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	
	public WebElement getOppName() {
		return oppName;
	}
	public WebElement getSalesStage() {
		return salesStage;
	}
	public WebElement getCloseDate() {
		return closeDate;
	}
	public WebElement getDesc() {
		return desc;
	}
	public WebElement getRelatedType() {
		return relatedType;
	}
	public WebElement getAddOrgConBtn() {
		return addOrgConBtn;
	}
	public WebElement getAddcampBtn() {
		return addcampBtn;
	}
	public WebElement getAmt() {
		return amt;
	}
	public WebElement getProbability() {
		return probability;
	}
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	/**
	 * Business logic for create opportunity mandatory field
	 * @param opname
	 */
	public void createOpportunity(String opname) {
		getOppName().sendKeys(opname);
		getSavebtn().click();
		
		
	}
}