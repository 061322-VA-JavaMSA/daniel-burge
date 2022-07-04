package com.revature;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.daos.StorePostgres;
import com.revature.exceptions.LoginException;
import com.revature.models.Offer;
import com.revature.models.Store;
import com.revature.models.User;

import com.revature.services.Authservice;
import com.revature.services.OfferService;
import com.revature.services.UserService;
import com.revature.services.StoreService;

public class Driver {
	
	
	static Scanner scan;
	static Authservice as;
	static UserService us;
	static StoreService ss;
	static OfferService os;
	
	
	private static Logger log = LogManager.getLogger(Driver.class);
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		as = new Authservice();
		us = new UserService();
		ss = new StoreService();
		 os = new OfferService();
		
		StorePostgres sp = new StorePostgres();
		//***** Code attempt at making a navigated page****
		//boolean apex = true;
		//while(apex == true) {
		//String username = null;
		//String password = null;
		
		//System.out.println("1.Register an account");
		//System.out.println("2.Quit program:");
		//System.out.println("3.Login");
		//System.out.println("4.Create inventory");
		//System.out.println("5.Delete inventory");
		
		//Scanner scan = new Scanner(System.in);
		//int decision = scan.nextInt();
		//switch(decision) {
		//case 1:	
	
//System.out.println("Create an username:");
	//String uname = scan.nextLine();
//System.out.println("Create a password:");
	//String pass = scan.nextLine();
	//User userTBC = new User();
	//userTBC.setUsername(uname);
	//userTBC.setPassword(pass);
	//log.info(us.createUser(userTBC));
	
	
	
	
		
		//break;
		//case 2: System.out.println("Quit app");
		//		apex = false;
			//	break;
	//	case 3:System.out.println("Please enter username:");
		//	username = scan.nextLine();
		//	System.out.println("Please enter password:");
		//	password = scan.nextLine();
			
		//	try {
			//	log.info(as.login(username, password));
		//	} catch (LoginException e) {
		//		System.out.println("Wrong username/password");
		//		log.error("Login exception was thrown: " + e.fillInStackTrace());
				
			//	e.printStackTrace(); 
	//		}
	//		break;
	//	case 4: System.out.println("List of games:");
			
		//	List<Store> store = ss.getStore();
		//	for(Store s : store) {
			//	System.out.println(s);
		//		}
		//	System.out.println("Insert a game genre:");
		//	String genre= scan.nextLine();
		//	System.out.println("Insert a game name:");
		//	String game= scan.nextLine();
		//	System.out.println("Insert a game price:");
		//	double price = scan.nextDouble();
		//	Store storeTBC = new Store();
		//	storeTBC.setGenre(genre);
		//	storeTBC.setGame(game);
		//	storeTBC.setPrice(price);
		//	log.info(ss.createStore(storeTBC));
		
		//	System.out.print("List of games:");
		//	break;
		//case 5:System.out.print("List of games:");
		//List<Store> store1 = ss.getStore();
	//	for(Store s: store1) {System.out.println(s);}
	//	System.out.println("Delete a a game by id:");
	//	ss.deleteStorebyId(scan.nextInt());
	//		break;
			
		
	//	}
		
	//	}
		


		
		System.out.println("Please enter username:");
		String username = scan.nextLine();
		System.out.println("Please enter password:");
		String password = scan.nextLine();
		
		try {
			log.info(as.login(username, password));
			System.out.println("Successful login");
		} catch (LoginException e) {
			System.out.println("Wrong username/password");
			log.error("Login exception was thrown: " + e.fillInStackTrace());
			
			e.printStackTrace(); 
		}

		
		
		// "1; drop table users"
		System.out.println("Create an username:");
	String uname = scan.nextLine();
		System.out.println("Create a password:");
	String pass = scan.nextLine();
		User userTBC = new User();
		userTBC.setUsername(uname);
		userTBC.setPassword(pass);
		log.info(us.createUser(userTBC));
		
		
		System.out.println("List of games:");
		
		List<Store> store = ss.getStore();
		for(Store s : store) {
		System.out.println(s);
			}
		System.out.println("Insert a game genre:");
		String genre= scan.nextLine();
		System.out.println("Insert a game name:");
		String game= scan.nextLine();
		System.out.println("Insert a game price:");
		double price = scan.nextDouble();
		Store storeTBC = new Store();
		storeTBC.setGenre(genre);
		storeTBC.setGame(game);
		storeTBC.setPrice(price);
		log.info(ss.createStore(storeTBC));
	
		System.out.print("List of games:");
		
		for(Store s: store) {System.out.println(s);}
		System.out.println("Delete a a game by id:");
		ss.deleteStorebyId(scan.nextInt());
		
		
		for(Store s: store) {System.out.println(s);}
		int gaming_id;
		int amount;
		int user_id;
		

		Offer o = new Offer();
		System.out.println("Pick the id of the item you would like to purchase");
		gaming_id = scan.nextInt();
		System.out.println("Enter the offer you would like to make");
		amount = scan.nextInt();
		System.out.println("Enter your user id in the database");
		user_id = scan.nextInt();
		o.setGamingID(gaming_id);
		o.setAmount(amount);
		o.setUserID(user_id);
		os.MakeanOffer(o);
		System.out.println("Offer has been created.");
		
	}
		
		
		//retrieve an id pick.
		//scan.nextLine();
		// System.out.print("Pick an id # to purchase an game :" );
	//	int id = scan.nextInt();
		
	
	

	}



