package com.revature.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.StorePostgres;


import com.revature.models.Store;


public class StoreService {
	private StorePostgres us = new StorePostgres();

private static Logger log = LogManager.getLogger(StoreService.class);

public List<Store> getStore(){
	return us.retrieveStores();
}

public Store createStore (Store s) {
	// logic to validate u
	// if ok
//	u = ud.createUser(u);
	Store store = us.create(s);
	log.info("Store item: " + store + " was created.");
	return store;
	

}}
