package GSCSDM;

import GSCSPD.*;

	
import java.io.*;



public class StudentDM {

	/**
	 * loadFaculty(gradSchool) looks for data in the file with given file name. 
	 * @param store
	 */

	public static void loadStudent(University univ, String fileName)
	{
		
		//String fileName ="data/STU.DUMP.csv";
		String line = null;
		String[] token;
		Student student = new Student();
		
		 
				
	    try {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = 
	            new FileReader(fileName);

	        // Always wrap FileReader in BufferedReader.
	        BufferedReader bufferedReader = 
	            new BufferedReader(fileReader);
	        // to skip the first line of data
	       // bufferedReader.readLine();
	        //while there is data in file do this
	        while((line = bufferedReader.readLine()) != null) 
	        {
	        		//split data by comma
		        	token = line.split(",");
		        	
		        	student = new Student(univ,token[0],token[1],token[2]); 
		        
		        	       				        	
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
