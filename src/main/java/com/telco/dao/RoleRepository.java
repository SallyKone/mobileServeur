package com.telco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telco.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	

}
