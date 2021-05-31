package com.qldiem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class monhoc {

	private String maMH;
	private String tenMH;
	tinchi tinchi;
	theloai theloai;
	public String getMaMH() {
		return maMH;
	}
	public void setMaMH(String maMH) {
		this.maMH = maMH;
	}
	public String getTenMH() {
		return tenMH;
	}
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}
	public tinchi getTinchi() {
		return tinchi;
	}
	public void setTinchi(tinchi tinchi) {
		this.tinchi = tinchi;
	}
	public theloai getTheloai() {
		return theloai;
	}
	public void setTheloai(theloai theloai) {
		this.theloai = theloai;
	}
	public monhoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public monhoc(String maMH, String tenMH, com.qldiem.models.tinchi tinchi, com.qldiem.models.theloai theloai) {
		super();
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.tinchi = tinchi;
		this.theloai = theloai;
	}
	
	
	
}
