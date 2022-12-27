package cmpe113_lab06;
import java.util.*;
public class findDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input numbers: ");
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		if(num1%num2 ==0)
			System.out.println(num1 + " is divisible by " + num2);
		else
			System.out.println(num1 + " is not divisible by " + num2);
	}

}
