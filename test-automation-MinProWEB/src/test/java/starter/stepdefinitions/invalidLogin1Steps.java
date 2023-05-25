package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.login.HomePage;
import starter.login.HomeePage;
import starter.login.LoginPage;
import starter.login.accountlog;

public class invalidLogin1Steps {
    @Steps
    HomeePage homeePage;
    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;
    @Steps
    accountlog accountlog;

    @Given("I am open the home page1")
    public void openTheHomePage(){
        loginPage.openUrl("https://alta-shop.vercel.app");
        homeePage.openTheHomePage();
    }
    @Given("I am open the login page1")
    public void openTheLoginPage(){
        loginPage.openTheLoginPage();
    }
    @Given("I am on the login page1")
    public void onTheLoginPage() {
        loginPage.validateOnTheLoginPage();
    }
    @And("I enter valid password1")
    public void doEnterValidPassword(){
        loginPage.inputPassword("123123");
    }
    @And("I click login button1")
    public void doClickLoginButton(){
        loginPage.clickButtonLogin();
    }
    @Then("i can see error message")
    public void onTheHomePage(){
        loginPage.validateErrorMessageDisplayed();
    }
}
