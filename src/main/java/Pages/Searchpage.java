package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Utiles.PropertyReader;
import Validation.Validation_Search;

public class Searchpage {
	private WebDriver driver;
	Actions action;
	public Searchpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("Searchmsgs","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	public void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("Searchmsgs","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	public void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("Searchmsgs","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Valid_Login,"test case pass");
	}
	public void Click_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.User,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Validate_User,"test case pass");
	}
	public void Click_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","user1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.User_1,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Validate_User1,"test case pass");
	}
	public void Click_On_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","search");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Search,"test case pass");
		ele4.click();
	}
	public void Search_Active() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","searchactive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Search_Active,"test case pass");
	}
	public void Conversation_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search,"test case pass");
	}
	public void Enter_Search(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","entersearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Enter_Search,"test case pass");
		ele4.sendKeys(search);
	}
	public void Conversation_Search_1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_1,"test case pass");
	}
	public void Conversation_Search_12() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_12,"test case pass");
	}
	public void Click_On_All_Users() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectallusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_All_Users,"test case pass");
		ele4.click();
	}
	public void All_Users_Wrapper() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","wrapperallusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.All_Users_Wrapper,"test case pass");
	}
	public void All_Users_Wrapper1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","wrapperallusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.All_Users_Wrapper1,"test case pass");
	}
	public void All_Users_Wrapper2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","wrapperallusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.All_Users_Wrapper2,"test case pass");
	}
	public void Click_On_Search_In_All_Users(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","searchusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Search_In_All_Users,"test case pass");
		ele4.sendKeys(search);
	}
	public void Select_The_User_1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectuser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_The_User_1,"test case pass");
		ele4.click();
	}
	public void Selected_User_1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selecteduser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Selected_User_1,"test case pass");
	}
	public void Conversation_Search_2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_2,"test case pass");
	}
	public void Select_The_User_2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectuser2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_The_User_2,"test case pass");
		ele4.click();
	}
	public void Selected_User_2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selecteduser2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Selected_User_2,"test case pass");
	}
	public void Conversation_Search_3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_3,"test case pass");
	}
	public void Click_All_Dates() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectalldates");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_All_Dates,"test case pass");
		ele4.click();
	}
	public void All_Dates_Wrapper() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","wrapperalldates");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.All_Dates_Wrapper,"test case pass");
	}
	public void Select_Today() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selecttoday");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_Today,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_4,"test case pass");
	}
	public void Select_Yesterday() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectyesterday");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_Yesterday,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_5,"test case pass");
	}
	public void Select_Last_7_Days() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","select7days");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_Last_7_Days,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_6,"test case pass");
	}
	public void Select_Last_30_Days() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","select30days");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_Last_30_Days,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_7,"test case pass");
	}
	public void Select_This_Month() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectmonth");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_This_Month,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_8() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_8,"test case pass");
	}
	public void Select_This_Year() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectyear");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_This_Year,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_9() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_9,"test case pass");
	}
	public void Select_Last_Year() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectlastyear");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_Last_Year,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_10() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_10,"test case pass");
	}
	public void Select_All_Dates() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectalldates1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_All_Dates,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_11() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_11,"test case pass");
	}
	public void Select_Date_Range() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectdaterange1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_Date_Range,"test case pass");
		ele4.click();
	}
	public void Select_From_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectfromdate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_From_Date,"test case pass");
		ele4.click();
	}
	public void Select_The_Date_In_From_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectanydateinformdate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_The_Date_In_From_Date,"test case pass");
		ele4.click();
	}
	public void Select_To_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selecttodate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_To_Date,"test case pass");
		ele4.click();
	}
	public void Select_The_Date_In_To_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectanydateintodate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_The_Date_In_To_Date,"test case pass");
		ele4.click();
	}
	public void Select_The_Date_In_To_Date1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectanydateintodate1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Select_The_Date_In_To_Date1,"test case pass");
		ele4.click();
	}
	public void Click_On_Apply() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","daterangeapply");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Apply,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Validate_Toast_Msg,"test case pass");
	}
	public void Validate_Toast_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Validate_Toast_Msg1,"test case pass");
	}
	public void Validate_Toast_Msg2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Validate_Toast_Msg2,"test case pass");
	}
	public void Conversation_Search_13() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_13,"test case pass");
	}
	public void Click_On_Reset_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","refreshicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Reset_Button,"test case pass");
		ele4.click();
	}
	public void Click_On_Close_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","closeicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Close_Button,"test case pass");
		ele4.click();
	}
	public void Switch_Exact() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","exact");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Switch_Exact,"test case pass");
		ele4.click();
	}
	public void Valid_Close_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","hiddensearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Valid_Close_Search,"test case pass");
	}
	public void Click_On_Text_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selecttexticon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Text_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_14() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_14,"test case pass");
	}
	public void Conversation_Search_25() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_25,"test case pass");
	}
	public void Click_On_Image_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectimageicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Image_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_15() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_15,"test case pass");
	}
	public void Conversation_Search_26() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_26,"test case pass");
	}
	public void Click_On_Video_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectvideoicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Video_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_16() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_16,"test case pass");
	}
	public void Conversation_Search_27() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_27,"test case pass");
	}
	public void Click_On_Doc_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectdocicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Doc_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_17() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_17,"test case pass");
	}
	public void Conversation_Search_28() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_28,"test case pass");
	}
	public void Click_On_Link_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectlinkicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Link_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_18() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_18,"test case pass");
	}
	public void Conversation_Search_29() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_29,"test case pass");
	}
	public void Click_On_Contact_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectcontacticon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Contact_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_19() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_19,"test case pass");
	}
	public void Conversation_Search_30() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_30,"test case pass");
	}
	public void Click_On_Location_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectlocicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Location_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_20() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_20,"test case pass");
	}
	public void Conversation_Search_31() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_31,"test case pass");
	}
	public void Click_On_Read_Receipt_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectreadreceipticon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Read_Receipt_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_21() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_21,"test case pass");
	}
	public void Conversation_Search_32() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_32,"test case pass");
	}
	public void Click_On_Flag_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectflagicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Flag_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_22() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_22,"test case pass");
	}
	public void Conversation_Search_33() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_33,"test case pass");
	}
	public void Click_On_Respond_later_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectrespondlatericon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Respond_later_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_23() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_23,"test case pass");
	}
	public void Conversation_Search_34() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_34,"test case pass");
	}
	public void Click_On_Code_Snippet_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","selectcodeicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Click_On_Code_Snippet_Filter,"test case pass");
		ele4.click();
	}
	public void Conversation_Search_24() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_24,"test case pass");
	}
	public void Conversation_Search_35() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_35,"test case pass");
	}
	public void Conversation_Search_36() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_36,"test case pass");
	}
	public void Conversation_Search_37() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_37,"test case pass");
	}
	public void Conversation_Search_38() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_38,"test case pass");
	}
	public void Conversation_Search_39() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_39,"test case pass");
	}
	public void Conversation_Search_40() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_40,"test case pass");
	}
	public void Conversation_Search_41() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_41,"test case pass");
	}
	public void Conversation_Search_42() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_42,"test case pass");
	}
	public void Conversation_Search_43() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_43,"test case pass");
	}
	public void Conversation_Search_44() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_44,"test case pass");
	}
	public void Conversation_Search_45() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_45,"test case pass");
	}
	public void Conversation_Search_46() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_46,"test case pass");
	}
	public void Conversation_Search_47() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_47,"test case pass");
	}
	public void Conversation_Search_48() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_48,"test case pass");
	}
	public void Conversation_Search_49() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_49,"test case pass");
	}
	public void Conversation_Search_50() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_50,"test case pass");
	}
	public void Conversation_Search_51() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_51,"test case pass");
	}
	public void Conversation_Search_52() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_52,"test case pass");
	}
	public void Conversation_Search_53() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_53,"test case pass");
	}
	public void Conversation_Search_54() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","conversationmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_54,"test case pass");
	}
	public void Conversation_Search_55() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_55,"test case pass");
	}
	public void Conversation_Search_56() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_56,"test case pass");
	}
	public void Conversation_Search_57() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_57,"test case pass");
	}
	public void Conversation_Search_58() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_58,"test case pass");
	}
	public void Conversation_Search_59() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_59,"test case pass");
	}
	public void Conversation_Search_60() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_60,"test case pass");
	}
	public void Conversation_Search_61() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_61,"test case pass");
	}
	public void Conversation_Search_62() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_62,"test case pass");
	}
	public void Conversation_Search_63() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Searchmsgs","highlightedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Search.Conversation_Search_63,"test case pass");
	}
	public void TRoop_Login(String email, String password) throws Exception {
		this.Set_Email(email);
		this.Set_Password(password);
	}
}
