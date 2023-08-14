package com.jdbc.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class JPASignUpModel {
	@Id
	@Column(name ="sno")
	 private String sNo;
	@Column(name ="first_name")
	 private String firstName;
	@Column(name ="last_name")
	 private String lastName;
	@Column(name ="email")
	 private String email;
	@Column(name ="dob")
	 private String dob;
	@Column(name ="gender")
	 private String gender;
	@Column(name ="phoneno")
	 private String phoneNo;
	@Column(name ="password")
	 private String password;
	@Column(name ="created_by")
	 private String createdBy;
	@Column(name ="updated_by")
	 private String updatedBy;
	@Column(name ="created_date")
	 private Date createdDate;
	@Column(name ="updated_date")
	 private Date updatedDate;
	@Column(name ="is_Active")
	 private Boolean isActive;
	 
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	 

}
