import java.util.*;

/**
 * An academic department is a division of a university or school faculty devoted to a particular academic discipline.
 */
public class Department
{

	GraduateSchool graduateSchool;
	ArrayList<User> user;
	/**
	 * name of the department in a graduate school
	 */
	private string name;

	public string getName()
	{
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(string name)
	{
		this.name = name;
	}

}