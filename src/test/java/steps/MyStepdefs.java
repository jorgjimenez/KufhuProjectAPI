package steps;

import controllers.HttpController;
import controllers.TestController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import utils.DataSession;


public class MyStepdefs {
    ///TODO Cambiar nombre de la clase cuando halla mas features
    private TestController testController = new TestController();
    private HttpController httpController = new HttpController();

    ///////////////////BACKGROUND///////////////////////////////////////////
    @Given("^the user has the information of BaseURL$")
    public void theUserHasTheInformationOfBaseURL() {
        httpController.contentType("application/json");
        httpController.baseURL();
    }
//////////////////////SCENARIOS////////////////////////////////////////////////////
///CREATE TICKET ///
    @Given("^The user want to create a ticket$")
    public void theUserWantToCreateATicket() {
        httpController.endpointTicket();
    }

    @When("^the user sends a request to create a ticket for a \"([^\"]*)\" position$")
    public void theUserSendsARequestToCreateATicketForAPosition(String position) throws Throwable {
        //TODO tabla BDD scenario outline
        testController.creatTicket(position);
    }

    @Then("^the ticket is created$")
    public void theTicketIsCreated() {
        Assert.assertEquals(200, testController.getResponse().getStatusCode());
        JsonPath jsonResponse = testController.getResponse().jsonPath();
        Assert.assertNotNull(jsonResponse.get("id").toString());
        Assert.assertEquals(jsonResponse.get("title").toString(),DataSession.getFromSession(DataSession.Data.title));
    }

//DELETE TICKET////
    @When("^the user delete the ticket$")
    public void theUserDeleteTheTicket() {
        testController.deleteTicket();
    }

    @Then("^the ticket has been deleted$")
    public void theTicketHasBeenDeleted() {
    }
}
