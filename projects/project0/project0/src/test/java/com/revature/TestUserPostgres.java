package com.revature;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.daos.UserPostgres;
import com.revature.models.User;

class TestUserPostgres {

	private final UserPostgres up = new UserPostgres();
	@Test 
	void testUpdateUser() {
		User user = new User(0, null, null);
	
		

}}
