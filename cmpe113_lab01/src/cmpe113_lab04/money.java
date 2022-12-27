package cmpe113_lab04;
import java.util.*;
public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter int 1");
		int a = scan.nextInt();
		
		System.out.println("Enter int 5");
		int b = scan.nextInt();
		
		System.out.println("Enter int 10");
		int c = scan.nextInt();
		
		System.out.println("Enter int 20");
		int d = scan.nextInt();
		
		int tot = d*20+c*10+b*5+a;
		c = tot/20;
		a = tot%20;
		
		System.out.println(tot);
		System.out.println(c);
		System.out.println(a);
	}

}
