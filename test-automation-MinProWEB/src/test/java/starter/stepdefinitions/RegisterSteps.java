package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import starter.login.LoginPage;
import starter.register.RegisterPage;
import starter.register.accountreg;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;
    @Steps
    LoginPage loginPage;
    @Steps
    accountreg accountreg;

    @Given("I am open the register page")
    public void openTheRegisterPage(){
        registerPage.openUrl("https://alta-shop.vercel.app/auth/register");
    }
    @Given("I am on the register page")
    public void onTheRegisterPage(){
        registerPage.validateOnTheRegisterPage();
    }
    @When("I enter register valid username")
    public void doEnterValidUsernameReg(){
        registerPage.inputUsername("akunbaru" + accountreg.id );
    }
    @And("I enter valid email")
    public void doEnterValidEmailReg(){
        int min = 1;
        int max = 1000000;
        int number = (int)Math.floor(Math.random() * (max - min + 1) + min);
        String email = "akunbaru" + String.valueOf(number) + "@gmail.com";
        registerPage.inputEmail(email);
    }
    @And("I enter register valid password")
    public void doEnterValidPasswordReg(){
        registerPage.inputPassword("akunbaru" + accountreg.id);
    }
    @And("I click register button")
    public void doClickRegisterButton(){
        registerPage.clickButtonRegister();
    }
    @Then("I am back on the login page")
    public void validateOnTheLoginPage(){
        loginPage.validateOnTheLoginPage();
    }

}


