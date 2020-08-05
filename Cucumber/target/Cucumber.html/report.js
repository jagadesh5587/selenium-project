$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature.feature");
formatter.feature({
  "line": 1,
  "name": "verify login page",
  "description": "",
  "id": "verify-login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "login",
  "description": "",
  "id": "verify-login-page;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user verify the homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "verify-login-page;login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "verify-login-page;login;;1"
    },
    {
      "cells": [
        "sid",
        "5646"
      ],
      "line": 13,
      "id": "verify-login-page;login;;2"
    },
    {
      "cells": [
        "here",
        "5578"
      ],
      "line": 14,
      "id": "verify-login-page;login;;3"
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
  "name": "user launch the browser and amazon application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_the_browser_and_amazon_application()"
});
formatter.result({
  "duration": 227071586,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "login",
  "description": "",
  "id": "verify-login-page;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user enter \"sid\" and \"5646\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user verify the homepage",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "sid",
      "offset": 12
    },
    {
      "val": "5646",
      "offset": 22
    }
  ],
  "location": "Steps.user_enter_and(String,String)"
});
formatter.result({
  "duration": 8579894,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_the_login_button()"
});
formatter.result({
  "duration": 606221,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_verify_the_homepage()"
});
formatter.result({
  "duration": 185190,
  "status": "passed"
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
  "name": "user launch the browser and amazon application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_the_browser_and_amazon_application()"
});
formatter.result({
  "duration": 141425,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "login",
  "description": "",
  "id": "verify-login-page;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user enter \"here\" and \"5578\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user verify the homepage",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "here",
      "offset": 12
    },
    {
      "val": "5578",
      "offset": 23
    }
  ],
  "location": "Steps.user_enter_and(String,String)"
});
formatter.result({
  "duration": 711175,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_the_login_button()"
});
formatter.result({
  "duration": 150745,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_verify_the_homepage()"
});
formatter.result({
  "duration": 185190,
  "status": "passed"
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
  "name": "user launch the browser and amazon application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_launch_the_browser_and_amazon_application()"
});
formatter.result({
  "duration": 139399,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "verify the forgot password",
  "description": "",
  "id": "verify-login-page;verify-the-forgot-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "user enter password",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user clicks forgot password",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user reset password",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_enter_password()"
});
formatter.result({
  "duration": 173843,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_forgot_password()"
});
formatter.result({
  "duration": 162902,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_reset_password()"
});
formatter.result({
  "duration": 518692,
  "status": "passed"
});
});