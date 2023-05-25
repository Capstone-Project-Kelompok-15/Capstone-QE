package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.login.HomePage;
import starter.login.HomeePage;
import starter.login.LoginPage;
import starter.login.accountlog;

public class invalidLogin2Steps {
    @Steps
    HomeePage homeePage;
    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;
    @Steps
    accountlog accountlog;

    @Given("I am open the home page3")
    public void openTheHomePage(){
        loginPage.openUrl("https://alta-shop.vercel.app");
        homeePage.openTheHomePage();
    }
    @Given("I am open the login page3")
    public void openTheLoginPage(){
        loginPage.openTheLoginPage();
    }
    @Given("I am on the login page3")
    public void onTheLoginPage() {
        loginPage.validateOnTheLoginPage();
    }

    @And("I click login button3")
    public void doClickLoginButton(){
        loginPage.clickButtonLogin();
    }
    @Then("i can see error message3")
    public void onTheHomePage(){
        loginPage.validateErrorMessageDisplayed();
    }
}
