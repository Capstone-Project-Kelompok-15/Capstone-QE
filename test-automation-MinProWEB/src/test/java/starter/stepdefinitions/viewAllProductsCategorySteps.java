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
import starter.products.viewAllProductsPage;

public class viewAllProductsCategorySteps {
    @Steps
    HomeePage homeePage;
    @Steps
    LoginPage loginPage;
    @Steps
    viewAllProductsPage viewAllProducts;
    @Steps
    HomePage homePage;
    @Steps
    accountlog accountproducts;

    @Given("I am open the home page to view all products categories")
    public void openTheHomePage(){
        loginPage.openUrl("https://alta-shop.vercel.app");
        homeePage.openTheHomePage();
    }
    @Given("I am open the login page to view all products categories")
    public void openTheLoginPage(){
        loginPage.openTheLoginPage();
    }
    @Given("I am on the login page to view all products categories")
    public void onTheLoginPage() {
        loginPage.validateOnTheLoginPage();
    }
    @When("I enter valid username to view all products categories")
    public void doEnterValidUsername(){
        loginPage.inputEmail("someone" + "@mail.com");
    }
    @And("I enter valid password to view all products categories")
    public void doEnterValidPassword(){
        loginPage.inputPassword("123123");
    }
    @And("I click login button to view all products categories")
    public void doClickLoginButton(){
        loginPage.clickButtonLogin();
    }
    @And("I click Triangle button on products categories")
    public void doClickTriangleCategoriesButton(){viewAllProducts.clickTriangleCategoriesButton();}
    @Then("I can view all products categories")
    public void validateProductsCategoriesPage(){
        viewAllProducts.viewAllProductsCategories();
    }
}
