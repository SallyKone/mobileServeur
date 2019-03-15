package com.telco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.telco.dao.CommentaireRepository;
import com.telco.model.Commentaire;


@RestController
@RequestMapping(value="/commentaire")
public class CommentaireController {
	@Autowired
	private CommentaireRepository commentaireRepository;
	
	
	@RequestMapping(value="/liste",method=RequestMethod.GET) 
	public List<Commentaire> all() {
		return commentaireRepository.findAll();
	}
	
	@RequestMapping(value="/liste/{id}",method=RequestMethod.GET)
	public Commentaire getCommentaire(@PathVariable ("id")int id) {
		return commentaireRepository.getOne(id);
	}
			
	
	@RequestMapping(value="/save", method=RequestMethod.POST) 
	Commentaire newCommentaire(@RequestBody Commentaire newCommentaire) {
		return commentaireRepository.save(newCommentaire);
	}
	
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE) 
	public Boolean deleteCommentaire(@PathVariable Commentaire id){
		commentaireRepository.delete(id);
		return true;
	}
	
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT) 
	public Commentaire update(@RequestBody Commentaire commentaire, @PathVariable int id){
		commentaire.setId(id);
		return commentaireRepository.saveAndFlush(commentaire);
	}

}
