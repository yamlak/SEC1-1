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
	/**
	 * student grades in a course
	 */
	private String grade;

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
		// TODO - implement StudentCourses.StudentCourses
		throw new UnsupportedOperationException();
	}

}