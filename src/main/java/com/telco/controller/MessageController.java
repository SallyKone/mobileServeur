package com.telco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.telco.dao.MessageRepository;
import com.telco.model.Message;

@RestController
@RequestMapping(value="/message")
public class MessageController {
	@Autowired
	private MessageRepository messageRepository;
	
	
	@RequestMapping(value="/listeMessage",method=RequestMethod.GET) 
	public List<Message> all() {
		return messageRepository.findAll();
	}
	
	@RequestMapping(value="/listeMessage/{id}",method=RequestMethod.GET)
	public Message getMessage(@PathVariable ("id")int id) {
		return messageRepository.getOne(id);
	}
			
	
	@RequestMapping(value="/saveMessage", method=RequestMethod.POST) 
	Message newMessage(@RequestBody Message newMessage) {
		return messageRepository.save(newMessage);
	}
	
	
	@RequestMapping(value="/deleteMessage/{id}", method=RequestMethod.DELETE) 
	public Boolean deleteMessage(@PathVariable Message id){
		messageRepository.delete(id);
		return true;
	}
	
	
	@RequestMapping(value="/updateMessage/{id}", method=RequestMethod.PUT) 
	public Message update(@RequestBody Message message, @PathVariable int id){
		message.setId(id);
		return messageRepository.saveAndFlush(message);
	}

}
