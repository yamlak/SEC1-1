package GSCSPD;

import java.util.*;

/**
 * courses taken by students
 */
public class StudentCourses
{

	private Semester semester;
	private Course course;
	private Student student;
	
	//private String sId;
	//private String courseCode;
	//private String courseSemester;
	/**
	 * student grades in a course
	 */
	private String grade;

	public Student getStudent()
	{
		return this.student;
	}

	/**
	 * 
	 * @param id
	 */
	public void setStudent(Student student)
	{
		this.student = student;
	}

	public Course getCourse()
	{
		return this.course;
	}

	/**
	 * 
	 * @param grade
	 */
	public void setCourse(Course course)
	{
		this.course = course;
	}

	public Semester getSemester()
	{
		return this.semester;
	}

	/**
	 * 
	 * @param grade
	 */
	public void setSemester(Semester semester)
	{
		this.semester = semester;
	}

	public String getGrade()
	{
		return this.grade;
	}

	/**
	 * 
	 * @param grade
	 */
	public void setGrade(String grade)
	{
		this.grade = grade;
	}

	public StudentCourses()
	{
		
	}
	
	public StudentCourses(University univ, String sId, String courseCode, String courseSemester, String grade)
	{
		
		this();
		if(univ.findCourse(courseCode)!= null)
		{
		this.student = univ.findStudent(sId);
		
		this.course = univ.findCourse(courseCode);
		this.semester = univ.findSemester(courseSemester);
		this.grade = grade;
		student.addStudentCourses(this);}
	}

	public String toString()
	{
		return getStudent().getId()+" "
				+getCourse().getNumber()+" "
				+getSemester().getName()+ " "
				+getGrade();
	}

}