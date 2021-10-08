package ck2;


	

class House extends building {
	public String name = "A house";
	public String desc = "a nice place";
	String featu = "just a house";

	public House(String s) {
		name = s;
	}

	public void explore() {
		System.out.println("the size of the house is" + size);
		System.out.println(name);
		System.out.println(desc);
		System.out.println(featu);
		if (haunted) {
			System.out.println("Watch out! A ghost!");
		}
	}
}

