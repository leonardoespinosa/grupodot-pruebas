package com.grupodot.financiamientosas.business.transfer;

import java.io.Serializable;

public class QuotationTO implements Serializable{

	private static final long serialVersionUID = -2732632702487413110L;

	private String partnerName;
	private double mountlyFee;
	private int totalPayment;
	private double interestRate;
	
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public double getMountlyFee() {
		return mountlyFee;
	}
	public void setMountlyFee(double mountlyFee) {
		this.mountlyFee = mountlyFee;
	}
	public int getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(int totalPayment) {
		this.totalPayment = totalPayment;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
