$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Work/Automation/Eclipse/Test_ArtifactID/src/main/java/Features/Deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deals Data Creation",
  "description": "",
  "id": "deals-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM New Deals Scenario",
  "description": "",
  "id": "deals-data-creation;free-crm-new-deals-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is in new Deals login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enters Username and Password",
  "rows": [
    {
      "cells": [
        "srikanth04@gmail.com",
        "India123$"
      ],
      "line": 5
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters deal details",
  "rows": [
    {
      "cells": [
        "Test deal",
        "1000",
        "50",
        "10"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefinition.User_is_in_New_Deals_Login_Page()"
});
formatter.result({
  "duration": 11768443999,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.User_enters_Username_and_Password(DataTable)"
});
formatter.result({
  "duration": 266128361,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.User_click_on_Login_Button()"
});
formatter.result({
  "duration": 68105204,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefinition.User_enters_deal_Details(DataTable)"
});
formatter.result({
  "duration": 2364074859,
  "status": "passed"
});
});