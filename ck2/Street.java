package ck2;

public class Street {

	public String name = "a street";
	int num_of_building = 0;
	public String desc = "nice";
	public building[] stBuild;

	public Street() {
		System.out.print("street initialized");

	}

	

	public Street(int num) {

		num_of_building = num;
		stBuild = new building[num];
	}

	

	public Street(String s) {

		name = s;
	}

	public String toString() {
		return name;
	}
	
	public void getName() 	{
		System.out.println(name);
		
	}
	//
	public void explore() {
	for(int i = 0;i<stBuild.length;i++)	{
		stBuild[i].explore();
	}
	}
//

	public void morningStroll() {
		System.out.println("Let's go for a morning stroll on Mayhew Street,");

	}	
	
}//