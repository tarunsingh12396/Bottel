package test;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("remote-allow-origins=*");
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
	String parentid=	driver.getWindowHandle();
	System.out.println(parentid);
		
	WebElement win=	driver.findElement(By.xpath("//button[@id=\"newWindowsBtn\"]"));
		win.click();
		
	Set<String>childid=	driver.getWindowHandles();
	
	for (String s : childid) {

		
		
		
		if (!parentid.equals(s)) {
			
			driver.switchTo().window(s);
			
		String title=	driver.getTitle();
		
		if (title.contains("XPath Practice ")) {
			
	WebElement news=driver.findElement(By.xpath("//input[@name=\"name\"][2]"));
	news.sendKeys("dgsg");
	
//	Alert alert=driver.switchTo().alert();
//	alert.accept();
	break;
			
		}
			
			
			
			
		}
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		

	}

}
