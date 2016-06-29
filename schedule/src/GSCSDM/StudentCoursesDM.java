package GSCSDM;

 import GSCSPD.*;


import java.io.*;



public class StudentCoursesDM {

	/**
	 * loadFaculty(gradSchool) looks for data in the file with given file name. 
	 * @param store
	 */

	public static void loadStudentCourses(University univ, String fileName)
	{
		
		//String fileName ="data/STC.DUMP.csv";
		String line = null;
		String[] token;
		StudentCourses studentCourses = new StudentCourses();
		
		 
				
	    try {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = 
	            new FileReader(fileName);

	        // Always wrap FileReader in BufferedReader.
	        BufferedReader bufferedReader = 
	            new BufferedReader(fileReader);
	        // to skip the first line of data
	        //bufferedReader.readLine();
	        //while there is data in file do this
	        while((line = bufferedReader.readLine()) != null) 
	        {
	        		//split data by comma
		        	token = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
		        	
		        	studentCourses = new StudentCourses(univ, token[0],token[1],token[3], token[4]);
		        
		        	//.addStudentCourses(studentCourses);		        	
		        				        	
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

