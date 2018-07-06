package com.grupodot.financiamientosas.presentation.mb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.grupodot.financiamientosas.business.bean.PartnerBeanRemote;
import com.grupodot.financiamientosas.business.transfer.QuotationTO;

@ManagedBean(name = "partnerManagedBean")
@ApplicationScoped
public class PartnerManagedBean {

	@EJB
	private PartnerBeanRemote partnerBeanRemote;
	
	private int amount;
	private QuotationTO quotation;
	private String message;
	
	@PostConstruct
    public void init() {
        
    }
	
	public void findPartnerByAmount() {
		QuotationTO quotation = partnerBeanRemote.findPartnerByAmount(this.getAmount());
		if(quotation != null) {			
			setQuotation(quotation);
			setMessage(null);
		} else {
			setMessage("No hay socio disponible");
			setQuotation(null);
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public QuotationTO getQuotation() {
		return quotation;
	}

	public void setQuotation(QuotationTO quotation) {
		this.quotation = quotation;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
