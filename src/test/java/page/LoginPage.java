package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import helper.Base;

public class LoginPage extends Base {

	public void user_enter_correct_username_and_password(String uname, String pass) {
		WebElement AB = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		AB.sendKeys(uname);
		WebElement hn = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		hn.sendKeys(pass);

	}

	public void user_click_on_login_button() {
		WebElement pc = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		pc.click();
	}

	public boolean user_navigate_to_home_page() {
		return driver.findElement(By.xpath("//div[@class=\"product_label\"]")).isDisplayed();

	}

}
