Feature:
  Scenario: User wants to check if there is an image on the web page
    Given I go on the petclinic site
    When I click on the HomePage
    Then I check for the image
