package Pages;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utiles.PropertyReader;
import Validation.Validation_LocationTrackingControls;

public class LocationTrackingpage {
	private WebDriver driver;
	Robot rb;
	public LocationTrackingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("locationtrackingdetails","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	public void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("locationtrackingdetails","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	public void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("locationtrackingdetails","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Valid_Login,"test case pass");
	}
	public void Click_On_Dashboard() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","dashboard");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-app");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Click_On_Dashboard,"test case pass");
		ele4.click();
	}
	public void Click_On_Controls() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","controls");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Click_On_Controls,"test case pass");
		ele4.click();
	}
	public void Click_On_LocationTracking() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","location");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Click_On_LocationTracking,"test case pass");
		ele4.click();
	}
	public void Heading_LocationTracking() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","heding");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Heading_LocationTracking,"test case pass");
		ele4.click();
	}
	public void Click_On_Disable() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","disable");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Click_On_Disable,"test case pass");
		ele4.click();
	}
	public void Click_On_Enable() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","enable");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Click_On_Enable,"test case pass");
		ele4.click();
	}
	public void Time_Slot_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","timeslottext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Time_Slot_Text,"test case pass");
	}
	public void Add_Time_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","addtimetext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Add_Time_Text,"test case pass");
	}
	public void Enter_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","enterbtn");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Enter_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Validate_Toast_Msg,"test case pass");
	}
	public void Enter_Time(String time) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","min");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Enter_Time,"test case pass");
		ele4.sendKeys(time);
	}
	public void Slot_Min() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","text");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Slot_Min,"test case pass");
	}
	public void Validate_Toast_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Validate_Toast_Msg1,"test case pass");
	}
	public void Validate_Toast_Msg2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Validate_Toast_Msg2,"test case pass");
	}
	public void Remove_Time1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","removetimeslot");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Remove_Time1,"test case pass");
		ele4.click();
	}
	public void Remove_Time2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","removetimeslot");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Remove_Time2,"test case pass");
		ele4.click();
	}
	public void Remove_Time3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","removetimeslot");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Remove_Time3,"test case pass");
		ele4.click();
	}
	public void Validate_TimeSlots() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","listwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Validate_TimeSlots,"test case pass");
	}
	public void Save_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","savebtn");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Save_Button,"test case pass");
		ele4.click();
	}
	public void Click_On_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Click_On_User,"test case pass");
		ele4.click();
	}
	public void Click_On_Location_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","locationicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Click_On_Location_Icon,"test case pass");
		ele4.click();
	}
	public void Validate_Location_Timeslots() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("locationtrackingdetails","user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_LocationTrackingControls.Validate_Location_Timeslots,"test case pass");
	}
}
