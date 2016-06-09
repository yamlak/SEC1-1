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
	private string abbreviation;

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

	public string getAbbreviation()
	{
		return this.abbreviation;
	}

	/**
	 * 
	 * @param abbreviation
	 */
	public void setAbbreviation(string abbreviation)
	{
		this.abbreviation = abbreviation;
	}

}