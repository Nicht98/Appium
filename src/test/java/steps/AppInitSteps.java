package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccessInitializationPage;

import static org.testng.Assert.assertTrue;

public class AppInitSteps {

    AccessInitializationPage accessInitPage;

    public AppInitSteps(AccessInitializationPage accessInitPage) {
        this.accessInitPage = accessInitPage;
    }

    @Given("the app is launch")
    public void theAppIsLaunch() {

    }

    @And("the permission{int} is displayed")
    public void thePermissionIsDisplayed(int arg0) {
        assertTrue(accessInitPage.permission_message());
    }

    @When("the user click on allow")
    public void theUserClickOnAllow() {
        accessInitPage.accept_permission();
    }

    @And("the next permission is displayed")
    public void theNextPermissionIsDisplayed() {
        assertTrue(accessInitPage.permission_message());
    }

    @And("click on allow again")
    public void clickOnAllowAgain() {
        accessInitPage.accept_permission();
    }

    @Then("the Initialization page is displayed")
    public void theInitializationPageIsDisplayed() {
        accessInitPage.IsLogoDisplayed();
    }
}
