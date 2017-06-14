package com.tyzx.ams.bo;

public class User {

	private String merchantsCode;
	
	private String password;
	
	private String phone;
	
	private String merchantsName;	
	
	public User(String merchantsCode, String password, String phone, String merchantsName) {
		super();
		this.merchantsCode = merchantsCode;
		this.password = password;
		this.phone = phone;
		this.merchantsName = merchantsName;
	}

	public User(String password, String phone) {
		super();
		this.password = password;
		this.phone = phone;
	}

	public String getMerchantsCode() {
		return merchantsCode;
	}

	public void setMerchantsCode(String merchantsCode) {
		this.merchantsCode = merchantsCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMerchantsName() {
		return merchantsName;
	}

	public void setMerchantsName(String merchantsName) {
		this.merchantsName = merchantsName;
	}

	
	
}
