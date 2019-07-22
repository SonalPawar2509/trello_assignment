Feature: trello website
  I want to use this feature to verify add/Edit board functionality


  @smoke
  Scenario: Log in
    Given Launch browser with url "trello.url"
    When User log in with UserName "user.email" and password "password"
    Then User info should be displayed correctly
    And Logout the user
    Then close the browser

  @smoke
  Scenario: Verify create board functionality
    Given Launch browser with url "trello.url"
    When User log in with UserName "user.email" and password "password"
    Then User info should be displayed correctly
    And I click on Create Board
    And I enter board name
    When I click on Create Board button
    Then I should be navigated to newly created board
    And I create list
    And I change background color
    #Then I verify user Info
    Then close the browser



