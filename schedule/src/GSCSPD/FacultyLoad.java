package GSCSPD;

import java.util.*;

/**
 * maximum number of hours a faculty can teach
 */
public class FacultyLoad
{

	Faculty faculty;
	Semester semester;
	/**
	 * number of hours faculty can teach
	 */
	private int hours;

	public int getHours()
	{
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(int hours)
	{
		this.hours = hours;
	}

	/**
	 * 
	 * @param faculty
	 * @param semester
	 * 
	 */
	
	public Faculty getFaculty()
	{
		return this.faculty;
	}

	/**
	 * 
	 * @param coreCourse
	 */
	public void setSemester(Semester semester)
	{
		this.semester=semester;
	}
	
	public Semester getSemester()
	{
		return this.semester;
	}

	/**
	 * 
	 * @param coreCourse
	 */
	public void setFaculty(Faculty faculty)
	{
		this.faculty = faculty;
	}
	public FacultyLoad(University univ, String fName, String sName,  int hours)
	{
		this();
	//	System.out.println(univ.findFaculty(fName)+ "faculty load");
		if(univ.findFaculty(fName)!= null && univ.findSemester(sName)!= null)
		{
		this.hours = hours;
		this.faculty = univ.findFaculty(fName);
		this.semester = univ.findSemester(sName);
		
		faculty.addFacultyLoad(this);	}
		
	}

	public FacultyLoad()
	{
		//semester = new ArrayList<Semester>();
	
	}
	
	public String toString()
	{
		return getFaculty().getDaysToTeach()+" "
				+getSemester().getName()+" "
				+getHours();
	}

}