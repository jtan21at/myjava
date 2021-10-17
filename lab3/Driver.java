package lab3;
import java.util.*;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a U string:");
	      str = sc.nextLine();
		University uni=new University("good univ");
	      
		System.out.println("Enter a string:");
	      str = sc.nextLine();
	      System.out.println("Enter a Stu string:");
	      str = sc.nextLine();
	      Student stu=new Student();
	      stu.name=str;
	      System.out.println("Enter a stu addr:");
	    	  str = sc.nextLine();
	    	   stu.addr.st_name=str;
	      uni.Addstudent(stu);
	      
	      try {
	    	  System.out.println("Enter a Fac string:");
	    	  str = sc.nextLine();
	    	  FacultyMember fac=new FacultyMember();
	    	  fac.name=str;
	    	  System.out.println("Enter a Fac addr:");
	    	  str = sc.nextLine();
	    	  fac.addr.st_name=str;
	    	  uni.AddFaculty(fac);

	      
	      }

	      catch(Exception e) {
	    	  System.out.println("Something's wrong.");
	      }
	      uni.getClass();
	      uni.getFaculty();
	      uni.getstudent();
	      

	}

	private static void Student() {
		// TODO Auto-generated method stub
		
	}

}
