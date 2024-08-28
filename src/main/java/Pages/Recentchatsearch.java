package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Utiles.PropertyReader;
import Validation.Validation_Recentchatsearch;
import Validation.Validation_Rightclick;
import Validation.Validation_Search;

public class Recentchatsearch {
	private WebDriver driver;
	Actions action;
	public Recentchatsearch(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("recentchatsearch","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	public void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("recentchatsearch","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	public void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("recentchatsearch","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Valid_Login,"test case pass");
	}
	public void Click_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.User,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_User,"test case pass");
	}
	public void Click_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","user1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.User_1,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_User1,"test case pass");
	}
	public void No_Data() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","nodata");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.No_Data,"test case pass");
	}
	public void Click_OrangeUser() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","orangeuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Orange_User,"test case pass");
		ele4.click();
	}
	public void Click_DeActivatedUser1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","deactivateduser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_DeActivatedUser1,"test case pass");
		ele4.click();
	}
	public void DeActivated_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","deactivatedtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.DeActivated_Text,"test case pass");
	}
	public void Click_Deleted_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","deletedgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_Deleted_Group,"test case pass");
		ele4.click();
	}
	public void Deleted_Group_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","deletedgrouptext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Deleted_Group_Text,"test case pass");
	}
	public void Click_Exited_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","exitedgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_Exited_Group,"test case pass");
		ele4.click();
	}
	public void Exited_Group_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","exitedgrouptext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Exited_Group_Text,"test case pass");
	}
	public void Click_On_Unread_Msg_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","unreadmsgicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Unread_Msg_Icon,"test case pass");
		ele4.click();
	}
	public void Clicked_Unread_Msg_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","unreadmsgicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Clicked_Unread_Msg_Icon,"test case pass");
	}
	public void Clicked_Unread_Msg_Icon1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","unreadmsgicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Clicked_Unread_Msg_Icon1,"test case pass");
	}
	public void Validate_Unread_Msg_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","unreadmsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Unread_Msg_Icon,"test case pass");
	}
	public void Empty_Unread_Msgs() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","nounreadmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Empty_Unread_Msgs,"test case pass");
	}
	public void Unread_Msgs_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","unreaduser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Unread_Msgs_User,"test case pass");
	}
	public void Unread_Msgs_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","unreadgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Unread_Msgs_Group,"test case pass");
	}
	public void Unread_Msgs_Group1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","unreadgroup1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Unread_Msgs_Group1,"test case pass");
		ele4.click();
	}
	public void Unread_Msgs_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","unreaduser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Unread_Msgs_User1,"test case pass");
		ele4.click();
	}
	public void Unread_Msgs_Notification() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","unreadmsgnotifcation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Unread_Msgs_Notification,"test case pass");
	}
	public void Click_On_Respond_later_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","respondlatericon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Respond_later_Icon,"test case pass");
		ele4.click();
	}
	public void Clicked_Respond_later_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","respondlatericon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Clicked_Respond_later_Icon,"test case pass");
	}
	public void Validate_Respond_later_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","respondlaterwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Respond_later_Icon,"test case pass");
	}
	public void Respond_later_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","respondlateruser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Respond_later_User,"test case pass");
		ele4.click();
	}
	public void Respond_later_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","respondlateruser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Respond_later_User1,"test case pass");
		ele4.click();
	}
	public void Respond_later_User2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","respondlateruser2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Respond_later_User2,"test case pass");
		ele4.click();
	}
	public void Right_Click_On_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		action=new Actions(driver);
		action.contextClick(ele4).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Click_On_Respond_Later() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","respondlater");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Respond_Later,"test case pass");
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
	public void Search_Filter_Active() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","searchfilteractive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Search_Filter_Active,"test case pass");
	}
	public void Click_On_Favourite_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","favouriteicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Favourite_Icon,"test case pass");
		ele4.click();
	}
	public void Clicked_Favourite_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","favouriteicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Clicked_Favourite_Icon,"test case pass");
	}
	public void Validate_Favourite_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","favouriteswrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Favourite_Icon,"test case pass");
	}
	public void Favourite_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","unreadgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Unread_Msgs_Group,"test case pass");
		ele4.click();
	}
	public void Validate_Favourite_Icon1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","favouriteuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Favourite_Icon1,"test case pass");
	}
	public void Status_For_Favourite_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","statusofFavourite");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-isfavourite");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Status_For_Favourite_Icon,"test case pass");
	}
	public void Click_On_Recent_Chat_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","recentchatsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Recent_Chat_Search,"test case pass");
		ele4.click();
	}
	public void Click_On_Recent_Chat_Search(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","recentchatsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Recent_Chat_Search,"test case pass");
		ele4.sendKeys(search);
	}
	public void Click_On_Close_Button_For_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","clearsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Close_Button_For_Search,"test case pass");
		ele4.click();
	}
	public void Validate_Close_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","clearsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Close_Search,"test case pass");
	}
	public void Click_On_Filters_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","filters");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Filters_Icon,"test case pass");
		ele4.click();
	}
	public void Validate_Filters_Wrapper() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","wrapperfilter");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Filters_Wrapper,"test case pass");
	}
	public void Click_On_All_Members_And_Groups() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","allmembersandgroups");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_All_Members_And_Groups,"test case pass");
		ele4.click();
	}
	public void Validate_All_Members_And_Groups() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","listwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_All_Members_And_Groups,"test case pass");
	}
	public void Validate_Closed_Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","wrapperclose");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Closed_Filter,"test case pass");
	}
	public void Click_On_Members() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","members");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Members,"test case pass");
		ele4.click();
	}
	public void Validate_Members() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","listwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Members,"test case pass");
	}
	public void Click_On_Groups() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","groups");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Groups,"test case pass");
		ele4.click();
	}
	public void Validate_Groups() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","listwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Groups,"test case pass");
	}
	public void Click_On_Orange_Members() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","orangemember");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Orange_Members,"test case pass");
		ele4.click();
	}
	public void Validate_Orange_Members() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","listwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Orange_Members,"test case pass");
	}
	public void Click_On_DeActivated_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","deactivateduser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_DeActivated_User,"test case pass");
		ele4.click();
	}
	public void Validate_DeActivated_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","listwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_DeActivated_User,"test case pass");
	}
	public void Click_On_Deleted_Exited_Groups() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","deleted/exitedgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Deleted_Exited_Groups,"test case pass");
		ele4.click();
	}
	public void Validate_Deleted_Exited_Groups() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","listwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Deleted_Exited_Groups,"test case pass");
	}
	public void Click_On_Dates() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","filterdates");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Dates,"test case pass");
		ele4.click();
	}
	public void Validate_Dates_Wrapper() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","customdatewrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Dates_Wrapper,"test case pass");
	}
	public void Click_On_Custom_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","customdate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Custom_Date,"test case pass");
	}
	public void Click_On_Today() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","today");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Today,"test case pass");
		ele4.click();
	}
	public void Validate_Today() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","dateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Today,"test case pass");
		ele4.click();
	}
	public void Validate_Today1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","searchhighlight");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Today1,"test case pass");
	}
	public void Validate_Today_In_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","todayactive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Today_In_Search,"test case pass");
	}
	public void Click_On_Yesterday() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","yesterday");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Yesterday,"test case pass");
		ele4.click();
	}
	public void Validate_Yesterday() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","datauser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Yesterday,"test case pass");
		ele4.click();
	}
	public void Validate_Yesterday1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","searchhighlight");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Yesterday1,"test case pass");
	}
	public void Validate_Yesterday_In_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","yesterdayactive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Yesterday_In_Search,"test case pass");
	}
	public void Click_On_Last_7_Days() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","last7days");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Last_7_Days,"test case pass");
		ele4.click();
	}
	public void Validate_Last_7_Days() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","datauser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Last_7_Days,"test case pass");
		ele4.click();
	}
	public void Validate_Last_7_Days1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","searchhighlight");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Last_7_Days1,"test case pass");
	}
	public void Validate_Last_7_Days_In_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","last7dayactive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Last_7_Days_In_Search,"test case pass");
	}
	public void Click_On_Last_30_Days() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","last30days");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Last_30_Days,"test case pass");
		ele4.click();
	}
	public void Validate_Last_30_Days() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","datauser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Last_30_Days,"test case pass");
		ele4.click();
	}
	public void Validate_Last_30_Days1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","searchhighlight");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Last_30_Days1,"test case pass");
	}
	public void Validate_Last_30_Days_In_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","last30dayactive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Last_30_Days_In_Search,"test case pass");
	}
	public void Click_On_This_Month() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","thismonth");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_This_Month,"test case pass");
		ele4.click();
	}
	public void Validate_This_Month() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","datauser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_This_Month,"test case pass");
		ele4.click();
	}
	public void Validate_This_Month1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","searchhighlight");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_This_Month1,"test case pass");
	}
	public void Validate_This_Month_In_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","thismonthactive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_This_Month_In_Search,"test case pass");
	}
	public void Click_On_This_Year() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","thisyear");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_This_Year,"test case pass");
		ele4.click();
	}
	public void Validate_This_Year() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","datauser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_This_Year,"test case pass");
		ele4.click();
	}
	public void Validate_This_Year1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","searchhighlight");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_This_Year1,"test case pass");
	}
	public void Validate_This_Year_In_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","thisyearactive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_This_Year_In_Search,"test case pass");
	}
	public void Click_On_Last_Year() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","lastyear");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Last_Year,"test case pass");
		ele4.click();
	}
	public void Validate_Last_Year() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","datauser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Last_Year,"test case pass");
		ele4.click();
	}
	public void Validate_Last_Year1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","searchhighlight");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Last_Year1,"test case pass");
	}
	public void Validate_Last_Year_In_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","lastyearactive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Last_Year_In_Search,"test case pass");
	}
	public void Click_On_All_Dates() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","alldates");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_All_Dates,"test case pass");
		ele4.click();
	}
	public void Validate_All_Dates() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","datauser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_All_Dates,"test case pass");
		ele4.click();
	}
	public void Validate_All_Dates1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","searchhighlight");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_All_Dates1,"test case pass");
	}
	public void Validate_All_Dates_In_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","alldatesactive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_All_Dates_In_Search,"test case pass");
	}
	public void Validate_Date_Range() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","daterange");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Date_Range,"test case pass");
	}
	public void Click_On_Apply() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","applybutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Click_On_Apply,"test case pass");
		ele4.click();
	}
	public void Validate_Apply() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Apply,"test case pass");
		ele4.click();
	}
	public void Select_From_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","fromdate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Select_From_Date,"test case pass");
		ele4.click();
	}
	public void Validate_From_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","selectfromdate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_From_Date,"test case pass");
		ele4.click();
	}
	public void Validate_Apply1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Apply1,"test case pass");
	}
	public void Select_To_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","todate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Select_To_Date,"test case pass");
		ele4.click();
	}
	public void Validate_To_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","selecttodate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_To_Date,"test case pass");
		ele4.click();
	}
	public void Validate_To_Date1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","selecttodate1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_To_Date1,"test case pass");
		ele4.click();
	}
	public void Validate_Apply2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Apply2,"test case pass");
	}
	public void Validate_Selected_Date_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","datauser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Selected_Date_User,"test case pass");
		ele4.click();
	}
	public void Validate_Selected_User_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","searchhighlight");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Selected_User_Msg,"test case pass");
	}
	public void Validate_Date_Range_In_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("recentchatsearch","daterangeactive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Recentchatsearch.Validate_Date_Range_In_Search,"test case pass");
	}
}
