package com.telco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telco.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
