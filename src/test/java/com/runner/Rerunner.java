package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failed.txt",
plugin ="json:target/output.json",glue="com.step",monochrome=true,snippets=SnippetType.CAMELCASE)

public class Rerunner {

	
	
	

}
