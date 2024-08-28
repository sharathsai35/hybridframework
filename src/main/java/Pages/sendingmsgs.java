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
import org.junit.Assert;

import Utiles.PropertyReader;
import Validation.Validation_SendMsgs;

public class sendingmsgs {
	private WebDriver driver;
	Actions action;
	Alert alert;
	Robot rb;
	public sendingmsgs(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("sendingmsgsdetails","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	private void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("sendingmsgsdetails","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	private void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("sendingmsgsdetails","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Valid_Login,"test case pass");
	}
	public void Click_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User,"test case pass");
	}
	public void Click_On_Message_Input() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","entering-text");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Message_Text,"test case pass");
	}
	public void Enter_Text(String msg) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","entering-text");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(msg);
	}
	public void Validate_Entered_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Message_Text,"test case pass");
	}
	public void Validate_Entered_Text1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Message_Text1,"test case pass");
	}
	public void Click_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","sendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Sended_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Message_Text,"test case pass");
	}
	public void Click_Attachment_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","attachmentbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Attachment_Button,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendattachment");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Send_Image,"test case pass");
	}
	public void Close_Image() throws Exception {
		Validate_Send_Image();
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Close_Image,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Image() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Closed_Image,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedattachment");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Attachment,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Send_Video,"test case pass");
	}
	public void Close_Video() throws Exception {
		Validate_Send_Video();
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Close_Video,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Video() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Closed_Video,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Video,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesenddoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Send_Doc_Name,"test case pass");
	}
	public void Close_Doc() throws Exception {
		Validate_Send_Doc_Name();
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Close_Doc,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Doc() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Closed_Doc,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendeddoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Doc,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Send_Audio_Name,"test case pass");
	}
	public void Close_Audio() throws Exception {
		Validate_Send_Audio_Name();
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Close_Audio,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Audio() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Closed_Audio,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Audio,"test case pass");
	}
	public void Validate_Sended_Audio1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedaudio1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Audio1,"test case pass");
	}
	public void Enter_link(String link) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","entering-text");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(link);
	}
	public void Validate_Entered_link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_link,"test case pass");
	}
	public void Validate_Sended_link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateenteredlink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_link,"test case pass");
	}
	public void Click_Voice_msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickvoicemsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_Voice_Msg,"test case pass");
		ele4.click();
	}
	public void Pause_Voice_msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_link,"test case pass");
	}
	public void Pause_Play_Voice_msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateenteredlink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_link,"test case pass");
	}
	public void Click_Read_receipt() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickreadreceipt");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_Read_Receipt,"test case pass");
		ele4.click();
	}
	public void Click_Read_receipt1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickreadreceipt");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_Read_Receipt1,"test case pass");
	}
	public void Click_Read_receipt_Active() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatereadreceipt");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_Read_Receipt_Active,"test case pass");
	}
	public void Validate_Read_receipt() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedreadreceipt");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Read_Receipt,"test case pass");
	}
	public void User_7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user7");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_7,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User7,"test case pass");
	}
	public void Click_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickcodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_Code_Snippet,"test case pass");
		ele4.click();
	}
	public void Click_Code_Snippet_Active() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatecodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_Code_Snippet_Active,"test case pass");
	}
	public void Validate_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedcodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Code_Snippet,"test case pass");
	}
	public void Click_Forkout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickforkout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_Forkout,"test case pass");
		ele4.click();
	}
	public void Click_Forkout_Active() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateforkout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_Forkout_Active,"test case pass");
	}
	public void Select_Forkout_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Select_Forkout_User,"test case pass");
		ele4.click();
	}
	public void Select_Forkout_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Select_Forkout_Group,"test case pass");
		ele4.click();
	}
	public void Selected_Forkout_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutselected");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Selected_Forkout_User,"test case pass");
	}
	public void Selected_Forkout_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutselected");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Selected_Forkout_Group,"test case pass");
	}
	public void Selected_Forkout_User_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutselected");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Selected_Forkout_User_Group,"test case pass");
	}
	public void Search_In_Forkout(String forkout) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","searchinforkout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Search_In_Forkout,"test case pass");
		ele4.sendKeys(forkout);
	}
	public void Select_Forkout_Group1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutgroup1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Select_Forkout_Group1,"test case pass");
		ele4.click();
	}
	public void Selected_Forkout_Group1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutselected");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Selected_Forkout_Group1,"test case pass");
	}
	public void Search_Invalid() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","searchinvalid");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Search_Invalid,"test case pass");
	}
	public void Close_Search_Forkout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","closethesearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Close_Search_Forkout,"test case pass");
	}
	public void Select_Forkout_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutuser1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Select_Forkout_User1,"test case pass");
		ele4.click();
	}
	public void Selected_Forkout_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutselected");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Selected_Forkout_User1,"test case pass");
	}
	public void Refresh_Selected_User_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","refreshselectedusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Refresh_Selected_User_Group,"test case pass");
		ele4.click();
	}
	public void Validate_Refreshed_Count() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","refreshedcount");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Refreshed_Count,"test case pass");
	}
	public void Click_On_Done() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","donebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Done,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Forkout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","closedforkout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Closed_Forkout,"test case pass");
	}
	public void Click_On_Forkout_Again() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickforkoutagain1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Forkout_Again,"test case pass");
		Thread.sleep(2000);
		ele4.click();
	}
	public void Validate_Forkout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","deactiveforkout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Forkout,"test case pass");
	}
	public void Close_Selected_Members() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","closeselectedmembers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Close_Selected_Members,"test case pass");
		ele4.click();
	}
	public void Validate_Forkout1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickforkout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Forkout1,"test case pass");
	}
	public void User_1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_1,"test case pass");
		ele4.click();
	}
	public void Forkout_Msg_With_Marker() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutmarker");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Forkout_Msg_With_Marker,"test case pass");
	}
	public void User_2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_2,"test case pass");
		ele4.click();
	}
	public void Select_Forkout_User2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutuser2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Select_Forkout_User2,"test case pass");
		ele4.click();
	}
	public void Selected_Forkout_User2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","forkoutselected");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Selected_Forkout_User2,"test case pass");
	}
	public void Forkout_Msg_Without_Marker() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","withoutmarker");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Forkout_Msg_Without_Marker,"test case pass");
		ele4.click();
	}
	public void Click_On_Burnout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","burnout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Burnout,"test case pass");
		ele4.click();
	}
	public void Validate_Burnout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateburnout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Burnout,"test case pass");
	}
	public void Click_On_Burnout_Again() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateburnout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Burnout_Again,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_Burnout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateclickedburnout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Clicked_Burnout,"test case pass");
	}
	public void Set_Any_Time_In_Burnout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","burnoutwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Set_Any_Time_In_Burnout,"test case pass");
	}
	public void Validate_Set_Time_Burnout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","settimeburnout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Set_Time_Burnout,"test case pass");
		ele4.click();
	}
	public void Start_Burnout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","startburnout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Start_Burnout,"test case pass");
		ele4.click();
	}
	public void Validate_Started_Burnout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","startedburnout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Started_Burnout,"test case pass");
	}
	public void Reject_Burnout_In_Waiting_Acceptance() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Rejectbuttoninwaiting");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Reject_Burnout_In_Waiting_Acceptance,"test case pass");
		ele4.click();
	}
	public void Validate_Rejected_Burnout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validaterejectedburnout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Rejected_Burnout,"test case pass");
	}
	public void Cancel_Burnout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","cancelburnout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Cancel_Burnout,"test case pass");
		ele4.click();
	}
	public void Validate_Cancelled_Burnout() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatecancelledburnout");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Cancelled_Burnout,"test case pass");
	}
	public void Click_On_Location() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","location");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Location,"test case pass");
		ele4.click();
	}
	public void Validate_Location() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatelocation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Location,"test case pass");
	}
	public void Click_On_Location_Again() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatelocation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Location_Again,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_Location() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateclickedlocation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Clicked_Location,"test case pass");
	}
	public void Set_Any_Time_In_Location() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","locationwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Set_Any_Time_In_Location,"test case pass");
	}
	public void Validate_Set_Time_Location() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","settimelocation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Set_Time_Location,"test case pass");
		ele4.click();
	}
	public void Start_Location() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","startlocation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Start_Location,"test case pass");
		ele4.click();
	}
	public void Validate_Started_Location() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","startedlocation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Started_Location,"test case pass");
	}
	public void Reject_Location_In_Waiting_Acceptance() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Rejectbuttoninwaitinglocation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Reject_Location_In_Waiting_Acceptance,"test case pass");
		ele4.click();
	}
	public void Validate_Rejected_Location() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validaterejectedlocation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Rejected_Location,"test case pass");
	}
	public void Cancel_Location() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","cancellocation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Cancel_Location,"test case pass");
		ele4.click();
	}
	public void Validate_Cancelled_Location() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatecancelledlocation");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Cancelled_Location,"test case pass");
	}
	public void Click_On_Bold() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickbold");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Bold,"test case pass");
		ele4.click();
	}
	public void Validate_Bold() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validatebold");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Bold,"test case pass");
	}
	public void Click_On_Bold_Again() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validatebold");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Bold_Again,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_Bold() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateclickedbold");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Clicked_Bold,"test case pass");
	}
	public void User_3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_3,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User3,"test case pass");
	}
	public void Validate_Sended_Bold_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedboldmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Bold_Msg,"test case pass");
	}
	public void Click_On_Italic() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickitalic");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Italic,"test case pass");
		ele4.click();
	}
	public void Validate_Italic() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateitalic");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Italic,"test case pass");
	}
	public void Click_On_Italic_Again() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateitalic");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Italic_Again,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_Italic() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateclickeditalic");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Clicked_Italic,"test case pass");
	}
	public void User_4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user4");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_4,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User4,"test case pass");
	}
	public void Validate_Sended_Italic_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendeditalicmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Italic_Msg,"test case pass");
	}
	public void Click_On_Underline() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickunderline");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Underline,"test case pass");
		ele4.click();
	}
	public void Validate_Underline() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateunderline");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Underline,"test case pass");
	}
	public void Click_On_Underline_Again() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateunderline");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Underline_Again,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_Underline() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateclickedunderline");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Clicked_Underline,"test case pass");
	}
	public void User_5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user5");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_5,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User5,"test case pass");
	}
	public void Validate_Sended_Underline_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedunderlinemsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Underline_Msg,"test case pass");
	}
	public void Click_On_Strikethrough() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickstrikethrough");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Strikethrough,"test case pass");
		ele4.click();
	}
	public void Validate_Strikethrough() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validatestrikethrough");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Strikethrough,"test case pass");
	}
	public void Click_On_Strikethrough_Again() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validatestrikethrough");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Strikethrough_Again,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_Strikethrough() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateclickedstrikethrough");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Clicked_Strikethrough,"test case pass");
	}
	public void User_6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user6");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_6,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User6,"test case pass");
	}
	public void Validate_Sended_Strikethrough_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedstrikethroughmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Strikethrough_Msg,"test case pass");
	}
	public void User_8() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user8");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-name");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_8,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User8() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User8,"test case pass");
	}
	public void Validate_Sended_Bold_Italic_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedbolditalicmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Bold_Italic_Msg,"test case pass");
	}
	public void Validate_Sended_Bold_Underline_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedbolditalicmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Bold_Underline_Msg,"test case pass");
	}
	public void Validate_Sended_Bold_Strikethrough_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedboldstrikethroughmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Bold_Strikethrough_Msg,"test case pass");
	}
	public void Validate_Sended_Italic_Underline_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendeditalicunderlinemsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Italic_Underline_Msg,"test case pass");
	}
	public void Validate_Sended_Italic_Strikethrough_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendeditalicstrikethroughmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Italic_Strikethrough_Msg,"test case pass");
	}
	public void Validate_Sended_Underline_Strikethrough_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedunderlinestrikethroughmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Underline_Strikethrough_Msg,"test case pass");
	}
	public void Validate_Sended_Bold_Italic_Underline_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedbolditalicunderlinemsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Bold_Italic_Underline_Msg,"test case pass");
	}
	public void Validate_Sended_Bold_Italic_Strikethrough_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedbolditalicstrikethroughmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Bold_Italic_Strikethrough_Msg,"test case pass");
	}
	public void Validate_Sended_Bold_Underline_Strikethrough_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendedboldunderlinestrikethroughmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Bold_Underline_Strikethrough_Msg,"test case pass");
	}
	public void Validate_Sended_Italic_Underline_Strikethrough_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validatesendeditalicunderlinestrikethroughmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Italic_Underline_Strikethrough_Msg,"test case pass");
	}
	public void Click_On_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Emoji,"test case pass");
		ele4.click();
	}
	public void Validate_Emoji_Active() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Emoji,"test case pass");
	}
	public void Click_On_Emoji_Active() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","validateemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_Emoji_Active,"test case pass");
		ele4.click();
	}
	public void Validate_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","clickemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Emoji1,"test case pass");
	}
	public void Validate_Emoji_Tab() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojiwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Emoji_Tab,"test case pass");
	}
	public void Click_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojisearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Search,"test case pass");
		ele4.click();
	}
	public void Enter_Search_In_Emoji(String emoji) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojisearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(emoji);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Search,"test case pass");
	}
	public void Search_With_Invalid_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","invalidemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Search_With_Invalid_Emoji,"test case pass");
	}
	public void Clear_The_Searched_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojisearchclear");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Clear_The_Searched_Emoji,"test case pass");
		ele4.click();
	}
	public void Click_On_People_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojipeople");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-category");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_People_Emoji,"test case pass");
		ele4.click();
	}
	public void Click_On_Nature_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojinature");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-category");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Nature_Emoji,"test case pass");
		ele4.click();
	}
	public void Click_On_Food_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojifood");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-category");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Food_Emoji,"test case pass");
		ele4.click();
	}
	public void Click_On_Activity_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojiactivity");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-category");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Activity_Emoji,"test case pass");
		ele4.click();
	}
	public void Click_On_Objects_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojiobjects");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-category");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Objects_Emoji,"test case pass");
		ele4.click();
	}
	public void Click_On_Flag_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojiflags");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-category");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Flag_Emoji,"test case pass");
		ele4.click();
	}
	public void Click_On_Regional_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojiregional");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-category");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Regional_Emoji,"test case pass");
		ele4.click();
	}
	public void Click_On_Symbols_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojisymbols");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-category");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Symbols_Emoji,"test case pass");
		ele4.click();
	}
	public void Click_On_Travel_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emojitravel");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("data-category");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Click_On_Travel_Emoji,"test case pass");
		ele4.click();
	}
	public void Enter_People_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emoji1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Enter_People_Emoji,"test case pass");
		ele4.click();
	}
	public void Validate_Entered_People_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","enteremoji1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_People_Emoji,"test case pass");
	}
	public void Validate_Sended_People_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","receivedemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_People_Emoji,"test case pass");
	}
	public void Enter_Nature_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emoji2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Enter_Nature_Emoji,"test case pass");
		ele4.click();
	}
	public void Validate_Entered_Nature_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","enteremoji2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_Nature_Emoji,"test case pass");
	}
	public void Validate_Sended_Nature_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","receivedemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Nature_Emoji,"test case pass");
	}
	public void Validate_Sended_Food_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","receivedemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Food_Emoji,"test case pass");
	}
	public void Validate_Sended_Activity_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","receivedemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Activity_Emoji,"test case pass");
	}
	public void Validate_Sended_Objects_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","receivedemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Objects_Emoji,"test case pass");
	}
	public void Validate_Sended_Flag_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","receivedemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Flag_Emoji,"test case pass");
	}
	public void Validate_Sended_Regional_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","receivedemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Regional_Emoji,"test case pass");
	}
	public void Validate_Sended_Symbols_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","receivedemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Symbols_Emoji,"test case pass");
	}
	public void Validate_Sended_Travel_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","receivedemoji");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Sended_Travel_Emoji,"test case pass");
	}
	public void Enter_Food_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emoji3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Enter_Food_Emoji,"test case pass");
		ele4.click();
	}
	public void Validate_Entered_Food_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","enteremoji3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_Food_Emoji,"test case pass");
	}
	public void Enter_Activity_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emoji4");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Enter_Activity_Emoji,"test case pass");
		ele4.click();
	}
	public void Validate_Entered_Activity_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","enteremoji4");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_Activity_Emoji,"test case pass");
	}
	public void Enter_Objects_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emoji5");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Enter_Objects_Emoji,"test case pass");
		ele4.click();
	}
	public void Validate_Entered_Objects_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","enteremoji5");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_Objects_Emoji,"test case pass");
	}
	public void Enter_Flag_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emoji6");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Enter_Flag_Emoji,"test case pass");
		ele4.click();
	}
	public void Validate_Entered_Flag_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","enteremoji6");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_Flag_Emoji,"test case pass");
	}
	public void Enter_Regional_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emoji7");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Enter_Regional_Emoji,"test case pass");
		ele4.click();
	}
	public void Validate_Entered_Regional_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","enteremoji7");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_Regional_Emoji,"test case pass");
	}
	public void Enter_Symbols_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emoji8");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Enter_Symbols_Emoji,"test case pass");
		ele4.click();
	}
	public void Validate_Entered_Symbols_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","enteremoji8");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_Symbols_Emoji,"test case pass");
	}
	public void Enter_Travel_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","emoji9");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Enter_Travel_Emoji,"test case pass");
		ele4.click();
	}
	public void Validate_Entered_Travel_Emoji() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","enteremoji9");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_Entered_Travel_Emoji,"test case pass");
	}
	public void User_9() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user9");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_9,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User9() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User9,"test case pass");
	}
	public void User_10() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user10");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_10,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User10() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User10,"test case pass");
	}
	public void User_11() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user11");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_11,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User11() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User11,"test case pass");
	}
	public void User_12() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user12");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_12,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User12() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User12,"test case pass");
	}
	public void User_13() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user13");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_13,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User13() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User13,"test case pass");
	}
	public void User_14() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user14");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_14,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User14() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User14,"test case pass");
	}
	public void User_15() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user15");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_15,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User15() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User15,"test case pass");
	}
	public void User_16() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user16");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_16,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User16() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User16,"test case pass");
	}
	public void User_17() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","user17");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.User_17,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User17() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("sendingmsgsdetails","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_SendMsgs.Validate_User17,"test case pass");
	}
	public void TRoop_Login(String email, String password) throws Exception {
		this.Set_Email(email);
		this.Set_Password(password);
	}
	public void Sending(String msg, String password) throws Exception {
		this.Enter_Text(msg);
	}
}
