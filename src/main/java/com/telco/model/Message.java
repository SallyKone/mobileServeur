package com.telco.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String Contenu;
	private Date date;
	private Time heure;
	@ManyToOne
	@JoinColumn(name="id_envoyeur", referencedColumnName="id")
	private User user;
	@ManyToOne
	@JoinColumn(name="id_recepteur", referencedColumnName="id")
	private User users;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(int id, String contenu, Date date, Time heure, User user, User users) {
		super();
		this.id = id;
		Contenu = contenu;
		this.date = date;
		this.heure = heure;
		this.user = user;
		this.users = users;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContenu() {
		return Contenu;
	}
	public void setContenu(String contenu) {
		Contenu = contenu;
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
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	
	
	
	

}
