package ck2;


	

class House extends building {
	public String name = "A house";
	public String desc = "a nice place";
	String featu = "just a house";

	public House(String s) {
		name = s;
	}

	public void explore() {
		System.out.print("You pass a" + size+ "meter house");
		System.out.print("with a(n)");
		System.out.print(" ");
		System.out.println(featu);
		if (haunted) {
			System.out.println("Watch out! A ghost!");
		}
	}
}

