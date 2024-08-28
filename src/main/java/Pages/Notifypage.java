package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Utiles.PropertyReader;
import Validation.Validation_Notify;

public class Notifypage {
	private WebDriver driver;
	
	public Notifypage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("notifydetails","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	public void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("notifydetails","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	public void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("notifydetails","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Valid_Login,"test case pass");
	}
	public void Click_On_Utilities() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","notifytab");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-app");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Click_On_Utilities,"test case pass");
		ele4.click();
	}
	public void Notify_Active() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","notifytab1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Notify_Active,"test case pass");
	}
	public void Enter_Notify_Search(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","notifysearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Enter_Notify_Search,"test case pass");
		ele4.sendKeys(search);
	}
	public void Valid_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","validmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Valid_Search,"test case pass");
	}
	public void Invalid_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","emptynotify");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Invalid_Search,"test case pass");
	}
	public void Notify_AllUsers() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","notifyalluser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Notify_AllUsers,"test case pass");
		ele4.click();
	}
	public void Notify_Priority() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","priority");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Notify_Priority,"test case pass");
		ele4.click();
	}
	public void Notify_Regular() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","regular");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Notify_Regular,"test case pass");
		ele4.click();
	}
	public void Notify_TimeSensitive() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","timesensentative");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Notify_TimeSensitive,"test case pass");
		ele4.click();
	}
	public void Notify_Urgent() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","urgent");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Notify_Urgent,"test case pass");
		ele4.click();
	}
	public void Notify_SOS() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","sos");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Notify_SOS,"test case pass");
		ele4.click();
	}
	public void Create_New() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","createnew");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Create_New,"test case pass");
		ele4.click();
	}
	public void Create_New_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","name");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Create_New_Text,"test case pass");
	}
	public void Enter_Notify_Msg(String msg) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","entermsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Enter_Notify_Msg,"test case pass");
		ele4.sendKeys(msg);
	}
	public void Click_On_Send() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","sendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Click_On_Send,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Toast_Msg,"test case pass");
	}
	public void Validate_Toast_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Toast_Msg1,"test case pass");
	}
	public void Select_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","user1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Select_User,"test case pass");
		ele4.click();
	}
	public void Select_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","group");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Select_Group,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Toast_Msg2,"test case pass");
	}
	public void Search_User(String user) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","search");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Search_User,"test case pass");
		ele4.sendKeys(user);
	}
	public void Search_Invalid_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","noresult");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Search_Invalid_User,"test case pass");
	}
	public void Validate_User_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","usercount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_User_Count,"test case pass");
	}
	public void Switch_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","groupswitch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Switch_Group,"test case pass");
		ele4.click();
	}
	public void Validate_Group_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","usercount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Group_Count,"test case pass");
	}
	public void Validate_Selected_Users_Groups() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","selecteduser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Selected_Users_Groups,"test case pass");
	}
	public void Validate_Selected_Users_Groups_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","selectedusercount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Selected_Users_Groups_Count,"test case pass");
	}
	public void Validate_Selected_Users_Groups_Count1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","selectedusercount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Selected_Users_Groups_Count1,"test case pass");
	}
	public void Validate_Selected_Users_Groups_Count2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","selectedusercount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Selected_Users_Groups_Count2,"test case pass");
	}
	public void Validate_Selected_User_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","selectedcount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Selected_User_Count,"test case pass");
	}
	public void Validate_Selected_Group_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","selectedcount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Selected_Group_Count,"test case pass");
	}
	public void Validate_Selected_User_Group_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","selectedcount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Selected_User_Group_Count,"test case pass");
	}
	public void Selected_Search(String user) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","Selectedusersearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Selected_Search,"test case pass");
		ele4.sendKeys(user);
	}
	public void Select_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","user2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Select_User1,"test case pass");
	}
	public void Invalid_Selected_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","noresult");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Invalid_Selected_Search,"test case pass");
	}
	public void Select_Priority_In_Notify() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","selectedpriority");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Select_Priority_In_Notify,"test case pass");
		ele4.click();
	}
	public void Validate_Priority_In_Notify() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","prioritywrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Priority_In_Notify,"test case pass");
	}
	public void Send_Priority_With_Regular_In_Notify() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","priorityregular");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Send_Priority_With_Regular_In_Notify,"test case pass");
		ele4.click();
	}
	public void Send_Priority_With_Time_Sensitive_In_Notify() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","prioritytime");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Send_Priority_With_Time_Sensitive_In_Notify,"test case pass");
		ele4.click();
	}
	public void Send_Priority_With_Urgent_In_Notify() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","priorityurgent");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Send_Priority_With_Urgent_In_Notify,"test case pass");
		ele4.click();
	}
	public void Send_Priority_With_SOS_In_Notify() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","prioritysos");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Send_Priority_With_SOS_In_Notify,"test case pass");
		ele4.click();
	}
	public void Confirmation_Text_Of_SOS() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","confirmationtextsos");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Confirmation_Text_Of_SOS,"test case pass");
	}
	public void Yes_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","yes");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Yes_Button,"test case pass");
		ele4.click();
	}
	public void No_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","no");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.No_Button,"test case pass");
		ele4.click();
	}
	public void Message() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","message");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Message,"test case pass");
		String Loginbtn1=PropertyReader.Get_Locator("notifydetails","recall");
		By loginbtnl1=By.xpath(Loginbtn1);
		WebElement ele5=driver.findElement(loginbtnl1);
		//Browsers.Wait_Method(ele4);
		String actualText1=ele5.getAttribute("class");
		System.out.println(actualText1);
		Assert.assertEquals(actualText1,Validation_Notify.Recall,"test case pass");
		Actions ac=new Actions(driver);
		ac.moveToElement(ele4).click(ele5).perform();
	}
	public void Message1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","message1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Message,"test case pass");
		String Loginbtn1=PropertyReader.Get_Locator("notifydetails","recall");
		By loginbtnl1=By.xpath(Loginbtn1);
		WebElement ele5=driver.findElement(loginbtnl1);
		//Browsers.Wait_Method(ele4);
		String actualText1=ele5.getAttribute("class");
		System.out.println(actualText1);
		Assert.assertEquals(actualText1,Validation_Notify.Recall,"test case pass");
		Actions ac=new Actions(driver);
		ac.moveToElement(ele4).click(ele5).perform();
	}
	public void Validate_Toast_Msg3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("notifydetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Notify.Validate_Toast_Msg3,"test case pass");
	}
}
