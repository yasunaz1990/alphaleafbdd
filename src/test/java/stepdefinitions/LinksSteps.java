package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static util.Automations.*;

public class LinksSteps {

    private final By loc_cant_login_link = By.cssSelector(".bottom-form-link  .forgotLink");


    @When("^user scroll down$")
    public void user_scroll_down() {
        System.out.println("imaginge we are scrolling down");
    }

    @Then("^user should see cant login link$")
    public void user_should_see_cant_login_link() {
        isVisible(loc_cant_login_link);
    }
}
