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

public class  LoginSteps {
    @Steps
    HomeePage homeePage;
    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;
    @Steps
    accountlog accountlog;

    @Given("I am open the home page")
    public void openTheHomePage(){
        loginPage.openUrl("https://alta-shop.vercel.app");
        homeePage.openTheHomePage();
    }
    @Given("I am open the login page")
    public void openTheLoginPage(){
        loginPage.openTheLoginPage();
    }

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPage.validateOnTheLoginPage();
    }
    @When("I enter valid username")
    public void doEnterValidUsername(){
        loginPage.inputEmail("someone" + "@mail.com");
    }
    @And("I enter valid password")
    public void doEnterValidPassword(){
        loginPage.inputPassword("123123");
    }
    @And("I click login button")
    public void doClickLoginButton(){
        loginPage.clickButtonLogin();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        homePage.validateOnTheHomePage();
    }
}
