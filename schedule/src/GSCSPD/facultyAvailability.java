package GSCSPD;

import java.util.*;

/**
 * availability of faculty who can teach the course
 */
public class facultyAvailability
{

	Faculty faculty;
	ArrayList<Semester> semester;
	/**
	 * days faculty available to teach a course
	 */
	private String days;

	public String getDays()
	{
		return this.days;
	}

	/**
	 * 
	 * @param days
	 */
	public void setDays(String days)
	{
		this.days = days;
	}

}