package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.Automations;
import util.DriverUtil;

public class Hooks {

    @Before
    public static void setUp(){
        DriverUtil.openBrowser();
        Automations.init(DriverUtil.getDriver());
    }


    @After
    public static void cleanUp() {
        DriverUtil.closeBrowser();
    }
}
