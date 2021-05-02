package testcases;



import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.read_excel_data;

public class Base_Test {

	WebDriver base_test_driver;
	
	
	@BeforeClass
	@Parameters({"browser"})
	public void open_browser(String browser)
	{
		if(browser.equals("chrome")) {
			WebDriverManager.chromiumdriver().setup();
			base_test_driver=new ChromeDriver();
			base_test_driver.get("https://www.phptravels.net/");
			base_test_driver.manage().window() .maximize(); }
		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			base_test_driver=new FirefoxDriver();
			base_test_driver.get("https://www.phptravels.net/");
			base_test_driver.manage().window() .maximize(); }
	}
	@AfterClass
	public void close_browser()
	{
		base_test_driver.close();
	}
//	@DataProvider
//	public String[][] test_data() throws InvalidFormatException, IOException
//	{
//		read_excel_data obj=new read_excel_data();
//		return obj.read_sheet();
//	}

}
