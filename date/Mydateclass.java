/**
 * 
 */
package date;
import java.io.*;
import java.util.Scanner;
/**
 * @author jtan
 *
 */

public class Mydateclass{
	public Mydateclass(){
		
	}
	int day;
	int month;
	int year;
	
	public void setDate(int month_E, int day_E,int year_E) {
		month=month_E;
		day=day_E;
		year=year_E;
	}
	
	/**
	 * @return
	 */
	public String getDate() {
		String str=String.format("%02d",month)+"/"+String.format("%02d",day)+"/"+String.format("%02d",year);
		return "Date is "+str;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// instantiate object
		Mydateclass obj = new Mydateclass();
		//set date values
		obj.setDate(5,25,00);
		// display date
		System.out.println(obj.getDate());
		// display name
		System.out.println("Jianwen Tan");
		

	}//end main

}
