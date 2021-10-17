package lab3;
import java.util.*;

public class University {
	public String name;

	public University(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Student> stus = new ArrayList<Student>();
	public ArrayList<FacultyMember> faculty = new ArrayList<FacultyMember>();
	public void Addstudent(Student stu) {
		stus.add(stu);
		System.out.println("Student Added");
	    
	}
	public void AddFaculty(FacultyMember fac) {
		faculty.add(fac);
		System.out.println("Faculty Added");
	    
	}
	public void Rmvstudent(Student stu) {
		stus.remove(stu);
		System.out.println("Student Remove");
	    
	}
	
	public void Rmvstudent(int n) {
		stus.remove(n);
		System.out.println("Student Remove");
	
	    
	}
	public void Rmvstudent() {
		this.stus.getstudent();
		System.out.println("Student pick");
		String str = "";
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
		stus.remove(Integer.valueOf(str));
		System.out.println("Student Remove");
	
	    
	}
	public void Rmvfaculty() {
		this.stus.getFaculty();
		System.out.println("Faculty pick");
		String str = "";
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a digit:");
	      str = sc.nextLine();
		stus.remove(Integer.valueOf(str));
		System.out.println("Faculty Remove");
	
	    
	}
	public void getstudent() {
		for (int i = 0; i < stus.size(); i++) {
      System.out.println(String.valueOf(i)+" "+stus.get(i));
    }
	}
	public void getFaculty() {
		for (int i = 0; i < faculty.size(); i++) {
      System.out.println(String.valueOf(i)+faculty.get(i));
    }
	}
}
