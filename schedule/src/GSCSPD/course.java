package GSCSPD;

import java.util.*;

/**
 * courses offered in graduate school
 */
public class course
{

	GraduateSchool graduateSchool;
	ArrayList<Section> section;
	ArrayList<DegreePlanReq> degreeRequirements;
	ArrayList<StudentCourses> studentCourses;
	/**
	 * identity number of the course
	 */
	private String number;
	/**
	 * name of the course
	 */
	private String name;
	/**
	 * detailed representation of course
	 */
	private String description;
	/**
	 * number of credit hours per course
	 */
	private int CreditHours;

	public String getNumber()
	{
		return this.number;
	}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(String number)
	{
		this.number = number;
	}

	public String getName()
	{
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getCreditHours()
	{
		// TODO - implement course.getCreditHours
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param CreditHours
	 */
	public void setCreditHours(int CreditHours)
	{
		// TODO - implement course.setCreditHours
		throw new UnsupportedOperationException();
	}

	public course()
	{
		// TODO - implement course.course
		throw new UnsupportedOperationException();
	}

}