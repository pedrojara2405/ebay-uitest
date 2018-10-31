$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("e2e_SearchProducts.feature");
formatter.feature({
  "line": 1,
  "name": "Search Products",
  "description": "Description: The purpose of this feature is to tests End 2 End - Search products on Ebay",
  "id": "search-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11532213100,
  "status": "passed"
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
  "name": "search results are shown",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "selects size \"10\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "search results are shown",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "the test prints in console the number of results",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user orders the products by \"price\" in \"ascendant\" mode",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the test asserts the order taking the first \"5\" results",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the test takes the first \"5\" products with their prices",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.user_goes_to_Ebay_home_page()"
});
formatter.result({
  "duration": 4935006200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shoes",
      "offset": 19
    }
  ],
  "location": "SearchPageSteps.searches_for(String)"
});
formatter.result({
  "duration": 12035884900,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageSteps.search_results_are_loaded()"
});
formatter.result({
  "duration": 53856500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PUMA",
      "offset": 15
    }
  ],
  "location": "SearchBrandFilterPageSteps.selects_brand(String)"
});
formatter.result({
  "duration": 246000,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageSteps.search_results_are_loaded()"
});
formatter.result({
  "duration": 25506000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 14
    }
  ],
  "location": "SearchSizeFilterPageSteps.selects_size(String)"
});
formatter.result({
  "duration": 248200,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageSteps.search_results_are_loaded()"
});
formatter.result({
  "duration": 40454200,
  "status": "passed"
});
formatter.match({
  "location": "ConsoleResultsPageSteps.prints_in_console_the_numbers_of_results()"
});
formatter.result({
  "duration": 189700,
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
  "location": "SearchResultsPageSteps.orders_the_products_by(String,String)"
});
formatter.result({
  "duration": 55100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 45
    }
  ],
  "location": "ConsoleResultsPageSteps.asserts_the_order_taking_the_first_results(String)"
});
formatter.result({
  "duration": 37700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "SearchResultsPageSteps.takes_the_first_products_with_their_prices(String)"
});
formatter.result({
  "duration": 49700,
  "status": "passed"
});
formatter.after({
  "duration": 2937040800,
  "status": "passed"
});
});