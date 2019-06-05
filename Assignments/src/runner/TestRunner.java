package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "features",glue= {"stepDefination"}, tags= {"@tag1,@tag2"})
public class TestRunner {

}
