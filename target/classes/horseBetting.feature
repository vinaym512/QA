@HorseBettingSlipEntry
Feature: Bet for a horse racing

  @BetUsingForm
  Scenario: I want to bet on a horse racing using a bet slip
    Given I navigate to william hill website "https://www.williamhill.com.au"
    When User clicks on Racing link at left menu
    And User clicks on the bet button on the right pane
    And User enters a stake value of "10.5"
    Then User clicks on Add to Bet Slip Button
    Then User verify that bet is added