package com.app.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\Downloads\\Feb_Cucumber\\Feb_Cucumber\\src\\test\\java\\com\\app\\feature\\LoginPage.feature",
                 glue = "com.app.stepdefinition",
                 dryRun = false,
                 
    
                 )
               

public class RunnerLogin {

}
