/**
 * 
 */
package ck2;

/**
 * @author j
 *
 */
public class building {
	double size=1.0;
	boolean haunted=false;
	String message="";
	public void setSize(double size) {
		this.size=size;
	}
	public void explore() {
		System.out.println(message);
		if (haunted) {
			System.out.println("Watch out! A ghost!");
		}
	}

}
