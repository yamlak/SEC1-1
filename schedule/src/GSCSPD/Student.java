package GSCSPD;

import java.util.*;

/**
 * A person who is studying in the university
 */
public class Student
{

	GraduateSchool graduateSchool;
	ArrayList<StudentCourses> studentCourses;
	/**
	 * unique identification number of the student
	 */
	private String id;
	
	private String degreeCode;
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

	public String getDegreeCode()
	{
		return this.degreeCode;
	}

	/**
	 * 
	 * @param name
	 */
	public void setDegreeCode(String degreeCode)
	{
		this.degreeCode = degreeCode;
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
		studentCourses = new ArrayList<StudentCourses>(); 
	}

	/**
	 * 
	 * @param id
	 * @param name
	 */
	public Student(GraduateSchool gradSchool, String id, String degreeCode, String graduationDate)
	{
		this();
		this.id = id;
		this.degreeCode = degreeCode;
		this.graduationDate = graduationDate;
		gradSchool.addStudents(this);
	}
	
	public ArrayList<StudentCourses> getStudentCourses()
	{
		return this.studentCourses;
	}
	
	public void addStudentCourses (StudentCourses studentCourses)
	{
		if (studentCourses != null)
		{
			getStudentCourses().add(studentCourses);
		}
	}
	
	public String toString()
	{
		return getId()+" "
				+getDegreeCode()+" "
				+getGraduationDate();
	}

}