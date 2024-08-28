package Pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utiles.PropertyReader;
import Validation.Validation_EditGroup;

public class EditGroup {
	private WebDriver driver;
	Actions action;
	Alert alert;
	public EditGroup(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("Editgroupdetails","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	private void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("Editgroupdetails","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	private void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("Editgroupdetails","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","Addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Valid_Login,"test case pass");
	}
	public void Click_Group() throws Exception
	{
		String a=PropertyReader.Get_Locator("Editgroupdetails","groupname");
		By b=By.xpath(a);
		WebElement ele4=driver.findElement(b);
		//Browsers.Wait_Method(ele4);
		ele4.click();
	}
	public void Validate_GroupName() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","groupname");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.GroupName,"test case pass");
	}
	public void Click_Group_Profile() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","groupprofile");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
	}
	public void Validate_GroupProfile() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","groupprofile");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.GroupProfile,"test case pass");
	}
	public void Click_Group_Profile_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","groupinfo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.GroupInfo,"test case pass");
	}
	public void Validate_GroupInfo() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","Validategroupinfo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_GroupInfo,"test case pass");
	}
	public void Click_Group_Profile_Users() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","groupusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.GroupUsers,"test case pass");
	}
	public void Validate_GroupUserstab() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","Validategroupusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_GroupUsers,"test case pass");
	}
	public void Click_Group_Profile_logs() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","grouplogs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Grouplogs,"test case pass");
	}
	public void Validate_Grouplogs() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","Validategrouplogs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Grouplogs,"test case pass");
	}
	public void Click_Group_Profile_Pin() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","grouppin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Grouppin,"test case pass");
	}
	public void Validate_GroupPin() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validategrouppin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Grouppin,"test case pass");
	}
	public void Click_Group_Profile_Settings() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","groupsettings");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Groupsettings,"test case pass");
	}
	public void Validate_GroupSettings() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validategroupsettings");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Groupsettings,"test case pass");
	}
	public void Change_GroupName() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","groupname1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Change_GroupName,"test case pass");
	}
	public void Change_GroupName1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","groupname2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Change_GroupName1,"test case pass");
	}
	public void Click_Edit_GroupName() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","editgroupname");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Edit_GroupName,"test case pass");
		ele4.click();
	}
	public void Enter_Edit_GroupName(String editedgroup) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","entergroupname");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.clear();
		ele4.sendKeys(editedgroup);
	}
	public void Save_GroupName() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","savegroupname");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Save_GroupName,"test case pass");
		ele4.click();
	}
	public void Validate_Saved_GroupName() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Saved_GroupName,"test case pass");
	}
	public void Changed_Group_Logs() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","groupname2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Grouplogs1,"test case pass");
	}
	public void Validate_Grouplogs1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","Validategrouplogs1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Grouplogs1,"test case pass");
	}
	public void Cancel_GroupName() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","cancelgroupname");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Cancel_GroupName,"test case pass");
		ele4.click();
	}
	public void Validate_Changed_GroupName() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","changedgroupname");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Change_GroupName,"test case pass");
	}
	public void Validate_Changed_GroupName1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","changedgroupname1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Change_GroupName1,"test case pass");
	}
	public void Click_Close_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","closegroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Close_Group,"test case pass");
		ele4.click();
	}
	public void Search_Group_Users(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","searchusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Search_GroupUser,"test case pass");
		ele4.sendKeys(search);
	}
	public void Validate_searched_Group_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validatesearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-username");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Search,"test case pass");
	}
	public void Close_searched_Group_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","closesearchuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Close_Search,"test case pass");
		ele4.click();
	}
	public void Click_Add_Member() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","addmember");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Add_Member,"test case pass");
		ele4.click();
	}
	public void Validate_Edit_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","valideditgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Edit_Group,"test case pass");
	}
	public void Add_User_In_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","adduser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-username");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_GroupUser2,"test case pass");
		ele4.click();
	}
	public void Submit_EditGroup() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","submitbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_submit,"test case pass");
		ele4.click();
		 Thread.sleep(2000);;
		 alert = driver.switchTo().alert(); 
		 String a=alert.getText();
		 System.out.println(a);
			Assert.assertEquals(a,Validation_EditGroup.Alertmsg,"test case pass");
		 alert.accept();
		 
	}
	public void Validate_Group_Users() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","groupuserstab");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.GroupUsers,"test case pass");
	}
	public void Validate_Added_User_In_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","Validategroupusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_AddedUsers,"test case pass");
	}
	public void Edit_User_in_Group() throws Exception
	{
		String a=PropertyReader.Get_Locator("Editgroupdetails","movetouser");
		By b=By.xpath(a);
		WebElement e=driver.findElement(b);
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","3dots");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Valid_3dots,"test case pass");
		e.click();
		ele4.click();
	}
	public void Active_3Dots() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","active3dots");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Active_3dots,"test case pass");
	}
	public void Make_admin() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","make-admin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Make_Admin,"test case pass");
		ele4.click();
	}
	public void Validate_ToastMsg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Toastmsg,"test case pass");
		ele4.click();
	}
	public void Remove_Moderator() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","remove-moderator");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Remove_Moderator,"test case pass");
		ele4.click();
	}
	public void Active_3Dots1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","active3dots");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Active_3dots1,"test case pass");
	}
	public void Active_3Dots2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","active3dots");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Active_3dots2,"test case pass");
	}
	public void Remove_admin() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","remove-admin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Remove_Admin,"test case pass");
		ele4.click();
	}
	public void Make_Moderator() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","make-moderator");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Make_Moderator,"test case pass");
		ele4.click();
	}
	public void View_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","view-user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.View_Group_User,"test case pass");
		ele4.click();
	}
	public void Validate_View_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validateviewuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_View_User,"test case pass");
	}
	public void Message_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","message-user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Message_Group_User,"test case pass");
		ele4.click();
	}
	public void Validate_Message_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validatemessageuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Message_User,"test case pass");
	}
	public void Group_3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","group3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Group_3,"test case pass");
		ele4.click();
	}
	public void Group_10() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","group10");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Group_10,"test case pass");
		ele4.click();
	}
	public void Remove_from_group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","removefromgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Remove_from_Group,"test case pass");
		ele4.click();
	}
	public void Validate_remove_from_group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Remove_from_group,"test case pass");
	}
	public void Group_4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","group4");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Group_4,"test case pass");
		ele4.click();
	}
	public void Delete_Self_All_Msgs_Files() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","deleteallmsgsandfiles");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Delete_Self_AllMsgs_Files,"test case pass");
		ele4.click();
	}
	public void Delete_Self_Only_Msgs() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","deleteonlymsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Delete_Self_Only_Msgs,"test case pass");
		ele4.click();
	}
	public void Delete_Self_Only_Files() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","deleteonlyfiles");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Delete_Self_Only_Files,"test case pass");
		ele4.click();
	}
	public void Click_Submit() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","deletegroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Click_Submit,"test case pass");
		ele4.click();
	}
	public void Confirmation_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","confirmtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Confirmation_Text,"test case pass");
	}
	public void Confirmation_Text1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","confirmtext1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Confirmation_Text1,"test case pass");
	}
	public void Confirmation_Text2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","confirmtext2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Confirmation_Text2,"test case pass");
	}
	public void Click_No_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","nobutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Click_No_button,"test case pass");
		ele4.click();
	}
	public void Click_Yes_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","yesbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Click_Yes_Button,"test case pass");
		ele4.click();
	}
	public void Validate_toast_msg_Allmsgsfiles() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Allmsgs_files,"test case pass");
	}
	public void Validate_toast_msg_Allmsgs() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Allmsgs,"test case pass");
	}
	public void Validate_toast_msg_Allfiles() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Allfiles,"test case pass");
	}
	public void Group_5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","group5");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Group_5,"test case pass");
		ele4.click();
	}
	public void Everyone() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","everyone");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Everyone,"test case pass");
	}
	public void Delete_All_Msgs_Files() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","deleteeveryoneAllmsgsfiles");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Delete_AllMsgs_Files,"test case pass");
		ele4.click();
	}
	public void Delete_Only_Msgs() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","deleteeveryoneOnlymsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Delete_Only_Msgs,"test case pass");
		ele4.click();
	}
	public void Delete_Only_Files() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","deleteeveryoneOnlyFiles");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Delete_Only_Files,"test case pass");
		ele4.click();
	}
	public void Confirmation_Text_Everyone() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","confirmtexteveryone");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Confirmation_Text_Everyone,"test case pass");
	}
	public void Confirmation_Text1_Everyone() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","confirmtexteveryone1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Confirmation_Text1_Everyone,"test case pass");
	}
	public void Confirmation_Text2_Everyone() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","confirmtexteveryone2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Confirmation_Text2_Everyone,"test case pass");
	}
	public void Validate_Everyone_toast_msg_Allmsgsfiles() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Allmsgs_files_Everyone,"test case pass");
	}
	public void Validate_Everyone_toast_msg_Allmsgs() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_OnlyMsgs_Everyone,"test case pass");
	}
	public void Validate_Everyone_toast_msg_Allfiles() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_OnlyFiles_Everyone,"test case pass");
	}
	public void Conversation_Messages_Allmsgs_Files() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","conversationmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Allmsgs_Files_Delete,"test case pass");
	}
	public void Conversation_Messages_OnlyMsgs() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","conversationmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Onlymsgs_Delete,"test case pass");
	}
	public void Conversation_Messages_OnlyFiles() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","conversationmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_OnlyFiles_Delete,"test case pass");
	}
	public void Delete_Self() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","deleteself");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Delete_Self,"test case pass");
		ele4.click();
	}
	public void Conversation_Messages_Allmsgs_Files_Self() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","conversationmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Allmsgs_Files_DeleteSelf,"test case pass");
	}
	public void Conversation_Messages_OnlyMsgs_Self() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","conversationmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_Onlymsgs_DeleteSelf,"test case pass");
	}
	public void Conversation_Messages_OnlyFiles_Self() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","conversationmsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validate_OnlyFiles_DeleteSelf,"test case pass");
	}
	public void Group_6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","group6");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Group_6,"test case pass");
		ele4.click();
	}
	public void Group_7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","group7");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Group_7,"test case pass");
		ele4.click();
	}
	public void Delete_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","deleteeveryone");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Delete_Group,"test case pass");
		ele4.click();
	}
	public void Confirmation_Text_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","confirmtextdelete");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Confirmation_Text_Delete,"test case pass");
	}
	public void Validate_toast_msg_Delete_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Delete_Group_Toastmsg,"test case pass");
	}
	public void Group_8() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","group8");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Group_8,"test case pass");
		ele4.click();
	}
	public void Exit_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","exitgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Exit_Group,"test case pass");
		ele4.click();
	}
	public void Click_Submit_To_Exit_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","exit");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Click_Submit_Exit_Group,"test case pass");
		ele4.click();
	}
	public void Confirmation_Text_Exit_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","confirmtexttoexit");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Confirmation_Exit_Group,"test case pass");
	}
	public void Validate_toast_msg_Admin_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validation_Admin_Group_Exit,"test case pass");
	}
	public void Validate_toast_msg_Non_Admin_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","validtoastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Validation_Non_Admin_Group_Exit,"test case pass");
	}
	public void Group_9() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Editgroupdetails","group9");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_EditGroup.Group_9,"test case pass");
		ele4.click();
	}
	public void TRoop_Login(String email, String password) throws Exception {
		this.Set_Email(email);
		this.Set_Password(password);
	}
	public void Edit(String editgroupname, String password) throws Exception {
		this.Set_Email(editgroupname);
		this.Set_Password(password);
	}
}
