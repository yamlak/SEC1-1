package GSCSDM;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import GSCSPD.*;


public class GradSchoolDM {

	public static void loadGraduateSchool(University univ)
	{
		
		String fileName ="data/TestDataGradSchools.csv";
		String line = null;
		String[] token;
		GraduateSchool gradSchool = new GraduateSchool();
		
		 
				
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
		        	
		        	 gradSchool = new GraduateSchool(univ, token[0],token[1]);
		        
		        	univ.addGradSchools(gradSchool);
		        				        	
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
