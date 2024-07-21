package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPageSD {
	WebDriver driver;
	@Given("User opens the chrome browser")
	public void user_opens_the_chrome_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	    
	}

	@And("User opens the url {string}")
	public void user_opens_the_url(String url) throws InterruptedException {
	    
	    driver.get(url);
	    Thread.sleep(2000);
	}

	
	public static void main(String[] args) {
		
		
	}

}
