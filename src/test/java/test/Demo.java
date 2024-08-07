package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	@Test
	public void login () {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
	WebElement name=	driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
	name.sendKeys("standard_user");
	
	WebElement pass=	driver.findElement(By.xpath("//input[@id=\"password\"]"));
	pass.sendKeys("secret_sauce");
	
	WebElement log=	driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
	log.click();
		
	}

}
