package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.ManageUserPage;

public class ManageUserSteps {
    @Steps
    ManageUserPage manageUserPage;

    @And("I click manage user icon on the side bar")
    public void clickManageUserIcon() {
        manageUserPage.clickManageUserIcon();
    }
    @When("I am on the manage user page")
    public void onTheManageUserPage() {
        manageUserPage.validateManageUserPage();
    }
    @Then ("I see the number of app users")
    public void onNumberofUsers() {
        manageUserPage.validateNumberofUsers();
    }
    @And("I click the mute user icon")
    public void clickMuteIcon() {
        manageUserPage.clickMuteIcon();
    }
    @And("I click the mute option for {string}")
    public void clickMuteOption(String duration) {
        manageUserPage.clickMuteOption(duration);
    }
    @And("I click the mute button")
    public void clickMuteButton() {
        manageUserPage.clickMuteButton();
    }
    @And("I click on the block user icon")
    public void clickBlockIcon() {
        manageUserPage.clickBlockIcon();
    }
    @And("I click the block button")
    public void clickBlockButton() {
        manageUserPage.clickBlockButton();
    }
    @And("I click on the online user card")
    public void clickOnlineCard() {
        manageUserPage.clickOnlineCard();
    }
    @Then ("I see the number of online users of the application")
    public void onNumberofUsersOnline() {
        manageUserPage.validateNumberofUsersOnline();
    }
    @When("I am on the online user page")
    public void onTheUserOnlinePage() {
        manageUserPage.validateOnlineUserPage();
    }
    @And("I click the number of blocked users card")
    public void clickBlockCard() {
        manageUserPage.clickBlockCard();
    }
    @Then ("I see the number of blocked app users")
    public void onNumberofUsersBlock() {
        manageUserPage.validateNumberofUsersBlock();
    }
    @When("I am on the number of blocked users page")
    public void onTheBlockUserPage() {
        manageUserPage.validateTheBlockUserPage();
    }
    @And("I click the unblock user icon")
    public void clickUnblockIcon() {
        manageUserPage.clickUnblockIcon();
    }
    @Then ("I click the unblock button in the confirmation pop up")
    public void clickUnblockButton() {
        manageUserPage.clickUnblockButton();
    }
    @And("I click the card for the number of muted users")
    public void clickMuteCard() {
        manageUserPage.clickMuteCard();
    }
    @Then ("I see the number of muted app users")
    public void onNumberofUsersMute() {
        manageUserPage.validateNumberofUsersMute();
    }
    @When("I am on the page for the number of muted users")
    public void onTheMuteUserPage() {
        manageUserPage.validateMuteUserPage();
    }
    @And("I click the unmute user icon")
    public void clickUnmuteIcon() {
        manageUserPage.clickUnmuteIcon();
    }
    @Then ("I click the unmute button in the confirmation popup")
    public void clickUnmuteButton() {
        manageUserPage.clickUnmuteButton();
    }
    @And("I click on the search icon")
    public void clickSearchIcon() {
        manageUserPage.clickSearchIcon();
    }
    @And("I click the column search for users")
    public void clickColumnSearch() {
        manageUserPage.clickColumnSearch();
    }
    @And("I input {string} in the search field")
    public void inputWord(String word) {
        manageUserPage.inputWord(word);
    }
    @And("I hit enter on the keyboard")
    public void pressEnter() {
        manageUserPage.pressEnter();
    }
    @Then ("I am seeing search results for {string}")
    public void seeResultWord(String word) {
        manageUserPage.seeResultWord(word);
    }

}
