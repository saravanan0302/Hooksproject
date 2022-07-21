Feature: Validation of Facebook Web Application login page
 @smoke
  Scenario Outline: TC01_Validation of facebook web application login with valid credentials
    Given User launch the facebook web application URL
    When User Enters valid "<username>" and  valid "<password>"
    And User clicks the login button
    Then User verify the Error message is displayed

    Examples: 
      | username            | password     |
      | saravanan@gmail.com | saravana@123 |
@reg
  Scenario Outline: TC02_Validation of facebook web application signup page with invalid credentials
    Given User launch the facebook web application URL
    When clicks the create new account button
    Then User enters the invalid "<firstname>" and "<lastname>"
    And User clicks the signup Button
    Then User verify the Error message is displayed

    Examples: 
      | firstname | lastname |
      | saravana  | krish    |
