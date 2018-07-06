package com.grupodot.financiamientosas.business.bean;

import javax.ejb.Remote;

import com.grupodot.financiamientosas.business.transfer.QuotationTO;

@Remote
public interface PartnerBeanRemote {
	
	/**
	 * Return partner by customer amount 
	 * @return List<Partner>
	 */
	public QuotationTO findPartnerByAmount(int amount);
}
