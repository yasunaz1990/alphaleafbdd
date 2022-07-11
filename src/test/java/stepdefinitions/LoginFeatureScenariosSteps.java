package stepdefinitions;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.tr.Fakat;
import org.openqa.selenium.By;

import static util.Automations.*;


public class LoginFeatureScenariosSteps {

    private final By loc_login_link = By.xpath("(//a[text()='Log in'])[1]");
    private final By loc_username_input = By.cssSelector("input#user");
    private final By loc_password_input = By.cssSelector("input#password");
    private final By loc_login_button = By.cssSelector("input#login");
    private final By loc_error_message = By.cssSelector("div#error > .error-message");

    private final Faker faker = new Faker();


    @Given("^user is on trello home page$")
    public void user_is_on_trello_home_page() {
        visit("https://trello.com");
        sleep(2);
    }

    @Given("^user goes to trello login page$")
    public void user_goes_to_trello_login_page() {
        click(loc_login_link);
        sleep(2);
    }

    @When("^user enters invalid credentials$")
    public void user_enters_invalid_credentials() {
        String fakeUser = faker.name().username();
        String fakePass = faker.internet().password();
        type(loc_username_input, fakeUser);
        sleep(2);
        type(loc_password_input, fakePass);
        sleep(2);

    }

    @When("^user clicks login button$")
    public void user_clicks_login_button() {
        click(loc_login_button);
        sleep(2);
    }

    @Then("^user should see error message$")
    public void user_should_see_error_message() {
        isVisible(loc_error_message);
        sleep(2);
    }
}
