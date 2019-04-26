package feautures;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "C:\\Users\\jjimenez\\Documents\\KHUFU-PROJECT\\KuffuTesting\\src\\test\\Resources\\features", glue = "steps")
public class TestRunner {

}
