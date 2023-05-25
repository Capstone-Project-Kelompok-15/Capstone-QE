package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.login.LoginPage;
import starter.login.accountlog;
import starter.register.RegisterPage;

public class invalidRegister1Steps {
    @Steps
    RegisterPage invalidRegister1Page;
    @Steps
    LoginPage loginPage;
    @Steps
    accountlog accountreg;

    @Given("I am open the register page1")
    public void openTheRegisterPage(){
        invalidRegister1Page.openUrl("https://alta-shop.vercel.app/auth/register");
    }
    @Given("I am on the register page1")
    public void onTheRegisterPage(){
        invalidRegister1Page.validateOnTheRegisterPage();
    }
    @And("I enter valid email1")
    public void doEnterValidEmailReg(){
        invalidRegister1Page.inputEmail("akunbaru" + accountreg.id + "@gmail.com");
    }
    @And("I enter register valid password1")
    public void doEnterValidPasswordReg(){
        invalidRegister1Page.inputPassword("akunbaru" + accountreg.id);
    }
    @And("I click register button1")
    public void doClickRegisterButton(){
        invalidRegister1Page.clickButtonRegister();
    }
    @Then("I receive error message1")
    public void receiveErrorMessage() {
        invalidRegister1Page.validateErrorMessageDisplayed();
    }

}


