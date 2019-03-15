package com.telco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.telco.dao.MediaRepository;
import com.telco.model.Media;

@RestController
@RequestMapping(value="/media")
public class MediaController {
	
	@Autowired
	private MediaRepository mediaRepository;
	
	
	@RequestMapping(value="/listemedia",method=RequestMethod.GET) 
	public List<Media> all() {
		return mediaRepository.findAll();
	}
	
	@RequestMapping(value="/listemedia/{id}",method=RequestMethod.GET)
	public Media getMedia(@PathVariable ("id")int id) {
		return mediaRepository.getOne(id);
	}
			
	
	@RequestMapping(value="/savemedia", method=RequestMethod.POST) 
	Media newMedia(@RequestBody Media newMedia) {
		return mediaRepository.save(newMedia);
	}
	
	
	@RequestMapping(value="/deletemedia/{id}", method=RequestMethod.DELETE) 
	public Boolean deleteMedia(@PathVariable Media id){
		mediaRepository.delete(id);
		return true;
	}
	
	
	@RequestMapping(value="/updatemedia/{id}", method=RequestMethod.PUT) 
	public Media update(@RequestBody Media media, @PathVariable int id){
		media.setId(id);
		return mediaRepository.saveAndFlush(media);
	}

}
