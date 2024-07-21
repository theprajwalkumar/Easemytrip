package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPagePO {
	WebDriver ldriver;
	public LandingPagePO(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver , this);
		
	}

}
