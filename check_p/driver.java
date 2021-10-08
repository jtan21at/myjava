package check_p;
import check_p.CoordinatePair;

public class driver {

	public static void main(String[] args) {
		CoordinatePair f_1 = new CoordinatePair(1.0,2.0); 
		CoordinatePair f_2 = new CoordinatePair(1,3);
		f_1.GetCord();// TODO Auto-generated method stub
		System.out.println(CoordinatePair.equals(f_1,f_2));
		System.out.println(CoordinatePair.getEuclideanDistance(f_1,f_2));
	}

}
