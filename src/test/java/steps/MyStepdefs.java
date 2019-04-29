package steps;

import controllers.TestController;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;


public class MyStepdefs {
    private TestController testController = new TestController();
///////////////////BACKGROUND///////////////////////////////////////////
    @Given("^the user has the information of BaseURL$")
    public void theUserHasTheInformationOfBaseURL() {
        testController.contentType("application/json");
        testController.baseURL();
    }

//////////////////////SCENARIOS////////////////////////////////////////////////////

    @Given("^The user want to create a ticket$")
    public void theUserWantToCreateATicket() {
        testController.endpointTicket();
    }

    @When("^the user sends a request to create a ticket for a \"([^\"]*)\" position$")
    public void theUserSendsARequestToCreateATicketForAPosition(String position) throws Throwable {
        testController.creatTicket(position);
    }

    @Then("^the ticket is created$")
    public void theTicketIsCreated() {
        Assert.assertEquals(200, testController.getResponse().getStatusCode());
        //TODO validaciones mas fuertes con DATASESSION
    }


}
