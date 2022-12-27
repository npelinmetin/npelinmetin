package cmpe113_lab04;

import java.util.*;
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a float variable declaration
		double miles;
		//create a Scanner object for reading inputs from the user
		Scanner keyboard = new Scanner(System.in);
		//read the value of distance in miles
		System.out.println("Please enter distance in miles:"); 
		miles = keyboard.nextDouble();
		//Your code will come here
		double result  = miles * 1.609344;
		result = Math.round(result);
		System.out.println(miles + " miles is equal to " +  (int)result + " kilometers.");
	}

}
