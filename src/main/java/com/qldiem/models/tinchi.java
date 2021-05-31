package com.qldiem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class tinchi {
	
	private String maTC;
	private int soTC;
	public String getMaTC() {
		return maTC;
	}
	public void setMaTC(String maTC) {
		this.maTC = maTC;
	}
	public int getSoTC() {
		return soTC;
	}
	public void setSoTC(int soTC) {
		this.soTC = soTC;
	}
	public tinchi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public tinchi(String maTC, int soTC) {
		super();
		this.maTC = maTC;
		this.soTC = soTC;
	}
	
	
	
}
