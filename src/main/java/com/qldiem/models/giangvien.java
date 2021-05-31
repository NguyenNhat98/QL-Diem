package com.qldiem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class giangvien {

	private String maGV;
	private String tenGV;
	private String diaChi;
	private int sdt;
	private String email;
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public giangvien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giangvien(String maGV, String tenGV, String diaChi, int sdt, String email) {
		super();
		this.maGV = maGV;
		this.tenGV = tenGV;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.email = email;
	}
	
	                   
	
}
