package com.restpoc.jaxb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employee")
public class XMLService {
	@GET
	@Path("/{empNo}/xml")
	@Produces(MediaType.APPLICATION_XML)
	public Employee getCustomerInXML(@PathParam("empNo") int empNo) {
		Employee empObj = new Employee();
		empObj.setEmpName("Debarshi");
		empObj.setEmpNo(empNo);
		return empObj;
	}
	@GET
	@Path("/{empNo}/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getCustomerInJSON(@PathParam("empNo") int empNo) {
		Employee empObj = new Employee();
		empObj.setEmpName("Debarshi");
		empObj.setEmpNo(empNo);
		return empObj;
	}
}