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
	 * name of the faculty
	 */
	private String name;
	/**
	 * identity number of the faculty
	 */
	private String number;
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
	public Faculty(String name, String number, String title, String daysToTeach)
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