package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.HomePage;
import starter.login.HomeePage;
import starter.login.LoginPage;
import starter.login.accountlog;

public class invalidLogin3Steps {
    @Steps
    HomeePage homeePage;
    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;
    @Steps
    accountlog accountlog;

    @Given("I am open the home page2")
    public void openTheHomePage(){
        loginPage.openUrl("https://alta-shop.vercel.app");
        homeePage.openTheHomePage();
    }
    @Given("I am open the login page2")
    public void openTheLoginPage(){
        loginPage.openTheLoginPage();
    }
    @Given("I am on the login page2")
    public void onTheLoginPage() {
        loginPage.validateOnTheLoginPage();
    }
    @When("I enter valid email2")
    public void doEnterValidUsername(){
        loginPage.inputEmail("someone" + "@mail.com");
    }
    @And("I click login button2")
    public void doClickLoginButton(){
        loginPage.clickButtonLogin();
    }
    @Then("i can see error message2")
    public void onTheHomePage(){
        loginPage.validateErrorMessageDisplayed();
    }
}
