package com.telco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.telco.dao.RoleRepository;
import com.telco.model.Role;

@RestController
@RequestMapping(value="/role")
public class RoleController {
	@Autowired
	private RoleRepository roleRepository;
	
	
	@RequestMapping(value="/listerole",method=RequestMethod.GET) 
	public List<Role> all() {
		return roleRepository.findAll();
	}
	
	@RequestMapping(value="/listerole/{id}",method=RequestMethod.GET)
	public Role getRole(@PathVariable ("id")int id) {
		return roleRepository.getOne(id);
	}
			
	
	@RequestMapping(value="/saverole", method=RequestMethod.POST) 
	Role newRole(@RequestBody Role newRole) {
		return roleRepository.save(newRole);
	}
	
	
	@RequestMapping(value="/deleterole/{id}", method=RequestMethod.DELETE) 
	public Boolean deleteRole(@PathVariable Role id){
		roleRepository.delete(id);
		return true;
	}
	
	
	@RequestMapping(value="/updaterole/{id}", method=RequestMethod.PUT) 
	public Role update(@RequestBody Role role, @PathVariable int id){
		role.setId(id);
		return roleRepository.saveAndFlush(role);
	}
	

}
