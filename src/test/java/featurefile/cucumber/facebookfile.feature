Feature: Chatting  Access To Worldwide Users


Scenario: User Try To Click The Signup Button

    Given User Launched The Application
    When User Click The Create New Account Button It Navigates To Signup Page



Scenario: User Signup The Application By Giving Details From The User

    When  User Enter The Firstname In Firstname Field
    And User Enter The Surname In Surname Field
    And User Enter The Email Or Mobile Number In EmailId Filed
    And User Enter The Strong Password In Password Field
    And User Select The Date Of Birth In Date Dropdown Function
    And user Select The Month Of Birth In Month Dropdown Function
    And User Select The Year Of Birth In Year Dropdown Function
    And User Click The Gender In Gender Section Button
    Then User Click The Signup Button It Navigates To OTP Verification Page


 
 Scenario: User Verify The Given Values By By Entering The OTP
 
 
     When User Enter The OneTimePassword In OTP Field
     And User Click The Continue Button 
     Then user Click The Ok Button To Create An Account

