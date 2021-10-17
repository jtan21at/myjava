package lab3;
import java.util.ArrayList;

public class FacultyMember extends Person {
	 public String employee_id;
	 public String employee_id() {
		 return employee_id;
	 }
	 public String toString() {
		 return (name+employee_id);
	 }
	 public void getname() {
		 System.out.println(this.name);
	      
	 }
	ArrayList<String> course = new ArrayList<String>();
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
	public FacultyMember() {
		// TODO Auto-generated constructor stub
	}

}
