package com.restpoc.client;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class RESTClient {
    public static void main(String[] args) {
        Client c = Client.create();
        WebResource resourceGet = c.resource("http://localhost:8080/RESTPOC/restpoc/mathOperation/10/20/30");
        String responseGet = resourceGet.get(String.class);
        System.out.println("responseGet: " + responseGet);
        
        JSONObject sampleData = new JSONObject();
        sampleData.put("key1", "ABC");
        sampleData.put("key2", "DEF");
        
        WebResource resourcePost = c.resource("http://localhost:8080/RESTPOC/restpoc/mathOperation/post");
        String responsePost = resourcePost.post(String.class, sampleData.toString());
        System.out.println("responsePost: " + responsePost);
        
        WebResource resourcePostJAXB = c.resource("http://localhost:8080/RESTPOC/restpoc/employee/999/xml");
        String responseJAXB = resourcePostJAXB.get(String.class);
        System.out.println("responseJAXB: " + responseJAXB);
        
        WebResource resourcePostJAXBJSON = c.resource("http://localhost:8080/RESTPOC/restpoc/employee/999/json");
        String responseJAXBJSON = resourcePostJAXBJSON.get(String.class);
        System.out.println("responseJAXBJSON: " + responseJAXBJSON);
        
    }
}
