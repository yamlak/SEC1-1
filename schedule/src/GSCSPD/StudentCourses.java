package GSCSPD;

import java.util.*;

/**
 * courses taken by students
 */
public class StudentCourses
{

	Semester semester;
	Course course;
	Student student;
	
	private String sId;
	private String courseCode;
	private String courseSemester;
	/**
	 * student grades in a course
	 */
	private String grade;

	public String getSId()
	{
		return this.sId;
	}

	/**
	 * 
	 * @param id
	 */
	public void setSId(String sId)
	{
		this.sId = sId;
	}

	public String getCourseCode()
	{
		return this.courseCode;
	}

	/**
	 * 
	 * @param grade
	 */
	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}

	public String getCourseSemester()
	{
		return this.courseSemester;
	}

	/**
	 * 
	 * @param grade
	 */
	public void setCourseSemester(String courseSemester)
	{
		this.courseSemester = courseSemester;
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
	
	public StudentCourses(GraduateSchool gradSchool, String sId, String courseCode, String courseSemester, String grade)
	{
		this();
		this.sId = sId;
		this.courseCode = courseCode;
		this.courseSemester = courseSemester;
		this.grade = grade;
		gradSchool.addStudentCourses(this);
	}
	
	public String toString()
	{
		return getSId()+" "
				+getCourseCode()+" "
				+getCourseSemester()+ " "
				+getGrade();
	}

}