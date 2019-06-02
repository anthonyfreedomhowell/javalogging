import java.util.Scanner;
import java.io.*;

///This program logs what the user wants to log.
//first the program will log the user's name, 
//the date in a mm-dd-yyyy format and finally
//how many javas the user has had.


public class JavaLogging {

	public static void main(String[] args) {
	 System.out.println("Welcome to the Java logging program. This program logs " +
			"how many javas you have had on a particular day.");

		
		String name;
		String input;
		int month;
		int day;
		int year;
		int javas;

		Scanner keyboard = new Scanner(System.in);


		System.out.print("How many coffees have you had today?");
		input = keyboard.nextLine();


		javas = Integer.parseInt(input);

		System.out.println("It looks like you have had: " + javas + " coffees.");


		
	}



}
