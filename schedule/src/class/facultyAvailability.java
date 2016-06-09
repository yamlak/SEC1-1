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
	private string days;

	public string getDays()
	{
		return this.days;
	}

	/**
	 * 
	 * @param days
	 */
	public void setDays(string days)
	{
		this.days = days;
	}

}