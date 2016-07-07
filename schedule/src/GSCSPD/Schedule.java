package GSCSPD;

import java.util.*;
import java.util.Map.Entry;

/**
 * giving lists of intended events and times
 */
public class Schedule
{   
//	static Section sections = new Section();
	String name;
	 ArrayList<Section> section;
	
	public ArrayList<Section> getSection()
	{
		return this.section;
	}
	public void addSection (Section section)
	{
		if (section != null)
		{
			getSection().add(section);
		}
	}
	
	public void removeSection(Section section )
	{
		if (section != null)
		{
			getSection().remove(section.getNumber());
		}
	}
	
public Schedule(){
	 section = new ArrayList< Section>();
	
}

public Schedule(String name){
	this.name = name;
	 section = new ArrayList< Section>();
}
	/*User user;
	GraduateSchool graduateSchool;
	
	/**
	 * a half-year term in a school or college
	 */
	/*private String semester;
	/**
	 * a course is a study of a particular topic offered at university
	 */
	/*private String course;
	/**
	 * section number where the course is offered
	 */
	/*private Section sectionNumber;
	/**
	 * instructors who teach the course
	 */
	/*private String faculty;
	/**
	 * a limited time period when the course is offered
	 */
	/*private String term;
	/**
	 * place where the course is explained
	 */
	/*private string room;
	/**
	 * percentage of students filled in a course offered
	 */
	/*private string percentageClassFill;

	public string getSemester()
	{
		return this.semester;
	}

	/**
	 * 
	 * @param semester
	 */
/*	public void setSemester(string semester)
	{
		this.semester = semester;
	}

	public string getCourse()
	{
		return this.course;
	}

	/**
	 * 
	 * @param course
	 */
/*	public void setCourse(string course)
	{
		this.course = course;
	}

	public string getSectionNumber()
	{
		return this.sectionNumber;
	}

	/**
	 * 
	 * @param sectionNumber
	 */
	/*public void setSectionNumber(string sectionNumber)
	{
		this.sectionNumber = sectionNumber;
	}

	public string getFaculty()
	{
		return this.faculty;
	}

	/**
	 * 
	 * @param faculty
	 */
/*	public void setFaculty(string faculty)
	{
		this.faculty = faculty;
	}

	public string getTerm()
	{
		return this.term;
	}

	/**
	 * 
	 * @param term
	 */
	/*public void setTerm(string term)
	{
		this.term = term;
	}

	public string getRoom()
	{
		return this.room;
	}

	/**
	 * 
	 * @param room
	 */
	/*public void setRoom(string room)
	{
		this.room = room;
	}

	public string getPercentageClassFill()
	{
		return this.percentageClassFill;
	}

	/**
	 * 
	 * @param percentageClassFill
	 */
	/*public void setPercentageClassFill(string percentageClassFill)
	{
		this.percentageClassFill = percentageClassFill;
	}
*/
	/*public void calPercentage()
	{
		// TODO - implement Schedule.calPercentage
		throw new UnsupportedOperationException();
	}

	public void generateSchedule()
	{
		// TODO - implement Schedule.generateSchedule
		throw new UnsupportedOperationException();
	}

	public void testSchedule()
	{
		// TODO - implement Schedule.testSchedule
		throw new UnsupportedOperationException();
	}

	public Schedule()
	{
		// TODO - implement Schedule.Schedule
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param semester
	 */
/*	public Schedule(Semester semester)
	{
		// TODO - implement Schedule.Schedule
		throw new UnsupportedOperationException();
	}
*/
	


}