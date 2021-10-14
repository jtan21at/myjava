package panstring;
import java.util.Scanner;


public class check_pan {

	public check_pan() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String str_in, reverse = "";
	      Scanner input = new Scanner(System.in);// TODO Auto-generated method stub
	      System.out.println("how many times you like to try?" );
	      Scanner times=new Scanner(System.in);
	      Integer time=Integer.valueOf(times.nextLine());
	      
	    	while (time>0)	{  
	      System.out.println("Enter a string:");
	      str_in = input.nextLine();
	      for ( int i = str_in.length() - 1; i >= 0; i-- )
	    	  reverse = reverse + str_in.charAt(i);

	      if (reverse.equals(str_in))
	    	  System.out.println(str_in+" is a palindrome");
	      else
	    	  System.out.println(str_in+" is not a palindrome");

	      time--;
	    	}
	}

}
