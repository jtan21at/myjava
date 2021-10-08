package lexicon;

public class sort {
	public static String largest (String[] strIn) {
		int[] largest;
		largest = new int[strIn.length];
		for (int i=0;i<strIn.length-1;i++){
            for (int j=0;j<strIn.length-i-1;j++) {
            	if(strIn[j].compareTo(strIn[j+1])>0){
            		largest[i]=j;//find the  largest  
            	}
            }
		}
		return strIn[largest[0]];//return the largest only
	}
          
} 

/**
 * 
 */
/**
 * 
 */
