package com.qldiem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Khoa {
	
	private String maKH;
	private String tenKH;
	private String lienheKH;
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getLienheKH() {
		return lienheKH;
	}
	public void setLienheKH(String lienheKH) {
		this.lienheKH = lienheKH;
	}
	public Khoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Khoa(String maKH, String tenKH, String lienheKH) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.lienheKH = lienheKH;
	}
	
	
	
}
