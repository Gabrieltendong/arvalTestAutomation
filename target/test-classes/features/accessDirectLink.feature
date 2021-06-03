Feature: access direct link

  @Bug_449
  Scenario: Slow loading of the home page
    Given user navigate to home page
    Then count number of loading times