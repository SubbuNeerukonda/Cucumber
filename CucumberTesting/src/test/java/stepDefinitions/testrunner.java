package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/Resources/Features",
        glue= {"stepDefinitions"} ,
        monochrome=true,
        plugin = { "pretty", "junit:target/htmlreports/x.html",
                "json:target/Jsonreports/y.json",
                "junit:target/Xmlreports/z.xml"
        }  ,
        stepNotifications = true,
        tags = "@smoketest"
)

public class testrunner
{
}
