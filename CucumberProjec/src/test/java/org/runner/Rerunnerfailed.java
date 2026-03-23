package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="target/cucumberfailed.txt",glue="org.step",dryRun=false,
                  plugin= {"pretty","target/rerun.txt"})
public class Rerunnerfailed {
@AfterClass
public static void jvm() {
	JvmReport.generateJvmReport("target/cucumber.json");

}
}
