package cmpe113_lab09week11;
import java.util.*;
public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int size;
		int[] x,y,f;
		boolean controller = true;
		
		while(controller)
		{
			System.out.println("Size of the vectors: ");
			size = scan.nextInt();
			if(size == 0)
			{
				System.out.println("Bye!");
				controller = false;
				System.exit(0);
			}
			
			x = new int[size];
			y = new int[size];
			f = new int[size];
			
			int i =0;
			
			System.out.println("First vector (x): ");
			while(i<size)
			{
				x[i] = scan.nextInt();
				i++;
			}
			i = 0;
			
			System.out.println("Second vector (y): ");
			while(i<size)
			{	
				y[i] = scan.nextInt();
				i++;
			}
			i = 0;
			
			while(i<size)
			{
				f[i] = 2*x[i] + 3*y[i]; 
				i++;
			}
			i = 0;
			
			System.out.print("Result: [");
			while(i<size)
			{
				System.out.print(f[i]);
				if(i<size-1)
				{
					System.out.print(" ");
				}
				i++;
			}
			System.out.println("]");
		}
		
	}

}
