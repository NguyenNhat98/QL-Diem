package com.qldiem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class hocky {
	
	private String maHK;
	private String tenHK;
	public String getMaHK() {
		return maHK;
	}
	public void setMaHK(String maHK) {
		this.maHK = maHK;
	}
	public String getTenHK() {
		return tenHK;
	}
	public void setTenHK(String tenHK) {
		this.tenHK = tenHK;
	}
	public hocky() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hocky(String maHK, String tenHK) {
		super();
		this.maHK = maHK;
		this.tenHK = tenHK;
	}
	
	
	
}
