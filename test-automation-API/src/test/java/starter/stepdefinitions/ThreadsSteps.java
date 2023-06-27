package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.threads.*;

public class ThreadsSteps {
    @Steps
    PostTheads Post;
    @Steps
    GetTheadsAll GetAll;
    @Steps
    GetThreadsId GetId;
    @Steps
    GetThreadsTitle GetTitle;
    @Steps
    GetThreadsTopic GetTopic;
    @Steps
    PutThreads Update;
    @Steps
    DeleteThreads Delete;
    @Steps
    PostLikes Like;
    @Steps
    GetLikesId GetLike;
    @Steps
    DeleteLikes Unlike;
    @Steps
    PostFollow Follow;
    @Steps
    DeleteUnfollow Unfollow;

    //Create threads
    @Given("I set POST api endpoints new thread")
    public void setPostApiEndpointsNewThread(){
        Post.setPostApiEndpoints();
    }
    @When("I send POST HTTP request new thread")
    public void sendPostHttpRequestNewThread(){
        Post.sendPostHTTPRequest();
    }

    @Given("I set POST api endpoints new thread invalid")
    public void setPostApiEndpointsNewThreadInvalid(){
        Post.setPostApiEndpointInvalid();
    }
    @When("I send POST HTTP request new thread invalid")
    public void sendPostHttpRequestNewThreadInvalid(){
        Post.sendPostHTTPRequestInvalid();
    }

    //Get all threads
    @Given("I set GET api endpoints all threads")
    public void setGetApiEndpointsAllThreads() {
        GetAll.setApiEndpoints();
    }
    @When("I send GET HTTP request all threads")
    public void sendGetHttpRequestAllThreads(){
        GetAll.sendGetHttpRequest();
    }

    @Given("I set GET api endpoints all threads invalid")
    public void setGetApiEndpointsAllThreadsInvalid() {
        GetAll.setApiEndpointsInvalid();
    }
    @When("I send GET HTTP request all threads invalid")
    public void sendGetHttpRequestAllThreadsInvalid(){
        GetAll.sendGetHttpRequestInvalid();
    }
    @Then("I receive valid HTTP response code 404")
    public void receiveHttpResponseCode404(){
        GetAll.validateHttpResponseCode404();
    }
    @And("I receive valid data for response code 404")
    public void receiveValidDataForResponseCode404(){
        GetAll.validateDataInvalidForResponseCode404();
    }

    //Get all threads by admin
    @Given("I set GET api endpoints all threads by admin")
    public void setGetApiEndpointsAllThreadsByAdmin() {
        GetAll.setApiEndpointsByAdmin();
    }
    @When("I send GET HTTP request all threads by admin")
    public void sendGetHttpRequestAllThreadsByAdmin(){
        GetAll.sendGetHttpRequestByAdmin();
    }

    @When("I send GET HTTP request all threads invalid by admin")
    public void sendGetHttpRequestAllThreadsInvalidByAdmin(){
        GetAll.sendGetHttpRequestInvalidByAdmin();
    }

    //Get threads by id
    @Given("I set GET api endpoints thread by id")
    public void setGetApiEndpointsById() {
        GetId.setApiEndpointsById();
    }
    @When("I send GET HTTP request thread by id")
    public void sendGetHttpRequestById(){
        GetId.sendGetHttpRequest();
    }

    @Given("I set GET api endpoints thread by id invalid")
    public void setGetApiEndpointsByIdInvalid() {
        GetId.setApiEndpointsInvalid();
    }
    @When("I send GET HTTP request thread by id invalid")
    public void sendGetHttpRequestByIdInvalid(){
        GetId.sendGetHttpRequestInvalid();
    }


    //Get threads by title
    @Given("I set GET api endpoints thread by title")
    public void setGetApiEndpointsByTitle() {
        GetTitle.setApiEndpointsByTitle();
    }
    @When("I send GET HTTP request thread by title")
    public void sendGetHttpRequestByTitle(){
        GetTitle.sendGetHttpRequest();
    }

    @Given("I set GET api endpoints thread by title invalid")
    public void setGetApiEndpointsByTitleInvalid() {
        GetTitle.setApiEndpointsInvalid();
    }
    @When("I send GET HTTP request thread by title invalid")
    public void sendGetHttpRequestByTitleInvalid(){
        GetTitle.sendGetHttpRequestInvalid();
    }


    //Get threads by topic
    @Given("I set GET api endpoints thread by topic")
    public void setGetApiEndpointsByTopic() {
        GetTopic.setApiEndpointsByTopic();
    }
    @When("I send GET HTTP request thread by topic")
    public void sendGetHttpRequestByTopic(){
        GetTopic.sendGetHttpRequest();
    }

    @Given("I set GET api endpoints thread by topic invalid")
    public void setGetApiEndpointsByTopicInvalid() {
        GetTopic.setApiEndpointsInvalid();
    }
    @When("I send GET HTTP request thread by topic invalid")
    public void sendGetHttpRequestByTopicInvalid(){
        GetTopic.sendGetHttpRequestInvalid();
    }


    //Update threads +
    @Given("I set PUT api endpoints update thread")
    public void setPutApiEndpointsUpdateThread(){
        Update.setPutApiEndpointsUpdateThread();
    }
    @When("I send PUT HTTP request update thread")
    public void sendPutHttpRequestUpdateThread(){
        Update.sendPutHttpRequestUpdateThread();
    }

