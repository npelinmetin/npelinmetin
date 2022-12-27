
import java.util.Scanner;
		public class b {
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        String s = input.nextLine();
		        int upper = 0;
		        int lower = 0;
		        for (int i = 0; i < s.length(); i++) {
		            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
		                upper++;
		            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
		                lower++;
		            }
		        }
		        System.out.println("Total number of capital letters: " + upper);
		        System.out.println("Total number of small letters: " + lower);
	}

}
