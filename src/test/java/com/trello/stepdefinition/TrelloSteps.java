package com.trello.stepdefinition;

import com.trello.pages.*;
import com.trello.utils.ConstantsTestData;
import cucumber.api.java.en.And;
import org.junit.Assert;

import com.trello.utils.ConfigUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrelloSteps {
    LoginPage loginPage = new LoginPage();
    CreateBoardPage createBoardPage = new CreateBoardPage();

    @Given("^Launch browser with url \"([^\"]*)\"$")
    public void launchBrowser(String url) throws Throwable {
        loginPage.launchApplication(ConfigUtil.getProperty(url));
    }

    @When("^User log in with UserName \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void logIn(String userName, String password) throws Throwable {
        loginPage.login(ConfigUtil.getProperty(userName), ConfigUtil.getProperty(password));
        Assert.assertTrue("Boards", loginPage.verifyUserIsLoggedIn());
    }

    @Then("^close the browser$")
    public void terminateBrowser() throws Throwable {
        loginPage.cleanUP();
    }

    @And("^Logout the user$")
    public void logoutUser() throws Throwable {
        loginPage.logout();
        Assert.assertTrue("Thanks for using Trello.", loginPage.logout_confirmation());
    }

    @Then("^User info should be displayed correctly$")
    public void verifyUserInfo() throws Throwable {
        Assert.assertTrue(loginPage.userInfo());
    }


    @And("^I click on Create Board$")
    public void iClickOnCreateBoard() {
        createBoardPage.clickOnCreateBoard();
    }

    @And("^I enter board name$")
    public void iEnterBoardName() {
        createBoardPage.enterBoardName(ConstantsTestData.boardName);
    }

    @When("^I click on Create Board button$")
    public void iClickOnCreateBoardButton() {
        createBoardPage.clickCreateButton();
    }

    @Then("^I should be navigated to newly created board$")
    public void iShouldBeNavigatedToNewlyCreatedBoard() {
        createBoardPage.verifyBoardName();
    }


    @And("^I create list$")
    public void iCreateList() {
        createBoardPage.createList();
    }

/*    @Then("^I verify user Info$")
    public void iChangeBoardDescription() {
        String userInfo = createBoardPage.getUserInfo();

    }*/

    @And("^I change background color$")
    public void iChangeBackgroundColor() {
        createBoardPage.changeBGColor();
    }
}
