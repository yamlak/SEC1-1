package GSCSPD;

import java.util.*;



/**
 * Division of academic year
 */
public class Semester
{

	University university;
	FacultyLoad facultyload;
	facultyAvailability facultyAvailability;
	ArrayList<StudentCourses> studentCourses;
	/**
	 * name of the semester like fall/spring/summer
	 */
	private String semesterName;
	/**
	 * shows the starting date of the semester
	 */
	private String startDate;
	/**
	 * shows the ending date of the semester
	 */
	private String endDate;
	
	public Semester()
	{
		
	}
	
	public Semester(String semesterName, String startDate, String endDate )
	{	//this();
		this.semesterName= semesterName;
		this.startDate= startDate;
		this.endDate = endDate;
		//university.addSemester(this);
	}
	

	public String getName()
	{
		return this.semesterName;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.semesterName = name;
	}

	public String getStartDate()
	{
		return this.startDate;
	}

	/**
	 * 
	 * @param startData
	 */
	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}

	public String getEndDate()
	{
		return this.endDate;
	}

	/**
	 * 
	 * @param endData
	 */
	public void setEndDate(String endDate)
	{
		this.endDate = endDate;
	}

}