package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.bookmarks.DeleteBookmarks;
import starter.bookmarks.GetBookmarksAll;
import starter.bookmarks.PostBookmarks;

public class BookmarksSteps {
    @Steps
    PostBookmarks Post;
    @Steps
    GetBookmarksAll GetAll;
    @Steps
    DeleteBookmarks Delete;

    //Create bookmark
    @Given("I set POST api endpoints new bookmark")
    public void setPostApiEndpointsNewBookmark(){
        Post.setPostApiEndpoints();
    }
    @When("I send POST HTTP request new bookmark")
    public void sendPostHttpRequestNewBookmark(){
        Post.sendPostHTTPRequest();
    }

    @Given("I set POST api endpoints new bookmark invalid")
    public void setPostApiEndpointsNewBookmarkInvalid(){
        Post.setPostApiEndpointInvalid();
    }
    @When("I send POST HTTP request new bookmark invalid")
    public void sendPostHttpRequestNewBookmarkInvalid(){
        Post.sendPostHTTPRequestInvalid();
    }


    //Get all bookmarks
    @Given("I set GET api endpoints all bookmarks")
    public void setGetApiEndpointsAllBookmarks() {
        GetAll.setApiEndpoints();
    }
    @When("I send GET HTTP request all bookmarks")
    public void sendGetHttpRequestAllBookmarks(){
        GetAll.sendGetHttpRequest();
    }

    @Given("I set GET api endpoints all bookmarks invalid")
    public void setGetApiEndpointsAllBookmarksInvalid() {
        GetAll.setApiEndpointsInvalid();
    }
    @When("I send GET HTTP request all bookmarks invalid")
    public void sendGetHttpRequestAllBookmarskInvalid(){
        GetAll.sendGetHttpRequestInvalid();
    }


    //Delete a bookmark
    @Given("I set DELETE api endpoints delete bookmark")
    public void setDeleteApiEndpoints(){
        Delete.setDeleteApiEndpoints();
    }
    @When("I send DELETE HTTP request delete bookmark")
    public void sendDeleteApiEndpoints(){
        Delete.sendDeleteHttpRequest();
    }

    @Given("I set DELETE api endpoints delete bookmark invalid")
    public void setDeleteApiEndpointsInvalid(){
        Delete.setDeleteApiEndpointsInvalid();
    }
    @When("I send DELETE HTTP request delete bookmark invalid")
    public void sendDeleteApiEndpointsInvalid(){
        Delete.sendDeleteHttpRequestInvalid();
    }
}
