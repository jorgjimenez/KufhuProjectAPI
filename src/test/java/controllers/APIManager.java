package controllers;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.Propertie;

public class APIManager {

     public Response post(RequestSpecification requestSpecification){
          return requestSpecification.when().port(80).post();
     }
     }


