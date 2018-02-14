package com.wisdom.webserv.service;

import java.util.ArrayList;
import java.util.List;

import com.wisdom.webserv.model.Message;

public class MessageService {

	public List<Message> getAllMsg()
	{
		Message m1 = new Message(1, "Hi World", "Bhagya");
		Message m2 = new Message(2, "Hi all", "Bhagya");
		
		List<Message> msg = new ArrayList<Message>();
		msg.add(m1);
		msg.add(m2);
		
		return msg;
		
	}
}
