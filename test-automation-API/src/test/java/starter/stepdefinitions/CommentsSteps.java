package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.comments.*;

public class CommentsSteps {
    @Steps
    PostComments Post;
    @Steps
    GetCommentsAll GetAll;
    @Steps
    GetCommentsId GetId;
    @Steps
    PutComments Update;
    @Steps
    DeleteComments Delete;

    //Create comment
    @Given("I set POST api endpoints new comment")
    public void setPostApiEndpointsNewComment(){
        Post.setPostApiEndpoints();
    }
    @When("I send POST HTTP request new comment")
    public void sendPostHttpRequestNewComment(){
        Post.sendPostHTTPRequest();
    }

    @Given("I set POST api endpoints new comment invalid")
    public void setPostApiEndpointsNewCommentInvalid(){
        Post.setPostApiEndpointInvalid();
    }
    @When("I send POST HTTP request new comment invalid")
    public void sendPostHttpRequestNewCommentInvalid(){
        Post.sendPostHTTPRequestInvalid();
    }

    //Get all comments
    @Given("I set GET api endpoints all comments")
    public void setGetApiEndpointsAllComments() {
        GetAll.setApiEndpoints();
    }
    @When("I send GET HTTP request all comments")
    public void sendGetHttpRequestAllComments(){
        GetAll.sendGetHttpRequest();
    }

    @Given("I set GET api endpoints all comments invalid")
    public void setGetApiEndpointsAllCommentsInvalid() {
        GetAll.setApiEndpointsInvalid();
    }
    @When("I send GET HTTP request all comments invalid")
    public void sendGetHttpRequestAllCommentsInvalid(){
        GetAll.sendGetHttpRequestInvalid();
    }

    //Get comment by id
    @Given("I set GET api endpoints comment by id")
    public void setGetApiEndpointsById() {
        GetId.setApiEndpointsById();
    }
    @When("I send GET HTTP request comment by id")
    public void sendGetHttpRequestById(){
        GetId.sendGetHttpRequest();
    }

    @Given("I set GET api endpoints comment by id invalid")
    public void setGetApiEndpointsByIdInvalid() {
        GetId.setApiEndpointsInvalid();
    }
    @When("I send GET HTTP request comment by id invalid")
    public void sendGetHttpRequestByIdInvalid(){
        GetId.sendGetHttpRequestInvalid();
    }


    //Update comment +
    @Given("I set PUT api endpoints update comment")
    public void setPutApiEndpointsUpdateComment(){
        Update.setPutApiEndpointsUpdateComment();
    }
    @When("I send PUT HTTP request update comment")
    public void sendPutHttpRequestUpdateComment(){
        Update.sendPutHttpRequestUpdateComment();
    }

    //Update comment -
    @Given("I set PUT api endpoints update comment invalid")
    public void setPutApiEndpointsUpdateCommentInvalid(){
        Update.setPutApiEndpointsUpdateCommentInvalid();
    }
    @When("I send PUT HTTP request update comment invalid")
    public void sendPutHttpRequestUpdateCommentInvalid(){
        Update.sendPutHttpRequestUpdateCommentInvalid();
    }


    //Delete a comment
    @Given("I set DELETE api endpoints delete comment")
    public void setDeleteApiEndpoints(){
        Delete.setDeleteApiEndpoints();
    }
    @When("I send DELETE HTTP request delete comment")
    public void sendDeleteApiEndpoints(){
        Delete.sendDeleteHttpRequest();
    }

    @Given("I set DELETE api endpoints delete comment invalid")
    public void setDeleteApiEndpointsInvalid(){
        Delete.setDeleteApiEndpointsInvalid();
    }
    @When("I send DELETE HTTP request delete comment invalid")
    public void sendDeleteApiEndpointsInvalid(){
        Delete.sendDeleteHttpRequestInvalid();
    }
}
