package apiTests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.logging.Logger;
import aquality.selenium.core.utilities.JsonSettingsFile;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.Specifications;


public class BaseTest {

    private static JsonSettingsFile config = new JsonSettingsFile("config.json");
    protected Logger logger = AqualityServices.getLogger();

    @BeforeSuite
    public void beforeMethod() {
        Specifications.instalSpecification(Specifications.requestSpecification(config.getValue("/url").toString()));
    }

    @AfterSuite
    public void afterMethod() {}

}
