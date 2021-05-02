package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base_page{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	private By myaccount_link=By.linkText("MY ACCOUNT");
	private By sign_up_link=By.linkText("Sign Up");

	public void click_on_myaccount_link()
	{
		wait_elements(base_page_driver, 20 , myaccount_link);
		base_page_driver.findElement(myaccount_link).click();
	}
	
	public void click_on_signup_link()
	{
		wait_elements(base_page_driver, 20 , sign_up_link);
		base_page_driver.findElement(sign_up_link).click();
	}




}