package com.revature;
import java.util.Scanner;


public class UserNamePasswordTester {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String username;
		String password;
		System.out.println("Enter your username: ");
		username = sc.nextLine();
		System.out.println("Enter your password: ");
		password = sc.nextLine();
		
		if(username.equals(username) && password.equals(password)) {
			System.out.println("Welcome " + username + ", to not being a nerd xD" );
			
		}else {
			System.out.println("Invalid credentials");
			
		}
		
		
	}

}
