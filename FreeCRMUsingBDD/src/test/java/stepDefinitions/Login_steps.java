package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
public class Login_steps {

	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page(){
	System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.freecrm.com/index.html");
		
		}
}
