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
import Validation.Validation_Rightclick;

public class Rightclickonmsgs {
	private WebDriver driver;
	Actions action;
	Alert alert;
	Robot rb;
	public Rightclickonmsgs(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Click_On_Login_Link() throws Exception
	{
		String Loginlinkl=PropertyReader.Get_Locator("rightclickmsg","loginlinkL");
		By LoginlinkL=By.xpath(Loginlinkl);
		WebElement ele1=driver.findElement(LoginlinkL);
		ele1.click();
		//Browser.Take_Screen_Shot("image002");
	}
	private void Set_Email(String email) throws Exception
	{
		String emailtext=PropertyReader.Get_Locator("rightclickmsg","emailTextl");
		By emailtextbox=By.xpath(emailtext);
		WebElement ele2=driver.findElement(emailtextbox);
		//Browser.Wait_Method(ele2);
		ele2.sendKeys(email);
	}
	private void Set_Password(String Password) throws Exception
	{
		String password=PropertyReader.Get_Locator("rightclickmsg","passwordl");
		By passwordtext=By.xpath(password);
		WebElement ele3=driver.findElement(passwordtext);
		//Browsers.Wait_Method(ele3);
		ele3.sendKeys(Password);
	}
	public void Click_On_Login_Btn() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","loginbtnl");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.click();
		System.out.println("Successfully logined");
	}
	public void Validate_Login() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","addbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Valid_Login,"test case pass");
	}
	public void Click_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User,"test case pass");
	}
	public void Click_On_Message_Input() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","entering-text");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Message_Text,"test case pass");
	}
	public void Enter_Text(String msg) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","entering-text");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(msg);
	}
	public void Validate_Entered_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Message_Text,"test case pass");
	}
	public void Validate_Entered_Text1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Message_Text1,"test case pass");
	}
	public void Click_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","sendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Sended_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Message_Text,"test case pass");
	}
	public void Validate_Sended_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Sended_Msg1,"test case pass");
	}
	public void Click_Attachment_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","attachmentbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Attachment_Button,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendattachment");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Send_Image,"test case pass");
	}
	public void Close_Image() throws Exception {
		Validate_Send_Image();
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Close_Image,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Image() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Closed_Image,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendedattachment");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Sended_Attachment,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Send_Video,"test case pass");
	}
	public void Close_Video() throws Exception {
		Validate_Send_Video();
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Close_Video,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Video() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Closed_Video,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendedvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Sended_Video,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesenddoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Send_Doc_Name,"test case pass");
	}
	public void Close_Doc() throws Exception {
		Validate_Send_Doc_Name();
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Close_Doc,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Doc() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Closed_Doc,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendeddoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Sended_Doc,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Send_Audio_Name,"test case pass");
	}
	public void Close_Audio() throws Exception {
		Validate_Send_Audio_Name();
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","closebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Close_Audio,"test case pass");
		ele4.click();
	}
	public void Validate_Closed_Audio() throws Exception {
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validateclosed");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Closed_Audio,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendedaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Sended_Audio,"test case pass");
	}
	public void Validate_Sended_Audio1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendedaudio1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Sended_Audio1,"test case pass");
	}
	public void Enter_link(String link) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","entering-text");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(link);
	}
	public void Validate_Entered_link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Entered_link,"test case pass");
	}
	public void Validate_Sended_link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateenteredlink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Sended_link,"test case pass");
	}
	public void Click_Voice_msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","clickvoicemsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_Voice_Msg,"test case pass");
		ele4.click();
	}
	public void Pause_Voice_msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateenteredtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Entered_link,"test case pass");
	}
	public void Pause_Play_Voice_msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateenteredlink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Sended_link,"test case pass");
	}
	public void Click_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","clickcodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("title");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_Code_Snippet,"test case pass");
		ele4.click();
	}
	public void Click_Code_Snippet_Active() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatecodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_Code_Snippet_Active,"test case pass");
	}
	public void Validate_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendedcodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Code_Snippet,"test case pass");
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
	public void Right_Click_On_Reply() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","reply");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Right_Click_On_Reply,"test case pass");
		ele4.click();
	}
	public void Validate_Reply() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Reply,"test case pass");
	}
	public void Validate_Reply7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Reply7,"test case pass");
	}
	public void Validate_Reply1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Reply1,"test case pass");
	}
	public void Validate_Reply2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Reply2,"test case pass");
	}
	public void Validate_Reply3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Reply3,"test case pass");
	}
	public void Validate_Reply4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Reply4,"test case pass");
	}
	public void Validate_Reply5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Reply5,"test case pass");
	}
	public void Validate_Reply6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","replymsgwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Reply6,"test case pass");
	}
	public void Validate_Replied_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","repliedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Msg,"test case pass");
	}
	public void Validate_Replied_Msg2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","repliedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Msg2,"test case pass");
	}
	public void Validate_Replied_Image1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","repliedimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Image1,"test case pass");
	}
	public void Validate_Replied_Video1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","repliedimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Video1,"test case pass");
	}
	public void Validate_Replied_Doc1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","repliedimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Doc1,"test case pass");
	}
	public void Validate_Replied_Audio1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","repliedimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Audio1,"test case pass");
	}
	public void Validate_Replied_Link1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","repliedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Link1,"test case pass");
	}
	public void Validate_Replied_Code_Snippet1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","repliedcode");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Code_Snippet1,"test case pass");
	}
	public void Validate_Replied_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validaterepliedmsg1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Msg1,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Image,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickvideo1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Video,"test case pass");
	}
	public void Validate_Replied_Video2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickvideo2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Video,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickdoc1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Doc,"test case pass");
	}
	public void Validate_Replied_Doc2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickdoc2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Doc,"test case pass");
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
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickaudio1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Audio,"test case pass");
	}
	public void Validate_Replied_Audio2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickaudio2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Audio,"test case pass");
	}
	public void Validate_Replied_Link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclicklink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Link,"test case pass");
	}
	public void Validate_Replied_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","replycodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Replied_Code_Snippet,"test case pass");
	}
	public void Right_Click_On_Image() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		action=new Actions(driver);
		action.contextClick(ele4).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Right_Click_On_Video() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		action=new Actions(driver);
		action.contextClick(ele4).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Right_Click_On_Doc() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickdoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		action=new Actions(driver);
		action.contextClick(ele4).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Right_Click_On_Audio() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		action=new Actions(driver);
		action.contextClick(ele4).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Right_Click_On_Link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclicklink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		action=new Actions(driver);
		action.contextClick(ele4).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Right_Click_On_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","rightclickcodesnippet");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		action=new Actions(driver);
		action.contextClick(ele4).build().perform();
		//Browsers.Wait_Method(ele4);
	}
	public void Validate_Right_Click() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validaterightclick");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Right_Click,"test case pass");
	}
	public void Validate_Right_Click1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validaterightclick");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Right_Click1,"test case pass");
	}
	public void Validate_Right_Click2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validaterightclick");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Right_Click2,"test case pass");
	}
	public void Validate_Right_Click3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validaterightclick");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Right_Click3,"test case pass");
	}
	public void User_1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_1,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User1,"test case pass");
	}
	public void User_2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user2");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_2,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User2,"test case pass");
	}
	public void User_3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user3");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_3,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User3() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User3,"test case pass");
	}
	public void User_4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user4");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_4,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User4() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User4,"test case pass");
	}
	public void User_5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user5");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_5,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User5() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User5,"test case pass");
	}
	public void User_6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user6");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_6,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User6() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User6,"test case pass");
	}
	public void User_7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user7");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_7,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User7() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User7,"test case pass");
	}
	public void User_8() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user8");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_8,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User8() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User8,"test case pass");
	}
	public void User_9() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user9");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_9,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User9() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User9,"test case pass");
	}
	public void User_10() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user10");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_10,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User10() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User10,"test case pass");
	}
	public void User_11() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user11");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_11,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User11() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User11,"test case pass");
	}
	public void User_12() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user12");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_12,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User12() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User12,"test case pass");
	}
	public void User_13() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","user13");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.User_13,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_User13() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_User13,"test case pass");
	}
	public void Click_On_Forward() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forward");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Forward,"test case pass");
		ele4.click();
	}
	public void Validate_Forward() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Forward,"test case pass");
	}
	public void Forward_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardsendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Forward_Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Forward_Send() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Forward_Send,"test case pass");
	}
	public void Forward_Cancel_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardcancelbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Forward_Cancel_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Forward_Cancel() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardcancel");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Forward_Cancel,"test case pass");
	}
	public void Forward_Search_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Forward_Search_Button,"test case pass");
		ele4.click();
	}
	public void Enter_Forward_Search_User(String search) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		ele4.sendKeys(search);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Enter_Text,"test case pass");
	}
	public void Forward_Search_Clear_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardsearchclear");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Forward_Search_Clear_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Search_Clear_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardsearchclearhidden");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Search_Clear_Button,"test case pass");
	}
	public void Forward_Invlalid_Search() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardinvalidsearch");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Forward_Invlalid_Search,"test case pass");
	}
	public void Forward_Select_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwarduser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Forward_Select_User,"test case pass");
		ele4.click();
	}
	public void Validate_Selected_User() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","username");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("data-username");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Selected_User,"test case pass");
	}
	public void Forward_Select_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardgroup");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Forward_Select_Group,"test case pass");
		ele4.click();
	}
	public void Validate_Selected_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","groupname");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("data-username");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Selected_Group,"test case pass");
	}
	public void Validate_Selected_Members() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardselectedusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Selected_Members,"test case pass");
	}
	public void Validate_Selected_Members1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardselectedusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Selected_Members1,"test case pass");
	}
	public void Validate_Selected_Members2() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardselectedusers");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Selected_Members2,"test case pass");
	}
	public void Forward_Reset_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardresetbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Forward_Reset_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Reset_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validateresetbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Reset_Button,"test case pass");
	}
	public void Click_On_Forward_Marker() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardmarker");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Forward_Marker,"test case pass");
		ele4.click();
	}
	public void Click_On_Close_Button_To_Forward() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardclosebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Close_Button_To_Forward,"test case pass");
		ele4.click();
	}
	public void Forward_Send_Button1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardsendbutton1");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Forward_Send_Button1,"test case pass");
		ele4.click();
	}
	public void Forward_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","forwardicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Forward_Icon,"test case pass");
	}
	public void Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","group");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Group,"test case pass");
		ele4.click();
	}
	public void Validate_Clicked_Group() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","Validateuser");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Group,"test case pass");
	}
	public void Click_On_Copy() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","copy");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Copy,"test case pass");
		ele4.click();
	}
	public void Validate_Copy() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","copywrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Copy,"test case pass");
	}
	public void Copy_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","copysendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Copy_Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Copy_Send() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","copytoast");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Copy_Send,"test case pass");
	}
	public void Copy_Cancel_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","copycancelbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Copy_Cancel_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Copy_Cancel() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","copycancel");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Copy_Cancel,"test case pass");
	}
	public void Validate_Copy_Toast() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","copytoast");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Copy_Toast,"test case pass");
	}
	public void Double_Click_Copy() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatesendedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		action=new Actions(driver);
		action.doubleClick(ele4).perform();
	}
	public void Validate_Copy_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","doubleclick");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Copy_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Copy_Toast1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","copytoast");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Copy_Toast1,"test case pass");
	}
	public void Click_On_Edit() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","edit");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Edit,"test case pass");
		ele4.click();
	}
	public void Validate_Edit() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Edit,"test case pass");
	}
	public void Edit_Close_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editclose");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Edit_Close_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Edit_Close() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editclosebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Edit_Close,"test case pass");
	}
	public void Validate_Edited_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Edited_Msg,"test case pass");
	}
	public void Validate_Edited_Image() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editedimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Edited_Image,"test case pass");
	}
	public void Validate_Edited_Video() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editedvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Edited_Video,"test case pass");
	}
	public void Validate_Edited_Doc() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editeddoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Edited_Doc,"test case pass");
	}
	public void Validate_Edited_Audio() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editedaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Edited_Audio,"test case pass");
	}
	public void Validate_Edited_link() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editedlink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Edited_link,"test case pass");
	}
	public void Validate_Edited_Code_Snippet() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editedcode");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Edited_Code_Snippet,"test case pass");
	}
	public void Enter_Text1(String msg) throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editedcode");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		//Browsers.Wait_Method(ele4);
		ele4.sendKeys(msg);
	}
	public void Validate_Edit_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","editicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Edit_Icon,"test case pass");
	}
	public void Code_Snippet_Submit_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","codesubmit");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Code_Snippet_Submit_Button,"test case pass");
		ele4.click();
	}
	public void Click_On_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","info");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Info,"test case pass");
		ele4.click();
	}
	public void Validate_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Info,"test case pass");
	}
	public void Validate_Msg_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Msg_Info,"test case pass");
	}
	public void Validate_Msg_Info_Other() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Msg_Info_Other,"test case pass");
	}
	public void Validate_Image_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Image_Info,"test case pass");
	}
	public void Validate_Video_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Video_Info,"test case pass");
	}
	public void Validate_Doc_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Doc_Info,"test case pass");
	}
	public void Validate_Audio_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Audio_Info,"test case pass");
	}
	public void Validate_Link_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Link_Info,"test case pass");
	}
	public void Validate_Code_Snippet_Info() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infowrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Code_Snippet_Info,"test case pass");
	}
	public void Info_Close_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infoclose");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Info_Close_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Info_Close() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","infoclosebutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Info_Close,"test case pass");
	}
	public void Click_On_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","delete");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Delete,"test case pass");
		ele4.click();
	}
	public void Validate_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deletewrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Delete,"test case pass");
	}
	public void Click_On_Delete_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deletesendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Delete_Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Delete_Confirmation_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deleteconfirmationtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Delete_Confirmation_Text,"test case pass");
	}
	public void Click_On_Delete_Cancel_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deletecancelbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Delete_Cancel_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Cancel() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deletecancel");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Cancel,"test case pass");
	}
	public void Click_On_Delete_Yes_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deleteyesbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Delete_Yes_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Deleted_Yes_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatedeletedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Deleted_Yes_Msg,"test case pass");
	}
	public void Validate_Deleted_Yes_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatedeletedmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Deleted_Yes_Msg1,"test case pass");
	}
	public void Click_On_Delete_No_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deletenobutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Delete_No_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Deleted_No_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validatedeleteno");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Deleted_No_Msg,"test case pass");
	}
	public void Click_On_Delete_Close_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deleteclose");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Delete_Close_Button,"test case pass");
		ele4.click();
	}
	public void Select_Image_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deleteimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Image_Delete,"test case pass");
		ele4.click();
	}
	public void Select_Video_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deletevideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Video_Delete,"test case pass");
		ele4.click();
	}
	public void Select_Doc_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deletedoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Doc_Delete,"test case pass");
		ele4.click();
	}
	public void Select_Audio_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deleteaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Audio_Delete,"test case pass");
		ele4.click();
	}
	public void Select_Link_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deletelink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Link_Delete,"test case pass");
		ele4.click();
	}
	public void Select_Code_Snippet_Delete() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","deletecode");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Code_Snippet_Delete,"test case pass");
		ele4.click();
	}
	public void Click_On_Flag() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","flag");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Flag,"test case pass");
		ele4.click();
	}
	public void Validate_Flag_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","flagicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Flag_Icon,"test case pass");
	}
	public void Click_On_UnFlag() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","flag");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_UnFlag,"test case pass");
		ele4.click();
	}
	public void Validate_UnFlag_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","flagicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("data-flag");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_UnFlag_Icon,"test case pass");
	}
	public void Click_On_Pin() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","pin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Pin,"test case pass");
		ele4.click();
	}
	public void Validate_Pin_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","pinicon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Pin_Icon,"test case pass");
	}
	public void Click_On_UnPin() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","pin");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_UnPin,"test case pass");
		ele4.click();
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
	public void Validate_Respond_Later_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","respondlatericon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Respond_Later_Icon,"test case pass");
	}
	public void Click_On_Clear() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","respondlater");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Clear,"test case pass");
		ele4.click();
	}
	public void Validate_Clear_Icon() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","respondlatericon");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("data-status");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Clear_Icon,"test case pass");
	}
	public void Click_On_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recall");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Recall,"test case pass");
		ele4.click();
	}
	public void Validate_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallwrapper");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Recall,"test case pass");
	}
	public void Click_On_Recall_Send_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallsendbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Recall_Send_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Recall_Confirmation_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallconfirmationtext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Recall_Confirmation_Text,"test case pass");
	}
	public void Click_On_Recall_Cancel_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallcancelbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Recall_Cancel_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Cancel_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallcancel");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Cancel_Recall,"test case pass");
	}
	public void Click_On_Recall_Yes_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallyesbutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Recall_Yes_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Recalled_Yes_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validaterecalledmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Recalled_Yes_Msg,"test case pass");
	}
	public void Validate_Recalled_Yes_Msg1() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validaterecalledmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Recalled_Yes_Msg1,"test case pass");
	}
	public void Click_On_Recall_No_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallnobutton");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Recall_No_Button,"test case pass");
		ele4.click();
	}
	public void Validate_Recalled_No_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validaterecallno");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("class");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Recalled_No_Msg,"test case pass");
	}
	public void Click_On_Recall_Close_Button() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallclose");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("id");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Click_On_Recall_Close_Button,"test case pass");
		ele4.click();
	}
	public void Recalled_Text() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recalltext");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Recalled_Text,"test case pass");
	}
	public void Select_Image_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallimage");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Image_Recall,"test case pass");
		ele4.click();
	}
	public void Select_Video_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallvideo");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Video_Recall,"test case pass");
		ele4.click();
	}
	public void Select_Doc_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recalldoc");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Doc_Recall,"test case pass");
		ele4.click();
	}
	public void Select_Audio_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallaudio");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Audio_Recall,"test case pass");
		ele4.click();
	}
	public void Select_Link_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recalllink");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Link_Recall,"test case pass");
		ele4.click();
	}
	public void Select_Code_Snippet_Recall() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","recallcode");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getAttribute("for");
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Select_Code_Snippet_Recall,"test case pass");
		ele4.click();
	}
	public void Validate_Recall_For_Previous_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validaterecalledmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Recall_For_Previous_Msg,"test case pass");
	}
	public void Validate_Recall_For_Other_User_Msg() throws Exception
	{
		String Loginbtn=PropertyReader.Get_Locator("rightclickmsg","validaterecalledmsg");
		By loginbtnl=By.xpath(Loginbtn);
		WebElement ele4=driver.findElement(loginbtnl);
		String actualText=ele4.getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText,Validation_Rightclick.Validate_Recall_For_Other_User_Msg,"test case pass");
	}
	public void TRoop_Login(String Email, String Password) throws Exception 
	{
		this.Set_Email(Email);
	     this.Set_Password(Password);
	}
}
