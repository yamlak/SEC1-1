package GSCSGI;
import GSCSDM.*;
import GSCSPD.*;


public class TestSchedule {
public static University myUniversity;
	public static void main(String[] args) {
		
		myUniversity = new University();
	/*	System.out.println("Ready to open Store");
		myStore.openStore();
		printStore();
		System.out.println("Store Open:"+myStore.getName() );
*/
		
		
		// reading data from a csv file
		  System.out.println("\n Reading semester from csv :\n");
		  		 
		  SemesterDM.loadSemester(myUniversity);
		  
		  System.out.println("\n Reading GradSchool from csv :\n");
		  GradSchoolDM.loadGraduateSchool(myUniversity);

		  // display semester data
		  myUniversity.getSemester();
		  myUniversity.getGraduateSchool();
		// System.out.println(myUniversity.getName()+ " " + sem.getStartDate()+ " " + sem.getEndDate());


	}

}
