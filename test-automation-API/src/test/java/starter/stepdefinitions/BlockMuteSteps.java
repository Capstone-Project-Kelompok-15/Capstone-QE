package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.blockmute.DeleteBlock;
import starter.blockmute.DeleteMute;
import starter.blockmute.PostBlock;
import starter.blockmute.PostMute;

public class BlockMuteSteps {
    @Steps
    PostMute Mute;
    @Steps
    DeleteMute Unmute;
    @Steps
    PostBlock Block;
    @Steps
    DeleteBlock Unblock;


    //Mute a user
    @Given("I set POST api endpoints mute user")
    public void setPostApiEndpointsMuteUser(){
        Mute.setPostApiEndpoints();
    }
    @When("I send POST HTTP request mute user")
    public void sendPostHttpRequestMuteUser(){
        Mute.sendPostHTTPRequest();
    }

    @Given("I set POST api endpoints mute user invalid")
    public void setPostApiEndpointsMuteUserInvalid(){
        Mute.setPostApiEndpointInvalid();
    }
    @When("I send POST HTTP request mute user invalid")
    public void sendPostHttpRequestMuteUserInvalid(){
        Mute.sendPostHTTPRequestInvalid();
    }


    //Unmute a user
    @Given("I set POST api endpoints unmute user")
    public void setDeleteApiEndpointsUnmuteUser(){
        Unmute.setDeleteApiEndpoints();
    }
    @When("I send POST HTTP request unmute user")
    public void sendDeleteApiEndpointsUnmuteUser(){
        Unmute.sendDeleteHttpRequest();
    }

    @Given("I set POST api endpoints unmute user invalid")
    public void setDeleteApiEndpointsUnmuteUserInvalid(){
        Unmute.setDeleteApiEndpointsInvalid();
    }
    @When("I send POST HTTP request unmute user invalid")
    public void sendDeleteApiEndpointsUnmuteUserInvalid(){
        Unmute.sendDeleteHttpRequestInvalid();
    }


    //Block a user
    @Given("I set POST api endpoints block user")
    public void setPostApiEndpointsBlockUser(){
        Block.setPostApiEndpoints();
    }
    @When("I send POST HTTP request block user")
    public void sendPostHttpRequestBlockUser(){
        Block.sendPostHTTPRequest();
    }

    @Given("I set POST api endpoints block user invalid")
    public void setPostApiEndpointsUnblockUserInvalid(){
        Block.setPostApiEndpointInvalid();
    }
    @When("I send POST HTTP request block user invalid")
    public void sendPostHttpRequestUnblockUserInvalid(){
        Block.sendPostHTTPRequestInvalid();
    }


    //Unblock a user
    @Given("I set POST api endpoints unblock user")
    public void setDeleteApiEndpointsUnblockUser(){
        Unblock.setDeleteApiEndpoints();
    }
    @When("I send POST HTTP request unblock user")
    public void sendDeleteApiEndpointsUnblockUser(){
        Unblock.sendDeleteHttpRequest();
    }

    @Given("I set POST api endpoints unblock user invalid")
    public void setDeleteApiEndpointsUnblockUserInvalid(){
        Unblock.setDeleteApiEndpointsInvalid();
    }
    @When("I send POST HTTP request unblock user invalid")
    public void sendDeleteApiEndpointsUnblockUserInvalid(){
        Unblock.sendDeleteHttpRequestInvalid();
    }
}
