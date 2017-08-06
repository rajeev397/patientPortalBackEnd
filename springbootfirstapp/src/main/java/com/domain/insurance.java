package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "insurance_type")
public class insurance {
	
     @Id
     @Column(name="membership_type")
	private String membershipType;
	private String premium;
	private String deductible;
	private String co_insurance;
	private String out_of_pocket;


//	
//	@OneToOne
//    @JoinColumn(name = "membershipType")
//	private Patient patient;

	public String getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public String getDeductible() {
		return deductible;
	}

	public void setDeductible(String deductible) {
		this.deductible = deductible;
	}

	public String getPremium() {
		return premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getDeducible() {
		return deductible;
	}

	public void setDeducible(String deductible) {
		this.deductible = deductible;
	}

	public String getCo_insurance() {
		return co_insurance;
	}

	public void setCo_insurance(String co_insurance) {
		this.co_insurance = co_insurance;
	}

	public String getOut_of_pocket() {
		return out_of_pocket;
	}

	public void setOut_of_pocket(String out_of_pocket) {
		this.out_of_pocket = out_of_pocket;
	}

	public insurance(String membershipType, String premium, String deducible, String co_insurance,
			String out_of_pocket) {
		super();
		this.membershipType = membershipType;
		this.premium = premium;
		this.deductible = deducible;
		this.co_insurance = co_insurance;
		this.out_of_pocket = out_of_pocket;
	}

	public insurance() {
		super();
	}

}
