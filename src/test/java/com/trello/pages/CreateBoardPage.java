package com.trello.pages;

import com.trello.utils.ConstantsTestData;
import org.openqa.selenium.By;

public class CreateBoardPage extends PageBase {

    By create_board_link = By.xpath("//span[contains(text(), 'Create new board')]");

    By boardNameTxt = By.xpath("//input[@placeholder='Add board title']");

    By createBoard_button = By.xpath("//span[contains(text(), 'Create Board')]");

    By actualBoard_name = By.xpath("//span[@class='js-board-editing-target board-header-btn-text']");

    By listTitle_txtbox = By.xpath("//input[@name='name']");

    By addList_button = By.xpath("//input[@value='Add List']");

    By greenAddCard_button = By.xpath("//input[@value='Add Card']");

    By greyAddCard_button = By.xpath("//span[text()='Add a card']");

    By cardTitle_txtbox = By.xpath("//textarea[@placeholder='Enter a title for this card…']");

    By aboutBoard_option = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[2]/div/ul[1]/li[1]/a");

    By userName_txt = By.xpath("//p[text()='@sonalpawar']");

    By changeColor_link = By.xpath("//a[@class='board-menu-navigation-item-link js-change-background']");

    By colors_link = By.xpath("//div[text()='Colors']");

    By selectColor = By.xpath("//div[@class='board-menu-content-frame']/div/div[5]");

    By goBack_button = By.xpath("//a[@title='Go back.']");


    public void createBoard(String url) {
        waitTillElementVisible(create_board_link);
        click(create_board_link);
        enter(create_board_link, "ABCSADSAKDSAK1123");
    }

    public void clickOnCreateBoard() {
        click(create_board_link);
    }

    public void enterBoardName(String boardName) {
        enter(boardNameTxt, boardName);
    }

    public void clickCreateButton() {
        click(createBoard_button);
        waitTillElementVisible(actualBoard_name);    }

    public String verifyBoardName() {
        waitTillElementVisible(actualBoard_name);
        String actualBoardName = getText(actualBoard_name);

        return actualBoardName; }

    public void createList() {
        waitTillElementVisible(actualBoard_name);

        for (int i = 0; i < ConstantsTestData.listNameArray.length; i++) {
            enter(listTitle_txtbox, ConstantsTestData.listNameArray[i]);
            click(addList_button);

            waitTillElementVisible(addList_button);
        }

    }

 /*   public void addCards()
    {
        waitTillElementVisible(greyAddCard_button);

        for(int i=0; i< ConstantsTestData.CardsNameArray.length; i++)
        {
            click(greyAddCard_button);
            enter(cardTitle_txtbox, ConstantsTestData.CardsNameArray[i]);
            click(greenAddCard_button);

            waitTillElementVisible(greyAddCard_button);
        }

    }*/

    public void changeBGColor() throws InterruptedException {
        waitTillElementVisible(changeColor_link);
        click(changeColor_link);
        waitTillElementVisible(colors_link);
        click(colors_link);
        click(selectColor);
        wait(3000);
    }

/*    public String getUserInfo() {
        waitTillElementVisible(aboutBoard_option);
        click(aboutBoard_option);
        return getText(userName_txt);
    }*/

}
