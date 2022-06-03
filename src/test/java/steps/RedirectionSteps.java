package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class RedirectionSteps {

    public RedirectionSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    LoginPage loginPage;


    @Given("the user is on the Main activity page")
    public void theUserIsOnTheMainActivityPage() {
        assertTrue(loginPage.Background_Image_Displayed());
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.goTologin();
    }

    @Then("redirect to the login page")
    public void redirectToTheLoginPage() {
        assertTrue(loginPage.isNav_MenuDisplaye());
    }
}
