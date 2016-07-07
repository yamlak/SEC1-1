package GSCSPD;

import java.util.*;

/**
 * major and minimum requirements to complete a degree
 */
public class DegreePlanReq
{

	
	private ArrayList<Course> course;
	/**
	 * name of the degree requirements
	 */
	private Degree degree;
	/**
	 * number of hours the course is offered
	 */
	private String hours;
	/**
	 * type of requirement
	 */
	private String type;
	/**
	 * courses are mandatory to finish a degree
	 */
	//private String courses;
	/**
	 * from a list of electives, courses are chosen by students based on requirement
	 */
	private String description;
	/**
	 * students take prerequisites on requirement
	 */
	private String prerequisites;


	public String getHours()
	{
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(String hours)
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

	public ArrayList<Course> getCourses()
	{
		return this.course;
	}

	/**
	 * 
	 * @param coreCourse
	 */
	public void setCourses(Course courses)
	{
		getCourses().add(courses);
	}
	
	public Degree getDegree()
	{
		return this.degree;
	}

	/**
	 * 
	 * @param coreCourse
	 */
	public void setDegree(Degree degree)
	{
		this.degree= degree;
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
		course = new ArrayList<Course>();
	}
	
	public DegreePlanReq(University univ, String degreeCode, String description, String hours, String type)
	{
		this();
		//	System.out.println("*" + degreeCode + "*");
		if(univ.findDegree(degreeCode)!=null){
		this.degree = univ.findDegree(degreeCode);
		this.description = description;
		this.hours = hours;
		this.type= type;
		//this.course = courses;
		//System.out.println(" constrac " + degree.toString());
		//setDegree(degree);
		degree.addDegreePlanReq(this);}
	}

	public String toString()
	{
		return getDegree().getCode().toString()+" "
				+getDescriptions()+" "
				+getHours() + " "
				+getCourses();
	}
}