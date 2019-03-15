package com.telco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telco.model.Media;

public interface MediaRepository extends JpaRepository<Media, Integer> {

}
