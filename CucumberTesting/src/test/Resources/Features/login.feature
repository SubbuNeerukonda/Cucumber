Feature:  Feature to test login
  @smoketest
  Scenario: validate Login scenario
    Given User launches HomePage
    When user enter valid userName and password
    And User Clicks on LoginButton
    Then User Navigates to HomePage
