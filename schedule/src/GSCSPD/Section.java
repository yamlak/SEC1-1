package GSCSPD;

import java.security.KeyStore.Entry;
import java.util.*;

/**
 * strength of students divided into sections to reduce load
 */
public class Section
{

	Schedule schedule;
	Course course;
	Faculty faculty;
	Semester semester;
	
	//ArrayList<Faculty> faculty = new ArrayList<Faculty>();
	TreeMap<String, Integer> fCourses = new TreeMap<String, Integer>();
	/**
	 * unique number provided for a section
	 */
	private String number;

	public String getNumber()
	{
		return this.number;
	}

	public Semester getSemester()
	{
		return this.semester;
	}
	
	/**
	 * Adds the semester to the university.
	 * 
	 * 
	 * @param semester
	 */
	
	
	public void setSemester(Semester semester)
	{
		if (semester != null)
		{
			this.semester = semester;
		}
	}
	
	public void removeSemester(Semester semester )
	{
		if (semester != null)
		{
			removeSemester(semester);
		}
	}
	
	public void setCourse(Course course)
	{
		 this.course = course;
	}
	
	/**
	 * Adds the semester to the university.
	 * 
	 * 
	 * @param semester
	 */
	
	
	public void setFaculty(Faculty faculty)
	{
		if (faculty != null)
		{
			this.faculty = faculty;
		}
	}
	/**
	 * 
	 * @param number
	 */
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public Course getCourse()
	{
		return this.course;
	}
	
	public Faculty getFaculty(){
		return this.faculty;
	}

	public void numberStudents()
	{
		// TODO - implement Section.numberStudents
		throw new UnsupportedOperationException();
	}

	public void calcPerCentCap()
	{
		// TODO - implement Section.calcPerCentCap
		throw new UnsupportedOperationException();
	}

	public Section()
		{ 
	//schedule = new Schedule();
	}

	/**
	 * 
	 * @param number
	 * @param schedule
	 */
	public Section(University univ, Semester semester, Faculty faculty, Course course, String number){
		this();
		this.course = course;
		this.faculty= faculty;
		this.semester = semester;
		this.number= number;
		schedule.addSection(this);
		
	}
	public String toString()
	{
		return getCourse()+" "
				+getFaculty();
				/*+getTitle()+" "
				+getDaysToTeach()+ " "
				+getDegree();*/
	}
	
}