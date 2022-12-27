package cmpe113_lab07;

import java.util.Scanner;

public class deneme2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		int num;
		System.out.print("Enter a num: ");
		num= keyboard.nextInt();
		int i =1;
		while(i<=num) {
			System.out.println("Square of " + i + ": " + i*i);
			i++;
		}
	}

}
