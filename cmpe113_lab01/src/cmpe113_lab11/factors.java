package cmpe113_lab11;
import java.util.*;
public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: " );
		int num = scan.nextInt();
		int prime = 0 ;
		System.out.print("Number's factors are: ");
		for(int i = 1; i<=num ;i++) {
			if (num % i == 0) {
				prime++;
		        System.out.print(i);
		        if (i<num) {
			        System.out.print(", ");
			      }
		      }
		}
		System.out.println("");
		if(prime ==2) System.out.print("It’s a prime number.");
		
	}

}
