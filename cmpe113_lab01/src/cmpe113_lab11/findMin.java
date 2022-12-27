package cmpe113_lab11;
import java.util.*;
public class findMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int i =1;
		int min =Integer.MAX_VALUE,num;
		while(i<=10) {
			System.out.println(i +". number: ");
			num = scan.nextInt();
			if(num<min) min = num;
			i++;
		}
		System.out.println("The smallest number is: " + min);
	}
	
}
