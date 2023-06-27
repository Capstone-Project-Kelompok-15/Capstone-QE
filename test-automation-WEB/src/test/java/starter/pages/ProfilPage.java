package starter.pages;

import com.github.javafaker.Faker;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProfilPage extends PageObject {
    private By validateProfil() {
        return By.id("gambarprofil");
    }
    private By validField(String field) {
        switch (field) {
            case "username":
                return By.id("username");
            case "email":
                return By.id("email");
            case "password":
                return By.id("password");
            case "password confirmation":
                return By.id("passwordKonfirmasi");
            default:
                return null;
        }
    }
    private By changePicture() {
        return By.xpath("//h3[@class='text-xl font-normal text-[#195FAA] pt-[5px]']");
    }
    private By saveButton() {
        return By.xpath("//button[@id='buttonsimpan ']");
    }
    private By save2Button() {
        return By.id("simpan");
    }
    private By backButton() {
        return By.id("buttonBack");
    }
    private By validateChange() {
        return By.id("buttonProfile");
    }

    public String createRandomName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }
    public String password = "password";
    @Step
    public boolean onTheProfilPage() {
        return $(validateProfil()).waitUntilPresent().isDisplayed();
    }
    @Step
    public void clickChangePicture() {
        $(changePicture()).click();
    }
    @Step
    public void inputValid(String field) {
        if (field.equals("username")) {
            $(validField(field)).type(createRandomName());
        } else if (field.equals("email")) {
            $(validField(field)).type("adminqe@gmail.com");
        } else if (field.equals("password")) {
            $(validField(field)).type("adminqe123");
        } else if (field.equals("password confirmation")) {
            $(validField(field)).type("adminqe123");
        }
    }
    @Step
    public void clickSaveButton() {
        $(saveButton()).click();
    }
    @Step
    public void clickSave2Button() {
        $(save2Button()).click();
    }
    @Step
    public void clickBackButton() {
        $(backButton()).click();
    }
    @Step
    public Boolean validateResultChange() {
        return $(validateChange()).waitUntilPresent().isDisplayed();
    }
}
