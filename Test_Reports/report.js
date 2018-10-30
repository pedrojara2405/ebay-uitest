$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("e2e_SearchProducts.feature");
formatter.feature({
  "line": 1,
  "name": "Search Products",
  "description": "Description: The purpose of this feature is to tests End 2 End - Search products on Ebay",
  "id": "search-products",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Customer performs search using specified filters and orders the results",
  "description": "",
  "id": "search-products;customer-performs-search-using-specified-filters-and-orders-the-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@End2EndTest"
    },
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user goes to Ebay Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user searches for \"shoes\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "search results are shown",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "selects brand \"PUMA\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "selects size \"10\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the test prints in console the number of results",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user orders the products by \"price\" in \"ascendant\" mode",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the test asserts the order taking the first \"5\" results",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "the test takes the first \"5\" products with their prices",
  "keyword": "When "
});
formatter.match({
  "location": "e2e_SearchProductsSteps.user_goes_to_Ebay_home_page()"
});
formatter.result({
  "duration": 9863394199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shoes",
      "offset": 19
    }
  ],
  "location": "e2e_SearchProductsSteps.searches_for(String)"
});
formatter.result({
  "duration": 11213818800,
  "status": "passed"
});
formatter.match({
  "location": "e2e_SearchProductsSteps.search_results_are_loaded()"
});
formatter.result({
  "duration": 157451401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PUMA",
      "offset": 15
    }
  ],
  "location": "e2e_SearchProductsSteps.selects_brand(String)"
});
formatter.result({
  "duration": 97000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 14
    }
  ],
  "location": "e2e_SearchProductsSteps.selects_size(String)"
});
formatter.result({
  "duration": 89100,
  "status": "passed"
});
formatter.match({
  "location": "e2e_SearchProductsSteps.prints_in_console_the_numbers_of_results()"
});
formatter.result({
  "duration": 31800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "price",
      "offset": 29
    },
    {
      "val": "ascendant",
      "offset": 40
    }
  ],
  "location": "e2e_SearchProductsSteps.orders_the_products_by(String,String)"
});
formatter.result({
  "duration": 105501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 45
    }
  ],
  "location": "e2e_SearchProductsSteps.asserts_the_order_taking_the_first_results(String)"
});
formatter.result({
  "duration": 111800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "e2e_SearchProductsSteps.takes_the_first_products_with_their_prices(String)"
});
formatter.result({
  "duration": 115601,
  "status": "passed"
});
});