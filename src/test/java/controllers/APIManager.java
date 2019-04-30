package controllers;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.Propertie;

public class APIManager {

     public Response post(RequestSpecification requestSpecification){
          return requestSpecification.when().port(Integer.parseInt(Propertie.getValueByKey("port"))).post();
     }
     public Response delete(RequestSpecification requestSpecification){
          return requestSpecification.when().port(Integer.parseInt(Propertie.getValueByKey("port"))).delete();
     }
     }



