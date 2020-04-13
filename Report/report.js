$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Automation.feature");
formatter.feature({
  "line": 1,
  "name": "automated Testing on automation practice application",
  "description": "",
  "id": "automated-testing-on-automation-practice-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user to Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user to login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_to_Launch_the_browser()"
});
formatter.result({
  "duration": 479437300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "duration": 215500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "user to check the sign function",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-check-the-sign-function",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user launch the automation practice application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user to click on  sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user navigate to homepage of automation practice",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_automation_practice_application()"
});
formatter.result({
  "duration": 4988592800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_sign_in_button1()"
});
formatter.result({
  "duration": 161400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_navigate_to_homepage_of_automation_practice()"
});
formatter.result({
  "duration": 5012063700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "user to check the login function using vaild username and password",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-check-the-login-function-using-vaild-username-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user enter the valid username \"\u003cusername\u003e\" on username field",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user enter the valid password \"\u003cpassword\u003e\" on password field",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user validate the name of the user in homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-check-the-login-function-using-vaild-username-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 20,
      "id": "automated-testing-on-automation-practice-application;user-to-check-the-login-function-using-vaild-username-and-password;;1"
    },
    {
      "cells": [
        "bahubali302@gmail.com",
        "wenndeisel"
      ],
      "line": 21,
      "id": "automated-testing-on-automation-practice-application;user-to-check-the-login-function-using-vaild-username-and-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user to Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user to login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_to_Launch_the_browser()"
});
formatter.result({
  "duration": 156900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "duration": 136600,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "user to check the login function using vaild username and password",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-check-the-login-function-using-vaild-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user enter the valid username \"bahubali302@gmail.com\" on username field",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user enter the valid password \"wenndeisel\" on password field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user validate the name of the user in homepage",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "bahubali302@gmail.com",
      "offset": 31
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_username_on_username_field(String)"
});
formatter.result({
  "duration": 5403936600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "wenndeisel",
      "offset": 31
    }
  ],
  "location": "StepDefinition.user_enter_the_valid_password_on_password_field(String)"
});
formatter.result({
  "duration": 5041162700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_submit_button()"
});
formatter.result({
  "duration": 5040177900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_validate_the_name_of_the_user_in_homepage()"
});
formatter.result({
  "duration": 162800,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user to Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user to login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_to_Launch_the_browser()"
});
formatter.result({
  "duration": 156600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "duration": 132400,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "user to select dress to order",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-select-dress-to-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "user navigated to homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "user to select type of dress",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user to select casuall dress",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user navigate to casuall dress page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigated_to_homepage()"
});
formatter.result({
  "duration": 98500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_type_of_dress()"
});
formatter.result({
  "duration": 2245358800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_casuall_dress()"
});
formatter.result({
  "duration": 2198826300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_navigate_to_casuall_dress_page()"
});
formatter.result({
  "duration": 19496606300,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user to Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user to login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_to_Launch_the_browser()"
});
formatter.result({
  "duration": 162100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "duration": 137400,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "user to purchase the clothes",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-purchase-the-clothes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "user navigate to casual dress page",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user to click on quick button in the image",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user  to select dress Quantity",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user to select dress size",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user to select on color",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user to click on add to cart button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigate_to_casual_dress_page()"
});
formatter.result({
  "duration": 118300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_quick_button_in_the_image()"
});
formatter.result({
  "duration": 8385071500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_dress_Quantity()"
});
formatter.result({
  "duration": 16353407500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_dress_size()"
});
formatter.result({
  "duration": 3846852900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_select_on_color()"
});
formatter.result({
  "duration": 3175446200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_add_to_cart_button()"
});
formatter.result({
  "duration": 2178024400,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user to Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user to login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_to_Launch_the_browser()"
});
formatter.result({
  "duration": 130700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "duration": 112700,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "user to check for to proceed checkout",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-check-for-to-proceed-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "user navigated to proceed page",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "user to click on proceed button",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "user navigate to summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigated_to_proceed_page()"
});
formatter.result({
  "duration": 95000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_proceed_button()"
});
formatter.result({
  "duration": 6136314400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_navigate_to_summary_page()"
});
formatter.result({
  "duration": 143300,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user to Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user to login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_to_Launch_the_browser()"
});
formatter.result({
  "duration": 158700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "duration": 136400,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "user to check for to  proceed summary",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-check-for-to--proceed-summary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "user navigated to summary page",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "user to click on proceed summary button",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "user to navigate to signin page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigated_to_summary_page()"
});
formatter.result({
  "duration": 145700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_proceed_summary_button()"
});
formatter.result({
  "duration": 8081600000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_navigate_to_signin_page()"
});
formatter.result({
  "duration": 5001478000,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user to Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user to login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_to_Launch_the_browser()"
});
formatter.result({
  "duration": 149200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "duration": 98100,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "user to check for  to proceed  address page",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-check-for--to-proceed--address-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 53,
  "name": "user to navigated to proceed to address page",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "user to click on proceed to address button",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "user to navigate to proceed to shipping page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_to_navigated_to_proceed_to_address_page()"
});
formatter.result({
  "duration": 133800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_proceed_to_address_button()"
});
formatter.result({
  "duration": 8079170100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_navigate_to_proceed_to_shipping_page()"
});
formatter.result({
  "duration": 145100,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user to Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user to login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_to_Launch_the_browser()"
});
formatter.result({
  "duration": 252700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "duration": 135800,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "user to check for  proceed for shipping",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-check-for--proceed-for-shipping",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 58,
  "name": "user to navigated to proceed to shipping page",
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "user to click on terms and service check box",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "user to click on proceed to shipping  button",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user to navigate to proceed to payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_to_navigated_to_proceed_to_shipping_page()"
});
formatter.result({
  "duration": 201000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_terms_and_service_check_box()"
});
formatter.result({
  "duration": 2091927000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_proceed_to_shipping_button()"
});
formatter.result({
  "duration": 2048765500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_navigate_to_proceed_to_payment_page()"
});
formatter.result({
  "duration": 131000,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user to Launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user to login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_to_Launch_the_browser()"
});
formatter.result({
  "duration": 154700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_login_the_application()"
});
formatter.result({
  "duration": 172000,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "user to check for payment process",
  "description": "",
  "id": "automated-testing-on-automation-practice-application;user-to-check-for-payment-process",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 66,
  "name": "user to navigated to proceed to payment page",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "user to click on pay by bank wire button",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": "user to click on order confirmation buton",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "user navigate to  confirmed order recipt details page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_to_navigated_to_proceed_to_payment_page()"
});
formatter.result({
  "duration": 194000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_pay_by_bank_wire_button()"
});
formatter.result({
  "duration": 2088161200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_click_on_order_confirmation_buton()"
});
formatter.result({
  "duration": 2047697500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_navigate_to_confirmed_order_recipt_details_page()"
});
formatter.result({
  "duration": 122900,
  "status": "passed"
});
});