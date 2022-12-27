package cmpe113_lab12;
import java.util.*;
public class Box {

	static int width, length, height;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter box dimensions:");
		init(scan.nextInt(),scan.nextInt(),scan.nextInt());
		print();
	}
	
	public static void init(int w, int l, int h)
	{
		width = w;
		length = l;
		height = h;
	}
	
	public static void print()
	{
		int volume = width * length *height;
		System.out.println("The volume of box: " + volume);
		
		boolean cube = (width == length) && (length == height);
		if(cube)
			System.out.println("It's a Cube");
		else
			System.out.println("It's a Cuboid");
	}

}
