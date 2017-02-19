Feature: Discover search
  As a non logged in user I should be able to do search on Discover.

  Scenario: I search music festivals in new york
    Given I navigate to "https://www.universe.com/"
    And I enter "music festivals" into input field having class "query"
    And I enter "new york" into input field having xpath "//input[contains(@placeholder,'Canada')]"
    When I click on link having text "Search"
    And I wait for 5 sec
    Then I should see page title as "Events in Canada  - Universe"
    Then I close browser
