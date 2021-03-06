package com.revature.daos;

import java.util.List;

import com.revature.models.Store;


public interface StoreDao {
	Store create(Store s);
	
	Store retrieveStoreById(int id);
	List<Store> retrieveStores();
	Store retrieveStoreByStore();
	boolean updateStore(Store s);
	boolean deleteStorebyid(int id);

	Store retrieveStoreByStore(String genre);
}
