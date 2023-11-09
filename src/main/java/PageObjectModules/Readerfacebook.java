package PageObjectModules;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

public class Readerfacebook {

	public Properties prop;
	
	public Readerfacebook() throws Exception {
	
	File reader = new File("C:\\Users\\White_Devil\\eclipse-workspace\\cucumber.facebook\\src\\main\\java\\PageObjectModules\\fbproperties");
	
	FileInputStream input = new FileInputStream(reader);
	
	prop = new Properties();
	prop.load(input);
	
	
	}
	public String getbrowsername() {
		String browser = prop.getProperty("browsername");
		return browser;
	}
	
	public String geturl() {
		String url = prop.getProperty("geturl");
		return url;
		
	}
	public String getmailid() {
		String emailid = prop.getProperty("mailid");
		return emailid;
		
	}
	public String getpassword() {
		String password = prop.getProperty("password");
		return password;
		
	}
	
	public String createaccount() {
		String accountcreate = prop.getProperty("elementname");
		return accountcreate;
		
	}
	
	public String firstname() {
		String name = prop.getProperty("firstname");
		return name;
	}

	public String lastname() {
		String lname = prop.getProperty("surname");
		return lname;
	}
	
	public String mobilenumberoremail() {
		String number = prop.getProperty("registerMobilenumberoremail");
		return number;
	}
	
	public String reentermailormobile() {
		String reenter = prop.getProperty("registerMobilenumberoremail");
		return reenter;
	}
	
	public String regpassword() {
		String passwd = prop.getProperty("registerPassword");
	    return passwd;
	}
	
	public String dateOfbirth() {
		String date = prop.getProperty("birthDate");
		return date;
	}
	
	public String monthOfbirth() {
		String month = prop.getProperty("birthMonth");
		return month;
		}
	
	public String yearOfbirth() {
		String year = prop.getProperty("birthYear");
		return year;
	}
	
	public String genderMale() {
		String male = prop.getProperty("maleGender");
		return male;
		
	}
	
	public String genderFemale() {
		String female = prop.getProperty("femaleGender");
		return female;
		
	}
	public String genderCustom() {
		String custom = prop.getProperty("customGender");
		return custom;
		
	}
	
	public String GenderSelection() {
		String gender = prop.getProperty("gender");
		return gender;
	
	}
	
	public String Goback() {
		String back = prop.getProperty("Goback");
		return back;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
