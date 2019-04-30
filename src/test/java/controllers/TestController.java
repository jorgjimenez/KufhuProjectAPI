package controllers;
import helpers.JsonTicket;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.DataSession;
import utils.Propertie;

public class TestController {
    protected Response response;
    protected static RequestSpecification requestSpecification;
    protected APIManager apiManager = new APIManager();
    private JsonTicket jsonTicket = new JsonTicket();



    public void creatTicket(String position){

        requestSpecification.with().body(jsonTicket.createTicket(position));
        response=apiManager.post(requestSpecification);
    }

    public void deleteTicket(){
        String id=DataSession.getFromSession(DataSession.Data.id);
        response=apiManager.delete(requestSpecification);
    }
    public Response getResponse() {
        return response;
    }


}
