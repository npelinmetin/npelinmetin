package cmpe113_lab04;
import java.util.*;
public class digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("digit:");
		int d = scan.nextInt();
		
		int t = d/1000;
		d = d - t*1000;
		int h = d/100;
		d = d - h*100;
		int ten = d/10;
		d = d - ten*10;
		int u = d;
		
		System.out.println(t);
		System.out.println(h);
		System.out.println(ten);
		System.out.println(u);

		
	}

}
