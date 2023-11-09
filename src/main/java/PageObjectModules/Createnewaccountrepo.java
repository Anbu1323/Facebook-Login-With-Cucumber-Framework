package PageObjectModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnewaccountrepo {
	
	 public	WebDriver test;
		
	
	public Createnewaccountrepo(WebDriver test2) {
		this.test = test2;
		PageFactory.initElements(Baseclass.test, this);
		// TODO Auto-generated constructor stub
	}

	

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMailidOrmobilenumber() {
		return mailidOrmobilenumber;
	}

	public WebElement getReEntermailornumber() {
		return ReEntermailornumber;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getDateofbirth() {
		return Dateofbirth;
	}
	
	public WebElement getMonthofbirth() {
		return Monthofbirth;
	}

	public WebElement getYearofbirth() {
		return Yearofbirth;
	}
	
	public WebElement getFemale() {
		return female;
	}



	public WebElement getMale() {
		return male;
	}



	public WebElement getCustom() {
		return custom;
	}

	public WebElement getSignup() {
		return Signup;
	}
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(name = "reg_email__")
	private WebElement mailidOrmobilenumber;
	
	@FindBy(name = "reg_email_confirmation__")
	private WebElement ReEntermailornumber;
	
	
	@FindBy(id = "password_step_input")
	private WebElement password;
	
	@FindBy(id ="day" )
	private WebElement Dateofbirth;

	@FindBy(name = "birthday_month")
	private WebElement Monthofbirth;


	@FindBy(name = "birthday_year")
	private WebElement Yearofbirth;

	@FindBy(xpath = "//label[text()='Female']" )
	private WebElement female;
	

	@FindBy(xpath = "//label[text()='Male']" )
	private WebElement male;
	
	@FindBy(xpath = "//label[text()='Custom']")
	private WebElement custom;
	

	@FindBy(name = "websubmit")
	private WebElement Signup;
	

	
	
	
	

}
