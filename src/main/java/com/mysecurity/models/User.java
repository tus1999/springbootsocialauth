package com.mysecurity.models;


class User {
	private Long id;
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	User(long id, String name, String password){
		this.id = id;
		this.name = name;
		this.password = password;
	}
}
