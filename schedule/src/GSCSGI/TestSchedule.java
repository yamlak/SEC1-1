package GSCSGI;
import GSCSDM.*;
import GSCSPD.*;


public class TestSchedule {
public static University myUniversity;
public static GraduateSchool gradSchool;
	public static void main(String[] args) {
		
		myUniversity = new University();
		gradSchool = new GraduateSchool();
	/*	System.out.println("Ready to open Store");
		myStore.openStore();
		printStore();
		System.out.println("Store Open:"+myStore.getName() );
*/
		
		
		// reading data from a csv file
		  System.out.println("Reading semester from csv :\n");
		  		 
		  SemesterDM.loadSemester(myUniversity);
		  
		     // display semester data
		  myUniversity.getSemester();
		  
		  GradSchoolDM.loadGraduateSchool(myUniversity);
		  System.out.println("Reading GradSchool from csv :\n");
		  myUniversity.getGraduateSchool();
		  
		  System.out.println("Reading Faculty from csv :\n");
		  FacultyDM.loadFaculty(gradSchool);
		  gradSchool.getFaculty();
		  
		// System.out.println(myUniversity.getName()+ " " + sem.getStartDate()+ " " + sem.getEndDate());


	}

}
