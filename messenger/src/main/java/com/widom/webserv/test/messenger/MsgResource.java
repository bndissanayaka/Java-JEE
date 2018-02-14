package com.widom.webserv.test.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wisdom.webserv.model.Message;
import com.wisdom.webserv.service.MessageService;

@Path("")
public class MsgResource {
	MessageService ms = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMsg() {
		return ms.getAllMsg();
	}
}
