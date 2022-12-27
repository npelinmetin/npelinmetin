package cmpe113_lab04;
import java.util.*;
public class EvaluateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter int x");
		double x = scan.nextInt();
		
		System.out.println("Enter int y");
		double y = scan.nextInt();
		
		System.out.println("Enter int z");
		double z = scan.nextInt();
		
		double f = (x-y)/(x+y) + 3*x*y;
		double g = (((x*x)-(y*y))/(x+z))+(((x*x)+(z*z))/(y-z));
		
		f = Math.round(f);
		g = Math.round(g);
		
		System.out.println("f = " +(int)f);
		System.out.println("g = " + (int)g);

		
	}

}
