package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom {
  
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='submitButton']")
	private WebElement loginbutton;
	
	
	public LoginPagePom(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public void loginOperation(String username,String password) {
		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginbutton().click();
	}
	
}