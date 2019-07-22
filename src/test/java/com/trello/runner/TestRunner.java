package com.trello.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/html/cucumber.html", "json:target/html/cucumber.json",},
        features = {"src/test/resources/features/trello.feature"},
        glue = {"com.trello.stepdefinition", "com.trello.hooks"},
        tags = {"@smoke"},
        monochrome = true)

public class TestRunner {

}
