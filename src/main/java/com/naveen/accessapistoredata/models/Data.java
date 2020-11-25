package com.naveen.accessapistoredata.models;



public class Data {

	private String  id ;
	private String name;
	private String gender;
	private String mobile;
	private String deptNo;
	private String city;
	private String _repeat;
	
	public Data() {
		
	}
	
	public Data(String id, String name, String gender, String mobile, String deptNo, String city, String  _repeat) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.deptNo = deptNo;
		this.city = city;
		this._repeat = _repeat;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String  getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String get_repeat() {
		return _repeat;
	}

	public void set_repeat(String _repeat) {
		this._repeat = _repeat;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", gender=" + gender + ", mobile=" + mobile + ", deptNo=" + deptNo
				+ ", city=" + city + ", _repeat=" + _repeat + "]";
	}


	

	
	
	
}
