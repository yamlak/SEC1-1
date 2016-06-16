package GSCSPD;

import java.util.*;

/**
 * instructor of a course
 */
public class Faculty
{

	GraduateSchool graduateSchool;
	ArrayList<Section> section;
	ArrayList<FacultyLoad> facultyLoad;
	ArrayList<facultyAvailability> facultyAvailability;
	/**
	 * last name of the faculty
	 */
	private String lastName;
	private String firstName;
	/**
	 * identity number of the faculty
	 */
	private String number=10000000;
	/**
	 * title owned by faculty
	 */
	private String title;
	private String daysToTeach;

	public void operation()
	{
		// TODO - implement Faculty.operation
		throw new UnsupportedOperationException();
	}

	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}

	/**
	 * 
	 * @param name
	 */
	public void setLastName(String name)
	{
		this.lastName = name;
	}
	
	public void setFirstName(string name)
	{
		this.firstName = name;
	}

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

	public String getTitle()
	{
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	public Faculty()
	{
		// TODO - implement Faculty.Faculty
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param number
	 * @param title
	 * @param daysToTeach
	 */
	public Faculty(String lName, String fname, String title, String daysToTeach)
	{
		// TODO - implement Faculty.Faculty
		throw new UnsupportedOperationException();
	}

	public String getDaysToTeach()
	{
		return this.daysToTeach;
	}

	/**
	 * 
	 * @param daysToTeach
	 */
	public void setDaysToTeach(String daysToTeach)
	{
		this.daysToTeach = daysToTeach;
	}

	/**
	 * 
	 * @param schedule
	 * @param section
	 */
	public void canTeachAddSection(Schedule schedule, Section section)
	{
		// TODO - implement Faculty.canTeachAddSection
		throw new UnsupportedOperationException();
	}

}
