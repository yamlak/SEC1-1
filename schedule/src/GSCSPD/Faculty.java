package GSCSPD;

import java.util.*;
import java.util.Map.Entry;

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
	private String number;
	/**
	 * title owned by faculty
	 */
	private String title;
	private String degree;
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
	
	public void setFirstName(String name)
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
	
	
	public ArrayList<FacultyLoad> getFacultyLoad()
	{
		return this.facultyLoad;
	}
	public void addFacultyLoad (FacultyLoad facultyLoad)
	{
		if (facultyLoad != null)
		{
			getFacultyLoad().add(facultyLoad);
		}
	}
	
	public void removeFacultyLoad(FacultyLoad facultyLoad )
	{
		if (facultyLoad != null)
		{
			getFacultyLoad().remove(facultyLoad.getFaculty());
		}
	}


	public Faculty()
	{
		facultyLoad = new ArrayList<FacultyLoad>();
	}

	/**
	 * 
	 * @param name
	 * @param number
	 * @param title
	 * @param daysToTeach
	 */
	public Faculty(University univ, String lName, String fname, String degree, String title, String daysToTeach)
	{	this();
		this.lastName = lName;
		this.firstName = fname;
		this.degree = degree;
		this.title = title;
		this.daysToTeach = daysToTeach;
		univ.addFaculty(this);
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
	
	public String getDegree()
	{
		return this.degree;
	}
	
	public void setDegree(String degree)
	{
		this.degree = degree;
	}
	public String toString()
	{
		return getLastName()+" "
				+getFirstName()+" "
				+getTitle()+" "
				+getDaysToTeach()+ " "
				+getDegree();
	}
	/**
	 * 
	 * @param schedule
	 * @param section
	 */
	/*public FacultyLoad maxLoad()
	{ int min=0;
		if(!facultyLoad.isEmpty())
		{
			for(FacultyLoad facultyLoad : this.facultyLoad)
			{
				if(facultyLoad.getHours()>min)
					max=facultyLoad.getHours();
			}
		}
	}*/
	public void canTeachAddSection(Schedule schedule, Section section)
	{
		// TODO - implement Faculty.canTeachAddSection
		throw new UnsupportedOperationException();
	}

}
