package cmpe113_lab05;
import java.util.*;
public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String input, encrypted = "";
		int paddingNum;
		
		System.out.println("Please enter a text: ");
		input = scan.nextLine();
		
		
		System.out.println("Please enter padding number: ");
		paddingNum = scan.nextInt();
		
        char alphabet;
        for(int i=0; i < input.length();i++) 
        {
             // Shift one character at a time
            alphabet = input.charAt(i);
            
            // if alphabet lies between a and z 
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
             // shift alphabet
             alphabet = (char) (alphabet + paddingNum);
             // if shift alphabet greater than 'z'
             if(alphabet > 'z') {
                // reshift to starting position 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             encrypted += alphabet;
            }
            
            // if alphabet lies between 'A'and 'Z'
            else if(alphabet >= 'A' && alphabet <= 'Z') {
             // shift alphabet
             alphabet = (char) (alphabet + paddingNum);    
                
             // if shift alphabet greater than 'Z'
             if(alphabet > 'Z') {
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             encrypted += alphabet;
            }
            else {
            	encrypted += alphabet;   
            }
        
        }
		
		System.out.println(encrypted);
		
		
		
	}

}
