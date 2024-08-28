package TestScript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Signuppage;
import Utiles.Browser;
import Utiles.ExtentReportManager;
import Utiles.PropertyReader;
import Validation.Validation_Signup;

public class SignuppageTest {
	WebDriver driver;
	Signuppage log;
	@BeforeMethod
	public void Setup() throws Exception
	{
		List<String>info=PropertyReader.getdata("Browser", 1);
		String broswername=info.get(0),drivername=info.get(1),url=info.get(2);
		driver=Browser.Launching_Browser(broswername, drivername);
		driver=Browser.Open_Url(url);
	}

	@AfterMethod
	public void closebroswer()
	{
		driver.close();
		ExtentReportManager.stopReport();
	}
	@Test(priority=1)
	public void Validation_Empty_Signup() throws Exception {
		ExtentReportManager.startTest("Validation_Empty_Signup", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		//List<String> info= PropertyReader.getdata("Signup", 1);
		//String rrr=info.get(0),pass=info.get(1),email=info.get(3);
		log.Click_On_FreeTrail_Btn();
		//log.Enter_Company_Name(rrr);
		//log.Enter_User_Name(pass);
		//log.Enter_Mobile_Num("8686868686");
		//log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : ");
		ExtentReportManager.logInfo("Name : ");
		ExtentReportManager.logInfo("Mobile Num : ");
		ExtentReportManager.logInfo("Email : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Empty_Signup_Page);
	}
	@Test(priority=2)
	public void Validation_Only_CompanyName() throws Exception {
		ExtentReportManager.startTest("Validation_Only_CompanyName", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 2);
		String rrr=info.get(0);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg1();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : Abc");
		ExtentReportManager.logInfo("Name : ");
		ExtentReportManager.logInfo("Mobile Num : ");
		ExtentReportManager.logInfo("Email : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Only_CompanyName);
	}
	@Test(priority=3)
	public void Validation_Only_Name() throws Exception {
		ExtentReportManager.startTest("Validation_Only_Name", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 3);
		String pass=info.get(1);
		log.Click_On_FreeTrail_Btn();
		log.Enter_User_Name(pass);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg2();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : ");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : ");
		ExtentReportManager.logInfo("Email : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Only_Name);
	}
	@Test(priority=4)
	public void Validation_Only_MobileNum() throws Exception {
		ExtentReportManager.startTest("Validation_Only_MobileNum", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		//List<String> info= PropertyReader.getdata("Signup", 1);
		//String rrr=info.get(0);
		//String pass=info.get(1);
		//String email=info.get(3);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Mobile_Num("8686868686");
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg3();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : ");
		ExtentReportManager.logInfo("Name : ");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Only_MobileNum);
	}
	@Test(priority=5)
	public void Validation_Only_Email() throws Exception {
		ExtentReportManager.startTest("Validation_Only_Email", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 4);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg4();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : ");
		ExtentReportManager.logInfo("Name : ");
		ExtentReportManager.logInfo("Mobile Num : ");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Only_Email);
	}
	@Test(priority=6)
	public void Validation_CompanyName_Name() throws Exception {
		ExtentReportManager.startTest("Validation_CompanyName_Name", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 5);
		String rrr=info.get(0);
		String pass=info.get(1);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg5();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : ");
		ExtentReportManager.logInfo("Email : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_CompanyName_Name);
	}
	@Test(priority=7)
	public void Validation_CompanyName_MobileNum() throws Exception {
		ExtentReportManager.startTest("Validation_CompanyName_MobileNum", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 6);
		String rrr=info.get(0);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_Mobile_Num("8686868686");
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg6();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : ");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_CompanyName_MobileNum);
	}
	@Test(priority=8)
	public void Validation_CompanyName_Email() throws Exception {
		ExtentReportManager.startTest("Validation_CompanyName_Email", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 7);
		String rrr=info.get(0);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg7();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : ");
		ExtentReportManager.logInfo("Mobile Num : ");
		ExtentReportManager.logInfo("Email : abc@abc.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_CompanyName_Email);
	}
	@Test(priority=9)
	public void Validation_CompanyName_Name_MobileNum() throws Exception {
		ExtentReportManager.startTest("Validation_CompanyName_Name_MobileNum", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 8);
		String rrr=info.get(0);
		String pass=info.get(1);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg8();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_CompanyName_Name_MobileNum);
	}
	@Test(priority=10)
	public void Validation_CompanyName_Name_Email() throws Exception {
		ExtentReportManager.startTest("Validation_CompanyName_Name_Email", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 9);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg9();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : ");
		ExtentReportManager.logInfo("Email : sharath@abc.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_CompanyName_Name_Email);
	}
	@Test(priority=11)
	public void Validation_CompanyName_MobileNum_Email() throws Exception {
		ExtentReportManager.startTest("Validation_CompanyName_MobileNum_Email", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 10);
		String rrr=info.get(0);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg10();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : ");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath@abc.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_CompanyName_MobileNum_Email);
	}
	@Test(priority=12)
	public void Validation_Name_MobileNum() throws Exception {
		ExtentReportManager.startTest("Validation_Name_MobileNum", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 11);
		String pass=info.get(1);
		log.Click_On_FreeTrail_Btn();
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg11();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : ");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Name_MobileNum);
	}
	@Test(priority=13)
	public void Validation_Name_Email() throws Exception {
		ExtentReportManager.startTest("Validation_Name_Email", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 12);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_User_Name(pass);
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg12();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : ");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : ");
		ExtentReportManager.logInfo("Email : sharath@abc.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Name_Email);
	}
	@Test(priority=14)
	public void Validation_Name_MobileNum_Email() throws Exception {
		ExtentReportManager.startTest("Validation_Name_MobileNum_Email", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 13);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg13();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : ");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath@abc.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Name_MobileNum_Email);
	}
	@Test(priority=15)
	public void Validation_MobileNum_Email() throws Exception {
		ExtentReportManager.startTest("Validation_MobileNum_Email", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 14);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg14();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : ");
		ExtentReportManager.logInfo("Name : ");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath@abc.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_MobileNum_Email);
	}
	@Test(priority=16)
	public void Valid_NameWithCharacters() throws Exception {
		ExtentReportManager.startTest("Valid_NameWithCharacters", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 15);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg15();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : dsa12123");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath@abc.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logFail(Validation_Signup.Enter_Invalid_Name);
	}
	@Test(priority=17)
	public void InValid_MobileNum() throws Exception {
		ExtentReportManager.startTest("InValid_MobileNum", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 16);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8546754");
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg16();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8546754");
		ExtentReportManager.logInfo("Email : sharath@abc.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Invalid_MobileNum);
	}
	@Test(priority=18)
	public void InValid_Email() throws Exception {
		ExtentReportManager.startTest("InValid_Email", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 17);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.isdisplayErrormsg17();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : asdada@fsd");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Invalid_Email);
	}
	@Test(priority=19)
	public void Valid_Data_Next() throws Exception {
		ExtentReportManager.startTest("Valid_Data_Next", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 18);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.Click_nextpage();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Validate_Nextpage);
	}	
	@Test(priority=20)
	public void Empty_Data_Secondpage() throws Exception {
		ExtentReportManager.startTest("Empty_Data_Secondpage", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 18);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Click_next_secondpage();
		Thread.sleep(1000);
		log.isdisplayErrormsg18();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Verification code : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Validate_Secondpage);
	}
	@Test(priority=21)
	public void Enter_Only_Password() throws Exception {
		ExtentReportManager.startTest("Enter_Only_Password", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 19);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		String password=info.get(3);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_Password(password);
		log.Click_next_secondpage();
		Thread.sleep(1000);
		log.isdisplayErrormsg19();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : sai@123");
		ExtentReportManager.logInfo("Verification code : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Only_Password);
	}
	@Test(priority=22)
	public void Click_Password_View() throws Exception {
		ExtentReportManager.startTest("Click_Password_View", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 19);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		String password=info.get(3);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_Password(password);
		log.Click_Password_View();
		Thread.sleep(1000);
		log.isdisplayErrormsg24();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : sai@123");
		ExtentReportManager.logInfo("Verification code : ");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Click_Password_View);
	}
	@Test(priority=23)
	public void Enter_Only_VerificationCode() throws Exception {
		ExtentReportManager.startTest("Enter_Only_VerificationCode", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 20);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_OTP("1234");
		log.Click_next_secondpage();
		Thread.sleep(1000);
		log.isdisplayErrormsg20();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Verification code : 1234");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Only_Verificationcode);
	}
	@Test(priority=24)
	public void Click_VerificationCode_Edit() throws Exception {
		ExtentReportManager.startTest("Click_VerificationCode_Edit", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 20);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_OTP("1234");
		log.Click_OTP_Edit();
		Thread.sleep(1000);
		log.isdisplayErrormsg25();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Verification code : 1234");
		ExtentReportManager.logPass(Validation_Signup.Click_Verificationcode_Edit);
	}
	@Test(priority=25)
	public void Click_VerificationCode_Edit_Cancel() throws Exception {
		ExtentReportManager.startTest("Click_VerificationCode_Edit_Cancel", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 20);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_OTP("1234");
		log.Click_OTP_Edit();
		Thread.sleep(1000);
		log.isdisplayErrormsg25();
		log.Click_OTP_Edit_Cancel();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Verification code : 1234");
		ExtentReportManager.logPass(Validation_Signup.Click_Verificationcode_Edit);
		ExtentReportManager.logInfo("Click on cancel button");
		ExtentReportManager.logPass(Validation_Signup.Click_Verificationcode_Edit_Cancel);
	}
	@Test(priority=26)
	public void Click_VerificationCode_Edit_SendCode() throws Exception {
		ExtentReportManager.startTest("Click_VerificationCode_Edit_SendCode", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 20);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_OTP("1234");
		log.Click_OTP_Edit();
		Thread.sleep(1000);
		log.isdisplayErrormsg25();
		Thread.sleep(1000);
		log.Click_OTP_Edit_Sendcode();
		Thread.sleep(1000);
		log.isdisplayErrormsg26();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Verification code : 1234");
		ExtentReportManager.logPass(Validation_Signup.Click_Verificationcode_Edit);
		ExtentReportManager.logInfo("Click on sendcode button");
		ExtentReportManager.logPass(Validation_Signup.Click_Verificationcode_Edit_SendCode);
	}
	@Test(priority=27)
	public void Click_VerificationCode_Resendcode() throws Exception {
		ExtentReportManager.startTest("Click_VerificationCode_Resendcode", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 20);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_OTP("1234");
		log.Click_Resendcode();
		Thread.sleep(1000);
		log.isdisplayErrormsg27();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Verification code : 1234");
		ExtentReportManager.logInfo("Click on Resendcode button");
		ExtentReportManager.logPass(Validation_Signup.Click_Verificationcode_ResendCode);
	}
	@Test(priority=28)
	public void Click_Only_LegalPolicy() throws Exception {
		ExtentReportManager.startTest("Click_Only_LegalPolicy", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 21);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(2000);
		log.Click_LegalPolicy();
		log.Click_next_secondpage();
		Thread.sleep(1000);
		log.isdisplayErrormsg21();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Verification code : ");
		ExtentReportManager.logInfo("Click on legal Policy");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Click_Only_Legalpolicy);
	}
	@Test(priority=29)
	public void Click_LegalPolicy_Link() throws Exception {
		ExtentReportManager.startTest("Click_LegalPolicy_Link", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 21);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(2000);
		log.Click_LegalPolicy();
		log.Click_LegalPolicy_Link();
		Thread.sleep(1000);
		log.isdisplayErrormsg28();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Verification code : ");
		ExtentReportManager.logInfo("Click on legal Policy");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Click_Only_Legalpolicy_Link);
	}
	@Test(priority=30)
	public void Click_LegalPolicy_Link_CloseButton() throws Exception {
		ExtentReportManager.startTest("Click_LegalPolicy_Link_CloseButton", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 21);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		Thread.sleep(1000);
		log.Click_LegalPolicy();
		Thread.sleep(1000);
		log.Click_LegalPolicy_Link();
		Thread.sleep(1000);
		log.Click_LegalPolicy_Link_Close();
		Thread.sleep(1000);
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Verification code : ");
		ExtentReportManager.logInfo("Click on legal Policy link");
		ExtentReportManager.logPass(Validation_Signup.Click_Only_Legalpolicy_Link);
		ExtentReportManager.logInfo("Click on close button legal Policy ");
		ExtentReportManager.logPass(Validation_Signup.Click_Only_Legalpolicy_Link_Close);
	}
	@Test(priority=31)
	public void Enter_Password_OTP() throws Exception {
		ExtentReportManager.startTest("Enter_Password_OTP", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 22);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		String password=info.get(3);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_Password(password);
		log.Enter_OTP("1234");
		log.Click_next_secondpage();
		Thread.sleep(1000);
		log.isdisplayErrormsg22();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : sai@123");
		ExtentReportManager.logInfo("Verification code : 1234");
		ExtentReportManager.logInfo("Don't Click on legal Policy");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Password_Verificationcode);
	}
	@Test(priority=32)
	public void Enter_Password_LeagalPolicy() throws Exception {
		ExtentReportManager.startTest("Enter_Password_LeagalPolicy", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 22);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		String password=info.get(3);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_Password(password);
		log.Click_LegalPolicy();
		log.Click_next_secondpage();
		Thread.sleep(1000);
		log.isdisplayErrormsg23();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : sai@123");
		ExtentReportManager.logInfo("Verification code : ");
		ExtentReportManager.logInfo("Click on legal Policy");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_Password_legalpolicy);
	}
	@Test(priority=33)
	public void Enter_OTP_LeagalPolicy() throws Exception {
		ExtentReportManager.startTest("Enter_OTP_LeagalPolicy", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 23);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_OTP("1234");
		log.Click_LegalPolicy();
		log.Click_next_secondpage();
		Thread.sleep(1000);
		log.isdisplayErrormsg29();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : ");
		ExtentReportManager.logInfo("Verification code : 1234");
		ExtentReportManager.logInfo("Click on legal Policy");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Enter_OTP_legalpolicy);
	}
	@Test(priority=34)
	public void Password_Lessthan_6Characters() throws Exception {
		ExtentReportManager.startTest("Password_Lessthan_6Characters", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 24);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		String password=info.get(3);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_Password(password);
		log.Enter_OTP("1234");
		log.Click_LegalPolicy();
		log.Click_next_secondpage();
		Thread.sleep(1000);
		log.isdisplayErrormsg30();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : sai");
		ExtentReportManager.logInfo("Verification code : 1234");
		ExtentReportManager.logInfo("Click on legal Policy");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Invalid_Password);
	}
	@Test(priority=35)
	public void Invalid_OTP() throws Exception {
		ExtentReportManager.startTest("Invalid_OTP", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 25);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		String password=info.get(3);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_Password(password);
		log.Enter_OTP("3434");
		log.Click_LegalPolicy();
		log.Click_next_secondpage();
		Thread.sleep(1000);
		log.isdisplayErrormsg31();
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : sai@123");
		ExtentReportManager.logInfo("Verification code : 3434");
		ExtentReportManager.logInfo("Click on legal Policy");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logPass(Validation_Signup.Invalid_OTP);
	}
	@Test(priority=36)
	public void Signup() throws Exception {
		ExtentReportManager.startTest("Signup", "test case description","test case pass");
		ExtentReportManager.startReport();
		log=new Signuppage(driver);
		List<String> info= PropertyReader.getdata("Signup", 26);
		String rrr=info.get(0);
		String pass=info.get(1);
		String email=info.get(2);
		String password=info.get(3);
		log.Click_On_FreeTrail_Btn();
		log.Enter_Company_Name(rrr);
		log.Enter_User_Name(pass);
		log.Enter_Mobile_Num("8686868686");
		log.Enter_Email(email);
		log.Click_next();
		log.Enter_Password(password);
		log.Enter_OTP("1234");
		log.Click_LegalPolicy();
		//log.Click_next_secondpage();
		Thread.sleep(1000);
		ExtentReportManager.logInfo("Chrome Browser Launched Successfully");
		ExtentReportManager.logInfo("Navigate to URL");
		ExtentReportManager.logInfo("Click on Free Trail button in home page");
		ExtentReportManager.logInfo("Company Name : abc");
		ExtentReportManager.logInfo("Name : sharath");
		ExtentReportManager.logInfo("Mobile Num : 8686868686");
		ExtentReportManager.logInfo("Email : sharath86@gmail.com");
		ExtentReportManager.logInfo("Click on Next button");
		ExtentReportManager.logInfo("Password : sai@123");
		ExtentReportManager.logInfo("Verification code : 1234");
		ExtentReportManager.logInfo("Click on legal Policy");
		ExtentReportManager.logInfo("Click on Next button");
	}
}