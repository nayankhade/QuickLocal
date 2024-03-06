package com.quicklocal.dto;

public class OrderDto {
    private String name;
    private String phone;
    private String email;
    private String address;
    private String pinCode;
    private String availableDate;
    private String availableTime;
	public OrderDto(String name, String phone, String address,String email, String pinCode, String availableDate,
			String availableTime) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.pinCode = pinCode;
		this.availableDate = availableDate;
		this.availableTime = availableTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getAvailableDate() {
		return availableDate;
	}
	public void setAvailableDate(String availableDate) {
		this.availableDate = availableDate;
	}
	public String getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}