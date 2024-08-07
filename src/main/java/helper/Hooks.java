package helper;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {
	
	@Before
	public void setup() {
		
		String browsername = prop.getProperty("browser");
	if (browsername.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		 driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		
		
		
	}else if (browsername.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		 driver= new FirefoxDriver(option);
		driver.manage().window().maximize();
		
		
	} else if (browsername.equals("Edge")) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		 driver= new EdgeDriver(option);
		driver.manage().window().maximize();
		
		
	}
	
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	
	@After
	public void teardown(Scenario s) {
	if (s.isFailed()) {
		getscreenshot();
		
	}
	
	driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
