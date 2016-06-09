import java.util.*;

/**
 * An educational institution designed for instruction, examination, or both, of students in many branches of advanced learning, conferring degrees in various facilities, and often embodying colleges and similar institutions. Oklahoma Christian university is a private comprehensive coeducational Christian liberal arts university.
 */
public class University
{

	ArrayList<ClassRoom> ClassRoom;
	ArrayList<GraduateSchool> graduateSchool;
	ArrayList<Semester> semesters;
	/**
	 * name of the university
	 */
	private String name;
	/**
	 * A short version of the name
	 */
	private String abbreviation;

	public String getAbbreviation()
	{
		return this.abbreviation;
	}

	/**
	 * 
	 * @param abbreviation
	 */
	public void setAbbreviation(String abbreviation)
	{
		this.abbreviation = abbreviation;
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

	/**
	 * 
	 * @param name
	 * @param abbreviation
	 */
	public University(String name, String abbreviation)
	{
		// TODO - implement University.University
		throw new UnsupportedOperationException();
	}

	public University()
	{
		// TODO - implement University.University
		throw new UnsupportedOperationException();
	}

}