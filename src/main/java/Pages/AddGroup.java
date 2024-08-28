package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utiles.PropertyReader;
import Validation.Validation_AddGroup;

public class AddGroup {
	private WebDriver driver;
	Actions action;
	public AddGroup(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("Addgroupdetails","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	private void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("Addgroupdetails","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	private void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("Addgroupdetails","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Click_On_Add_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
	}
	public void Enter_GroupName(String groupname) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","GroupName");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(groupname);
	}
	public void Enter_Description(String description) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","Description");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(description);
	}
	public void Group_Profile() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","GroupProfile");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
	}
	public void Description_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","Descriptioncount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Description_Count,"test case pass");
	}
	public void Add_User1() throws Exception
	{
		action=new Actions(driver);
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","AddUser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		ele4.isDisplayed();
		Thread.sleep(3000);
		String text =ele4.getText();
		System.out.println(text);
		//Browsers.Wait_Method(ele4);
		Thread.sleep(2000);
	    ele4.click();
	}
	public void Validate_Add_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","AddUser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Validate_AddUser1,"test case pass");
	}
	public void Add_User2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","AddUser2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		ele4.isDisplayed();
		Thread.sleep(3000);
		String text =ele4.getText();
		System.out.println(text);
		//Browsers.Wait_Method(ele4);
		Thread.sleep(2000);
		ele4.click();
	}
	public void Validate_Add_User2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","AddUser2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Validate_AddUser2,"test case pass");
	}
	public void Selected_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","Selectedcount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Selected_Count,"test case pass");
	}
	public void Make_Admin() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","MakeAdmin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String text =ele4.getText();
		System.out.println(text);
		//Browsers.Wait_Method(ele4);
		Thread.sleep(2000);
		ele4.click();
	}
	public void Validate_Make_Admin() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","MakeAdmin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Make_Admin,"test case pass");
	}
	public void Make_Moderator() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","MakeModerator");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String text =ele4.getText();
		System.out.println(text);
		//Browsers.Wait_Method(ele4);
		Thread.sleep(2000);
		ele4.click();
	}
	public void Validate_Make_Moderator() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","MakeModerator");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Make_Moderator,"test case pass");
	}
	public void Search_User(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","searchuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String text =ele4.getText();
		System.out.println(text);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(search);
	}
	public void Validate_valid_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","searchuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.isDisplayed();
		Thread.sleep(3000);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Search_User,"test case pass");
	}	
	public void Invalid_Search_User(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","invalidsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String text =ele4.getText();
		System.out.println(text);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(search);
	}
	public void Validate_Invalid_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","Validateinvalidsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.isDisplayed();
		Thread.sleep(3000);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Invalid_Search_User,"test case pass");
	}
	public void Close_Search_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","closesearchuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String text =ele4.getAttribute("id");
		ele4.getAttribute("id");
		System.out.println(text);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		Assert.assertEquals(text, Validation_AddGroup.Close_Search_User,"test case pass");
	}
	public void Remove_User() throws Exception
	{
		action=new Actions(driver);
		String Loginbtnll=PropertyReader.Get_Locator("Addgroupdetails","MakeAdmin");
		By loginbtnlll=By.xpath(Loginbtnll);
		WebElement ele4=driver.findElement(loginbtnlll);
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","Removeuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele=driver.findElement(loginbtnl);
		String text =ele4.getText();
		ele4.getAttribute("id");
		System.out.println(text);
		//Browsers.Wait_Method(ele4);
		action.moveToElement(ele4).click(ele);
	}
	public void Validate_Remove_user() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","Removeuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Remove_User,"test case pass");
	}
	public void Selected_Count1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","Selectedcount1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Selected_Count1,"test case pass");
	}
	public void Close_AddGroup() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","Closegroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
	}
	public void Validate_Close_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Close_AddGroup,"test case pass");
	}
	public void Click_On_Create_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","groupcreate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
	}
	public void Create_Airtime_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Addgroupdetails","AirtimeGroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
	}
	public void Airtime_Group_i_Symbol() throws Exception {
		String errormsg=PropertyReader.Get_Locator("Addgroupdetails","isymbol");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getAttribute("title");
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.i_symbol,"test case pass");
	}
	public void isdisplayErrormsg() throws Exception {
		String errormsg=PropertyReader.Get_Locator("Addgroupdetails","ErrorMsg");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Valid_Login,"test case pass");
	}
	public void isdisplayErrormsg1() throws Exception {
		String errormsg=PropertyReader.Get_Locator("Addgroupdetails","newtext");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Click_Add,"test case pass");
	}
	public void isdisplayErrormsg2() throws Exception {
		String errormsg=PropertyReader.Get_Locator("Addgroupdetails","ErrorMsg2");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Click_Create,"test case pass");
	}
	public void isdisplayErrormsg3() throws Exception {
		String errormsg=PropertyReader.Get_Locator("Addgroupdetails","ErrorMsg2");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Enter_Only_GroupName,"test case pass");
	}
	public void isdisplayErrormsg4() throws Exception {
		String errormsg=PropertyReader.Get_Locator("Addgroupdetails","ErrorMsg2");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Enter_GroupName_1charater,"test case pass");
	}
	public void isdisplayErrormsg5() throws Exception {
		String errormsg=PropertyReader.Get_Locator("Addgroupdetails","ErrorMsg2");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Enter_Only_Description,"test case pass");
	}
	public void isdisplayErrormsg6() throws Exception {
		String errormsg=PropertyReader.Get_Locator("Addgroupdetails","ErrorMsg2");
		By errormsgl=By.xpath(errormsg);
		WebElement errormsgL=driver.findElement(errormsgl);
		//Browsers.Wait_Method(ele4);
		errormsgL.isDisplayed();
		String actualText=errormsgL.getText();
	    System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_AddGroup.Enter_GroupName_Description,"test case pass");
	}
	public void TRoop_Login(String email, String password) throws Exception {
		this.Set_Email(email);
		this.Set_Password(password);
	}
	public void Enter_GroupName1(String groupname,String description,String search) throws Exception {
		this.Enter_GroupName(groupname);
		this.Enter_Description(description);
		this.Search_User(search);
	}
}
