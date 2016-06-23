package GSCSDM;

	import GSCSPD.*;

	
	import java.io.*;



	public class DegreeDM {

		/**
		 * loadFaculty(gradSchool) looks for data in the file with given file name. 
		 * @param store
		 */

		public static void loadDegree(GraduateSchool gradSchool)
		{
			
			String fileName ="data/TestDataDegrees.csv";
			String line = null;
			String[] token;
			Degree degree = new Degree();
			
			 
					
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
			        	
			        	degree = new Degree(gradSchool, token[0],token[1],token[2],token[3]);
			        
			        	gradSchool.addDegree(degree);
			        	
			        				        	
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

