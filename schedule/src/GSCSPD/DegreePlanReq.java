package GSCSPD;

import java.util.*;

/**
 * major and minimum requirements to complete a degree
 */
public class DegreePlanReq
{

	Degree degree;
	course course;
	/**
	 * name of the degree requirements
	 */
	private String name;
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
	private String coreCourse;
	/**
	 * from a list of electives, courses are chosen by students based on requirement
	 */
	private String elective;
	/**
	 * students take prerequisites on requirement
	 */
	private String prerequisites;

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

	public String getCoreCourse()
	{
		return this.coreCourse;
	}

	/**
	 * 
	 * @param coreCourse
	 */
	public void setCoreCourse(String coreCourse)
	{
		this.coreCourse = coreCourse;
	}

	public String getElective()
	{
		return this.elective;
	}

	/**
	 * 
	 * @param elective
	 */
	public void setElective(String elective)
	{
		this.elective = elective;
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
		// TODO - implement DegreePlanReq.DegreePlanReq
		throw new UnsupportedOperationException();
	}

}