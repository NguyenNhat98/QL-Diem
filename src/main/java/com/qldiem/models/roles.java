package com.qldiem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class roles {
	
	private int id;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public roles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public roles(int id, String role) {
		super();
		this.id = id;
		this.role = role;
	}
	
	
	
}
