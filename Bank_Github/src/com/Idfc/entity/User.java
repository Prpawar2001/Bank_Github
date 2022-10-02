package com.Idfc.entity;

public class User {
	private int accNo = 1001;
	private String passwd = "Pawar2001";
	private String name = "Prathamesh pawar";
	private int accBal = 40000;
	
	public int getAccNo() {
		return accNo;
	}
	public String getPasswd() {
		return passwd;
	}
	public String getName() {
		return name;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
}
