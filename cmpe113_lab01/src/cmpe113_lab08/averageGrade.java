package cmpe113_lab08;
import java.util.*;
public class averageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("class size =");
		int size = s.nextInt();
		if(size <=0) size=1;
		
		
		int grade=0,  k=1,failed =0;
		double temp=0;
		
		while( k<=size) {
			System.out.println("grade for student " + k);
			grade = s.nextInt();
			while(grade<0 || grade>100) {
				System.out.println("out of range, grade  for student " +k);
				grade=s.nextInt();
			}	
			temp +=grade;
			if(grade<50) failed++;
			k++;
		}
		System.out.println("average = " + temp/size);
		System.out.println("failed = " + failed);
	}

}
