Feature: Task 1 “Add to cart”
  @Demo
  Scenario: Test01
    Given the user is on the "flaschenpost" page
    And   enter zip code of the distrubition region
    And   go to category Wasser and choose Medium
    And   type Dreiser in the textbox named Markenauswahl
    And   Check the checkbox named Dreiser if it exists, if not, choose another brand and add to cart
    And   go to category Bier, choose Radler and find Glucks Radler Naturtrub and Add two articles in the cart
    And   Click Jetzt bestellen button and In the cart on the right-hand-side reduce the number of Glucks Radler Naturtrub to one
    Then  checks if all the expected products are in the cart




  @Demo
  Scenario: Negative Test
    Given the user is on the "flaschenpost" page
    Then  the user sees the screenshot