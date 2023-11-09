package stepdefinition.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.yaml.snakeyaml.reader.ReaderException;

import PageObjectModules.Baseclass;
import PageObjectModules.FacebookManagerobj;
import PageObjectModules.Readerfbmanager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runnerclass.cucumber.RunnerClass;

public class Stepdefinition extends Baseclass {
	
	public WebDriver test = RunnerClass.test;
	
	FacebookManagerobj fbob = new FacebookManagerobj(test);
	

@Given("User Launched The Application")
public void user_launched_the_application() throws Exception {
	waits("yes");
   
	String url = Readerfbmanager.Instant_reader().Instatnt_readerValue().geturl();
	geturls(url);
	
	
}



@When("User Click The Create New Account Button It Navigates To Signup Page")
public void user_click_the_create_new_account_button_it_navigates_to_signup_page() throws Exception {
   
	WebElement createaccount = fbob.Home_page().getCreateaccount();
	ClickElement(createaccount);
	sleep3sec();
	
}



@When("User Enter The Firstname In Firstname Field")
public void user_enter_the_firstname_in_firstname_field() throws Exception {
   
			String firstname = Readerfbmanager.Instant_reader().Instatnt_readerValue().firstname();
			SendKeysAction( fbob.Register_account().getFirstname(), firstname);

			
}



@When("User Enter The Surname In Surname Field")
public void user_enter_the_surname_in_surname_field() throws Exception {
	
	 String lastname = Readerfbmanager.Instant_reader().Instatnt_readerValue().lastname();
	 SendKeysAction(fbob.Register_account().getLastname(), lastname);
	 sleep2sec();
}



@When("User Enter The Email Or Mobile Number In EmailId Filed")
public void user_enter_the_email_or_mobile_number_in_email_id_filed() throws Exception {
	
	 String getmailidormoblie = Readerfbmanager.Instant_reader().Instatnt_readerValue().mobilenumberoremail();
	 SendKeysAction(fbob.Register_account().getMailidOrmobilenumber(), getmailidormoblie);
	 sleep2sec();
}

//@When("User Re Enter The Email Or Mobile Number For Verfication")
//public void user_re_enter_the_email_or_mobile_number_for_verfication() throws Exception {
// 
//	String reentermailormobile = Readerfbmanager.Instant_reader().Instatnt_readerValue().reentermailormobile();
//	SendKeysAction(fbob.Register_account().getReEntermailornumber(), reentermailormobile);
//}



@When("User Enter The Strong Password In Password Field")
public void user_enter_the_strong_password_in_password_field() throws Exception {
	
   String regpassword = Readerfbmanager.Instant_reader().Instatnt_readerValue().regpassword();
	SendKeysAction(fbob.Register_account().getPassword(), regpassword);
}

@When("User Select The Date Of Birth In Date Dropdown Function")
public void user_select_the_date_of_birth_in_date_dropdown_function() throws Exception {
	
	 String dateOfbirth = Readerfbmanager.Instant_reader().Instatnt_readerValue().dateOfbirth();
	 Selectbyvisibletext(fbob.Register_account().getDateofbirth(), dateOfbirth);
   
}

@When("user Select The Month Of Birth In Month Dropdown Function")
public void user_select_the_month_of_birth_in_month_dropdown_function() throws Exception {
	
    String monthofbirth = Readerfbmanager.Instant_reader().Instatnt_readerValue().monthOfbirth();
	Selectbyvisibletext(fbob.Register_account().getMonthofbirth(), monthofbirth);
}

@When("User Select The Year Of Birth In Year Dropdown Function")
public void user_select_the_year_of_birth_in_year_dropdown_function() throws Exception {
	
	String yearOfbirth = Readerfbmanager.Instant_reader().Instatnt_readerValue().yearOfbirth();
    Selectbyvisibletext(fbob.Register_account().getYearofbirth(), yearOfbirth);
}



@When("User Click The Gender In Gender Section Button")
public void user_click_the_gender_in_gender_section_button() throws Exception {

	String genderMale = Readerfbmanager.Instant_reader().Instatnt_readerValue().genderMale();
     Genderselect(fbob.Register_account().getMale(), genderMale);
	

}



@Then("User Click The Signup Button It Navigates To OTP Verification Page")
public void user_click_the_signup_button_it_navigates_to_otp_verification_page() throws Exception {
   
		ClickElement(fbob.Register_account().getSignup());
}

	
@When("User Enter The OneTimePassword In OTP Field")
public void user_enter_the_one_time_password_in_otp_field() throws Exception {
   WebElement otp_field = fbob.Verification_Field().getOtp_field();
	Onetimepassword(otp_field);
	sleep15sec();
	
}


@When("User Click The Continue Button")
public void user_click_the_continue_button() {
	
	WebElement continuebtn = fbob.Verification_Field().getContinuebtn();
	ClickElement(continuebtn);
}

@When("user Click The Ok Button To Prcceed To Create An Account")
public void user_click_the_ok_button_to_prcceed_Create_An_Account() {
	
	WebElement okbtn = fbob.Verification_Field().getOkbtn();
   ClickElement(okbtn);
	
}

	
	
	
	
	
	

}
