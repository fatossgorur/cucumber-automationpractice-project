
Feature: Contact Us Test

  Scenario: Go to website and test contact page


    And click contact us button
    And select subject heading
    And type email
    And type order reference
    And type message
    When click send button
    Then verify success

