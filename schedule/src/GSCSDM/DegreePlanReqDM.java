package GSCSDM;

 import GSCSPD.*;


import java.io.*;



public class DegreePlanReqDM {

	/**
	 * loadFaculty(gradSchool) looks for data in the file with given file name. 
	 * @param store
	 */

	public static void loadDegreePlanReq(Degree degree)
	{
		
		String fileName ="data/TestDataDegreePlanReq.csv";
		String line = null;
		String[] token;
		String[] token2;
		DegreePlanReq degreePlanReq = new DegreePlanReq();
		
		 
				
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
		        	token = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
		        	//token2= token[4].replaceAll("\\s","").split(",");
		        	//System.out.println("token length"    + "    "   +token2.length);
		        	//for(int i = 0; i<token2.length;i++)
		        	//{
		        	degreePlanReq = new DegreePlanReq(degree, token[0],token[1],Integer.parseInt(token[2]),token[3], token[4]);
		        	//}
		        	degree.addDegreePlanReq(degreePlanReq);		        	
		        				        	
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

