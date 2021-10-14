/**
 * 
 */
package ck2;

/**
 * @author j
 *
 */
public class Asylum extends building {

	String name = "a Asylum";
	String featu = "just a assylum";
	public String desc = "a nice place";

	public void setSize(double s) {
		size = s;
	}

	public void setName(String s) {
		name = s;
	}

	public void explore() {
		System.out.print("You pass a" + size+"house");
		System.out.print("with");
		System.out.print("a(n)");
		System.out.println(featu);
		if (haunted) {
			System.out.println("Watch out! A ghost!");
		}
	}
	/** * 
	 */
	public Asylum() {
		// TODO Auto-generated constructor stub
	}

}
