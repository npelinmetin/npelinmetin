package cmpe113_lab06;
import java.util.*;
public class ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the ticket type:");
		String type = s.nextLine();
		
		
		int cost = 0;
		
		if(type.equalsIgnoreCase("front")) {
			System.out.println("How many " + type.toLowerCase() + " row tickets do you want?");
			int num = s.nextInt();
			cost = 600*num;
			System.out.println("Total cost is " + cost + " TL.");
		}
		else if(type.equalsIgnoreCase("middle")) {
			System.out.println("How many " + type.toLowerCase() + " row tickets do you want?");
			int num = s.nextInt();
			cost = 400*num;
			System.out.println("Total cost is " + cost + " TL.");
		}
		else if(type.equalsIgnoreCase("back")) {
			System.out.println("How many " + type.toLowerCase() + " row tickets do you want?");
			int num = s.nextInt();
			cost = 150*num;
			System.out.println("Total cost is " + cost + " TL.");
		}
		else
			System.out.println("Invalid ticket type!");
	}

}
