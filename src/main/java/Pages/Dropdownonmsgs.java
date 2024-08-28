package Pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Utiles.PropertyReader;
import Validation.Validation_Dropdown;

public class Dropdownonmsgs {
	private WebDriver driver;
	Actions action;
	Alert alert;
	Robot rb;
	public Dropdownonmsgs(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("Dropdownmsg","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	private void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("Dropdownmsg","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	private void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("Dropdownmsg","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","loginbtnl");
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
		Assert.assertEquals(actualText,Validation_Dropdown.Valid_Login,"test case pass");
	}
	public void Click_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User,"test case pass");
	}
	public void Click_On_Message_Input() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","entering-text");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Message_Text,"test case pass");
	}
	public void Enter_Text(String msg) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","entering-text");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(msg);
	}
	public void Validate_Entered_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Message_Text,"test case pass");
	}
	public void Validate_Entered_Text1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Message_Text1,"test case pass");
	}
	public void Click_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","sendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Sended_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Message_Text,"test case pass");
	}
	public void Validate_Sended_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Sended_Msg1,"test case pass");
	}
	public void Click_Attachment_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","attachmentbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Attachment_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Send_Image() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		StringSelection str = new StringSelection("/home/tvisha/Documents/blog_img_01.png");
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
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendattachment");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Send_Image,"test case pass");
	}
	public void Close_Image() throws Exception {
		Validate_Send_Image();
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Close_Image,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Image() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Closed_Image,"test case pass");
	}
	public void Send_Attachment() throws Exception
	{
		Validate_Send_Image();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Thread.sleep(3000);
	}
	public void Validate_Sended_Attachment() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedattachment");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Sended_Attachment,"test case pass");
	}
	public void Validate_Send_Video() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
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
		Thread.sleep(1000);
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Send_Video,"test case pass");
	}
	public void Close_Video() throws Exception {
		Validate_Send_Video();
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Close_Video,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Video() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Closed_Video,"test case pass");
	}
	public void Send_Video() throws Exception
	{
		Validate_Send_Video();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Thread.sleep(5000);
	}
	public void Validate_Sended_Video() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Sended_Video,"test case pass");
	}
	public void Validate_Send_Doc_Name() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		StringSelection str = new StringSelection("/home/tvisha/Downloads/IOS_Bugs.xlsx");
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
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesenddoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Send_Doc_Name,"test case pass");
	}
	public void Close_Doc() throws Exception {
		Validate_Send_Doc_Name();
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Close_Doc,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Doc() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Closed_Doc,"test case pass");
	}
	public void Send_Doc() throws Exception
	{
		Validate_Send_Doc_Name();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Thread.sleep(3000);
	}
	public void Validate_Sended_Doc() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendeddoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Sended_Doc,"test case pass");
	}
	public void Validate_Send_Audio_Name() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
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
		Thread.sleep(1000);
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Send_Audio_Name,"test case pass");
	}
	public void Close_Audio() throws Exception {
		Validate_Send_Audio_Name();
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Close_Audio,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Audio() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Closed_Audio,"test case pass");
	}
	public void Send_Audio() throws Exception
	{
		Validate_Send_Audio_Name();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Thread.sleep(3000);
	}
	public void Validate_Sended_Audio() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Sended_Audio,"test case pass");
	}
	public void Validate_Sended_Audio1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedaudio1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Sended_Audio1,"test case pass");
	}
	public void Enter_link(String link) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","entering-text");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(link);
	}
	public void Validate_Entered_link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Entered_link,"test case pass");
	}
	public void Validate_Sended_link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateenteredlink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Sended_link,"test case pass");
	}
	public void Click_Voice_msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","clickvoicemsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_Voice_Msg,"test case pass");
		ele4.click();
	}
	public void Pause_Voice_msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Entered_link,"test case pass");
	}
	public void Pause_Play_Voice_msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateenteredlink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Sended_link,"test case pass");
	}
	public void Click_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","clickcodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_Code_Snippet,"test case pass");
		ele4.click();
	}
	public void Click_Code_Snippet_Active() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatecodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_Code_Snippet_Active,"test case pass");
	}
	public void Validate_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedcodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Code_Snippet,"test case pass");
	}
	public void Dropdown_On_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String a=PropertyReader.Get_Locator("Dropdownmsg","dropdowmmsg");
		By b=By.xpath(a);
		WebElement e=driver.findElement(b);
		action=new Actions(driver);
		action.moveToElement(ele4).click(e).build().perform();
	}
	public void Dropdown_On_Reply() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","reply");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Dropdown_On_Reply,"test case pass");
		ele4.click();
	}
	public void Validate_Reply() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Reply,"test case pass");
	}
	public void Validate_Reply7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Reply7,"test case pass");
	}
	public void Validate_Reply1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Reply1,"test case pass");
	}
	public void Validate_Reply2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Reply2,"test case pass");
	}
	public void Validate_Reply3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Reply3,"test case pass");
	}
	public void Validate_Reply4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Reply4,"test case pass");
	}
	public void Validate_Reply5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Reply5,"test case pass");
	}
	public void Validate_Reply6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Reply6,"test case pass");
	}
	public void Validate_Replied_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","repliedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Msg,"test case pass");
	}
	public void Validate_Replied_Msg2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","repliedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Msg2,"test case pass");
	}
	public void Validate_Replied_Image1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","repliedimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Image1,"test case pass");
	}
	public void Validate_Replied_Video1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","repliedimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Video1,"test case pass");
	}
	public void Validate_Replied_Doc1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","repliedimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Doc1,"test case pass");
	}
	public void Validate_Replied_Audio1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","repliedimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Audio1,"test case pass");
	}
	public void Validate_Replied_Link1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","repliedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Link1,"test case pass");
	}
	public void Validate_Replied_Code_Snippet1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","repliedcode");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Code_Snippet1,"test case pass");
	}
	public void Validate_Replied_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validaterepliedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Msg1,"test case pass");
	}
	public void Validate_Send_Image1() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		StringSelection str = new StringSelection("/home/tvisha/Documents/blog_img_01.png");
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
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Thread.sleep(3000);
	}
	public void Validate_Replied_Image() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","dropdownimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Image,"test case pass");
	}
	public void Validate_Send_Video1() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
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
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Thread.sleep(5000);
	}
	public void Validate_Replied_Video() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","dropdownvideo1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Video,"test case pass");
	}
	public void Validate_Replied_Video2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","dropdownvideo2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Video,"test case pass");
	}
	public void Validate_Send_Doc_Name1() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
		StringSelection str = new StringSelection("/home/tvisha/Downloads/IOS_Bugs.xlsx");
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
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Thread.sleep(5000);
	}
	public void Validate_Replied_Doc() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","dropdowndoc1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Doc,"test case pass");
	}
	public void Validate_Replied_Doc2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","dropdowndoc2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Doc,"test case pass");
	}
	public void Validate_Send_Audio_Name1() throws Exception
	{
		rb= new Robot();
		Thread.sleep(1000);
		//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
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
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Thread.sleep(5000);
	}
	public void Validate_Replied_Audio() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","dropdownaudio1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Audio,"test case pass");
	}
	public void Validate_Replied_Audio2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","dropdownaudio2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Audio,"test case pass");
	}
	public void Validate_Replied_Link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","dropdownlink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Link,"test case pass");
	}
	public void Validate_Replied_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","replycodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Replied_Code_Snippet,"test case pass");
	}
	public void Dropdown_On_Image() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validateimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String a=PropertyReader.Get_Locator("Dropdownmsg","dropdownimage1");
		By b=By.xpath(a);
		WebElement e=driver.findElement(b);
		action=new Actions(driver);
		action.moveToElement(ele4).click(e).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Dropdown_On_Video() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String a=PropertyReader.Get_Locator("Dropdownmsg","dropdownimage1");
		By b=By.xpath(a);
		WebElement e=driver.findElement(b);
		action=new Actions(driver);
		action.moveToElement(ele4).click(e).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Dropdown_On_Doc() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendeddoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String a=PropertyReader.Get_Locator("Dropdownmsg","dropdownimage1");
		By b=By.xpath(a);
		WebElement e=driver.findElement(b);
		action=new Actions(driver);
		action.moveToElement(ele4).click(e).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Dropdown_On_Audio() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String a=PropertyReader.Get_Locator("Dropdownmsg","dropdownimage1");
		By b=By.xpath(a);
		WebElement e=driver.findElement(b);
		action=new Actions(driver);
		action.moveToElement(ele4).click(e).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Dropdown_On_Link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String a=PropertyReader.Get_Locator("Dropdownmsg","dropdownimage1");
		By b=By.xpath(a);
		WebElement e=driver.findElement(b);
		action=new Actions(driver);
		action.moveToElement(ele4).click(e).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Dropdown_On_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedcodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String a=PropertyReader.Get_Locator("Dropdownmsg","dropdownimage1");
		By b=By.xpath(a);
		WebElement e=driver.findElement(b);
		action=new Actions(driver);
		action.moveToElement(ele4).click(e).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Validate_Dropdown() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatedropdown");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Dropdown,"test case pass");
	}
	public void Validate_Dropdown1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatedropdown");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Dropdown1,"test case pass");
	}
	public void Validate_Dropdown2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatedropdown");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Dropdown2,"test case pass");
	}
	public void Validate_Dropdown3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatedropdown");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Dropdown3,"test case pass");
	}
	public void User_14() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user14");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_14,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User14() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User14,"test case pass");
	}
	public void User_15() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user15");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_15,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User15() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User15,"test case pass");
	}
	public void User_16() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user16");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_16,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User16() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User16,"test case pass");
	}
	public void User_17() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user17");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_17,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User17() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User17,"test case pass");
	}
	public void User_18() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user18");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_18,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User18() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User18,"test case pass");
	}
	public void User_19() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user19");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_19,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User19() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User19,"test case pass");
	}
	public void User_20() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user20");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_20,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User20() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User20,"test case pass");
	}
	public void User_1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_1,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User1,"test case pass");
	}
	public void User_2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_2,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User2,"test case pass");
	}
	public void User_3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_3,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User3,"test case pass");
	}
	public void User_4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user4");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_4,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User4,"test case pass");
	}
	public void User_5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user5");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_5,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User5,"test case pass");
	}
	public void User_6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user6");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_6,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User6,"test case pass");
	}
	public void User_7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user7");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_7,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User7,"test case pass");
	}
	public void User_8() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user8");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_8,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User8() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User8,"test case pass");
	}
	public void User_9() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user9");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_9,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User9() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User9,"test case pass");
	}
	public void User_10() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user10");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_10,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User10() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User10,"test case pass");
	}
	public void User_11() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user11");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_11,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User11() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User11,"test case pass");
	}
	public void User_12() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user12");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_12,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User12() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User12,"test case pass");
	}
	public void User_13() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user13");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_13,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User13() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User13,"test case pass");
	}
	public void User_21() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","user21");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.User_21,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User21() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_User21,"test case pass");
	}
	public void Click_On_Forward() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forward");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Forward,"test case pass");
		ele4.click();
	}
	public void Validate_Forward() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Forward,"test case pass");
	}
	public void Forward_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardsendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Forward_Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Forward_Send() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Forward_Send,"test case pass");
	}
	public void Forward_Cancel_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardcancelbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Forward_Cancel_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Forward_Cancel() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardcancel");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Forward_Cancel,"test case pass");
	}
	public void Forward_Search_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Forward_Search_Button,"test case pass");
		ele4.click();
	}
	public void Enter_Forward_Search_User(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		ele4.sendKeys(search);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Enter_Text,"test case pass");
	}
	public void Forward_Search_Clear_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardsearchclear");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Forward_Search_Clear_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Search_Clear_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardsearchclearhidden");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Search_Clear_Button,"test case pass");
	}
	public void Forward_Invlalid_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardinvalidsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Forward_Invlalid_Search,"test case pass");
	}
	public void Forward_Select_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwarduser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Forward_Select_User,"test case pass");
		ele4.click();
	}
	public void Validate_Selected_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","username");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("data-username");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Selected_User,"test case pass");
	}
	public void Forward_Select_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Forward_Select_Group,"test case pass");
		ele4.click();
	}
	public void Validate_Selected_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","groupname");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("data-username");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Selected_Group,"test case pass");
	}
	public void Validate_Selected_Members() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardselectedusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Selected_Members,"test case pass");
	}
	public void Validate_Selected_Members1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardselectedusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Selected_Members1,"test case pass");
	}
	public void Validate_Selected_Members2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardselectedusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Selected_Members2,"test case pass");
	}
	public void Forward_Reset_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardresetbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Forward_Reset_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Reset_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validateresetbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Reset_Button,"test case pass");
	}
	public void Click_On_Forward_Marker() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardmarker");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Forward_Marker,"test case pass");
		ele4.click();
	}
	public void Click_On_Close_Button_To_Forward() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardclosebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Close_Button_To_Forward,"test case pass");
		ele4.click();
	}
	public void Forward_Send_Button1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardsendbutton1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Forward_Send_Button1,"test case pass");
		ele4.click();
	}
	public void Forward_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","forwardicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Forward_Icon,"test case pass");
	}
	public void Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","group");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Group,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Group,"test case pass");
	}
	public void Click_On_Copy() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","copy");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Copy,"test case pass");
		ele4.click();
	}
	public void Click_On_Copy1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","copyhidden");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		ele4.click();
	}
	public void Validate_Copy() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","copywrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Copy,"test case pass");
	}
	public void Copy_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","copysendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Copy_Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Copy_Send() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","copytoast");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Copy_Send,"test case pass");
	}
	public void Copy_Cancel_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","copycancelbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Copy_Cancel_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Copy_Cancel() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","copycancel");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Copy_Cancel,"test case pass");
	}
	public void Validate_Copy_Toast() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","copytoast");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Copy_Toast,"test case pass");
	}
	public void Double_Click_Copy() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatesendedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		action=new Actions(driver);
		action.doubleClick(ele4).perform();
	}
	public void Validate_Copy_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","doubleclick");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Copy_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Copy_Toast1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","copytoast");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Copy_Toast1,"test case pass");
	}
	public void Click_On_Edit() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","edit");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Edit,"test case pass");
		ele4.click();
	}
	public void Validate_Edit() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Edit,"test case pass");
	}
	public void Edit_Close_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editclose");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Edit_Close_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Edit_Close() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editclosebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Edit_Close,"test case pass");
	}
	public void Validate_Edited_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Edited_Msg,"test case pass");
	}
	public void Validate_Edited_Image() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editedimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Edited_Image,"test case pass");
	}
	public void Validate_Edited_Video() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editedvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Edited_Video,"test case pass");
	}
	public void Validate_Edited_Doc() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editeddoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Edited_Doc,"test case pass");
	}
	public void Validate_Edited_Audio() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editedaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Edited_Audio,"test case pass");
	}
	public void Validate_Edited_link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editedlink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Edited_link,"test case pass");
	}
	public void Validate_Edited_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editedcode");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Edited_Code_Snippet,"test case pass");
	}
	public void Enter_Text1(String msg) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editedcode");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(msg);
	}
	public void Validate_Edit_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","editicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Edit_Icon,"test case pass");
	}
	public void Code_Snippet_Submit_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","codesubmit");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Code_Snippet_Submit_Button,"test case pass");
		ele4.click();
	}
	public void Click_On_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","info");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Info,"test case pass");
		ele4.click();
	}
	public void Validate_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Info,"test case pass");
	}
	public void Validate_Msg_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Msg_Info,"test case pass");
	}
	public void Validate_Msg_Info_Other() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Msg_Info_Other,"test case pass");
	}
	public void Validate_Image_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Image_Info,"test case pass");
	}
	public void Validate_Video_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Video_Info,"test case pass");
	}
	public void Validate_Doc_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Doc_Info,"test case pass");
	}
	public void Validate_Audio_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Audio_Info,"test case pass");
	}
	public void Validate_Link_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Link_Info,"test case pass");
	}
	public void Validate_Code_Snippet_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Code_Snippet_Info,"test case pass");
	}
	public void Info_Close_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infoclose");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Info_Close_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Info_Close() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","infoclosebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Info_Close,"test case pass");
	}
	public void Click_On_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","delete");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Delete,"test case pass");
		ele4.click();
	}
	public void Validate_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deletewrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Delete,"test case pass");
	}
	public void Click_On_Delete_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deletesendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Delete_Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Delete_Confirmation_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deleteconfirmationtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Delete_Confirmation_Text,"test case pass");
	}
	public void Click_On_Delete_Cancel_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deletecancelbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Delete_Cancel_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Cancel() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deletecancel");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Cancel,"test case pass");
	}
	public void Click_On_Delete_Yes_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deleteyesbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Delete_Yes_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Deleted_Yes_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatedeletedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Deleted_Yes_Msg,"test case pass");
	}
	public void Validate_Deleted_Yes_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatedeletedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Deleted_Yes_Msg1,"test case pass");
	}
	public void Click_On_Delete_No_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deletenobutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Delete_No_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Deleted_No_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validatedeleteno");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Deleted_No_Msg,"test case pass");
	}
	public void Click_On_Delete_Close_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deleteclose");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Delete_Close_Button,"test case pass");
		ele4.click();
	}
	public void Select_Image_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deleteimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Image_Delete,"test case pass");
		ele4.click();
	}
	public void Select_Video_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deletevideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Video_Delete,"test case pass");
		ele4.click();
	}
	public void Select_Doc_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deletedoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Doc_Delete,"test case pass");
		ele4.click();
	}
	public void Select_Audio_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deleteaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Audio_Delete,"test case pass");
		ele4.click();
	}
	public void Select_Link_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deletelink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Link_Delete,"test case pass");
		ele4.click();
	}
	public void Select_Code_Snippet_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","deletecode");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Code_Snippet_Delete,"test case pass");
		ele4.click();
	}
	public void Click_On_Flag() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","flag");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Flag,"test case pass");
		ele4.click();
	}
	public void Validate_Flag_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","flagicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Flag_Icon,"test case pass");
	}
	public void Click_On_UnFlag() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","flag");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_UnFlag,"test case pass");
		ele4.click();
	}
	public void Validate_UnFlag_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","flagicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("data-flag");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_UnFlag_Icon,"test case pass");
	}
	public void Click_On_Pin() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","pin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Pin,"test case pass");
		ele4.click();
	}
	public void Validate_Pin_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","pinicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Pin_Icon,"test case pass");
	}
	public void Click_On_UnPin() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","pin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_UnPin,"test case pass");
		ele4.click();
	}
	public void Click_On_Respond_Later() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","respondlater");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Respond_Later,"test case pass");
		ele4.click();
	}
	public void Validate_Respond_Later_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","respondlatericon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Respond_Later_Icon,"test case pass");
	}
	public void Click_On_Clear() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","respondlater");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Clear,"test case pass");
		ele4.click();
	}
	public void Validate_Clear_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","respondlatericon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("data-status");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Clear_Icon,"test case pass");
	}
	public void Click_On_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recall");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Recall,"test case pass");
		ele4.click();
	}
	public void Click_On_Recall1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallhidden");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		ele4.click();
	}
	public void Validate_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Recall,"test case pass");
	}
	public void Click_On_Recall_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallsendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Recall_Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Recall_Confirmation_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallconfirmationtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Recall_Confirmation_Text,"test case pass");
	}
	public void Click_On_Recall_Cancel_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallcancelbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Recall_Cancel_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Cancel_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallcancel");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Cancel_Recall,"test case pass");
	}
	public void Click_On_Recall_Yes_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallyesbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Recall_Yes_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Recalled_Yes_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validaterecalledmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Recalled_Yes_Msg,"test case pass");
	}
	public void Validate_Recalled_Yes_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validaterecalledmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Recalled_Yes_Msg1,"test case pass");
	}
	public void Click_On_Recall_No_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallnobutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Recall_No_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Recalled_No_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validaterecallno");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Recalled_No_Msg,"test case pass");
	}
	public void Click_On_Recall_Close_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallclose");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Click_On_Recall_Close_Button,"test case pass");
		ele4.click();
	}
	public void Recalled_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recalltext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Recalled_Text,"test case pass");
	}
	public void Select_Image_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Image_Recall,"test case pass");
		ele4.click();
	}
	public void Select_Video_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Video_Recall,"test case pass");
		ele4.click();
	}
	public void Select_Doc_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recalldoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Doc_Recall,"test case pass");
		ele4.click();
	}
	public void Select_Audio_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Audio_Recall,"test case pass");
		ele4.click();
	}
	public void Select_Link_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recalllink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Link_Recall,"test case pass");
		ele4.click();
	}
	public void Select_Code_Snippet_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","recallcode");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Select_Code_Snippet_Recall,"test case pass");
		ele4.click();
	}
	public void Validate_Recall_For_Previous_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validaterecalledmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Recall_For_Previous_Msg,"test case pass");
	}
	public void Validate_Recall_For_Other_User_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("Dropdownmsg","validaterecalledmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Dropdown.Validate_Recall_For_Other_User_Msg,"test case pass");
	}
	public void TRoop_Login(String Email, String Password) throws Exception 
	{
		this.Set_Email(Email);
	     this.Set_Password(Password);
	}
}
