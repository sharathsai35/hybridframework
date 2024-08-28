package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utiles.PropertyReader;
import Validation.Validation_TMmonitor;

public class TMmonitorpage {
private WebDriver driver;
	
	public TMmonitorpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("Tmmonitor","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	public void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("Tmmonitor","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	public void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("Tmmonitor","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Valid_Login,"test case pass");
	}
	public void Click_On_TM_Monitor() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","monitortab");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-app");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Click_On_TM_Monitor,"test case pass");
		ele4.click();
	}
	public void Validate_TM_Monitor() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","validatemonitortext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Validate_TM_Monitor,"test case pass");
	}
	public void Validate_TM_Monitor1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","validatetext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Validate_TM_Monitor1,"test case pass");
	}
	public void Enter_Password(String password) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","enterpassword");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Enter_Password,"test case pass");
		ele4.sendKeys(password);
	}
	public void Click_On_Next() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","nextbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Click_On_Next,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Validate_Toast_Msg,"test case pass");
	}
	public void Validate_Toast_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","toastmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Validate_Toast_Msg1,"test case pass");
	}
	public void Validate_TM_Monitor2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","validatemonitortext1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Validate_TM_Monitor2,"test case pass");
	}
	public void Validate_TM_Monitor3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","validatetext1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Validate_TM_Monitor3,"test case pass");
	}
	public void Employee_Name() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","employeename");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Employee_Name,"test case pass");
	}
	public void Click_On_Employee_Name() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","employeename");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Click_On_Employee_Name,"test case pass");
		ele4.click();
	}
	public void Search_Employee_Name(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","employeename");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Search_Employee_Name,"test case pass");
		ele4.sendKeys(search);
	}
	public void Select_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Select_User,"test case pass");
		ele4.click();
	}
	public void Select_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","user1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Select_User1,"test case pass");
		ele4.click();
	}
	public void Click_On_Second_Next() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","next");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Click_On_Second_Next,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","toastmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Validate_Toast_Msg2,"test case pass");
	}
	public void Access() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","access");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Access,"test case pass");
	}
	public void Access1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","access1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Access1,"test case pass");
	}
	public void Access2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","access2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Access2,"test case pass");
	}
	public void Access3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","access3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Access3,"test case pass");
	}
	public void Access4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","access4");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Access4,"test case pass");
	}
	public void Access5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","access2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Access2,"test case pass");
		ele4.click();
	}
	public void Tm_Monitor() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Tmmonitor","afterend");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_TMmonitor.Tm_Monitor,"test case pass");
		ele4.click();
	}
}
