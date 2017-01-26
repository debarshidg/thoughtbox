package com.restpoc.mathoperations;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/employeeList")
public class EmployeeList {

	@GET
	@Produces("application/json")
	public Response mathOperation() throws JSONException {
		System.out.println("enter addNumbers");
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("name", "Debarshi").put("gender", 1).put("salary", 1000);
		
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("name", "Paromita").put("gender", 2).put("salary", 2000);
		
		JSONArray jsonArr = new JSONArray();
		jsonArr.put(jsonObject1);
		jsonArr.put(jsonObject2);
		return Response.status(200).entity(jsonArr.toString()).build();
	}

	@POST
	@Path("/post")
	@Produces("application/json")
	public Response mathOperationPost(String msg)throws JSONException {
		System.out.println("Param " + msg);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("param", msg);
		String result = "@Produces(\"application/json\") Output5: \n\nF to C Converter Output: \n\n"
				+ jsonObject;
		return Response.status(200).entity(result).build();
	}	
	
}