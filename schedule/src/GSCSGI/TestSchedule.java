package GSCSGI;
import java.util.Map.Entry;

import GSCSDM.*;
import GSCSPD.*;



public class TestSchedule {
public static University myUniversity;
public static GraduateSchool gradSchool;
	public static void main(String[] args) {
		
		myUniversity = new University();
//		gradSchool = new GraduateSchool();
	/*	System.out.println("Ready to open Store");
		myStore.openStore();
		printStore();
		System.out.println("Store Open:"+myStore.getName() );
*/
		
		
		// reading data from a csv file
		  System.out.println("\n Reading semester from csv :\n");
		  		 
		  SemesterDM.loadSemester(myUniversity);
		  
		     // display semester data
		 // myUniversity.getSemester();
		  
		 /* GradSchoolDM.loadGraduateSchool(myUniversity);
		  System.out.println("\n Reading GradSchool from csv :\n");
		  myUniversity.getGraduateSchool();
		  
		  System.out.println("\n Reading Faculty from csv :\n");
		  FacultyDM.loadFaculty(gradSchool);
		  gradSchool.getFaculty();
		  
		// System.out.println(myUniversity.getName()+ " " + sem.getStartDate()+ " " + sem.getEndDate());
*/
		  printUniversity();

	}
	/**
	 * printUniversity() prints out the data from the file. It prints all of the cashiers,
	 * registers, items and sessions.
	 */
	public static void printUniversity()
	{
		/*System.out.println("==============");
		System.out.println("Cashiers");
		System.out.println("==============");
		for (Entry<String, Cashier> entry : myStore.getCashiers().entrySet()) 
		{
	        System.out.println(entry.getValue().getPerson().getName());
	        
		}
		*/System.out.println("==============");
		System.out.println("GradSchool");
		System.out.println("==============");
		for (Entry<String, GraduateSchool> entry : myUniversity.getGradSchools().entrySet()) 
		{
	        System.out.println(entry.getValue().toString());
	        
		}
		System.out.println("==============");
		System.out.println("Semester");
		System.out.println("==============");
		for (Entry<String, Semester> entry : myUniversity.getSemesters().entrySet()) 
		{
	        System.out.println(entry.getValue().toString());
		}
		/*System.out.println("==============");
		System.out.println("Sessions");
		System.out.println("==============");
		for (Session session : myStore.getSessions())
	
		{
	        System.out.println(session.toString());
		}*/
	}

}
