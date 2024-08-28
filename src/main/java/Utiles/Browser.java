package Utiles;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser
{
	static WebDriver driver;
	static WebDriverWait driverwait;
	public static WebDriver Launching_Browser(String browsername,String drivername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
	}
	// till here it is to open in different browsers	
	public static WebDriver Open_Url(String Url) 
	{
		driver.get(Url);
		return driver;
	}
	//this is to get url in our selected browser
	public static WebDriver close()
	{
		driver.close();
		return driver;
	}
	// this is to close the browser 
	public static void Take_Screen_Shot(String ImageName) throws WebDriverException, Exception
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		FileUtils.copyFile(screenshot.getScreenshotAs(OutputType.FILE),new File(".//screenshot//"+ImageName+".Png"));
	}
	// taking screensht 	
	public static void Wait_Method(WebElement ele)
	{
		driverwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driverwait.until(ExpectedConditions.visibilityOf(ele));
		driverwait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}