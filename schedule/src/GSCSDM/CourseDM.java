package GSCSDM;

	import GSCSPD.*;

	
	import java.io.*;



	public class CourseDM {

		/**
		 * loadFaculty(gradSchool) looks for data in the file with given file name. 
		 * @param store
		 */

		public static void loadCourse(University univ, String fileName)
		{
			
		//	String fileName ="data/TestDataCourses.csv";
			String line = null;
			String[] token;
			String[] fToken;
			String[] prereqsToken;
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
			        			        
			        	
			        	course = new Course(univ, token[0],token[1],token[2], token[3],token[4],token[5],token[6],token[7]);
			        
			        	univ.addCourses(course);
			        	
			        	token[9]=token[9].replace("\"", "");
			        	fToken= token[9].replaceAll("^\"/\'s","").split(",");
			        	//if(token[8].contains("-"))
			        	//System.out.println("token length"    + "    "   +token2.length);
			        	for(int i = 0; i<fToken.length;i++)
			        	{
			        		if(fToken[i]!= null);
			        		if(univ.findFaculty(fToken[i])!=null)
			        		  	course.setFaculty(univ.findFaculty(fToken[i]));
			        	}
			        	
			        				        	
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

