package com.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient_info")
public class Patient {
	
	
	@Id
    @Column(name="id")
	private int id;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	private String age;
	private String dob;
	private String gender;
	private String email;
	private String mobile;
	private String address;
	@Column(name="country_of_origin")
	private String countryOfOrigin;
	@Column(name="membership_type")
	private String membershipType;
	private String smoking;
	private String alcohol;
	private String height;
	private String weight;
	@Column(name="drugaddict")
	private String drugAddict;
	@Column(name="mentalillness")
	private String mentalIllness;
	@Column(name="accountbalance")
	private String accountBalance;
	private String username;
	private String password;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int id, String firstName, String lastName, String age, String dob, String gender, String email,
			String mobile, String address, String countryOfOrigin, String membershipType, String smoking,
			String alcohol, String height, String weight, String drugAddict, String mentalIllness,
			String accountBalance, String username, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.countryOfOrigin = countryOfOrigin;
		this.membershipType = membershipType;
		this.smoking = smoking;
		this.alcohol = alcohol;
		this.height = height;
		this.weight = weight;
		this.drugAddict = drugAddict;
		this.mentalIllness = mentalIllness;
		this.accountBalance = accountBalance;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	
	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public String getSmoking() {
		return smoking;
	}

	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}

	public String getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDrugAddict() {
		return drugAddict;
	}

	public void setDrugAddict(String drugAddict) {
		this.drugAddict = drugAddict;
	}

	public String getMentalIllness() {
		return mentalIllness;
	}

	public void setMentalIllness(String mentalIllness) {
		this.mentalIllness = mentalIllness;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
