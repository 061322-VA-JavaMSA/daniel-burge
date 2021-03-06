package com.revature.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.OfferDAO;
import com.revature.daos.OfferPostgres;
import com.revature.models.Offer;

public class OfferService {
	private OfferDAO od = new OfferPostgres();
	private static Logger log = LogManager.getLogger(OfferService.class);
	
	public List<Offer> getOffer() {
		return od.retrieveOffer();
	}
	public Offer createOffer(Offer o) {
		// logic to validate u
		// if ok
//		u = ud.createUser(u);
		Offer offer = od.create(o);
		log.info("Offer id: " + offer + " status was changed.");
		return offer;
		

	}
	public Offer ChangeOfferStatus(Offer o) {
		return od.updateOffer(o);
		
	}
	public  Offer MakeanOffer(Offer o) {
		Offer om = od.makeanOffer(o);
		log.info("Your offer " + om + " has been recieved."  );
		return o;
	}

}
