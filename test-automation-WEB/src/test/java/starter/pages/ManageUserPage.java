package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ManageUserPage extends PageObject {
    private By manageUserIcon() {
        return By.id("sidebar-user");
    }
    private By validateManageUser() {
        return By.id("manage-user");
    }
    private By validateUsers() {
        return By.id("total-users");
    }
    private By muteIcon() {
        return By.id("mute-user");
    }
    private By muteOption(String duration) {
        switch (duration) {
            case "1 day":
                return By.xpath("//input[@value='1']");
            case "7 days":
                return By.xpath("//input[@value='7']");
            case "1 month":
                return By.xpath("//input[@value='30']");
            case "1 year":
                return By.xpath("//input[@value='365']");
            default:
                return null;
        }
    }
    private By muteButton() {
        return By.id("modal-mute-user");
    }
    private By blockIcon() {
        return By.id("block-user");
    }
    private By blockButton() {
        return By.id("modal-block-user");
    }
    private By onlineCard() {
        return By.id("online-users");
    }
    private By validateUsersOnline() {
        return By.id("online-users");
    }
    private By validateOnlineUser() {
        return By.id("online-users");
    }
    private By blockCard() {
        return By.id("blocked-users");
    }
    private By validateUsersBlock() {
        return By.id("blocked-users");
    }
    private By validateTheBlockUser() {
        return By.id("blocked-users");
    }
    private By unblockIcon() {
        return By.id("unblock-user");
    }
    private By unblockButton() {
        return By.id("modal-unblock-user");
    }
    private By muteCard() {
        return By.id("muted-users");
    }
    private By validateUsersMute() {
        return By.id("muted-users");
    }
    private By validateMuteUser() {
        return By.id("muted-users");
    }
    private By unmuteIcon() {
        return By.id("unmute-user");
    }
    private By unmuteButton() {
        return By.id("modal-unmute-user");
    }
    private By searchIcon() {
        return By.xpath("//button[@class='mt-[9px] mb-[9px] ml-[16px]']");
    }
    private By columnSearch() {
        return By.xpath("//form[@class='mt-[9px] mb-[9px] w-full']");
    }
    private By searchField() {
        return By.xpath("//input[@name='searchValue']");
    }
    private By validateResult(String word) {
//        return By.xpath("//div[@class='col-end-13 col-span-11 transition-all duration-200 ease-out  -ml-10']/div[3]/div[1]//div[@class='thread-card mt-3  flex h-16 items-center w-full']");
        switch (word) {
            case "irma":
                return By.xpath("//h1[@class='font-source-sans font-semibold text-[12px]']");
            case "tim":
                return By.xpath("//h1[@class='font-source-sans font-semibold text-[12px]']");
            case "colin":
                return By.xpath("//h1[@class='font-source-sans font-semibold text-[12px]']");
            case "damon":
                return By.xpath("//h1[@class='font-source-sans font-semibold text-[12px]']");
            case "chief":
                return By.xpath("//h6[@class='font-source-sans font-bold text-[12px]']");
            case "investor":
                return By.xpath("//h6[.='Investor Usability Executive']");
            default:
                return null;
        }
    }

    @Step
    public void clickManageUserIcon() {
        $(manageUserIcon()).click();
    }
    @Step
    public boolean validateManageUserPage() {
        return $(validateManageUser()).waitUntilPresent().isDisplayed();
    }
    @Step
    public boolean validateNumberofUsers() {
        return $(validateUsers()).waitUntilPresent().isDisplayed();
    }
    @Step
    public void clickMuteIcon() {
        $(muteIcon()).click();
    }
    @Step
    public void clickMuteOption(String duration) {
        $(muteOption(duration)).click();
    }
    @Step
    public void clickMuteButton() {
        $(muteButton()).click();
    }
    @Step
    public void clickBlockIcon() {
        $(blockIcon()).click();
    }
    @Step
    public void clickBlockButton() {
        $(blockButton()).click();
    }
    @Step
    public void clickOnlineCard() {
        $(onlineCard()).click();
    }
    @Step
    public boolean validateNumberofUsersOnline() {
        return $(validateUsersOnline()).waitUntilPresent().isDisplayed();
    }
    @Step
    public boolean validateOnlineUserPage() {
        return $(validateOnlineUser()).waitUntilPresent().isDisplayed();
    }
    @Step
    public void clickBlockCard() {
        $(blockCard()).click();
    }
    @Step
    public boolean validateNumberofUsersBlock() {
        return $(validateUsersBlock()).waitUntilPresent().isDisplayed();
    }
    @Step
    public boolean validateTheBlockUserPage() {
        return $(validateTheBlockUser()).waitUntilPresent().isDisplayed();
    }
    @Step
    public void clickUnblockIcon() {
        $(unblockIcon()).click();
    }
    @Step
    public void clickUnblockButton() {
        $(unblockButton()).click();
    }
    @Step
    public void clickMuteCard() {
        $(muteCard()).click();
    }
    @Step
    public boolean validateNumberofUsersMute() {
        return $(validateUsersMute()).waitUntilPresent().isDisplayed();
    }
    @Step
    public boolean validateMuteUserPage() {
        return $(validateMuteUser()).waitUntilPresent().isDisplayed();
    }
    @Step
    public void clickUnmuteIcon() {
        $(unmuteIcon()).click();
    }
    @Step
    public void clickUnmuteButton() {
        $(unmuteButton()).click();
    }
    @Step
    public void clickSearchIcon() {
        $(searchIcon()).click();
    }
    @Step
    public void clickColumnSearch() {
        $(columnSearch()).click();
    }
    @Step
    public void inputWord(String word) {
        $(searchField()).type(word);
    }
    @Step
    public void pressEnter() {
        $(searchField()).sendKeys(Keys.ENTER);
    }
    @Step
    public String seeResultWord(String word) {
        return $(validateResult(word)).waitUntilPresent().getText();
    }
}
