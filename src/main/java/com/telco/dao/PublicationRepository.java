package com.telco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telco.model.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Integer> {

}
