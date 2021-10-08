package FortuneCookies;
import FortuneCookies.FortuneCookies;
public class showCookies {

	public static void main(String[] args) {
		// driver
		FortuneCookies[] message=new FortuneCookies[5];//set five
		message[0]=new FortuneCookies("You will have a great success today");
		message[1]=new FortuneCookies("A chance meeting brings opportunity ");
		message[2]=new FortuneCookies("good luck");
		message[3]=new FortuneCookies("good luck always");
		message[4]=new FortuneCookies("always good luck ");
		//end set message


		
		/*for (int i=0; i< message.length; i++) {
			System.out.println(message[i].getMessage());
		};
		//endloop*/
		for ( FortuneCookies mes : message)  {
			System.out.println(mes.getMessage());//print message
		}
		//endloop
		
	}

	
}
