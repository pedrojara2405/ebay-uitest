Feature: Search Products
  Description: The purpose of this feature is to tests End 2 End - Search products on Ebay

  @End2EndTest
  Scenario: Customer performs search using specified filters and orders the results
    Given user goes to Ebay Home page
    When user searches for "shoes"
    When selects brand "PUMA"
    When selects size "10"
    Then search results are shown
    Then the test prints in console the number of results

    When user orders the products by "price" in "ascendant" mode
    Then the test asserts the order taking the first "5" results
    When the test takes the first "5" products with their prices

  #And prints in console the first "5" products with their prices
  #When the test orders the products by "name" in "ascendant" mode
  #And prints in console the products by "name" in "ascendant" mode
  #When the test orders the products by "price" in "descendant" mode
  #And prints in console the products by "price" in "descendant" mode

