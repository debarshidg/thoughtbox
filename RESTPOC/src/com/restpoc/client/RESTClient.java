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
        sampleData.put("key", "ABC");
        
        WebResource resourcePost = c.resource("http://localhost:8080/RESTPOC/restpoc/mathOperation/post");
        String responsePost = resourcePost.post(String.class, sampleData.toString());
        System.out.println("responsePost: " + responsePost);
        
    }
}