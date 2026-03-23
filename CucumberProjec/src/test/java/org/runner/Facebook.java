package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\welcome\\pavan\\eclipse\\CucumberProjec\\src\\test\\resources\\feature\\facebook.feature",
glue="org.step",dryRun =false,plugin = {
        "pretty",
        "html:target/cucumber.html",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml",
        "rerun:target/cucumberfailed.txt"
        
    })

public class Facebook {

	@AfterClass
	public static void report() {
		
		JvmReport.generateJvmReport("target/cucumber.json");
	}
}
