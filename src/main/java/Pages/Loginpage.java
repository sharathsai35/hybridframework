package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utiles.PropertyReader;
import Validation.Validation_Login;

public class Loginpage
{
private WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("logindetails","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	private void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("logindetails","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	private void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("logindetails","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("logindetails","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void isdiplayErrormsg() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("logindetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Login.Invalid_Password,"test case pass");
	}
	public void isdiplayErrormsg1() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("logindetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Login.Invalid_Username,"test case pass");
	}
	public void isdiplayErrormsg2() throws Exception
	{
		String errormsg=PropertyReader.Get_Locator("logindetails","Errormsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Login.Invalid_Username_Password,"test case pass");
	}
	public void isdisplayErrormsg1() throws Exception
	{
		String errormsg1=PropertyReader.Get_Locator("logindetails","Errormsg1");
		By errormsgll=By.xpath(errormsg1);
		WebElement errormsgs=driver.findElement(errormsgll);
		//Browsers.Wait_Method(ele4);
		errormsgs.isDisplayed();
		String actualText1=errormsgs.getText();
	    System.out.println(actualText1);
		Assert.assertEquals(actualText1,Validation_Login.Empty_Data,"test case pass");
	}
	public void isdisplayErrormsg2() throws Exception
	{
		String errormsg2=PropertyReader.Get_Locator("logindetails","Errormsg2");
		By errormsgll=By.xpath(errormsg2);
		WebElement errormsg1=driver.findElement(errormsgll);
		//Browsers.Wait_Method(ele4);
		errormsg1.isDisplayed();
		String actualText2=errormsg1.getText();
	    System.out.println(actualText2);
		Assert.assertEquals(actualText2,Validation_Login.Empty_Data1,"test case pass");
	}
	public void TRoop_Login(String Email, String Password) throws Exception 
	{
		this.Set_Email(Email);
	     this.Set_Password(Password);
	}
}