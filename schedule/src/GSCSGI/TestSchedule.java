package GSCSGI;
import java.util.TreeMap;
import java.util.Map.Entry;

import GSCSDM.*;
import GSCSPD.*;
import GSCSGI.GSCSJFrame;




public class TestSchedule {
public static University myUniversity;
public static GraduateSchool gradSchool;
public static Section section;
public static Schedule schedule;

	public static void main(String[] args) {
		TreeMap<String, Integer> sortedFaculty = new TreeMap<String, Integer>();
		myUniversity = new University();
	//	section = new Section();
		schedule = new Schedule("Grad School Schedule");
		
        String studentFileName = "data/STU.DUMP.csv";
		myUniversity.openUniversity();;
		GSCSJFrame.run(myUniversity,gradSchool);

		// reading data from a csv file
		  //System.out.println("\n Reading semester from csv :\n");
		  		 
		  SemesterDM.loadSemester(myUniversity);
		  GradSchoolDM.loadGraduateSchool(myUniversity);
		  FacultyDM.loadFaculty(myUniversity); 
		  DegreeDM.loadDegree(myUniversity);
		 // System.out.println(myUniversity.findGradscool("GSECS"));
		 // System.out.println(myUniversity.findDegree("MSCS.SFTW.ENG"));
		  CourseDM.loadCourse(myUniversity, "data/TestDataCourses.csv"); 
		  FacultyLoadDM.FacultyLoad(myUniversity, "data/TestDataFaculty.csv");
		  DegreePlanReqDM.loadDegreePlanReq(myUniversity, "data/TestDataDegreePlanReq.csv");
		  StudentDM.loadStudent(myUniversity,"data/STU.DUMP.csv");
		  StudentCoursesDM.loadStudentCourses(myUniversity, "data/STC.DUMP.csv");
		//  printUniversity();
		  Sections.CourseNeeded(myUniversity);
		  sortedFaculty= Sections.assignSection(myUniversity);;
	   System.out.println(schedule.getSection());
		  

	}
	/**
	 * printUniversity() prints out the data from the file. It prints all of the cashiers,
	 * registers, items and sessions.
	 */
	public static void printUniversity()
	{
		
		
		System.out.println("==============");
		System.out.println("GradSchool");
		System.out.println("==============");
		for (Entry<String, GraduateSchool> entry : myUniversity.getGradSchools().entrySet()) 
		{
	        System.out.println(entry.getValue().toString());
	        
	        System.out.println("==============");
			System.out.println("Degree");
			System.out.println("==============");
			for (Entry<String, Degree> degreeEntry : entry.getValue().getDegrees().entrySet()) 
			{
		        System.out.println(degreeEntry.getKey().toString());
		        System.out.println("==============");
				System.out.println("DegreePlanReq"); 
				System.out.println("==============");
				for (DegreePlanReq degreePlan : degreeEntry.getValue().getDegreePlanReqs())
					
				{
			        System.out.println(degreePlan.toString());
				}
		        
			}
	        
		}
		System.out.println("==============");
		System.out.println("Semester");
		System.out.println("==============");
		for (Entry<String, Semester> entry : myUniversity.getSemesters().entrySet()) 
		{
	        System.out.println(entry.getValue().toString());
		}
		System.out.println("==============");
		System.out.println("Faculty");
		System.out.println("==============");
		for (Entry<String, Faculty> entry : myUniversity.getFaculties().entrySet())
		{
	        System.out.println(entry.getValue().toString());
	        for (FacultyLoad facultyLoad : entry.getValue().getFacultyLoad())
	        {
	        	System.out.println(facultyLoad);
	        }
		}
		
		
		System.out.println("==============");
		System.out.println("Course");
		System.out.println("==============");
		for (Entry<String, Course> entry : myUniversity.getCourses().entrySet()) 
		{
	        System.out.println(entry.getValue().toString());
	        
		}
		
		
		
		System.out.println("==============");
		System.out.println("Student"); 
		System.out.println("==============");
		for (Entry<String, Student> entry : myUniversity.getStudents().entrySet()) 
		{
	        System.out.println(entry.getValue().toString());
	        for (Entry<String,StudentCourses> studentCourse : entry.getValue().getStudentCourses().entrySet())
				
			{
		        System.out.println(studentCourse.toString());
			}
	        
		}
		
	/*	System.out.println("==============");
		System.out.println("StudentCourses");
		System.out.println("==============");
		for (StudentCourses studentCourse : student.getStudentCourses())
			
		{
	        System.out.println(studentCourse.toString());
		}*/
	}

}
