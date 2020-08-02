package com.medi.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/failed-html-report"},
        features = "@target/rerun.txt",
        //this is the path of failed tests
        glue = "com.medi.stepdefinitions"
)
public class FailedTestRunner {
}
