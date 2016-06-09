import java.util.*;

/**
 * Division of academic year
 */
public class Semester
{

	University university;
	FacultyLoad facultyload;
	facultyAvailability facultyAvailability;
	ArrayList<StudentCourses> studentCourses;
	/**
	 * name of the semester like fall/spring/summer
	 */
	private String name;
	/**
	 * shows the starting date of the semester
	 */
	private Data startData;
	/**
	 * shows the ending date of the semester
	 */
	private Data endData;

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

	public Data getStartData()
	{
		return this.startData;
	}

	/**
	 * 
	 * @param startData
	 */
	public void setStartData(Data startData)
	{
		this.startData = startData;
	}

	public Data getEndData()
	{
		return this.endData;
	}

	/**
	 * 
	 * @param endData
	 */
	public void setEndData(Data endData)
	{
		this.endData = endData;
	}

}