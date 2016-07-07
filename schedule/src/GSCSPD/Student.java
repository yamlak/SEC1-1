package GSCSPD;

import java.util.*;
import java.util.Map.Entry;

/**
 * A person who is studying in the university
 */ 
public class Student
{

	University univ;
	TreeMap<String,StudentCourses> studentCourses;
	/**
	 * unique identification number of the student
	 */
	private String id;
	
	private Degree degree;
	/**
	 * name of the graduationDate
	 */
	private String graduationDate;

	public String getId()
	{
		return this.id;
		
	}

	/**
	 * 
	 * @param number
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	public Degree getDegree()
	{
		return this.degree;
	}

	/**
	 * 
	 * @param name
	 */
	public void setDegree(Degree degree)
	{
		this.degree = degree;
	}
	
	public String getGraduationDate()
	{
		return this.graduationDate;
	}

	/**
	 * 
	 * @param name
	 */
	public void setGraduationDate(String graduationDate)
	{
		this.graduationDate = graduationDate;
	}

	public Student()
	{
		studentCourses = new TreeMap<String, StudentCourses>();
		//studentCourses = new ArrayList<StudentCourses>(); 
	}

	/**
	 * 
	 * @param id
	 * @param name
	 */
	public Student(University univ, String id, String degreeCode, String graduationDate)
	{
		this();
		if(univ.findDegree(degreeCode)!=null){
		this.id = id;
		this.degree = univ.findDegree(degreeCode);
		this.graduationDate = graduationDate;
		univ.addStudents(this);}
	}
	
	
	public TreeMap<String, StudentCourses> getStudentCourses()
	{
		return this.studentCourses;
	}
	
	
	public void addStudentCourses (StudentCourses studentCourses)
	{
		if (studentCourses != null)
		{
			getStudentCourses().put(studentCourses.getCourse().getNumber(), studentCourses);
		}
	}
	
	
	public StudentCourses findStudentCourse(String studentId) {
		
		if(studentId.length()>0)
		{
			if(studentCourses.get(studentId)==null) return null;
			else return getStudentCourses().get(studentId);
	}
		else return null;
	}
	
public StudentCourses findStudentCourseByCourse(String courseNumber) {
		
		if(courseNumber.length()>0)
		{
			if(studentCourses.get(courseNumber)==null) return null;
			else return getStudentCourses().get(courseNumber);
	}
		else return null;
	}
	
	public String toString()
	{
		return getId()+" "
				+getDegree()+" "
				+getGraduationDate();
	}

}