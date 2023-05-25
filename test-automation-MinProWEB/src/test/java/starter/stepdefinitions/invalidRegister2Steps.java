package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.LoginPage;
import starter.register.accountreg;
import starter.register.RegisterPage;

public class invalidRegister2Steps {
    @Steps
    RegisterPage invalidRegister2Page;
    @Steps
    LoginPage loginPage;
    @Steps
    accountreg accountreg;

    @Given("I am open the register page2")
    public void openTheRegisterPage(){
        invalidRegister2Page.openUrl("https://alta-shop.vercel.app/auth/register");
    }
    @Given("I am on the register page2")
    public void onTheRegisterPage(){
        invalidRegister2Page.validateOnTheRegisterPage();
    }
    @When("I enter register valid username2")
    public void doEnterValidUsernameReg(){
    invalidRegister2Page.inputUsername("akunbaru" + accountreg.id );
}
    @And("I enter register valid password2")
    public void doEnterValidPasswordReg(){
        invalidRegister2Page.inputPassword("akunbaru" + accountreg.id);
    }
    @And("I click register button2")
    public void doClickRegisterButton(){
        invalidRegister2Page.clickButtonRegister();
    }
    @Then("I receive error message2")
    public void receiveErrorMessage() {
        invalidRegister2Page.validateErrorMessageDisplayed();
    }

}


