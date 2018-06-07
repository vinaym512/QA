@Signup
Feature: I want to sign up for QFF program

  @SignUpForm
  Scenario: I enter all the details on signup form
    Given I navigate to QA website "https://www.qantas.com.au/fflyer/dyn/joinff"
     When I fill all the fields with valid data
      And I hit Pay Button
     Then I verify that ff number generated