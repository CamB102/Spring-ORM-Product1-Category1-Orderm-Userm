package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "orders")
public class Order {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id")
 private int id;
 private int user_id;
 @Temporal(TemporalType.TIMESTAMP)
 private Date submit_date;
 private String approve;
 
 @OneToOne(mappedBy = "order")
 private User user;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getUser_id() {
	return user_id;
}

public void setUser_id(int user_id) {
	this.user_id = user_id;
}

public Date getSubmit_date() {
	return submit_date;
}

public void setSubmit_date(Date submit_date) {
	this.submit_date = submit_date;
}

public String getApprove() {
	return approve;
}

public void setApprove(String approve) {
	this.approve = approve;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Order(int id, int user_id, Date submit_date, String approve, User user) {
	super();
	this.id = id;
	this.user_id = user_id;
	this.submit_date = submit_date;
	this.approve = approve;
	this.user = user;
}
 
 
}
