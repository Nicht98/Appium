package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AllowAcces;
import pageObjects.LoginPage;

import static org.testng.Assert.assertTrue;

public class AllowSteps {

    AllowAcces allowAcces;
    LoginPage loginPage;

    public AllowSteps(AllowAcces allowAcces, LoginPage loginPage) {
        this.allowAcces = allowAcces;
        this.loginPage = loginPage;
    }


    @Given("the permission{int} is displayed")
    public void thePermissionIsDisplayed(int arg0) {
        assertTrue(allowAcces.permission_message());
    }

    @When("the user click on allow")
    public void theUserClickOnAllow() {
        allowAcces.accept_permission();
    }

    @And("click on allow again")
    public void clickOnAllowAgain() {
        assertTrue(allowAcces.permission_message());
        allowAcces.accept_permission();
    }

    @Then("the loginPage is displayed")
    public void theLoginPageIsDisplayed() {
    assertTrue(loginPage.Background_Image_Displayed());
    }
}
