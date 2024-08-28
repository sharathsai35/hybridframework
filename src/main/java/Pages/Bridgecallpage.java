package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utiles.PropertyReader;
import Validation.Validation_BridgeCall;

public class Bridgecallpage {
private WebDriver driver;
	
	public Bridgecallpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("Bridgecalldetails","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	public void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("Bridgecalldetails","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	public void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("Bridgecalldetails","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Valid_Login,"test case pass");
	}
	public void Click_On_Utilities() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","utilitestab");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-app");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Click_On_Utilities,"test case pass");
		ele4.click();
	}
	public void Click_On_Bridge_Call_Tab() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","bridgecalltab");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Click_On_Bridge_Call_Tab,"test case pass");
		ele4.click();
	}
	public void Validate_Bridge_Call_Tab() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","bridgecallpage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Validate_Bridge_Call_Tab,"test case pass");
	}
	public void Click_On_Create_New() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","createnew");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Click_On_Create_New,"test case pass");
		ele4.click();
	}
	public void Validate_Create_New() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","createpage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Validate_Create_New,"test case pass");
	}
	public void Enter_Title() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","title");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Enter_Title,"test case pass");
	}
	public void Enter_Title(String title) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","title1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		ele4.sendKeys(title);
	}
	public void Click_On_Invite() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","invite");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Click_On_Invite,"test case pass");
		ele4.click();
	}
	public void Select_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-search");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Select_User,"test case pass");
		ele4.click();
	}
	public void Select_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","user1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-search");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Select_User1,"test case pass");
	}
	public void Validate_Toast_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Validate_Toast_Msg,"test case pass");
	}
	public void Validate_Toast_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Validate_Toast_Msg1,"test case pass");
	}
	public void Validate_Toast_Msg2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Validate_Toast_Msg2,"test case pass");
	}
	public void Members() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","memberstext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Members,"test case pass");
	}
	public void Members_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","memberscount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Members_Count,"test case pass");
	}
	public void Search_Members(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","searchmembers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Search_Members,"test case pass");
		ele4.sendKeys(search);
	}
	public void Selected_Members() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","selectedmemberstext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Selected_Members,"test case pass");
	}
	public void Selected_Members_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","selectedmemberscount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Selected_Members_Count,"test case pass");
	}
	public void Search_Selected_Members(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","selectedmembersearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Search_Selected_Members,"test case pass");
		ele4.sendKeys(search);
	}
	public void No_Result() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","noresult");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.No_Result,"test case pass");
		ele4.click();
	}
	public void Enable_Waiting_Room() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","waitingroom");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Enable_Waiting_Room,"test case pass");
		ele4.click();
	}
	public void Allow_Others_To_Invite() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","othertoinvite");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Allow_Others_To_Invite,"test case pass");
		ele4.click();
	}
	public void Selected_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","selecteduser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Selected_User,"test case pass");
	}
	public void Bridge_Call_List() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Bridgecalldetails","list");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_BridgeCall.Bridge_Call_List,"test case pass");
	}
}
