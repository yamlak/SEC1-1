package GSCSDM;


import GSCSPD.*;


import java.io.*;



public class FacultyLoadDM {

	/**
	 * loadFaculty(gradSchool) looks for data in the file with given file name. 
	 * @param store
	 */

	public static void FacultyLoad(University univ, String fileName)
	{
		
	//	String fileName ="data/TestDataDegreePlanReq.csv";
		String line = null;
		String[] token;
		String[] token2;
		FacultyLoad facultyLoad ;
		
		 
				
	    try {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = new FileReader(fileName);

	        // Always wrap FileReader in BufferedReader.
	        BufferedReader bufferedReader = 
	            new BufferedReader(fileReader);
	        // to skip the first line of data
	        bufferedReader.readLine();
	        //while there is data in file do this
	        while((line = bufferedReader.readLine()) != null) 
	        {
	        		//split data by comma
		        	token = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
		        	facultyLoad = new FacultyLoad(univ, token[0],"2016FA",Integer.parseInt(token[6]));
		        	facultyLoad = new FacultyLoad(univ, token[0],"2017SP",Integer.parseInt(token[7]));
		        	facultyLoad = new FacultyLoad(univ, token[0],"2017SU",Integer.parseInt(token[8]));
		        //	token[4]=token[4].replace("\"", "");
		        //	token2= token[4].replaceAll("^\"/\'s","").split(",");
		        	//System.out.println("token length"    + "    "   +token2.length);
		        /*	for(int i = 0; i<token2.length;i++)
		        	{
		        		if(degreePlanReq.getDegree().getCode()!=token2[i]&& degreePlanReq.getType()!=token[3]);
		        		  	degreePlanReq.setCourses(univ.findCourse(token2[i]));
		        	} */
		        			        	
		        				        	 
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

