package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccessInitializationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginSteps {

    AccessInitializationPage accesInit;
    LoginPage loginPage;
    HomePage homePage;

    public LoginSteps(AccessInitializationPage accesInit, LoginPage loginPage, HomePage homePage) {
        this.accesInit = accesInit;
        this.loginPage = loginPage;
        this.homePage = homePage;
    }

    @Given("the user is on the Initialization page")
    public void theUserIsOnTheInitializationPage() {
        accesInit.IsLogoDisplayed();
    }

    @And("click to login button")
    public void clickToLoginButton() {
        accesInit.goToLogin();
    }

    @When("enter his {string} and {string}")
    public void enterHisAnd(String phoneNum, String pass) {
        loginPage.fillForm(phoneNum, pass);
    }

    @And("click on login button")
    public void userSelectACountry() {
        loginPage.login();
    }

    @Then("the user is redirect to HomePage")
    public void theUserIsRedirectToHomePage() {
        accesInit.allowPermission();
       assertTrue(homePage.isHomeDisplayed()) ;
    }
}
