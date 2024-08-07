package stepDefination;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginPageSteps {
	
	LoginPage login = new LoginPage();




@When("user enter correct username and password")
public void user_enter_correct_username_and_password() {
//	login.user_enter_correct_username_and_password();
    
}

@And("user click on login button")
public void user_click_on_login_button() {
	login.user_click_on_login_button();
    
}

@Then("user navigate to home page")
public void user_navigate_to_home_page() {
assertTrue(login.user_navigate_to_home_page());
    
}



@When("user enter correct {string} and {string}")
public void user_enter_correct_and(String username, String password) {
	login.user_enter_correct_username_and_password(username,password);
	
    
}







	}


