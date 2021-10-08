package check_p;
import java.lang.Math;


public class CoordinatePair {
	private double x;
	private double y;
	public CoordinatePair (double x1,double y1) {
		x=x1;
		y=y1;
	}
	public CoordinatePair () {
		x=0;
		y=0;
				
	};
	
	public void SetCord (double x1, double y1) {
		x=x1;
		y=y1;
	}
	public void GetCord () {
		System.out.println("CoordinatePair("+ Double.toString(x)+","+Double.toString(y)+")");
	}
	
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}
	public static boolean equals(CoordinatePair p_1,CoordinatePair p_2) {
		if (p_1.getx()==p_2.getx() & p_1.gety()==p_2.gety())
				return true;
		else return false;
	}
	public static double getEuclideanDistance(CoordinatePair p_1, CoordinatePair p_2) {
		double x1,x2,y1,y2;
		x1=p_1.getx();
		x2=p_2.getx();
		y1=p_1.gety();
		y2=p_2.gety();
		return (Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2)));
	}
}
