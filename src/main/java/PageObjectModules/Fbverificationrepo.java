package PageObjectModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbverificationrepo {

public WebDriver test;
	
	public Fbverificationrepo(WebDriver test2) {
		this.test = test2;
		PageFactory.initElements(Baseclass.test, this);
	}
	
	
	public WebElement getOtp_field() {
		return Otp_field;
	}

	public WebElement getContinuebtn() {
		return Continuebtn;
	}

	public WebElement getOkbtn() {
		return Okbtn;
	}
	

	@FindBy(id = "code_in_cliff")
	private WebElement Otp_field;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement Continuebtn;
	
	@FindBy(xpath = "//a[text()='OK']")
	private WebElement Okbtn;

	
	
	
}
