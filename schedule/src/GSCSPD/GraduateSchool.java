package GSCSPD;

import java.util.*;
import java.util.Map.Entry;

/**
 * A division of a university offering advanced programs beyond the bachelor's degree
 */
public class GraduateSchool
{

	University university;
	private TreeMap<String, Faculty> faculties;
	private TreeMap<String, Degree> degrees;
	private TreeMap<String, Department> departments;
	private TreeMap<String, Course> courses;
	private TreeMap<String, Student> students;
	private TreeMap<String, DegreePlanReq> degreePlan;
	//ArrayList<Department> departments;
	//ArrayList<Faculty> faculty = new ArrayList<Faculty>();
	//ArrayList<course> course;
	//ArrayList<Student> students;
	//ArrayList<Degree> degreePlan;
	ArrayList<Schedule> schedule;
	/**
	 * name given to represent school
	 */
	private String name;
	/**
	 * A short version of the name
	 */
	private String abbreviation;

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
	
	public GraduateSchool()
	{
		faculties = new TreeMap<String, Faculty>();
		//private TreeMap<String, Semester> semesters;
		departments = new TreeMap<String, Department>();
		degrees = new TreeMap<String, Degree>();
		courses = new TreeMap<String, Course>();
		students = new TreeMap<String, Student>();
		degreePlan = new TreeMap<String, DegreePlanReq>();
		
	}
	public GraduateSchool(University university, String abbreviation, String name)
	{	this();
		this.abbreviation = abbreviation;
		this.name = name;
		faculties = new TreeMap<String, Faculty>();
		//private TreeMap<String, Semester> semesters;
		departments = new TreeMap<String, Department>();
		degrees = new TreeMap<String, Degree>();
		courses = new TreeMap<String, Course>();
		students = new TreeMap<String, Student>();
		degreePlan = new TreeMap<String, DegreePlanReq>();
		university.addGradSchools(this);
		
	}
	
	public TreeMap<String,Faculty> getFaculties()
	{
		return this.faculties;
	}
	
	/**
	 * Adds the Faculty to the grad school.
	 * 
	 * 
	 * @param semester
	 */
	
	
	public void addFaculty(Faculty faculty)
	{
		if (faculty != null)
		{
			getFaculties().put(faculty.getLastName(), faculty);
		}
	}
	
	public void removeFaculty(Faculty faculty )
	{
		if (faculty != null)
		{
			getFaculties().remove(faculty.getLastName());
		}
	}
	
	public String[] getFacultyList()
	{
		String[] facultyList = new String[getFaculties().entrySet().size()]; 
		int i =0;
		for (Entry<String, Faculty> entry : getFaculties().entrySet())
		{
	        facultyList[i] = (entry.getValue().getFirstName());
	        i++;
		}
		return facultyList;
	}
	
	public TreeMap<String,Degree> getDegrees()
	{
		return this.degrees;
	}
	
	/**
	 * Adds the Degree to the grad school.
	 * 
	 * 
	 * @param semester
	 */
	
	
	public void addDegree(Degree degree)
	{
		if (degree != null)
		{
			getDegrees().put(degree.getCode(), degree);
		}
	}
	
	
	public void removeDegree(Degree degree)
	{
		if (degree != null)
		{
			getDegrees().remove(degree.getCode(), degree);
		}
	}
	
	public String[] getDegreeList()
	{
		String[] degreeList = new String[getDegrees().entrySet().size()]; 
		int i =0;
		for (Entry<String, Degree> entry : getDegrees().entrySet())
		{
	        degreeList[i] = (entry.getValue().getName());
	        i++;
		}
		return degreeList;
	}
	
	public TreeMap<String,Course> getCourses()
	{
		return this.courses;
	}
	
	/**
	 * Adds the Course to the grad school.
	 * 
	 * 
	 * @param semester
	 */
	
	
	public void addCourses(Course course)
	{
		if (course != null)
		{
			getCourses().put(course.getNumber(), course);
		}
	}
	
	
	
	public void removeCourses(Course course)
	{
		if (course != null)
		{
			getCourses().remove(course.getNumber(), course);
		}
	}
	
	public String[] getCourseList()
	{
		String[] courseList = new String[getCourses().entrySet().size()]; 
		int i =0;
		for (Entry<String, Course> entry : getCourses().entrySet())
		{
	        courseList[i] = (entry.getValue().getName());
	        i++;
		}
		return courseList;
	}

	public String toString()
	{
		return getName()+" "
				+getAbbreviation()+" ";
	}
	
	public TreeMap<String,Student> getStudents()
	{
		return this.students;
	}
	
	/**
	 * Adds the Student to the grad school.
	 * 
	 * 
	 * @param semester
	 */
	
	
	public void addStudents(Student student)
	{
		if (student != null)
		{
			getStudents().put(student.getId(), student);
		}
	}
	
	public void removeStudent(Student student)
	{
		if (student != null)
		{
			getStudents().remove(student.getId(), student);
		}
	}
	
	public String[] getStudentList()
	{
		String[] studentList = new String[getStudents().entrySet().size()]; 
		int i =0;
		for (Entry<String, Student> entry : getStudents().entrySet())
		{
	        studentList[i] = (entry.getValue().getDegreeCode());
	        i++;
		}
		return studentList;
	}
	
}
