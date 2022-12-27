package cmpe113_lab11;

import java.util.Scanner;

public class findMin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		usingArr();
		System.exit(0);
		Scanner scan = new Scanner(System.in);
		int i =1;
		int min1 =Integer.MAX_VALUE,min2 = Integer.MAX_VALUE, num;
		if(min1>min2) {
			int temp = min1;
			min1 = min2;
			min2 = temp;
		}
		while(i<=10) {
			System.out.println(i +". number: ");
			num = scan.nextInt();
			if(num<min1) {
				min2 = min1;
				min1 = num;
			}
			if(num>min1 && num<min2) {
				min2 = num;
			}
			i++;
		}
		System.out.println("The 1st smallest number is: " + min1);
		System.out.println("The 2nd smallest number is: " + min2);
	}
	public static void usingArr() {
		Scanner scan = new Scanner(System.in);
		int i =0;
		int[] arr = new int[10];
		while(i<10) {
			System.out.println(i +". number: ");
			arr[i] = scan.nextInt();
			i++;
		}
		int min1 = arr[0], min2 = arr[1];
		if(min1>min2) {
			int temp = min1;
			min1 = min2;
			min2 = temp;
		}
		for(int j =2;j<arr.length;j++) {
			if(arr[j]<min1) {
				min2 = min1;
				min1 = arr[j];
			}
			if(arr[j]>min1 && arr[j]<min2) {
				min2 = arr[j];
			}
			i++;
		}
		System.out.println("The 1st smallest number is: " + min1);
		System.out.println("The 2nd smallest number is: " + min2);
	}
}
