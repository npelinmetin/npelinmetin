package cmpe113_lab05;
import java.util.*;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String input;
		boolean areTheyEqual;
		int numOfA = 0;
		 
		System.out.println("Please enter a String:");
		input = scan.nextLine();
		
		System.out.println();
		
		System.out.println("Last two characters in your entry is: " + input.substring(input.length()-2, input.length()));
		
		System.out.println("Your entry has: " + input.length() + " characters");
		System.out.println("The UPPERCASE value of the string you entered is: " + input.toUpperCase());
		System.out.println("The lowercase value of the string you entered is: " + input.toLowerCase());
		
		areTheyEqual = input.toLowerCase().equalsIgnoreCase(input.toUpperCase());
		System.out.println("Are they equal? " + areTheyEqual);
		
		/*for(int x = 0; x < input.length(); x++) {
			if(input.charAt(x) == 'a') numOfA++;
		}
		System.out.println("Index of character 'a' in your entry is: " + numOfA);*/
		
		System.out.println("Index of character 'a' in your entry is: " + input.chars().filter(ch -> ch == 'a').count());

		System.out.println("The strings are concatenated: " + input.concat("-cmpe113-"));
		System.out.println("It's length becomes: " + input.concat("-cmpe113-").length());
		System.out.println(input.substring(input.indexOf(" ")-1, input.indexOf(" ")+2));

	
	}

}
