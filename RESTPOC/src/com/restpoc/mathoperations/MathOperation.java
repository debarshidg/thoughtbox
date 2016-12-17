package com.restpoc.mathoperations;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/mathOperation")
public class MathOperation {
	
	@GET
	@Produces("application/json")
	public Response mathOperation() throws JSONException {
		System.out.println("enter addNumbers");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("SUM", 10);
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}

	  @Path("{f}/{y}/{z}")
	  @GET
	  @Produces("application/json")
	  public Response mathOperation(@PathParam("f") float f, @PathParam("y") float y, @PathParam("y") float z) throws JSONException {
		System.out.println("enter addNumbers" + f + "" + y + "" + z);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("SUM", f + y + z);
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
}