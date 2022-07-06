package com.revature.daos;

import java.util.List;

import com.revature.models.Offer;


public interface OfferDAO{
	Offer create(Offer o);
	List <Offer> retrieveOffer();
	public Offer updateOffer(Offer o);
	public Offer makeanOffer(Offer o);



}
