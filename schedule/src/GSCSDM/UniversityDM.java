package GSCSDM;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import GSCSPD.*;


public class UniversityDM {

	public static void loadUniversity(University univ)
	{
		
		String fileName ="data/TestDataUniversityName.csv";
		String line = null;
		String[] token;
			
		 
				
	    try {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = 
	            new FileReader(fileName);

	        // Always wrap FileReader in BufferedReader.
	        BufferedReader bufferedReader = 
	            new BufferedReader(fileReader);
	        // to skip the first line of data
	        bufferedReader.readLine();
	        //while there is data in file do this
	        while((line = bufferedReader.readLine()) != null) 
	        {
	        		//split data by comma
		        	token = line.split(",");
		        	
		        	 univ.setName(token[0]); 
		        	 univ.setAbbreviation(token[1]);
		        
		        		        				        	
		     }    
	        // Always close files.
	        bufferedReader.close();            
	    }
	    catch(FileNotFoundException ex) 
	    {
	        System.out.println(
	            "Unable to open file '" + 
	            fileName + "'");                
	    }
	    catch(IOException ex) {
	        System.out.println(
	            "Error reading file '" 
	            + fileName + "'");   	
		
		}
	 
	}
}
