package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

import static org.testng.Assert.assertTrue;

public class RegisterSteps {

    RegisterPage registerPage;
    HomePage homePage;

    @Given("user is on Register Page")
    public void userIsOnRegisterPage() {
        assertTrue(registerPage.isReLogosDisplayed());
    }

    @And("user select a {string}")
    public void userSelectA(String country) {
        registerPage.selectCountry(country);
    }

    @And("set {string} and {string}")
    public void setAnd(String phoneNum, String password) {
        registerPage.fillRegistration(phoneNum, password);
        registerPage.registerSubmit();
    }

    @When("successful registration message appear")
    public void successfulRegistrationMessageAppear() {
        assertTrue(registerPage.registerSuccess());
    }

    @And("the user click on confirmation button")
    public void theUserClickOnConfirmationButton() {
        registerPage.confirm_Registration();
    }

    @Then("the user is on homePage")
    public void theUserIsOnHomePage() {
        assertTrue(homePage.isHomeDisplayed());
    }
}
