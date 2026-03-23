package org.jvm;
import java.io.File;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import java.util.ArrayList;
import java.util.LinkedList;


		import net.masterthought.cucumber.Configuration;
		import net.masterthought.cucumber.ReportBuilder;

		public class JvmReport {

		    public static void generateJvmReport(String jsonFile) {

		        File reportDir = new File("target/cucumber.jvm");
		         Configuration  configuration= new Configuration(reportDir, "Cucumber Automation Project");

		        configuration.addClassifications("Platform", "Windows");
		        configuration.addClassifications("Browser", "Chrome");
		        configuration.addClassifications("Version", "1.0");
		        

		        List<String> jsonFiles = new LinkedList<>();
		        jsonFiles.add(jsonFile);

		        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		        reportBuilder.generateReports();
		    }
		}