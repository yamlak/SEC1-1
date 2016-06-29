package GSCSPD;

import java.util.*;

/**
 * A person who is studying in the university
 */ 
public class Student
{

	University univ;
	ArrayList<StudentCourses> studentCourses;
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
		studentCourses = new ArrayList<StudentCourses>(); 
	}

	/**
	 * 
	 * @param id
	 * @param name
	 */
	public Student(University univ, String id, String degreeCode, String graduationDate)
	{
		this();
		this.id = id;
		this.degree = univ.findDegree(degreeCode);
		this.graduationDate = graduationDate;
		univ.addStudents(this);
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
				+getDegree().getCode()+" "
				+getGraduationDate();
	}

}