package com.telco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.telco.dao.PublicationRepository;
import com.telco.model.Publication;

@RestController
@RequestMapping(value="/publier")
public class PublicationController {
	@Autowired
	private PublicationRepository publicationRepository;
	
	
	@RequestMapping(value="/listepub",method=RequestMethod.GET) 
	public List<Publication> all() {
		return publicationRepository.findAll();
	}
	
	@RequestMapping(value="/listepub/{id}",method=RequestMethod.GET)
	public Publication getpublication(@PathVariable ("id")int id) {
		return publicationRepository.getOne(id);
	}
			
	
	@RequestMapping(value="/savepub", method=RequestMethod.POST) 
	Publication newPublication(@RequestBody Publication newPublication) {
		return publicationRepository.save(newPublication);
	}
	
	
	@RequestMapping(value="/deletepub/{id}", method=RequestMethod.DELETE) 
	public Boolean deletePublication(@PathVariable Publication id){
		publicationRepository.delete(id);
		return true;
	}
	
	
	@RequestMapping(value="/updatepub/{id}", method=RequestMethod.PUT) 
	public Publication update(@RequestBody Publication publication, @PathVariable int id){
		publication.setId(id);
		return publicationRepository.saveAndFlush(publication);
	}

}
