package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPagePom {
	@FindBy(xpath = "//input[@name='productname']")
	private WebElement pdtname ;
	@FindBy(xpath = "//input[@id='productcode']")
     private WebElement sStartDate;
	@FindBy(xpath = "//select[@name='manufacturer']")
	private WebElement manufacture	;
	@FindBy(xpath = "//input[@name='start_date']")
	private WebElement supStartDate;
	@FindBy(xpath = "//input[@name='sales_end_date']")
	private WebElement supEndDate ;
	@FindBy(xpath = "//input[@name='unit_price']")
     private WebElement unitPrice;
	@FindBy(xpath = "//input[@name='commissionrate']")
	private WebElement commRate;
	@FindBy(xpath = "//input[@name='qtyinstock']")
	private WebElement qtyStock;
	@FindBy(xpath = "//select[@name='productcategory']")
	private WebElement pdtCategory;
	@FindBy(xpath = "//input[@name='sales_end_date']")
	private WebElement sEndDate;
	@FindBy(xpath = "//img[@title='Select']")
	private WebElement vendorAddBtn ;
	@FindBy(xpath = "//input[@id='productcode']")
     private WebElement partnum;
	@FindBy(xpath = "//input[@id='vendor_part_no']")
	private WebElement vendorpartnum;
	@FindBy(xpath = "//input[@id='productsheet']")
	private WebElement productsheet;
	@FindBy(xpath = "//input[@name='qtyinstock']")
	private WebElement qty_unit;
	@FindBy(xpath = "//input[@name='qtyindemand']")
	private WebElement qtydemand;
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement desc;
	@FindBy(xpath = "(//input[@class='crmbutton small save'])[1]")
	private WebElement savebtn;
	@FindBy(xpath = "(//input[@class='crmbutton small cancel'])[1]")
	private WebElement cancelbtn;
	
	public CreateProductPagePom(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public WebElement getPdtname() {
		return pdtname;
	}
	public WebElement getPartnum() {
		return partnum;
	}
	public WebElement getVendorpartnum() {
		return vendorpartnum;
	}
	public WebElement getProductsheet() {
		return productsheet;
	}
	public WebElement getsStartDate() {
		return sStartDate;
	}
	
	public WebElement getManufacture() {
		return manufacture;
	}
	public WebElement getSupStartDate() {
		return supStartDate;
	}
	public WebElement getSupEndDate() {
		return supEndDate;
	}
	public WebElement getUnitPrice() {
		return unitPrice;
	}
	public WebElement getCommRate() {
		return commRate;
	}
	public WebElement getQtyStock() {
		return qtyStock;
	}
	public WebElement getPdtCategory() {
		return pdtCategory;
	}
	public WebElement getsEndDate() {
		return sEndDate;
	}
	public WebElement getVendorAddBtn() {
		return vendorAddBtn;
	}
	public WebElement getQty_unit() {
		return qty_unit;
	}
	public WebElement getQtydemand() {
		return qtydemand;
	}
	public WebElement getDesc() {
		return desc;
	}
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	/**
	 * business logic for create product with mandatory data
	 * @param pdtname
	 */
	public void createProduct(String pdtname) {
		getPdtname().sendKeys(pdtname);
		getSavebtn().click();
	}
}