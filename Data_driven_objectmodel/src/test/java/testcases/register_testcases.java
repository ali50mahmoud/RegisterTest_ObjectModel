package testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;
import pages.WelcomePage;
import utilities.read_excel_data;

public class register_testcases extends Base_Test {
	HomePage hp;
	RegisterPage rp;
	WelcomePage wp;


	@Test(dataProvider = "test_data")
	public void register_first_testcase (String first_name, String last_name, String phone, String email,String password ,String confirm) throws InterruptedException , IOException 
	{
		hp=new HomePage(base_test_driver);
		hp.click_on_myaccount_link();
		hp.click_on_signup_link();
		rp= new RegisterPage(base_test_driver);
		rp.insert_first_name(first_name);
		rp.insert_last_name(last_name);
		rp.insert_phone_number(phone);
		rp.insert_email(email);
		rp.insert_password(password);
		rp.confirm_password(confirm);
		rp.scroll_down (base_test_driver);
		rp.click_on_submit_bttn();
		wp=new WelcomePage(base_test_driver);
		Assert.assertEquals(wp.expected_result(), "Hi, "+first_name+" "+ last_name);
		wp.logout_from_myaccount(first_name);
	}


	@DataProvider
	public String [][] tes_date()  throws InvalidFormatException, IOException
	{
		read_excel_data obj = new read_excel_data();
		return  obj.read_sheet();
	}




}


