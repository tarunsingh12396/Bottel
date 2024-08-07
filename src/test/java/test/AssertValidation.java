package test;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertValidation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("");
		
	WebElement ab=	driver.findElement(By.xpath(""));
	ab.click();
	assertTrue(false);
	}

}
