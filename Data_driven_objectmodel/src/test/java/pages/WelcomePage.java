package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WelcomePage extends Base_page {


	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By logout_link=By.linkText("Logout");
	private By welcome_message=By.xpath("/html/body/div[2]/div[1]/div[1]/div/div/div[1]/div/div[2]/h3");


	public void logout_from_myaccount(String name) {
		base_page_driver.findElement(By.linkText(name.toUpperCase())).click();
		base_page_driver.findElement(logout_link).click();
	}


	public String expected_result() {
		wait_elements(base_page_driver,20,welcome_message);
		return base_page_driver.findElement(welcome_message).getText();
	}
	

}