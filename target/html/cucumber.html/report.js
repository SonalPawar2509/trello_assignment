$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/trello.feature");
formatter.feature({
  "line": 1,
  "name": "trello website",
  "description": "I want to use this feature to verify add/Edit board functionality",
  "id": "trello-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 69220901,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Log in",
  "description": "",
  "id": "trello-website;log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch browser with url \"trello.url\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User log in with UserName \"user.email\" and password \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User info should be displayed correctly",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Logout the user",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "trello.url",
      "offset": 25
    }
  ],
  "location": "TrelloSteps.launchBrowser(String)"
});
formatter.result({
  "duration": 5793816301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user.email",
      "offset": 27
    },
    {
      "val": "password",
      "offset": 53
    }
  ],
  "location": "TrelloSteps.logIn(String,String)"
});
formatter.result({
  "duration": 4033784600,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.verifyUserInfo()"
});
formatter.result({
  "duration": 84057200,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.logoutUser()"
});
formatter.result({
  "duration": 945232301,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.terminateBrowser()"
});
formatter.result({
  "duration": 74059199,
  "status": "passed"
});
formatter.after({
  "duration": 404500,
  "status": "passed"
});
formatter.before({
  "duration": 372800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify create board functionality",
  "description": "",
  "id": "trello-website;verify-create-board-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Launch browser with url \"trello.url\"",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User log in with UserName \"user.email\" and password \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User info should be displayed correctly",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I click on Create Board",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter board name",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on Create Board button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should be navigated to newly created board",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I create list",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I change background color",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#Then I verify user Info"
    }
  ],
  "line": 25,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "trello.url",
      "offset": 25
    }
  ],
  "location": "TrelloSteps.launchBrowser(String)"
});
formatter.result({
  "duration": 4757558700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user.email",
      "offset": 27
    },
    {
      "val": "password",
      "offset": 53
    }
  ],
  "location": "TrelloSteps.logIn(String,String)"
});
formatter.result({
  "duration": 3989660401,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.verifyUserInfo()"
});
formatter.result({
  "duration": 62184801,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.iClickOnCreateBoard()"
});
formatter.result({
  "duration": 103318300,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.iEnterBoardName()"
});
formatter.result({
  "duration": 174642999,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.iClickOnCreateBoardButton()"
});
formatter.result({
  "duration": 1709647600,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.iShouldBeNavigatedToNewlyCreatedBoard()"
});
formatter.result({
  "duration": 62332200,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.iCreateList()"
});
formatter.result({
  "duration": 755781801,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.iChangeBackgroundColor()"
});
formatter.result({
  "duration": 822750301,
  "status": "passed"
});
formatter.match({
  "location": "TrelloSteps.terminateBrowser()"
});
formatter.result({
  "duration": 2075430099,
  "status": "passed"
});
formatter.after({
  "duration": 1109300,
  "status": "passed"
});
});