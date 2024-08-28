package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import Utiles.PropertyReader;
import Validation.Validation_Signup;

public class Signuppage {
	private WebDriver driver;
	public Signuppage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_FreeTrail_Btn() throws Exception
	{
		String FreeTrail=PropertyReader.Get_Locator("signuppagedetails","Signup");
		By Signup=By.xpath(FreeTrail);
		WebElement ele5=driver.findElement(Signup);
		//Browsers.Wait_Method(ele4);
		ele5.click();
	}
	public void Enter_Company_Name(String company) throws Exception
	{
		String companyname=PropertyReader.Get_Locator("signuppagedetails","CompanyName");
		By CompanyName=By.xpath(companyname);
		WebElement ele6=driver.findElement(CompanyName);
		//Browsers.Wait_Method(ele4);
		ele6.sendKeys(company);
	}
	public void Enter_User_Name(String user) throws Exception
	{
		String username1=PropertyReader.Get_Locator("signuppagedetails","UserName");
		By UserName=By.xpath(username1);
		WebElement ele7=driver.findElement(UserName);
		//Browsers.Wait_Method(ele4);
		ele7.sendKeys(user);
	}
	public void Enter_Mobile_Num(String mobile) throws Exception
	{
		String mobilenum1=PropertyReader.Get_Locator("signuppagedetails","MobileNum");
		By MobileNum=By.xpath(mobilenum1);
		WebElement ele8=driver.findElement(MobileNum);
		//Browsers.Wait_Method(ele4);
		ele8.sendKeys(mobile);
	}
	public void Enter_Email(String email) throws Exception
	{
		String email1=PropertyReader.Get_Locator("signuppagedetails","Email");
		By Email=By.xpath(email1);
		WebElement ele9=driver.findElement(Email);
		//Browsers.Wait_Method(ele4);
		ele9.sendKeys(email);
	}
	public void Click_next() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","Next");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.click();
	}
	public void Click_nextpage() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","NextPage");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.isDisplayed();
		String actualText=ele10.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Validate_Nextpage,"test case pass");
	}
	public void Click_next_secondpage() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","NextSignup");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.click();
	}
	public void Enter_Password(String password) throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","Password");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.sendKeys(password);
	}
	public void Click_Password_View() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","PasswordView");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.click();
	}
	public void Enter_OTP(String otp) throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","VerificationCode");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.sendKeys(otp);
	}
	public void Click_OTP_Edit() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","OtpEdit");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.click();
	}
	public void Click_OTP_Edit_Cancel() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","OtpEditCancel");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.click();
	}
	public void Click_OTP_Edit_Sendcode() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","OtpEditSendCode");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.click();
	}
	public void Click_Resendcode() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","ResendCode");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.click();
	}
	public void Click_LegalPolicy() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","LegalPolicy");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.click();
	}
	public void Click_LegalPolicy_Link() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","LegalPolicyLink");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.click();
	}
	public void Click_LegalPolicy_Link_Close() throws Exception
	{
		String next1=PropertyReader.Get_Locator("signuppagedetails","LegalPolicyLinkCloseButton");
		By Next=By.xpath(next1);
		WebElement ele10=driver.findElement(Next);
		//Browsers.Wait_Method(ele4);
		ele10.click();
	}
	public void isdisplayErrormsg() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Empty_Signup_Page,"test case pass");
	}
	public void isdisplayErrormsg1() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_Only_CompanyName,"test case pass");
	}
	public void isdisplayErrormsg2() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_Only_Name,"test case pass");
	}
	public void isdisplayErrormsg3() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_Only_MobileNum,"test case pass");
	}
	public void isdisplayErrormsg4() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_Only_Email,"test case pass");
	}
	public void isdisplayErrormsg5() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_CompanyName_Name,"test case pass");
	}
	public void isdisplayErrormsg6() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_CompanyName_MobileNum,"test case pass");
	}
	public void isdisplayErrormsg7() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_CompanyName_Email,"test case pass");
	}
	public void isdisplayErrormsg8() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_CompanyName_Name_MobileNum,"test case pass");
	}
	public void isdisplayErrormsg9() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_CompanyName_Name_Email,"test case pass");
	}
	public void isdisplayErrormsg10() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);  
		Assert.assertEquals(actualText,Validation_Signup.Enter_CompanyName_MobileNum_Email,"test case pass");
	}
	public void isdisplayErrormsg11() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);  
		Assert.assertEquals(actualText,Validation_Signup.Enter_Name_Email,"test case pass");
	}
	public void isdisplayErrormsg12() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);  
		Assert.assertEquals(actualText,Validation_Signup.Enter_Name_MobileNum,"test case pass");
	}
	public void isdisplayErrormsg13() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);  
		Assert.assertEquals(actualText,Validation_Signup.Enter_Name_MobileNum_Email,"test case pass");
	}
	public void isdisplayErrormsg14() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);  
		Assert.assertEquals(actualText,Validation_Signup.Enter_MobileNum_Email,"test case pass");
	}
	public void isdisplayErrormsg15() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);  
		Assert.assertEquals(actualText,Validation_Signup.Enter_Invalid_Name,"test case pass");
	}
	public void isdisplayErrormsg16() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);  
		Assert.assertEquals(actualText,Validation_Signup.Enter_Invalid_MobileNum,"test case pass");
	}
	public void isdisplayErrormsg17() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);  
		Assert.assertEquals(actualText,Validation_Signup.Enter_Invalid_Email,"test case pass");
	}
	public void isdisplayErrormsg18() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Validate_Secondpage,"test case pass");
	}
	public void isdisplayErrormsg19() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_Only_Password,"test case pass");
	}
	public void isdisplayErrormsg20() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_Only_Verificationcode,"test case pass");
	}
	public void isdisplayErrormsg21() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Click_Only_Legalpolicy,"test case pass");
	}
	public void isdisplayErrormsg22() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_Password_Verificationcode,"test case pass");
	}
	public void isdisplayErrormsg23() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg1");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_Password_legalpolicy,"test case pass");
	}
	public void isdisplayErrormsg24() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg2");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Click_Password_View,"test case pass");
	}
	public void isdisplayErrormsg25() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg3");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Click_Verificationcode_Edit,"test case pass");
	}
	public void isdisplayErrormsg26() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg1");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Click_Verificationcode_Edit_SendCode,"test case pass");
	}
	public void isdisplayErrormsg27() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg1");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Click_Verificationcode_ResendCode,"test case pass");
	}
	public void isdisplayErrormsg28() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg4");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Click_Only_Legalpolicy_Link,"test case pass");
	}
	public void isdisplayErrormsg29() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Enter_OTP_legalpolicy,"test case pass");
	}
	public void isdisplayErrormsg30() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Invalid_Password,"test case pass");
	}
	public void isdisplayErrormsg31() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("signuppagedetails","Errormsg1");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Signup.Invalid_OTP,"test case pass");
	}
	public void TRoop_Signup(String company , String user ,String mobile,  String email) throws Exception 
	{
		this.Enter_Company_Name(company);
		this.Enter_User_Name(user);
		this.Enter_Mobile_Num(mobile);
		this.Enter_Email(email);
	}
}
