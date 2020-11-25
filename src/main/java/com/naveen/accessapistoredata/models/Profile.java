package com.naveen.accessapistoredata.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
			
			@Id
			private UUID  id ;
			private String name;
			private String gender;
			private String mobile;
			private int deptNo;
			private String city;
			
			public Profile() {
				
			}
			
			public Profile(UUID id, String name, String gender, String mobile, int deptNo, String city) {
				super();
				this.id = id;
				this.name = name;
				this.gender = gender;
				this.mobile = mobile;
				this.deptNo = deptNo;
				this.city = city;
			}
			
			public UUID getId() {
				return id;
			}
			public void setId(UUID id) {
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
			public int getDeptNo() {
				return deptNo;
			}
			public void setDeptNo(int deptNo) {
				this.deptNo = deptNo;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			
			
	
}
