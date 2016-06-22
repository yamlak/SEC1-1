package GSCSGI;
import java.util.Map.Entry;

import GSCSDM.*;
import GSCSPD.*;
import GSCSGI.GSCSJFrame;




public class TestSchedule {
public static University myUniversity;
public static GraduateSchool gradSchool;
public static Degree degree;
public static Student student;

	public static void main(String[] args) {
		
		myUniversity = new University();
		gradSchool = new GraduateSchool();
		degree = new Degree();
		student = new Student();

		myUniversity.openUniversity();;
		GSCSJFrame.run(myUniversity);

		// reading data from a csv file
		  //System.out.println("\n Reading semester from csv :\n");
		  		 
		  SemesterDM.loadSemester(myUniversity);
		  GradSchoolDM.loadGraduateSchool(myUniversity);
		  FacultyDM.loadFaculty(gradSchool); 
		  DegreeDM.loadDegree(gradSchool);
		  CourseDM.loadCourse(gradSchool); 
		  DegreePlanReqDM.loadDegreePlanReq(degree);
		  StudentDM.loadStudent(gradSchool);
		 // StudentCoursesDM.loadStudentCourses(student);
		  printUniversity();

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
		for (Entry<String, Faculty> entry : gradSchool.getFaculties().entrySet())
		{
	        System.out.println(entry.getValue().toString());
		}
		System.out.println("==============");
		System.out.println("Degree");
		System.out.println("==============");
		for (Entry<String, Degree> entry : gradSchool.getDegrees().entrySet()) 
		{
	        System.out.println(entry.getValue().toString());
	        
		}
		
		System.out.println("==============");
		System.out.println("Course");
		System.out.println("==============");
		for (Entry<String, Course> entry : gradSchool.getCourses().entrySet()) 
		{
	        System.out.println(entry.getValue().toString());
	        
		}
		
		System.out.println("==============");
		System.out.println("DegreePlanReq");
		System.out.println("==============");
		for (DegreePlanReq degreePlan : degree.getDegreePlanReqs())
			
		{
	        System.out.println(degreePlan.toString());
		}
		
		System.out.println("==============");
		System.out.println("Student"); 
		System.out.println("==============");
		for (Entry<String, Student> entry : gradSchool.getStudents().entrySet()) 
		{
	        System.out.println(entry.getValue().toString());
	        
		}
		
		System.out.println("==============");
		System.out.println("StudentCourses");
		System.out.println("==============");
		for (StudentCourses studentCourse : student.getStudentCourses())
			
		{
	        System.out.println(studentCourse.toString());
		}
	}

}
