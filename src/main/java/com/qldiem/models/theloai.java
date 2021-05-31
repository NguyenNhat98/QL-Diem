package com.qldiem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class theloai {

	private String maTL;
	private String tenTL;
	public String getMaTL() {
		return maTL;
	}
	public void setMaTL(String maTL) {
		this.maTL = maTL;
	}
	public String getTenTL() {
		return tenTL;
	}
	public void setTenTL(String tenTL) {
		this.tenTL = tenTL;
	}
	public theloai() {
		super();
		// TODO Auto-generated constructor stub
	}
	public theloai(String maTL, String tenTL) {
		super();
		this.maTL = maTL;
		this.tenTL = tenTL;
	}
	
	
	
}
