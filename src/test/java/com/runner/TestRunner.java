package com.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:src\\test\\resources\\Feature\\facebook.feature",
plugin = {"json:target/output.json","rerun:target/failed.txt"},glue="com.step",monochrome=true,snippets=SnippetType.CAMELCASE)

public class TestRunner {
	@AfterClass
	public static void afterclass() {
	Report.generateJvmRport(System.getProperty("user.dir")+"\\target\\output.json");
	}
	

	}


