package com.trello.pages;

import java.net.URISyntaxException;

import org.openqa.selenium.By;

public class LoginPage extends PageBase {

	By logIn_button = By.xpath("//a[text()='Log In']");

	By loginEmail_input = By.xpath("//input[@id='user']");

	By password_input = By.xpath("//input[@id='password']");

	By login_button2 = By.xpath("//input[@id='login']");

	By title_text = By.xpath("//span[text()='Boards']");

	By username_text = By.xpath("//span[text()='SP']");

	By logout_button = By.xpath("//button[@data-test-id='header-member-menu-logout']");

	By logout_confirmation = By.xpath("//h1[text()='Thanks for using Trello.']");





	///////////////////// Consolidate Methods/////////////////////

	public void launchApplication(String url) {
		getWebDriver().get(url);
	}

	public void login(String userName, String password) {
		click(logIn_button);
		enter(loginEmail_input, userName);
		enter(password_input, password);
		click(login_button2);
		waitTillElementVisible(title_text);

	}
	public boolean verifyUserIsLoggedIn(){
		waitTillElementVisible(title_text);
		return isDisplayed(title_text);
	}

	public boolean userInfo()
	{
		waitTillElementVisible(title_text);

		return isDisplayed(title_text);
	}

	public void logout() {
		waitTillElementVisible(username_text);
		click(username_text);
		waitTillElementVisible(logout_button);
		click(logout_button);

	}

	public boolean logout_confirmation(){

		waitTillElementVisible(logout_confirmation);
		return isDisplayed(logout_confirmation);

	}
	public String getCurrentURL() throws URISyntaxException {
		return new java.net.URI(getWebDriver().getCurrentUrl()).getPath();
	}
}
