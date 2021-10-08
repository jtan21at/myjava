/**
 * 
 */
package uppercase;
import java.util.Scanner;
/**
 * @author jianwen
 *
 */
public class uppercase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// takes input
		Scanner input = new Scanner(System.in);
		String arr_str="";
	
	startP:while(true){
			do {
			System.out.print("Enter a string letters only: ");
			arr_str=input.nextLine();
		} while (!arr_str.chars().allMatch(Character::isLetter));// Check if it is letters
		char[] str_Char=arr_str.toCharArray();
		System.out.print("\nThe Uppercase String  =  ");
		char p_Letter;
		for (char i:str_Char) {
			
			if (i>='a'&&i<='z') {
				p_Letter=(char)((int)i-32);
				System.out.print(p_Letter);
			}else System.out.print(i);
	}
		
		System.out.println("\nOriginal string:" +new String(str_Char));
		continue startP;
	}
}
	}
