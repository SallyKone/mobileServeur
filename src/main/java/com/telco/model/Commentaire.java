package com.telco.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Commentaire implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Libelle", length=250)
	private String libelle;
	private Date date;
	private Time heure;
	@ManyToOne
	@JoinColumn(name="user" ,referencedColumnName="id")
	private User user;
	@ManyToOne
	@JoinColumn(name="publication" ,referencedColumnName="id")
	private Publication publication;
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commentaire(int id, String libelle, Date date, Time heure, User user, Publication publication) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.date = date;
		this.heure = heure;
		this.user = user;
		this.publication = publication;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getHeure() {
		return heure;
	}
	public void setHeure(Time heure) {
		this.heure = heure;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Publication getPublication() {
		return publication;
	}
	public void setPublication(Publication publication) {
		this.publication = publication;
	}
	
	

}
