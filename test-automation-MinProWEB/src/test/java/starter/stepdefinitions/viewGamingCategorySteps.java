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

public class viewGamingCategorySteps {
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

    @Given("I am open the home page to view all products categories1")
    public void openTheHomePage(){
        loginPage.openUrl("https://alta-shop.vercel.app");
        homeePage.openTheHomePage();
    }
    @Given("I am open the login page to view all products categories1")
    public void openTheLoginPage(){
        loginPage.openTheLoginPage();
    }
    @Given("I am on the login page to view all products categories1")
    public void onTheLoginPage() {
//        loginPage.openUrl("https://alta-shop.vercel.app/auth/login");
        loginPage.validateOnTheLoginPage();
    }
    @When("I enter valid username to view all products categories1")
    public void doEnterValidUsername(){
        loginPage.inputEmail("someone" + "@mail.com");
    }
    @And("I enter valid password to view all products categories1")
    public void doEnterValidPassword(){
        loginPage.inputPassword("123123");
    }
    @And("I click login button to view all products categories1")
    public void doClickLoginButton(){
        loginPage.clickButtonLogin();
    }
    @And("I click Triangle button on products categories1")
    public void doClickTriangleCategoriesButton(){viewAllProducts.clickTriangleCategoriesButton();}
    @And("I choose gaming Categories1")
    public void doChooseGamingCategoryButton(){viewAllProducts.viewAllProductsCategories();}
    @Then("I can view gaming categories product1")
    public void validateProductsCategoriesPage(){
        viewAllProducts.viewAllProductsCategories();
    }
}
