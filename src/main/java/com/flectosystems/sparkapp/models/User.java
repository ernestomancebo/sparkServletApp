package com.flectosystems.sparkapp.models;

public class User {

	private String name;
	private String email;

	public User(String name, String email){
		this.name = name;
		this.email= email;

	}

	public String getName(){
		return name;	
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("{");
		sb.append("Name: " + name);
		sb.append(", ");
		sb.append("Email: " + email);
		sb.append("}");

		return sb.toString();

	}
}