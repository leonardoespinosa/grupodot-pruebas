package com.grupodot.financiamientosas.business.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.grupodot.financiamientosas.business.entity.Partner;
import com.grupodot.financiamientosas.business.manager.PartnerMngr;
import com.grupodot.financiamientosas.business.transfer.QuotationTO;

@Stateless( name = "PartnerBean" , mappedName = "ejb/PartnerBean" )
public class PartnerBean implements PartnerBeanRemote {
	
	@PersistenceContext(unitName = "FinanciamientoPU")
    private EntityManager entityManager;
	
	@EJB
	private PartnerMngr partnerMngr;

    @Override
	public QuotationTO findPartnerByAmount(int amount) {
    	try {
    		TypedQuery<Partner> query = entityManager.createQuery("select p from Partner p ", Partner.class);
        	List<Partner> partnersList = query.getResultList();
        	
        	return partnerMngr.findPartnerByAmount(amount, partnersList);
    	} catch(Exception e) {
    		e.printStackTrace();
    		return null;
    	}
	}
}
