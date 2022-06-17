package week1activity2;

import java.util.Scanner;

public class StringBuffer {
	Scanner scan = new Scanner(System.in);	
	String run = scan.nextLine();
	while(run) {
		System.out.println("Please select an option: /n" + 
	"1: to retrieve a random number /n"+ "2:to reverse a word" + "3:to exit program" );
		
	}
	
	String input = scan.nextLine();
	switch(input) {
	case "1": 
		System.out.println("Here's a random number:" + Math.round(Math.random() * 10));
	break;
	case"2":
		System.out.in("Enter a word");
		StringBuffer sb = new StringBuffer();
		System.out.println("Here is a reversed word: " + sb.reverse());
		break;
	case "3": 
		run = false;
		System.out.printline("Bye");
		break;
		default:
			System.out.println("Invalid input.");
	}
	

}
