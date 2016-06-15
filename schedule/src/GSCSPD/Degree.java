package GSCSPD;

import java.util.*;

/**
 * A degree plan is a definition of the course of study necessary to fulfill the requirement of graduation. A degree plan is "major specific" and is established through collaboration between the student and the academic advisor for the student's major.
 */
public class Degree
{

	GraduateSchool graduateSchool;
	ArrayList<DegreePlanReq> degreeRequirements;
	/**
	 * name of the degree plan offered
	 */
	private String name;
	/**
	 * unique code which represents the degree plan
	 */
	private String code;
	/**
	 * Degree plan consists of different departments. This shows different departments available in this university
	 */
	private String department;
	/**
	 * credit hour is a unit that gives weight to the value, level or time requirement of an academic course taken at a educational institution.
	 */
	private String track;

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

	public String getCode()
	{
		return this.code;
	}

	/**
	 * 
	 * @param code
	 */
	public void setCode(String code)
	{
		this.code = code;
	}

	public String getDepartment()
	{
		return this.department;
	}

	/**
	 * 
	 * @param department
	 */
	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String getHours()
	{
		// TODO - implement Degree.getHours
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(String hours)
	{
		// TODO - implement Degree.setHours
		throw new UnsupportedOperationException();
	}

	public Degree()
	{
		// TODO - implement Degree.Degree
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param code
	 * @param name
	 */
	public Degree(String code, String name)
	{
		// TODO - implement Degree.Degree
		throw new UnsupportedOperationException();
	}

	public void NumberCourseNeeded()
	{
		// TODO - implement Degree.NumberCourseNeeded
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param student
	 */
	public void listCourseToTake(Student student)
	{
		// TODO - implement Degree.listCourseToTake
		throw new UnsupportedOperationException();
	}

}