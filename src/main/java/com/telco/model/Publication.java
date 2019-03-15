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
public class Publication implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column(name="Titre", length=100)
	private String titre;
	private Date date;
	private Time heure;
	@Column(name="Description", length=255)
	private String description;
	@ManyToOne
	@JoinColumn(name="media", referencedColumnName="id")
	private Media media;
	@ManyToOne
	@JoinColumn(name="utilisateur", referencedColumnName="id")
	private User user;
	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Publication(int id, String titre, Date date, Time heure, String description, Media media, User user) {
		super();
		this.id = id;
		this.titre = titre;
		this.date = date;
		this.heure = heure;
		this.description = description;
		this.media = media;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Media getMedia() {
		return media;
	}
	public void setMedia(Media media) {
		this.media = media;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
