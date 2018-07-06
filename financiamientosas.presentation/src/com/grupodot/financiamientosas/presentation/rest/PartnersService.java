package com.grupodot.financiamientosas.presentation.rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.grupodot.financiamientosas.business.bean.PartnerBeanRemote;
import com.grupodot.financiamientosas.business.transfer.QuotationTO;

@Stateless
@Path("/partnerService")
public class PartnersService {
	
	@EJB
	PartnerBeanRemote partnerBeanRemote;

	@GET
	@Path("{amount}") 
	@Produces({MediaType.APPLICATION_JSON})
	public Response findPartnerByAmount(@PathParam("amount") int amount) throws JSONException {
		JSONObject jsonObject = new JSONObject();
		
		QuotationTO finalQuotation = partnerBeanRemote.findPartnerByAmount(amount);
		if(finalQuotation != null) {			
			jsonObject.put("Socio que realiza el Préstamo", finalQuotation.getPartnerName()); 
			jsonObject.put("Cuota Mensual", finalQuotation.getMountlyFee()); 
			jsonObject.put("Pago total del crédito", finalQuotation.getTotalPayment()); 
			jsonObject.put("Tasa de interés mensual", finalQuotation.getInterestRate()); 
		} else {
			jsonObject.put("Mensaje", "No hay socio disponible"); 
		}
		
		return Response.status(200).entity(jsonObject).build();
	}
}