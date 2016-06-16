package GSCSPD;

import java.util.*;

/**
 * A division of a university offering advanced programs beyond the bachelor's degree
 */
public class GraduateSchool
{

	University university;
	ArrayList<Department> departments;
	ArrayList<Faculty> faculty;
	ArrayList<course> course;
	ArrayList<Student> students;
	ArrayList<Degree> degreePlan;
	ArrayList<Schedule> schedule;
	/**
	 * name given to represent school
	 */
	private String name;
	/**
	 * A short version of the name
	 */
	private String abbreviation;

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

	public String getAbbreviation()
	{
		return this.abbreviation;
	}

	/**
	 * 
	 * @param abbreviation
	 */
	public void setAbbreviation(String abbreviation)
	{
		this.abbreviation = abbreviation;
	}
	
	public GraduateSchool()
	{
		
	}
	public GraduateSchool(String abbreviation, String name)
	{
		this.abbreviation = abbreviation;
		this.name = name;
		
	}
	
	ArrayList<Faculty> faculty = new ArrayList<Faculty>();
	
	public void addFaculty(faculty)
	{
		this.faculty.add(faculty);
	}
	
	public void getFaculty()
	{
		for (Faculty F: faculty)
		System.out.println(f.getName() + " " + f.get
	}

}
