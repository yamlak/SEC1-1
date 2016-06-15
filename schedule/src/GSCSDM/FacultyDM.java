package GSCSDM;

import GSCSPD.*;
	
	import java.io.*;

import GSCSPD.Section;
import GSCSPD.Semester;
import GSCSPD.University;

public class FacultyDM {

	/**
	 * loadUniversity(university) looks for data in the file with given file name. 
	 * @param store
	 */

	public static void loadSemester(University univ)
	{
		
		String fileName ="data/TestDataFaculty.csv";
		String line = null;
		String[] token;
		Faculty faculty = new Faculty();
		
		 
				
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
		        	
		        	 faculty = new Faculty(token[0],token[1],token[2]);
		        
		        	univ.addFaculty(faculty);
		        				        	
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
