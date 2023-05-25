package starter.products;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class viewAllProductsPage extends PageObject{
    private By containerHomePage(){
        return By.className("container");
    }
    private By loginPageButton(){
        return By.xpath("//i[@class='v-icon notranslate fas fa-sign-in theme--dark']");
    }
    private By emailField(){
        return By.id("input-1245");
    }
    private By Cart(){
        return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[1]/span/span/i");
    }
    private By gamingCategoriesButton(){
        return By.xpath("//span[@class='v-list-item__title' and text()='Furniture']");
    }
    private By buyButton(){
        return By.xpath("//span[@class='v-btn__content' and text()='Beli']");
    }
    private By detailButton(){
        return By.xpath("//span[@class='v-btn__content' and text()='Detail']");
    }
    private By Bayar(){
        return By.id("button-bayar");
    }
    private By TriangleCategoriesButton(){ return By.xpath("//i[@class='v-icon notranslate fas fa-caret-down theme--light']");}
    private By viewAllProductsCategoriesPage(){
        return By.className("container");
    }

    private By passwordField(){
        return By.id("input-1248");
    }
    private By loginButton(){
        return By.xpath("//span[text()='Login']");
    }
    private By errorMessage(){
        return By.xpath("//span[text()='email or password is invalid']");
    }
    @Step
    public static OpenUrl url(String targetUrl) {
        return new OpenUrl(targetUrl);
    }
    @Step
    public void openTheLoginPage(){
        $(loginPageButton()).click();
    }
    @Step
    public void validateOnTheLoginPage(){
        $(loginButton()).isDisplayed();
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickButtonLogin(){
        $(loginButton()).click();
    }
    public void viewAllProductsCategories(){
        $(viewAllProductsCategoriesPage()).isDisplayed();
    }
    @Step
    public boolean validateErrorMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean validateEqualErrorMessage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }
    @Step
    public void clickTriangleCategoriesButton(){
        $(TriangleCategoriesButton()).click();
    }
    @Step
    public void clickBuyToAddCart(){
        $(buyButton()).click();}
    public void clickDetailToSeDetailProducts(){
        $(detailButton()).click();
    }

    @Step
    public void validateOnTheHomePage(){
        $(containerHomePage()).isDisplayed();
    }
    @Step
    public void clikGamingCategories(){
        $(gamingCategoriesButton()).click();
    }
    @Step
    public void clickCart(){
        $(Cart()).click();
    }
    @Step
    public void clickBayar(){
        $(Bayar()).click();
    }
}
