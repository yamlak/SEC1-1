package GSCSPD;

import java.util.*;
import java.util.Map.Entry;

import GSCSDM.*;
import GSCSPD.*;




/**
 * An educational institution designed for instruction, examination, or both, of students in many branches of advanced learning, conferring degrees in various facilities, and often embodying colleges and similar institutions. Oklahoma Christian university is a private comprehensive coeducational Christian liberal arts university.
 */
public class University
{
	private TreeMap<String,ClassRoom> classRoom;
	/**
	 * Association Type = GSCSPD.ClassRoom;
	 */
	private TreeMap<String, GraduateSchool> gradSchools;
	private TreeMap<String, Semester> semesters;
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
		
		this.setAbbreviation(abbreviation);
		this.setName(name);
		semesters = new TreeMap <String, Semester>();
		//classRooms = new TreeMap <String, ClassRoom>();
		gradSchools = new TreeMap <String, GraduateSchool>();
		//throw new UnsupportedOperationException();
	}

	public University()
	{
			semesters = new TreeMap <String, Semester>();
			//classRooms = new TreeMap <String, ClassRoom>();
			gradSchools = new TreeMap <String, GraduateSchool>();
			
	//	throw new UnsupportedOperationException();
	}
	
	public TreeMap<String,Semester> getSemesters()
	{
		return this.semesters;
	}
	
	/**
	 * Adds the semester to the university.
	 * 
	 * 
	 * @param semester
	 */
	
	
	public void addSemester(Semester semester)
	{
		if (semester != null)
		{
			getSemesters().put(semester.getName(), semester);
		}
	}
	
	public void removeSemester(Semester semester )
	{
		if (semester != null)
		{
			getSemesters().remove(semester.getName());
		}
	}
	
	public String[] getSemesterList()
	{
		String[] semesterList = new String[getSemesters().entrySet().size()]; 
		int i =0;
		for (Entry<String, Semester> entry : getSemesters().entrySet()) 
		{
	        semesterList[i] = (entry.getValue().getStartDate());
	        i++;
		}
		return semesterList;
	}
	
	
	/*ArrayList<GraduateSchool> gSchool = new ArrayList<GraduateSchool>();
	
	public void addGraduateSchool(GraduateSchool graduateSchool )
	{
		this.gSchool.add(graduateSchool);
	}
	
	public void getGraduateSchool()
	{
		
			for(GraduateSchool gs: gSchool)
			System.out.println(gs.getName() + " " + gs.getAbbreviation());
			
		
	}*/
	
	public TreeMap<String,GraduateSchool> getGradSchools()
	{
		return this.gradSchools;
	}
	
	/**
	 * Adds the gradschools to the university.
	 * 
	 * 
	 * @param gradSchools
	 */
	
	
	public void addGradSchools(GraduateSchool gradSchool)
	{
		if (gradSchool != null)
		{
			getGradSchools().put(gradSchool.getAbbreviation(), gradSchool);
		}
	}
	
	public void removeGradSchools(GraduateSchool gradSchool )
	{
		if ( gradSchool!= null)
		{
			getGradSchools().remove(gradSchool.getAbbreviation());
		}
	}
	
	public String[] getGradSchoolsList()
	{
		String[] gradSchoolsList = new String[getGradSchools().entrySet().size()]; 
		int i =0;
		for (Entry<String, GraduateSchool> entry : getGradSchools().entrySet()) 
		{
			gradSchoolsList[i] = (entry.getValue().getName());
	        i++;
		}
		return gradSchoolsList;
	}
	

	/**
	 * Loads the store.
	 */
	public void openUniversity()
	{
		UniversityDM.loadUniversity(this);
	}
	
	

}