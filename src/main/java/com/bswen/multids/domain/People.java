package com.bswen.multids.domain;

public class People {
	
	private Integer id;
	private String name;
	private String surName;
	private String fullName;
	private String email;
	
	public People() {
		
	}
	
	public People(Integer id, String name, String surName, String fullName, String email) {
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.fullName = fullName;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
