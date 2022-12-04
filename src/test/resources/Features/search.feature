Feature: Search feature in amazon app

  Scenario: Search any product
    Given :  As a registered user when user opens the app
    Then :  In search bar user will type the "Productname"
    Then : As a result all the "productname" with different "brand" should be displayed
  
  

