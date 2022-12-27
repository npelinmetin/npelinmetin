package cmpe113_lab12;
import java.util.*;
public class Complex {

	static double real, imag;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a complex number:");
		init(scan.nextDouble(),scan.nextDouble());
		print();
	}

	public static void init(double re, double img)
	{
		real = re;
		imag = img;
	}
	
	static void print()
	{
		if(imag>=0)
			System.out.println("The complex number is: " + real +"+" + imag +"i");
		else
			System.out.println("The complex number is: " + real + imag +"i");
	}
}
