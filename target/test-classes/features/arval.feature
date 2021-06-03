Feature:
  Background:
    Given user connect to the homePage

  @Bug_443
  Scenario: Ineffective job search filter
    And Click on the link About Arval
    And Click on the link 'Careers & jobs'
    Then Select 'CDI' from the <<I'm looking for>> link

  @Bug_499
  Scenario: link returning an error page
    And At footer level click on an international partner
    Then The international partner page opens, in the navigation bar click on the expertise and professions tab
    And Scroller et faire un clic sur l'offre location longue durée d’Arval
    And A drop-down description is displayed, click on the link discover products and services

  @Bug_495
  Scenario: Redirection to insecure links
    And ckeck all link to verify insecure links

  @Bug_488
  Scenario: Image not Load
    And navigate to link Fleet management solutions
    And navigate to link Why arval
    Then see image header not load

  @Bug_481
  Scenario: Incorret alignment component
    And navigate to "a car in long term rental"
    Then verfiy position element

  @Bug_448
  Scenario: The "Contact us" link is non-functional
    And search car
    And click on button "Contact us"

  @Bug_441
  Scenario: Change language link is empty
    And change language website

  @Bug_467
  Scenario: Bad character management
    And navigate to professional page
    Then click to mark BMW

