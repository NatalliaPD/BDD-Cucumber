$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/NewAccount.feature");
formatter.feature({
  "line": 2,
  "name": "techfios Bank \u0026 Cash New Account functionality",
  "description": "",
  "id": "techfios-bank-\u0026-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddNewAccount"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "user should be able to open a new account",
  "description": "",
  "id": "techfios-bank-\u0026-cash-new-account-functionality;user-should-be-able-to-open-a-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user already logged in as \"demo@techfios.com\" and \"abc123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is able to see Dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user navigates to Bank and Cash",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on New Account",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user completes the form entering \"\u003caccountTitle\u003e\"and\"\u003cdescription\u003e\"and\"\u003cinitialBalance\u003e\"and\"\u003caccountNumber\u003e\"and\"\u003ccontactPerson\u003e\"and\"\u003cphone\u003e\"and\"\u003cInternetBankingUrl\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "created account should be posted",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "techfios-bank-\u0026-cash-new-account-functionality;user-should-be-able-to-open-a-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "intialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "InternetBankingUrl"
      ],
      "line": 15,
      "id": "techfios-bank-\u0026-cash-new-account-functionality;user-should-be-able-to-open-a-new-account;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Account receivable",
        "business",
        "",
        "1000000000",
        "",
        "987654321",
        "Natallia D",
        "18880002345",
        "http://www.nbanking.com/business"
      ],
      "line": 16,
      "id": "techfios-bank-\u0026-cash-new-account-functionality;user-should-be-able-to-open-a-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4311756100,
  "status": "passed"
});
formatter.before({
  "duration": 3697695000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "user should be able to open a new account",
  "description": "",
  "id": "techfios-bank-\u0026-cash-new-account-functionality;user-should-be-able-to-open-a-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AddNewAccount"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user already logged in as \"demo@techfios.com\" and \"abc123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is able to see Dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user navigates to Bank and Cash",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on New Account",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user completes the form entering \"Account receivable\"and\"business\"and\"\u003cinitialBalance\u003e\"and\"1000000000\"and\"\"and\"987654321\"and\"Natallia D\"",
  "matchedColumns": [
    2,
    3,
    5,
    6,
    7,
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "created account should be posted",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 27
    },
    {
      "val": "abc123",
      "offset": 51
    }
  ],
  "location": "StepImplementation.user_already_logged_in_as_something_and_something(String,String)"
});
formatter.result({
  "duration": 1600571300,
  "status": "passed"
});
formatter.match({
  "location": "StepImplementation.user_is_be_able_to_see_dashboard()"
});
formatter.result({
  "duration": 794162800,
  "status": "passed"
});
formatter.match({
  "location": "StepImplementation.user_navigates_to_bank_and_cash()"
});
formatter.result({
  "duration": 97251400,
  "status": "passed"
});
formatter.match({
  "location": "StepImplementation.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 625427600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Account receivable",
      "offset": 34
    },
    {
      "val": "business",
      "offset": 57
    },
    {
      "val": "\u003cinitialBalance\u003e",
      "offset": 70
    },
    {
      "val": "1000000000",
      "offset": 91
    },
    {
      "val": "",
      "offset": 106
    },
    {
      "val": "987654321",
      "offset": 111
    },
    {
      "val": "Natallia D",
      "offset": 125
    }
  ],
  "location": "StepImplementation.user_completes_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 401687000,
  "status": "passed"
});
formatter.match({
  "location": "StepImplementation.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 3351305500,
  "status": "passed"
});
formatter.match({
  "location": "StepImplementation.created_account_should_be_posted()"
});
formatter.result({
  "duration": 2368635700,
  "status": "passed"
});
formatter.after({
  "duration": 685912800,
  "status": "passed"
});
formatter.after({
  "duration": 699684700,
  "status": "passed"
});
});