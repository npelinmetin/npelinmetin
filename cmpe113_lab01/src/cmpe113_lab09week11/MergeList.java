package cmpe113_lab09week11;
import java.util.*;
public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr1 = new int[5],
			  arr2 = new int[5],
			  arr3 = new int[10];
		
		System.out.println("Enter first array in ascending order:");
		int i = 0;
		while(i<arr1.length)
		{
			arr1[i] = scan.nextInt();
			i++;
		
		}
		
		System.out.println("Enter second array in ascending order:");
		i = 0;
		while(i<arr2.length)
		{
			arr2[i] = scan.nextInt();
			i++;
		}
		
		int j = 0, k = 0, l = 0;
		while((j<5 && k<5))
		{
			if(arr1[j]<arr2[k])
			{
				arr3[l] = arr1[j];
				l++;
				j++;
				
			}
			else if(arr1[j]>arr2[k])
			{
				arr3[l] = arr2[k];
				l++;
				k++;
				
			}
		}
		 while (j < 5)
	            arr3[l++] = arr1[j++];
	     
	     while (k < 5)
	            arr3[l++] = arr2[k++];
		
		for(int a : arr3)
		{
			System.out.print(a +" ");
		}
			
	}

}
