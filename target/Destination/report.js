$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login panel",
  "description": "",
  "id": "login-panel",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12206990600,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "user is on login page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 4,
  "name": "User should login successfully with valid credentials",
  "description": "",
  "id": "login-panel;user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User enters valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user has login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.user_enters_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 2257666400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.user_click_on_login_button()"
});
formatter.result({
  "duration": 2949724000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userHasLoginSuccessfully()"
});
formatter.result({
  "duration": 4531876500,
  "status": "passed"
});
formatter.after({
  "duration": 2329700,
  "status": "passed"
});
});