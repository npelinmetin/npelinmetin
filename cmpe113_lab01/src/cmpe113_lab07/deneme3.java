package cmpe113_lab07;

import java.util.Scanner;

public class deneme3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		int num, guess =0;
		
		do{
			System.out.print("Enter a num: ");
			num= keyboard.nextInt();
			if(num>44) System.out.println("decrease your guess");
			if(num<44) System.out.println("increase your guess");
			guess++;
			
		}while(num!=44);
		
		System.out.println("You have found the number after "+guess +" guess.");
		
	}

}
