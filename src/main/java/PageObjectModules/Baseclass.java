package PageObjectModules;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



 public class Baseclass {

	static WebDriver test;
	static Actions ac;
    static Select d;
    static Select m;
    static Select y;
	public static WebDriver launchbrower(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\White_Devil\\eclipse-workspace\\cucumber.facebook\\driver\\chromedriver.exe");

			test = new ChromeDriver();
			test.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\White_Devil\\eclipse-workspace\\Amazontest\\webdriver\\chromedriver.exe");

			test = new FirefoxDriver();
			test.manage().window().maximize();
		}
		return test;
	}

	public static void geturls(String url) {
			test.get(url);
	}

	public static void waits(String waiting) {
		if(waiting.equalsIgnoreCase("yes")) {
		test.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	}

	public static void title(String webpageName) {
		test.getTitle();

	}

	public static void currentUrl(String webpagetUrl) {
		test.getCurrentUrl();

	}

	public static void Onetimepassword(WebElement element ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The OTP : ");
		String otp = sc.next();
		element.sendKeys(otp);
		
	}
	
	


	public static void alert(String alerts) {
		test.switchTo().alert().accept();

	}
	public static void Getback(WebElement element, String goback) throws Exception {
		ac = new Actions(test);
		ac.contextClick(element).build().perform();
		Robot r = new Robot();
		if(goback.equalsIgnoreCase("yes")) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
		
	}


	public static void SendKeysAction(WebElement getElement, String getEmailid) {
		 ac = new Actions(test);
		 ac.sendKeys(getElement, getEmailid).build().perform();
	}
	
	public static void ClickElement(WebElement element) {
		
		element.click();
		}
	
	
	public static void Close() {
		test.quit();
	}
	
	public static void sleep15sec() throws Exception {
		Thread.sleep(15000);
	}
	
	public static void sleep3sec() throws Exception {
		Thread.sleep(3000);
	}
	
	public static void sleep2sec() throws Exception {
		Thread.sleep(2000);
	}
	
	
	public static void Selectvalue(WebElement element, String birthdate) {
	
		d = new Select(element);
		d.selectByValue(birthdate);
		}
	
	public static void Selectbytext(WebElement element, String birthmonth) {
		m = new Select(element);
		m.selectByVisibleText(birthmonth);
		

	}
	
	public static void Selectbyvisibletext(WebElement element, String birthyear) {

		y = new Select(element);
        y.selectByVisibleText(birthyear);	
	}
	
	public static void Genderselect(WebElement element,  String gender) {
		
		ac = new Actions(test);
		if(gender.equalsIgnoreCase("click")) {
			ac.click(element).build().perform();
		}

	}
	
	
	
	
	
	
	}
	
	
	
	

