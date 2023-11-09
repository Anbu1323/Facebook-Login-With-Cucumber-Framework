package PageObjectModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagerepo {

 public WebDriver test;
	
	public Loginpagerepo(WebDriver test2) {
		this.test = test2;
		PageFactory.initElements(Baseclass.test, this);

	}

	

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getResetpassword() {
		return resetpassword;
	}

	public WebElement getCreateaccount() {
		return createaccount;
	}

	public WebElement getBack() {
		return Back;
	}
	
	@FindBy(name = "email")
	private WebElement emailid;
	
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement resetpassword;
	
    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")	
    private WebElement createaccount;
    
    @FindBy(name =  "login")
    private WebElement Back;

	
    
    
}
