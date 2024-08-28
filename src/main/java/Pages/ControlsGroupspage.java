package Pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Utiles.PropertyReader;
import Validation.Validation_GroupControls;

public class ControlsGroupspage {
private WebDriver driver;
	Robot rb;
	public ControlsGroupspage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("Controlsgroupsdetails","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	public void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("Controlsgroupsdetails","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	public void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("Controlsgroupsdetails","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Valid_Login,"test case pass");
	}
	public void Click_On_Dashboard() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","dashboard");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-app");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_Dashboard,"test case pass");
		ele4.click();
	}
	public void Click_On_Group_Tab() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","groupstab");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_Group_Tab,"test case pass");
		ele4.click();
	}
	public void Click_On_Add_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","addgroupbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_Add_Group,"test case pass");
		ele4.click();
	}
	public void Validate_Add_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","validategroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Add_Group,"test case pass");
	}
	public void Click_On_Create_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","createbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_Create_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg,"test case pass");
	}
	public void Enter_Group_Name(String name) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","entergroupname");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Enter_Group_Name,"test case pass");
		ele4.sendKeys(name);
	}
	public void Validate_Toast_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg1,"test case pass");
	}
	public void Validate_Toast_Msg2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg2,"test case pass");
	}
	public void Validate_Toast_Msg3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg3,"test case pass");
	}
	public void Enter_Group_Description(String name) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","enterdescription");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Enter_Group_Description,"test case pass");
		ele4.sendKeys(name);
	}
	public void Validate_The_Characters() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","characters");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_The_Characters,"test case pass");
	}
	public void Validate_The_Characters1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","characters");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_The_Characters1,"test case pass");
	}
	public void Click_On_Group_Image() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","groupimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_Group_Image,"test case pass");
		Actions ac=new Actions(driver);
		ac.moveToElement(ele4).click(ele4).perform();
	}
	public void Attachment_Image() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Documents/bg3.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Thread.sleep(3000);
	}
	public void Attachment_Video() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/20210827_180112.mp4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public void Validate_Toast_Msg5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg5,"test case pass");
	}
	public void Attachment_Audio() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/1638603838337.mp3");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public void Validate_Toast_Msg6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg6,"test case pass");
	}
	public void Attachment_Doc() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/Aug_2021_Timesheet.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public void Validate_Toast_Msg7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg7,"test case pass");
	}
	public void Remove_Group_Image() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","removeimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Remove_Group_Image,"test case pass");
		ele4.click();
	}
	public void Group_Search(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","groupsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Group_Search,"test case pass");
		ele4.sendKeys(search);
	}
	public void Select_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","selectuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Select_User,"test case pass");
		ele4.click();
	}
	public void Select_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","selectuser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Select_User1,"test case pass");
		ele4.click();
	}
	public void Click_On_Admin_For_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","useradmin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_Admin_For_User,"test case pass");
		ele4.click();
	}
	public void Click_On_Admin_For_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","useradmin1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_Admin_For_User1,"test case pass");
	}
	public void Remove_Admin_For_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","removeadminuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Remove_Admin_For_User,"test case pass");
		ele4.click();
	}
	public void Click_On_Moderator_For_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","usermoderator");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_Moderator_For_User,"test case pass");
		ele4.click();
	}
	public void Remove_Moderator_For_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","removemoderatoruser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Remove_Moderator_For_User,"test case pass");
		ele4.click();
	}
	public void Selected_Group_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","selectedgroupusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Selected_Group_User,"test case pass");
	}
	public void Selected_Group_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","selectedgroupusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Selected_Group_User1,"test case pass");
	}
	public void Selected_Group_User2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","selectedgroupusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Selected_Group_User2,"test case pass");
	}
	public void Airtime_Group_Checkbox() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","airtimegroupcheckbox");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Airtime_Group_Checkbox,"test case pass");
		ele4.click();
	}
	public void Airtime_Group_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","airtimegrouptext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Airtime_Group_Text,"test case pass");
	}
	public void Airtime_Group_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","airtimegroupinfo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Airtime_Group_Info,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg4,"test case pass");
	}
	public void Search_Groups(String group) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","searchgroups");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Search_Groups,"test case pass");
		ele4.sendKeys(group);
	}
	public void Validate_The_Searched_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","group");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_The_Searched_Group,"test case pass");
	}
	public void Invalid_Searched_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","noresult");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Invalid_Searched_Group,"test case pass");
	}
	public void Sort() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","sorts");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Sort,"test case pass");
		ele4.click();
	}
	public void Sort1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","sort1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Sort1,"test case pass");
		ele4.click();
	}
	public void Sort2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","sort2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Sort2,"test case pass");
		ele4.click();
	}
	public void Sort3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","sort3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Sort3,"test case pass");
		ele4.click();
	}
	public void Filter() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","filters");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Filter,"test case pass");
		ele4.click();
	}
	public void Filter1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","filter1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Filter1,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg8() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg8,"test case pass");
	}
	public void Filter2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","filter2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Filter2,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg9() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg9,"test case pass");
	}
	public void Filter3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","filter3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Filter3,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg10() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg10,"test case pass");
	}
	public void Filter4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","filter4");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Filter4,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg11() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg11,"test case pass");
	}
	public void Filter5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","filter5");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Filter5,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg12() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg12,"test case pass");
	}
	public void Filter6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","filter6");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Filter6,"test case pass");
		ele4.click();
	}
	public void Validate_Toast_Msg13() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","toastmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Toast_Msg13,"test case pass");
	}
	public void Reset_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","refresh");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Reset_Button,"test case pass");
		ele4.click();
	}
	public void Dots() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","3dots");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Dots,"test case pass");
		ele4.click();
	}
	public void Dots2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","3dots2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Dots2,"test case pass");
		ele4.click();
	}
	public void Dots1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","3dots1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Dots,"test case pass");
		ele4.click();
	}
	public void Wrapper() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","wraper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Wrapper,"test case pass");
	}
	public void View() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","view");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.View,"test case pass");
		ele4.click();
	}
	public void View1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","view1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.View1,"test case pass");
		ele4.click();
	}
	public void Validate_View() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","rightside");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_View,"test case pass");
	}
	public void Edit() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","edit");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Edit,"test case pass");
		ele4.click();
	}
	public void Validate_Edit() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","validateedit");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Validate_Edit,"test case pass");
	}
	public void Delete_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","deletegroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Delete_Group,"test case pass");
		ele4.click();
	}
	public void Delete_Group1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","deletegroup1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Delete_Group1,"test case pass");
		ele4.click();
	}
	public void Confirmation_Text2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","confirmationtext1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Confirmation_Text2,"test case pass");
	}
	public void Delete_All_Msgs_And_Files() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","allmsgsandfiles");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Delete_All_Msgs_And_Files,"test case pass");
		ele4.click();
	}
	public void Confirmation_Text1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","confirmationtext1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Confirmation_Text1,"test case pass");
	}
	public void Delete_All_Msgs() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","onlymsgs");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Delete_All_Msgs,"test case pass");
		ele4.click();
	}
	public void Confirmation_Text3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","confirmationtext1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Confirmation_Text3,"test case pass");
	}
	public void Delete_All_Files() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","onlyfiles");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Delete_All_Files,"test case pass");
		ele4.click();
	}
	public void Confirmation_Text4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","confirmationtext1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Confirmation_Text4,"test case pass");
	}
	public void Export_Chat_To_Excel() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","exportchat");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Export_Chat_To_Excel,"test case pass");
		ele4.click();
	}
	public void Export_Group_Members_To_Excel() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","exportgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Export_Group_Members_To_Excel,"test case pass");
		ele4.click();
	}
	public void Yes() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","yes");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Yes,"test case pass");
		ele4.click();
	}
	public void No() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","no");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("value");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.No,"test case pass");
		ele4.click();
	}
	public void Checkbox() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","checkbox");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Checkbox,"test case pass");
		ele4.click();
	}
	public void Checkbox1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","checkbox1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Checkbox1,"test case pass");
		ele4.click();
	}
	public void Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","3row");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Group,"test case pass");
		ele4.click();
	}
	public void Date_Range() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","daterange");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Date_Range,"test case pass");
		ele4.click();
	}
	public void Click_On_From_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","fromdate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_From_Date,"test case pass");
		ele4.click();
	}
	public void Select_From_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","selectfromdate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Select_From_Date,"test case pass");
		ele4.click();
	}
	public void Click_On_To_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","todate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("placeholder");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_To_Date,"test case pass");
		ele4.click();
	}
	public void Select_To_Date() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","selecttodate");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Select_To_Date,"test case pass");
		ele4.click();
	}
	public void Click_On_Submit_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","submit");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.Click_On_Submit_Button,"test case pass");
		ele4.click();
	}
	public void No_Result() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Controlsgroupsdetails","noresult");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_GroupControls.No_Result,"test case pass");
	}
}
