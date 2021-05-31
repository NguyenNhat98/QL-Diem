package com.qldiem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class namhoc {

	private String maNH;
	private String tenNH;
	public String getMaNH() {
		return maNH;
	}
	public void setMaNH(String maNH) {
		this.maNH = maNH;
	}
	public String getTenNH() {
		return tenNH;
	}
	public void setTenNH(String tenNH) {
		this.tenNH = tenNH;
	}
	public namhoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public namhoc(String maNH, String tenNH) {
		super();
		this.maNH = maNH;
		this.tenNH = tenNH;
	}
	
	
	
}
