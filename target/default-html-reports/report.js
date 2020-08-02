$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/demo.feature");
formatter.feature({
  "name": "User is on page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should on the page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user on the page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.medi.stepdefinitions.demoStepDefs.the_user_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user search \"Java\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.medi.stepdefinitions.demoStepDefs.the_user_search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see search result",
  "keyword": "Then "
});
formatter.match({
  "location": "com.medi.stepdefinitions.demoStepDefs.user_should_see_search_result()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Test Result\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertFalse(Assert.java:65)\r\n\tat com.medi.stepdefinitions.demoStepDefs.user_should_see_search_result(demoStepDefs.java:31)\r\n\tat ✽.User should see search result(file:///D:/Medi-Demo/src/test/resources/features/demo.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});