    //Update threads -
    @Given("I set PUT api endpoints update thread invalid")
    public void setPutApiEndpointsUpdateThreadInvalid(){
        Update.setPutApiEndpointsUpdateThreadInvalid();
    }
    @When("I send PUT HTTP request update thread invalid")
    public void sendPutHttpRequestUpdateThreadInvalid(){
        Update.sendPutHttpRequestUpdateThreadInvalid();
    }

    //Update threads +
    @Given("I set PUT api endpoints update thread by admin")
    public void setPutApiEndpointsUpdateThreadByAdmin(){
        Update.setPutApiEndpointsUpdateThreadByAdmin();
    }
    @When("I send PUT HTTP request update thread by admin")
    public void sendPutHttpRequestUpdateThreadByAdmin(){
        Update.sendPutHttpRequestUpdateThreadByAdmin();
    }
    @When("I send PUT HTTP request update thread invalid by admin")
    public void sendPutHttpRequestUpdateThreadInvalidByAdmin(){
        Update.sendPutHttpRequestUpdateThreadInvalidByAdmin();
    }


    //Delete a thread
    @Given("I set DELETE api endpoints delete thread")
    public void setDeleteApiEndpoints(){
        Delete.setDeleteApiEndpoints();
    }
    @When("I send DELETE HTTP request delete thread")
    public void sendDeleteApiEndpoints(){
        Delete.sendDeleteHttpRequest();
    }

    @Given("I set DELETE api endpoints delete thread invalid")
    public void setDeleteApiEndpointsInvalid(){
        Delete.setDeleteApiEndpointsInvalid();
    }
    @When("I send DELETE HTTP request delete thread invalid")
    public void sendDeleteApiEndpointsInvalid(){
        Delete.sendDeleteHttpRequestInvalid();
    }

    //Delete a thread by admin
    @Given("I set DELETE api endpoints delete thread by admin")
    public void setDeleteApiEndpointsByAdmin(){
        Delete.setDeleteApiEndpointsByAdmin();
    }
    @When("I send DELETE HTTP request delete thread by admin")
    public void sendDeleteApiEndpointsByAdmin(){
        Delete.sendDeleteHttpRequestByAdmin();
    }


    //Create like
    @Given("I set POST api endpoints new like")
    public void setPostApiEndpointsNewLike(){
        Like.setPostApiEndpoints();
    }
    @When("I send POST HTTP request new like")
    public void sendPostHttpRequestNewLike(){
        Like.sendPostHTTPRequest();
    }

    @Given("I set POST api endpoints new like invalid")
    public void setPostApiEndpointsNewLikeInvalid(){
        Like.setPostApiEndpointInvalid();
    }
    @When("I send POST HTTP request new like invalid")
    public void sendPostHttpRequestNewLikeInvalid(){
        Like.sendPostHTTPRequestInvalid();
    }


    //Get like by id
    @Given("I set GET api endpoints like by id")
    public void setGetApiEndpointsLikeById() {
        GetLike.setApiEndpointsById();
    }
    @When("I send GET HTTP request like by id")
    public void sendGetHttpRequestLikeById(){
        GetLike.sendGetHttpRequest();
    }

    @Given("I set GET api endpoints like by id invalid")
    public void setGetApiEndpointsLikeByIdInvalid() {
        GetLike.setApiEndpointsInvalid();
    }
    @When("I send GET HTTP request like by id invalid")
    public void sendGetHttpRequestLikeByIdInvalid(){
        GetLike.sendGetHttpRequestInvalid();
    }


    //Delete a like
    @Given("I set DELETE api endpoints delete like")
    public void setDeleteApiEndpointsLike(){
        Unlike.setDeleteApiEndpoints();
    }
    @When("I send DELETE HTTP request delete like")
    public void sendDeleteApiEndpointsLike(){
        Unlike.sendDeleteHttpRequest();
    }

    @Given("I set DELETE api endpoints delete like invalid")
    public void setDeleteApiEndpointsInvalidLike(){
        Unlike.setDeleteApiEndpointsInvalid();
    }
    @When("I send DELETE HTTP request delete like invalid")
    public void sendDeleteApiEndpointsInvalidLike(){
        Unlike.sendDeleteHttpRequestInvalid();
    }


    //Follow a threads
    @Given("I set POST api endpoints follow thread")
    public void setPostApiEndpointsFollowThread(){
        Follow.setPostApiEndpoints();
    }
    @When("I send POST HTTP request follow thread")
    public void sendPostHttpRequestFollowThread(){
        Follow.sendPostHTTPRequest();
    }

    @Given("I set POST api endpoints follow thread invalid")
    public void setPostApiEndpointsFollowThreadInvalid(){
        Follow.setPostApiEndpointInvalid();
    }
    @When("I send POST HTTP request follow thread invalid")
    public void sendPostHttpRequestFollowThreadInvalid(){
        Follow.sendPostHTTPRequestInvalid();
    }


    //Unfollow a thread
    @Given("I set POST api endpoints unfollow thread")
    public void setDeleteApiEndpointsUnfollowThread(){
        Unfollow.setDeleteApiEndpoints();
    }
    @When("I send POST HTTP request unfollow thread")
    public void sendDeleteApiEndpointsUnfollowThread(){
        Unfollow.sendDeleteHttpRequest();
    }

    @Given("I set POST api endpoints unfollow thread invalid")
    public void setDeleteApiEndpointsUnfollowThreadInvalid(){
        Delete.setDeleteApiEndpointsInvalid();
    }
    @When("I send POST HTTP request unfollow thread invalid")
    public void sendDeleteApiEndpointsUnfollowThreadInvalid(){
        Delete.sendDeleteHttpRequestInvalid();
    }
}
