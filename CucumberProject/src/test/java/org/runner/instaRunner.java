package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\ff\\insta.feature",
                  glue="org.step",snippets = SnippetType.CAMELCASE,
                  dryRun = false,strict = false)
public class instaRunner {

}
