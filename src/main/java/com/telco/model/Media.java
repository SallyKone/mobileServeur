package com.telco.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Media implements Serializable {
 @Id
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private int id;
 @Column(name="Libelle", length=50)
 private String libelle;
 @Column(name="Type_media", length=20)
 private String type_media;
 @ManyToOne
 @JoinColumn(name="User", referencedColumnName = "id")
 private User user;
public Media() {
	super();
	// TODO Auto-generated constructor stub
}
public Media(int id, String libelle, String type_media, User user) {
	super();
	this.id = id;
	this.libelle = libelle;
	this.type_media = type_media;
	this.user = user;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public String getType_media() {
	return type_media;
}
public void setType_media(String type_media) {
	this.type_media = type_media;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
 
 
}
