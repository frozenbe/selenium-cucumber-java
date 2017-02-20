Feature: Drag and drop
  I should be able to perform drag and drop functionality

  Scenario: I perform drag and drop test
    Given I navigate to "http://marcojakob.github.io/dart-dnd/basic/web/"
    When I drag an element having class "document" to element having class "trash"
    Then element having class "full" should be present
    And I wait for 5 sec
    Then I close browser
