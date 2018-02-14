package com.wisdom.test;
import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.client.ClientConfig;
public class TestWebService {
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI());
		// Get XML
		String xmlResponse = target.path("rest").path("employees").request().accept(MediaType.TEXT_XML).get(String.class);
		// Get XML for application
		String xmlAppResponse = target.path("rest").path("employees").request().accept(MediaType.APPLICATION_XML).get(String.class);
		System.out.println(xmlResponse);
		System.out.println(xmlAppResponse);
		}
		private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8181/RestWebService/").build();
		}
		}

