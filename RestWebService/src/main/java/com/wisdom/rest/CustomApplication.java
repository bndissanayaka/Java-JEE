package com.wisdom.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class CustomApplication extends Application {
	// Add Service APIs
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<Class<?>>();
		// register REST modules
		resources.add(JerseyService.class);
		return resources;
	}
}