package controllers;
import helpers.CreateJson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.Propertie;

public class TestController {
    protected Response response;
    protected RequestSpecification requestSpecification;
    protected APIManager apiManager = new APIManager();
    private CreateJson createJson= new CreateJson();

    public void baseURL() {
        requestSpecification.baseUri(Propertie.getValueByKey("baseUrl"));
    }

    public void contentType(String contentType) {
        requestSpecification = RestAssured.given().contentType(contentType);
    }

    public void endpointTicket(){
        requestSpecification.basePath(Propertie.getValueByKey("basePathTickets"));
    }

    public void creatTicket(String position){

        requestSpecification.with().body(createJson.createTicket(position));
        response=apiManager.post(requestSpecification);
    }
    public Response getResponse() {

        return response;
    }


}
