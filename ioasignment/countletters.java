package ioasignment;
import java.io.*;

public class countletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File filepath = new File(
		            "g:\\java\\TestFile.txt");
		        FileInputStream FinStream
		            = new FileInputStream(filepath);
		        InputStreamReader inSReader
		            = new InputStreamReader(FinStream);
		        BufferedReader bReader
		            = new BufferedReader(inSReader);
		

        String reader;
        String line;
        int lettercount=0;
        int frequency[]=new int [26];
        int asc=0;
        char letter='a';
        while ((reader = bReader.readLine()) != null) {
            if (reader.equals("")) {
               
            }
            else {
            	
            	line=reader.toUpperCase();
            	
            	System.out.println(line);
            	for (int j = 0; j < frequency.length; j++) {
            		frequency[j]=0;
            			
            		}
            	for(int i=0;i<line.length();i++){
            		char ch = line.charAt(i);
            		asc=65;
            		asc=(int)ch;
            		if (Character.isLetter(ch)){
            			asc=asc-65;
            			frequency[asc]++;
            			
            			
            	
            		
            		}
            	}
            	 letter='a';
            for (int j = 0; j < frequency.length; j++) {
            		if (frequency[j]>0) {
            			System.out.println("contains "+ letter );
            		}
            		
            		letter++;
            		
            	}
            	
            	}
            	
                
            	
               
                
                
                
            }
           
           

        
		}
		catch(Exception e) {
		      System.out.println("Something's wrong.");
	    }
         

	}

}
