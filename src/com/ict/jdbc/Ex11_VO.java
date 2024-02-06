package com.ict.jdbc;

// VO(Value Object) : DB 컬럼의 정보를 담기 위한 클래스

public class Ex11_VO {
	// 반드시! 컬럼명과 같은 이름으로 만들자
	private String custid, name, address, phone;
	
	// 생성자
	public Ex11_VO() {

	}

	public Ex11_VO(String custid, String name, String address, String phone) {
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	// getter setter
	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
