package Pages;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utiles.PropertyReader;
import Validation.Validation_MentionControls;

public class ControlMentionpage {
	private WebDriver driver;
	Robot rb;
	public ControlMentionpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("Controlmentionsdetails","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	public void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("Controlmentionsdetails","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	public void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("Controlmentionsdetails","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Valid_Login,"test case pass");
	}
	public void Click_On_Dashboard() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","dashboard");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-app");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Click_On_Dashboard,"test case pass");
		ele4.click();
	}
	public void Click_On_Controls() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","controls");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Click_On_Controls,"test case pass");
		ele4.click();
	}
	public void Click_On_Mention() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","mentions");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Click_On_Mention,"test case pass");
		ele4.click();
	}
	public void Validate_Mention_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","mentiontext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Validate_Mention_Text,"test case pass");
	}
	public void Validate_Mention() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","mentionwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Validate_Mention,"test case pass");
	}
	public void Validate_Mention1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","mentionwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Validate_Mention1,"test case pass");
	}
	public void Disable_The_Mention() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","disable");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Disable_The_Mention,"test case pass");
		ele4.click();
	}
	public void Enable_The_Mention() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","enable");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Enable_The_Mention,"test case pass");
		ele4.click();
	}
	public void Other_Mention_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","othermention");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Other_Mention_Text,"test case pass");
	}
	public void Label1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","label1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Label1,"test case pass");
		ele4.click();
	}
	public void Label2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","label2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Label2,"test case pass");
		ele4.click();
	}
	public void Label3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","label3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Label3,"test case pass");
		ele4.click();
	}
	public void Label4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","label4");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Label4,"test case pass");
		ele4.click();
	}
	public void Save_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","save");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Save_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Validate_Toast_Msg,"test case pass");
	}
	public void Click_On_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Click_On_User,"test case pass");
		ele4.click();
	}
	public void Click_On_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","user1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Click_On_User1,"test case pass");
		ele4.click();
	}
	public void Click_On_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","group");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Click_On_Group,"test case pass");
		ele4.click();
	}
	public void Click_On_Group1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","group1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Click_On_Group1,"test case pass");
		ele4.click();
	}
	public void Enter_Mention(String mention) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","entermention");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Enter_Mention,"test case pass");
		ele4.sendKeys(mention);
	}
	public void Mention_Hidden() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","mentionhidden");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Mention_Hidden,"test case pass");
	}
	public void Mention_Not_Hidden() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlmentionsdetails","mentionnothidden");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_MentionControls.Mention_Not_Hidden,"test case pass");
	}
}
