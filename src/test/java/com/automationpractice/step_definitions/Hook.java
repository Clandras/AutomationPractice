package com.automationpractice.step_definitions;


import com.automationpractice.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @Before
    public void setup(){
        System.out.println("-----------\nTest setup!");
    }

    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("Test failed!");
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        } else {
            System.out.println("Cleanup!\nTest completed!");
        }
        System.out.println("-----------------------------");
        Driver.close();
    }
}
