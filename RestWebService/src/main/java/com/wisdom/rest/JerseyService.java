package com.wisdom.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class JerseyService {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Employee 1"));
		list.add(new Employee(2, "Employee 2"));
		list.add(new Employee(3, "Employee 3"));
		return list;
	}
}