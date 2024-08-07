package helper;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {

	public static WebDriver driver;
	public static Properties prop;
	
	static {
		
		try {
			FileInputStream file = new FileInputStream("TestData/UserData.properties");
		  prop = new Properties();
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		public void movetoelement(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();	
			
		}
		
		public void selectbyindex(WebElement ele, int value) {
			Select s = new Select(ele);
			s.selectByIndex(value);
		}
		
		public void waitforexpectedelemets(WebElement ele) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
		
		public void waitforElementsclickable(WebElement ele) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
		}
		
		public void getscreenshot() {
			TakesScreenshot sc = (TakesScreenshot)driver;
	  File srcfile =  sc.getScreenshotAs(OutputType.FILE);
	  
	  try {
		FileUtils.copyFile(srcfile, new File( "Screenshot/" +System.currentTimeMillis()+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		}
		
		
		
	}
	
	
	
	
	
	
