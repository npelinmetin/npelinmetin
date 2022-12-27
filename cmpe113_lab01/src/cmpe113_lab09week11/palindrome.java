package cmpe113_lab09week11;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size;
		int[] array;
		boolean isPal = false;
		
		System.out.println("Please enter the capacity of the array: ");
		size = scan.nextInt();
		array = new int[size];
		
		int i = 0;
		while(i<size)
		{
			System.out.println("Please enter the element " + (i+1) +" of the array: ");
			array[i] = scan.nextInt();
			i++;
		}
		
		for(int j =0;j<size/2;j++)
		{
			if(array[j] == array[size-j-1])
				isPal = true;
			else
			{
				isPal = false;
				break;
			}
		}
		
		if(isPal)
			System.out.println("This array is a Palindrome.");
		else
			System.out.println("This array is not a Palindrome.");
	}

}
