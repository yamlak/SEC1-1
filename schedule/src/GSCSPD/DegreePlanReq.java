package GSCSPD;

import java.util.*;

/**
 * major and minimum requirements to complete a degree
 */
public class DegreePlanReq
{

	Degree degree;
	Course course;
	/**
	 * name of the degree requirements
	 */
	private String degreeCode;
	/**
	 * number of hours the course is offered
	 */
	private int hours;
	/**
	 * type of requirement
	 */
	private String type;
	/**
	 * courses are mandatory to finish a degree
	 */
	private String courses;
	/**
	 * from a list of electives, courses are chosen by students based on requirement
	 */
	private String description;
	/**
	 * students take prerequisites on requirement
	 */
	private String prerequisites;

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

	public int getHours()
	{
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(int hours)
	{
		this.hours = hours;
	}

	public String getType()
	{
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	public String getCourses()
	{
		return this.courses;
	}

	/**
	 * 
	 * @param coreCourse
	 */
	public void setCourses(String courses)
	{
		this.courses = courses;
	}

	public String getDescriptions()
	{
		return this.description;
	}

	/**
	 * 
	 * @param elective
	 */
	public void setDescriptions(String description)
	{
		this.description = description;
	}

	public String getPrerequisites()
	{
		return this.prerequisites;
	}

	/**
	 * 
	 * @param prerequisites
	 */
	public void setPrerequisites(String prerequisites)
	{
		this.prerequisites = prerequisites;
	}

	/**
	 * 
	 * @param student
	 */
	public void listCourseToTake(Student student)
	{
		// TODO - implement DegreePlanReq.listCourseToTake
		throw new UnsupportedOperationException();
	}

	public DegreePlanReq()
	{
	
	}
	
	public DegreePlanReq(Degree degree, String degreeCode, String description, int hours, String type, String courses)
	{
		this();
		this.degreeCode = degreeCode;
		this.description = description;
		this.hours = hours;
		this.courses = courses;
		degree.addDegreePlanReq(this);
	}

	public String toString()
	{
		return getDegreeCode()+" "
				+getDescriptions()+" "
				+getHours() + " "
				+getCourses();
	}
}