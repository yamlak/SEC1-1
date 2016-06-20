package GSCSPD;

import java.util.*;

/**
 * courses offered in graduate school
 */
public class Course
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
	private int creditHours;

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
		return this.creditHours;
	}

	/**
	 * 
	 * @param CreditHours
	 */
	public void setCreditHours(int creditHours)
	{
		this.creditHours = creditHours;
	}

	public Course()
	{
		
	}
	public Course(GraduateSchool gradSchool, String number, String name, String description, int creditHourse)
	{
		this();
		this.number = number;
		this.name = name;
		this.description = description; 
		this.creditHours = creditHourse;
		gradSchool.addCourses(this);

	}
	
	public String toString()
	{
		return getNumber()+" "
				+getName()+" "
				+getDescription()+" "
				+getCreditHours();
	}
}

