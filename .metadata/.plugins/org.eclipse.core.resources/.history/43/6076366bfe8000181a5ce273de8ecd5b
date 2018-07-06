package com.grupodot.financiamientosas.business.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="partner")
public class Partner implements Serializable{

	private static final long serialVersionUID = 6260117323967591882L;
	
	@Id
	@Column(name="id_partner")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPartner;
	
	@Column(name="partner_name")
	private String parterName;
	
	@Column(name="interest_rate")
	private double interestRate;
	
	@Column(name="maximum_amount_available")
	private int maximumAmountAvailable;
	
	public Partner() {
		super();
	}
	
	public Partner(String partnerName, double interestRate, int maximumAmountAvailable) {
		super();
		this.parterName = partnerName;
		this.interestRate = interestRate;
		this.maximumAmountAvailable = maximumAmountAvailable;
	}

	public Long getIdPartner() {
		return idPartner;
	}

	public void setIdPartner(Long idPartner) {
		this.idPartner = idPartner;
	}

	public String getParterName() {
		return parterName;
	}

	public void setParterName(String parterName) {
		this.parterName = parterName;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getMaximumAmountAvailable() {
		return maximumAmountAvailable;
	}

	public void setMaximumAmountAvailable(int maximumAmountAvailable) {
		this.maximumAmountAvailable = maximumAmountAvailable;
	}
}
