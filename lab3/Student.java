package lab3;
import java.util.*;

public class Student extends Person {
	public String CIN;
	public String toString() {
		return(CIN+" "+name);
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<String> course = new ArrayList<String>();
	
	public void Addcourse(String coursename) {
		course.add(coursename);
	}
	public void getcourse() {
		for (int i = 0; i < course.size(); i++) {
      System.out.println(i+course.get(i));
    }
	}
	public void dropcourse() {
		this.getcourse();
		System.out.println("Choose one to drop or enter to drop the first one");
		course.remove(0);
		
	}
	
	public void dropcourse(int n) {
		this.getcourse();
		System.out.println("drop"+n);
		course.remove(n);
		
	}
	

}
