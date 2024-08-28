package TestScript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import Utiles.ExtentReportManager;
import Pages.Loginpage;
import Utiles.Browser;
import Utiles.PropertyReader;
import Validation.Validation_Login;


public class LoginpageTest
{
WebDriver driver;
	ExtentReports extent;
	Loginpage login;
	public static ExtentTest test;
	
	@BeforeMethod
	private void Start_Procedure() throws Exception 
	{
		List<String>info=PropertyReader.getdata("Browser",1);
		String BrowserName=info.get(0),DriverName=info.get(1),Url=info.get(2);
		driver=Browser.Launching_Browser(BrowserName, DriverName);
		driver=Browser.Open_Url(Url);
	}

	@AfterMethod
	public void close()
	{
		driver=Browser.close();
		ExtentReportManager.stopReport();
	}
	@Test(priority=1) 
	public void Verify_Functionality_Of_Login_With_Empty_Username_EmptyPassword() throws Exception {
		ExtentReportManager.startTest("Verify_Functionality_Of_Login_With_Empty_Username_EmptyPassword", "test case description","test case pass");
		ExtentReportManager.startReport();
		//List<String>info=PropertyReader.getdata("Login_Page", 4); 
		//String Email=info.get(0); 
		//String Password=info.get(1); 
		login=new Loginpage(driver);
		login.Click_On_Login_Link(); 
		Thread.sleep(3000); 
		// login.TRoop_Login(Email,Password); 
		//Thread.sleep(2000); 
		login.Click_On_Login_Btn();
		Thread.sleep(2000);
		login.isdisplayErrormsg1();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on login button in home page");
		ExtentReportManager.logInfo("Email: ");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Click on login");
		ExtentReportManager.logPass(Validation_Login.Empty_Data);
		Thread.sleep(2000);
		}
	@Test(priority=2)
	public void Verify_Functionality_Of_Login_With_EmptyPassword() throws Exception
	{
		ExtentReportManager.startTest("Verify_Functionality_Of_Login_With_EmptyPassword", "test case description", "test case pass");
		ExtentReportManager.startReport();
		List<String>info=PropertyReader.getdata("Login_Page", 4);
		String Email=info.get(0);
		//String Password=info.get(1);
		login=new Loginpage(driver);
		login.Click_On_Login_Link();
		Thread.sleep(3000);
		login.TRoop_Login(Email,"");
		Thread.sleep(2000);
		login.Click_On_Login_Btn();
		Thread.sleep(1000);
		login.isdisplayErrormsg2();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on login button in home page");
		ExtentReportManager.logInfo("Email:email@tm.com");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Click on login");
		ExtentReportManager.logPass(Validation_Login.Empty_Data1);
	}
	@Test(priority=3)
	public void Verify_Functionality_Of_Login_With_EmptyUsername() throws Exception
	{
		ExtentReportManager.startTest("Verify_Functionality_Of_Login_With_EmptyUsername", "test case description", "test case pass");
		ExtentReportManager.startReport();
		List<String>info=PropertyReader.getdata("Login_Page", 5);
		//String Email=info.get(0);
		String Password=info.get(1);
		login=new Loginpage(driver);
		login.Click_On_Login_Link();
		Thread.sleep(3000);
		login.TRoop_Login("",Password);
		Thread.sleep(2000);
		login.Click_On_Login_Btn();
		Thread.sleep(1000);
		login.isdisplayErrormsg1();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on login button in home page");
		ExtentReportManager.logInfo("Email: ");
		ExtentReportManager.logInfo("Password : sai@123");
		ExtentReportManager.logInfo("Click on login");
		ExtentReportManager.logPass(Validation_Login.Empty_Data);
	}
	@Test(priority=4)
	public void Verify_Functionality_Of_Login_With_InvalidUsername_InvalidPassword() throws Exception
	{
		ExtentReportManager.startTest("Verify_Functionality_Of_Login_With_InvalidUsername_InvalidPassword", "test case description", "test case pass");
		ExtentReportManager.startReport();
		List<String>info=PropertyReader.getdata("Login_Page", 6);
		String Email=info.get(0);
		String Password=info.get(1);
		login=new Loginpage(driver);
		login.Click_On_Login_Link();
		Thread.sleep(3000);
		login.TRoop_Login(Email,Password);
		Thread.sleep(2000);
		login.Click_On_Login_Btn();
		Thread.sleep(1000);
		login.isdiplayErrormsg2();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on login button in home page");
		ExtentReportManager.logInfo("Email: fdgdsg@dfg");
		ExtentReportManager.logInfo("Password : sdfsfdff");
		ExtentReportManager.logInfo("Click on login");
		ExtentReportManager.logPass(Validation_Login.Invalid_Username_Password);
	}
	@Test(priority=5)
	public void Verify_Functionality_Of_Login_With_InValid_Username() throws Exception
	{
		ExtentReportManager.startTest("Verify_Functionality_Of_Login_With_InValid_Username", "test case description", "test case pass");
		ExtentReportManager.startReport();
		List<String>info=PropertyReader.getdata("Login_Page", 3);
		String Email=info.get(0);
		String Password=info.get(1);
		login=new Loginpage(driver);
		login.Click_On_Login_Link();
		Thread.sleep(3000);
		login.TRoop_Login(Email, Password);
		Thread.sleep(2000);
		login.Click_On_Login_Btn();
		Thread.sleep(1000);
		login.isdiplayErrormsg1();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on login button in home page");
		ExtentReportManager.logInfo("Email:fgsdf@fsd");
		ExtentReportManager.logInfo("Password : Sai@123");
		ExtentReportManager.logInfo("Click on login");
		ExtentReportManager.logPass(Validation_Login.Invalid_Username);
	}
	@Test(priority=6)
	public void Verify_Functionality_Of_Login_With_InValid_Password() throws Exception
	{
		ExtentReportManager.startTest("Verify_Functionality_Of_Login_With_InValid_Password", "test case description", "test case pass");
		ExtentReportManager.startReport();
		List<String>info=PropertyReader.getdata("Login_Page", 2);
		String Email=info.get(0);
		String Password=info.get(1);
		login=new Loginpage(driver);
		login.Click_On_Login_Link();
		Thread.sleep(3000);
		login.TRoop_Login(Email, Password);
		Thread.sleep(2000);
		login.Click_On_Login_Btn();
		Thread.sleep(1000);
		login.isdiplayErrormsg();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on login button in home page");
		ExtentReportManager.logInfo("Email:email@tm.com");
		ExtentReportManager.logInfo("Password : Sai@123");
		ExtentReportManager.logInfo("Click on login");
		ExtentReportManager.logPass(Validation_Login.Invalid_Password);
	}
	@Test(priority=7)
	public void Verify_Functionality_Of_Login_With_Valid_Data() throws Exception
	{
		ExtentReportManager.startTest("Verify_Functionality_Of_Login_With_Valid_Data", "test case description", "test case pass");
		ExtentReportManager.startReport();
		List<String>info=PropertyReader.getdata("Login_Page", 1);
		String Email=info.get(0);
		String Password=info.get(1);
		login=new Loginpage(driver);
		login.Click_On_Login_Link();
		Thread.sleep(3000);
		login.TRoop_Login(Email, Password);
		Thread.sleep(2000);
		login.Click_On_Login_Btn();
		
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on login button in home page");
		ExtentReportManager.logInfo("Email:email@tm.com");
		ExtentReportManager.logInfo("Password : sai@123");
		ExtentReportManager.logInfo("Click on login");
		ExtentReportManager.stopReport();
		//Thread.sleep(3000);
	}
}
