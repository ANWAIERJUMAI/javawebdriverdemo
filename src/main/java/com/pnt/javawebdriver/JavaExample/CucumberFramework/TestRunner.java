package com.pnt.javawebdriver.JavaExample.CucumberFramework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/enlem/IdeaProjects/src/main/java/com/pnt/javawebdriver/JavaExample/CucumberFramework",
        glue = {"stepDefination"},
        format = {"pretty","html: test-output"}
)


public class TestRunner {

}
