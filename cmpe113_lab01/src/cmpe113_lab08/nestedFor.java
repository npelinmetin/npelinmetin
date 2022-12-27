package cmpe113_lab08;
import java.util.*;
public class nestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a num");
		int num = s.nextInt();
		
		for(int i =num;i>0;i--) {
			System.out.print("* ");
			for(int j = i;j<num;j++) {
				if(j==num)break;
				else System.out.print(j +" ");
			}
			System.out.println();
		}
	}

}
