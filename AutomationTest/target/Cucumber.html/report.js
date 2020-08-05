$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AutomationFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Login and Purchase in AutomationProcess App",
  "description": "",
  "id": "login-and-purchase-in-automationprocess-app",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Login",
  "description": "",
  "id": "login-and-purchase-in-automationprocess-app;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user click the sign-in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click the sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "enter search item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "login-and-purchase-in-automationprocess-app;login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15,
      "id": "login-and-purchase-in-automationprocess-app;login;;1"
    },
    {
      "cells": [
        "sudha.cluster@gmail.com",
        "Sidhere24$$"
      ],
      "line": 16,
      "id": "login-and-purchase-in-automationprocess-app;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launch the AutomationPractice Application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_launch_the_automation_practice_application()"
});
formatter.result({
  "duration": 14033050808,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login",
  "description": "",
  "id": "login-and-purchase-in-automationprocess-app;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user click the sign-in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter \"sudha.cluster@gmail.com\" and \"Sidhere24$$\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click the sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "enter search item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_click_the_sign_in()"
});
formatter.result({
  "duration": 87896405,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sudha.cluster@gmail.com",
      "offset": 12
    },
    {
      "val": "Sidhere24$$",
      "offset": 42
    }
  ],
  "location": "LoginSteps.user_enter_and(String,String)"
});
formatter.result({
  "duration": 6624263,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_the_sign_in_button()"
});
formatter.result({
  "duration": 501672,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_search_item()"
});
formatter.result({
  "duration": 957554,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_submit_button()"
});
formatter.result({
  "duration": 380104,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.close_the_browser()"
});
formatter.result({
  "duration": 38902,
  "status": "passed"
});
});