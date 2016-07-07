package GSCSPD;

import java.util.*;

/**
 * courses offered in graduate school
 */
public class Course
{

	GraduateSchool graduateSchool;
	ArrayList<Section> section;
	ArrayList<DegreePlanReq> degreePlanReq;
	ArrayList<StudentCourses> studentCourses;
	ArrayList<Faculty> faculty;
	ArrayList<Course> prerqs;
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
	private String creditHours;
	
	private String courseCap;
	
	private String offeredFall;
	
	private String offeredSpring;
	
	private String offeredSummer;

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

	public String getCreditHours()
	{
		return this.creditHours;
	}

	/**
	 * 
	 * @param CreditHours
	 */
	public void setCreditHours(String creditHours)
	{
		this.creditHours = creditHours;
	}

	public ArrayList<Course> getPrerqsCourses()
	{
		return this.prerqs;
	}

	/**
	 * 
	 * @param coreCourse
	 */
	public void setPrerqsCourses(Course courses)
	{
		getPrerqsCourses().add(courses);
	}
	
	public ArrayList<Faculty> getFaculty()
	{
		return this.faculty;
	}

	/**
	 * 
	 * @param coreCourse
	 */
	public void setFaculty(Faculty faculty)
	{
		getFaculty().add(faculty);
	}
	
	public Course()
	{
		faculty = new ArrayList<Faculty>();
		prerqs = new ArrayList<Course>();
	}
	
	
	public Course(University univ, String number, String name, String description, String creditHourse, String courseCap, String offeredFall, String offeredSpring, String offeredSummer)
	{
		this();
		this.number = number;
		this.name = name;
		this.description = description; 
		this.creditHours = creditHourse;
		this.courseCap = courseCap;
		this.offeredFall = offeredFall;
		this.offeredSpring = offeredSpring;
		this.offeredSummer = offeredSummer;
	//	this.faculty = univ.findFaculty(facultyName);
	//	this.prerqs = univ.findCourse(prerqs);
		univ.addCourses(this);
		
		

	}
	
	public String toString()
	{
		return getNumber()+" "
				+getName()+" "
			//	+getDescription()+" "
				+getCreditHours()+ " "
				+getFaculty();
	}
}

