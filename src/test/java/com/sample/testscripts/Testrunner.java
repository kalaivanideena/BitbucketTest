package com.sample.testscripts;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\sample\\features",
glue = "com.samp.stepdefinition",
tags = {"@TC1"},
strict = false)
public class Testrunner {

}
