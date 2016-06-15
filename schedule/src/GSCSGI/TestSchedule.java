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
		  System.out.println("Reading semester from csv :");
		  		 
		  SemesterDM.loadSemester(myUniversity);
		  
		  System.out.println("Reading GradSchool from csv :");
		  GradSchoolDM.loadGraduateSchool(myUniversity);

		  // display semester data
		  myUniversity.getSemester();
		  myUniversity.getGraduateSchool();
		// System.out.println(myUniversity.getName()+ " " + sem.getStartDate()+ " " + sem.getEndDate());


	}

}
