package cmpe113_lab06;
import java.util.*;
public class findLarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input numbers: ");
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		int max = num1;
		
		if(num2 > num1)
			max = num2;
		
		System.out.println("The larger num is: " + max);
	}

}
