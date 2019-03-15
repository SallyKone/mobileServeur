package com.telco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telco.model.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Integer> {

}
