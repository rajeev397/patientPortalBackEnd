package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "in_doctor")

public class InDoctor {


	@Id
    @Column(name="id")
	private int id;
	@Column(name="doctorname")
	private String doctorname;
	@Column(name="doctorqualification")
	private String doctorqualification;
	@Column(name="doctornumber")
	private String doctornumber;
	@Column(name="doctoraddress")
	private String doctoraddress;
	@Column(name="workingdays")
	private String workingdays;
	@Column(name="doctortimings")
	private String doctortimings;
	private String zipcode;
	private String rating;
	
	
	
	
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public InDoctor() {
		super();
		
	}

	public InDoctor(int id, String doctorname, String doctorqualification, String doctornumber, 
			String doctoraddress, String workingdays, String doctortimings,String zipcode,String rating) {
		super();
		this.id = id;
		this.doctorname = doctorname;
		this.doctorqualification = doctorqualification;
		this.doctornumber = doctornumber;
		this.doctoraddress = doctoraddress;
		this.workingdays = workingdays;
		this.doctortimings = doctortimings;
		this.zipcode=zipcode;
		this.rating=rating;
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctorname() {
		return doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public String getDoctorqualification() {
		return doctorqualification;
	}

	public void setDoctorqualification(String doctorqualification) {
		this.doctorqualification = doctorqualification;
	}

	public String getDoctornumber() {
		return doctornumber;
	}

	public void setDoctornumber(String doctorphonenumber) {
		this.doctornumber = doctorphonenumber;
	}

	public String getDoctoraddress() {
		return doctoraddress;
	}

	public void setDoctoraddress(String doctoraddress) {
		this.doctoraddress = doctoraddress;
	}

	public String getworkingdays() {
		return workingdays;
	}

	public void setDoctordays(String workingdays) {
		this.workingdays = workingdays;
	}

	public String getDoctortimings() {
		return doctortimings;
	}

	public void setDoctortimings(String doctortimings) {
		this.doctortimings = doctortimings;
	}
	
	}
