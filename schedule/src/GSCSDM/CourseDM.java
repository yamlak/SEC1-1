package GSCSDM;

	import GSCSPD.*;

	
	import java.io.*;



	public class CourseDM {

		/**
		 * loadFaculty(gradSchool) looks for data in the file with given file name. 
		 * @param store
		 */

		public static void loadCourse(GraduateSchool gradSchool)
		{
			
			String fileName ="data/TestDataCourses.csv";
			String line = null;
			String[] token;
			Course course = new Course();
			
			 
					
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
			        			        
			        	
			        	course = new Course(gradSchool, token[0],token[1],token[2], Integer.parseInt(token[3]));
			        
			        	gradSchool.addCourses(course);
			        	
			        				        	
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

