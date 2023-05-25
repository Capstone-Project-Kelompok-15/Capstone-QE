package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.LoginPage;
import starter.register.RegisterPage;
import starter.register.accountreg;

public class invalidRegister3Steps {
    @Steps
    RegisterPage invalidRegister3Page;
    @Steps
    LoginPage loginPage;
    @Steps
    accountreg accountreg;

    @Given("I am open the register page3")
    public void openTheRegisterPage(){
        invalidRegister3Page.openUrl("https://alta-shop.vercel.app/auth/register");
    }
    @Given("I am on the register page3")
    public void onTheRegisterPage(){
        invalidRegister3Page.validateOnTheRegisterPage();
    }
    @When("I enter register valid username3")
    public void doEnterValidUsernameReg(){
    invalidRegister3Page.inputUsername("akunbaru" + accountreg.id );
}
    @And("I enter valid email3")
    public void doEnterValidEmailReg(){
        invalidRegister3Page.inputEmail("akunbaru" + accountreg.id + "@gmail.com");
    }
    @And("I click register button3")
    public void doClickRegisterButton(){
        invalidRegister3Page.clickButtonRegister();
    }
    @Then("I receive error message3")
    public void receiveErrorMessage() {
        invalidRegister3Page.validateErrorMessageDisplayed();
    }

}


