package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.LoginPage;
import starter.register.RegisterPage;
import starter.register.accountreg;

public class invalidRegister4Steps {
    @Steps
    RegisterPage invalidRegister4Page;
    @Steps
    LoginPage loginPage;
    @Steps
    accountreg accountreg;

    @Given("I am open the register page4")
    public void openTheRegisterPage(){
        invalidRegister4Page.openUrl("https://alta-shop.vercel.app/auth/register");
    }
    @Given("I am on the register page4")
    public void onTheRegisterPage(){
        invalidRegister4Page.validateOnTheRegisterPage();
    }

    @When("I enter register valid username4")
    public void doEnterValidUsernameReg(){
    invalidRegister4Page.inputUsername("akunbaru" + accountreg.id );
}
    @And("I enter valid email4")
    public void doEnterValidEmailReg(){
        invalidRegister4Page.inputEmail("someone" + "@mail.com");
    }
    @And("I enter register valid password4")
    public void doEnterValidPasswordReg(){
        invalidRegister4Page.inputPassword("123123");
    }
    @And("I click register button4")
    public void doClickRegisterButton(){
        invalidRegister4Page.clickButtonRegister();
    }
    @Then("I receive error message4")
    public void receiveErrorMessage() {
        invalidRegister4Page.validateErrorMessageDisplayed();
    }
}


