package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utiles.PropertyReader;
import Validation.Validation_CattleCall;

public class Cattlecallpage {
private WebDriver driver;
	
	public Cattlecallpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("cattlecalldetails","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	public void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("cattlecalldetails","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	public void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("cattlecalldetails","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Valid_Login,"test case pass");
	}
	public void Click_On_Cattle_Call() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","cattlecalltab");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-app");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Click_On_Cattle_Call,"test case pass");
		ele4.click();
	}
	public void Home_Tab() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","hometab");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Home_Tab,"test case pass");
	}
	public void Click_On_Now_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","nowbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Click_On_Now_Button,"test case pass");
		ele4.click();
	}
	public void Wrapper() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","wrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Wrapper,"test case pass");
	}
	public void Validate_Now() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","validatenow");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_Now,"test case pass");
	}
	public void Selected_Members() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","selectedmembers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Selected_Members,"test case pass");
	}
	public void Selected_Members1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","selectedmembers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Selected_Members1,"test case pass");
	}
	public void Select_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","selectuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-search");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Select_User,"test case pass");
		ele4.click();
	}
	public void Click_On_External_Tab() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","externaltab");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Click_On_External_Tab,"test case pass");
		ele4.click();
	}
	public void Validate_External_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","externaltext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_External_Text,"test case pass");
	}
	public void Enter_Email(String email) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","enteremail");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Enter_Email,"test case pass");
		ele4.sendKeys(email);
	}
	public void Search_User(String user) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","search");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Search_User,"test case pass");
		ele4.sendKeys(user);
	}
	public void Enter_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","enterbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Enter_Button,"test case pass");
		ele4.click();
	}
	public void External_History() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","externalhistory");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.External_History,"test case pass");
	}
	public void Selected_External_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","selectedexternal");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Selected_External_User,"test case pass");
	}
	public void Click_On_Invite() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","invite");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Click_On_Invite,"test case pass");
		ele4.click();
	}
	public void Click_On_Cancel() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","cancel");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Click_On_Cancel,"test case pass");
		ele4.click();
	}
	public void Click_On_Later_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","laterbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Click_On_Later_Button,"test case pass");
		ele4.click();
	}
	public void Wrapper1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","wrapper1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Wrapper1,"test case pass");
	}
	public void Wrapper2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","wrapper1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Wrapper2,"test case pass");
	}
	public void Wrapper4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","wrapper1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Wrapper4,"test case pass");
	}
	public void Click_On_Start_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","startbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Click_On_Start_Button,"test case pass");
		ele4.click();
	}
	public void Today_Meeting() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","todaymeeting");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Today_Meeting,"test case pass");
	}
	public void Today_Meeting1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","todaymeeting1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Today_Meeting1,"test case pass");
	}
	public void Today_Meeting2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","todaymeeting");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Today_Meeting2,"test case pass");
	}
	public void Today_Meeting3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","todaymeeting");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Today_Meeting3,"test case pass");
	}
	public void Edit_Meeting() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","editbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Edit_Meeting,"test case pass");
		ele4.click();
	}
	public void Schedule_Meeting() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","schedulebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Schedule_Meeting,"test case pass");
		ele4.click();
	}
	public void Cancel_Meeting() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","cancelbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Cancel_Meeting,"test case pass");
		ele4.click();
	}
	public void Back_Meeting() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","backbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Back_Meeting,"test case pass");
		ele4.click();
	}
	public void Delete_Meeting() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","deletebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Delete_Meeting,"test case pass");
		ele4.click();
	}
	public void Delete_Confirmation() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","deleteconfirmation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Delete_Confirmation,"test case pass");
	}
	public void Delete_Yes_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","yes");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Delete_Yes_Button,"test case pass");
		ele4.click();
	}
	public void Delete_No_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","no");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Delete_No_Button,"test case pass");
		ele4.click();
	}
	public void Delete_Close_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Delete_Close_Button,"test case pass");
		ele4.click();
	}
	public void Join_Meeting() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","joinmeeting");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Join_Meeting,"test case pass");
	}
	public void Submit() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","submit");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Submit,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","toastmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-original-title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_Toast_Msg3,"test case pass");
	}
	public void Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","date");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Date,"test case pass");
		ele4.click();
	}
	public void Select_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","selectdate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Select_Date,"test case pass");
		ele4.click();
	}
	public void Title_Name() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","title");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Title_Name,"test case pass");
	}
	public void Enter_Title_Name(String name) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","titlename");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Enter_Title_Name,"test case pass");
		ele4.sendKeys(name);
	}
	public void From_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","fromdate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.From_Text,"test case pass");
	}
	public void From_Time() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","fromtime");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.From_Time,"test case pass");
		ele4.click();
	}
	public void Select_From_Time_Hours() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","meetingfromtime");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Select_From_Time_Hours,"test case pass");
		ele4.click();
	}
	public void Select_From_Time_In_Minute() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","selectfromtime");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Select_From_Time_In_Minute,"test case pass");
		ele4.click();
	}
	public void To_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","todate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.To_Text,"test case pass");
	}
	public void To_Time() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","totime");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.To_Time,"test case pass");
		ele4.click();
	}
	public void Select_To_Time_Hours() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","meetingtotime");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Select_To_Time_Hours,"test case pass");
		ele4.click();
	}
	public void Select_To_Time_In_Minute() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","selecttotime");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Select_To_Time_In_Minute,"test case pass");
		ele4.click();
	}
	public void Add_Members_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","addmembers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Add_Members_Text,"test case pass");
		ele4.click();
	}
	public void Click_On_Add_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","addbutton1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Click_On_Add_Button,"test case pass");
		ele4.click();
	}
	public void Click_On_Add_Button1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","addbutton2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Click_On_Add_Button1,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","toastmsg2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-original-title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_Toast_Msg5,"test case pass");
	}
	public void Validate_Toast_Msg6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","toastmsg3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-original-title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_Toast_Msg6,"test case pass");
	}
	public void Validate_Toast_Msg7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_Toast_Msg7,"test case pass");
	}
	public void Validate_Toast_Msg8() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_Toast_Msg8,"test case pass");
	}
	public void Upcoming_Meeting() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","upcomingmeeting");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Upcoming_Meeting,"test case pass");
	}
	public void Upcoming_Meeting1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","upcomingmeeting");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Upcoming_Meeting1,"test case pass");
	}
	public void Dots() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","3dots");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Dots,"test case pass");
		ele4.click();
	}
	public void Wrapper3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","wrapper3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Wrapper3,"test case pass");
	}
	public void Schedule_Later() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","schedulelater");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Schedule_Later,"test case pass");
		ele4.click();
	}
	public void Cancel_Meeting1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","cancelmeeting1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Cancel_Meeting1,"test case pass");
		ele4.click();
	}
	public void Conference() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","conference");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Conference,"test case pass");
	}
	public void Enter_Meeting_ID(String id) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","meetingid");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Enter_Meeting_ID,"test case pass");
		ele4.sendKeys(id);
	}
	public void Validate_Toast_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_Toast_Msg,"test case pass");
	}
	public void Validate_Toast_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_Toast_Msg1,"test case pass");
	}
	public void Validate_Toast_Msg2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_Toast_Msg2,"test case pass");
	}
	public void Validate_Toast_Msg4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Validate_Toast_Msg4,"test case pass");
	}
	public void User_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","usercount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.User_Count,"test case pass");
	}
	public void User_Count1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","usercount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.User_Count1,"test case pass");
	}
	public void User_Count2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","usercount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.User_Count2,"test case pass");
	}
	public void Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","button");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Button,"test case pass");
	}
	public void Click_On_Meeting_Tab() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","meetingtab");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Click_On_Meeting_Tab,"test case pass");
		ele4.click();
	}
	public void Upcoming2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","upcoming2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Upcoming2,"test case pass");
	}
	public void Upcoming3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","upcoming3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Upcoming3,"test case pass");
	}
	public void Archives() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("cattlecalldetails","archive");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_CattleCall.Archives,"test case pass");
		ele4.click();
	}
}
