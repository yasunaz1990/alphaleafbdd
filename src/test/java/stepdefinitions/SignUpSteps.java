package stepdefinitions;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class SignUpSteps {

    @When("^user says they cannot sign in$")
    public void user_says_they_cannot_sign_in() {
        System.out.println("I don't want to log in ");

        By location = By.className("name");
    }
}
