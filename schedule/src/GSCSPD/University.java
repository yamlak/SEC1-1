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
	private TreeMap<String, Faculty> faculties;
	

	private TreeMap<String, Course> courses;
	private TreeMap<String, Student> students;
	private ArrayList<StudentCourses> studentCourses;
	
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
		this();
		this.setAbbreviation(abbreviation);
		this.setName(name);
		faculties = new TreeMap<String, Faculty>();
		//private TreeMap<String, Semester> semesters;
		
		courses = new TreeMap<String, Course>();
		students = new TreeMap<String, Student>();
		//studentCourses = new ArrayList<>();
		
	//	semesters = new TreeMap <String, Semester>();
		//classRooms = new TreeMap <String, ClassRoom>();
	//	gradSchools = new TreeMap <String, GraduateSchool>();
		//throw new UnsupportedOperationException();
	}

	public University()
	{
			semesters = new TreeMap <String, Semester>();
			//classRooms = new TreeMap <String, ClassRoom>();
			gradSchools = new TreeMap <String, GraduateSchool>();
			faculties = new TreeMap<String, Faculty>();
			//private TreeMap<String, Semester> semesters;
		
			
			courses = new TreeMap<String, Course>();
			students = new TreeMap<String, Student>();
			
			
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
	
	/*public ArrayList<StudentCourses> getStudentCourses()
	{
		return this.studentCourses;
	}
	
	public void addStudentCourses (StudentCourses studentCourses)
	{
		if (studentCourses != null)
		{
			getStudentCourses().add(studentCourses);
		}
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
			gradSchoolsList[i] = (entry.getValue().getAbbreviation());
	        i++;
		}
		return gradSchoolsList;
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
	
	
	
	/**
	 * Adds the Degree to the grad school.
	 * 
	 * 
	 * @param semester
	 */
	
	
	
	
	
	
	

	
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
	        courseList[i] = (entry.getValue().getNumber());
	        i++;
		}
		return courseList;
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
	        studentList[i] = (entry.getValue().getDegree().getCode());
	        i++;
		}
		return studentList;
	}
	 

	/**
	 * Loads the university.
	 */
	public void openUniversity()
	{
		UniversityDM.loadUniversity(this);
	}

	public GraduateSchool findGradscool(String gSchool) {
		
		if (gSchool.length()>0){
			if(getGradSchools().get(gSchool)== null) return null;
			else return getGradSchools().get(gSchool);
		}
		else return null;
	}
	
	public Degree findDegree(String degree) {
		
		for (Entry<String, GraduateSchool> gradschool: getGradSchools().entrySet())
		{
			if(degree.length()>0)
			{
				if(gradschool.getValue().getDegrees().get(degree)== null)
					return null;
					
				else return gradschool.getValue().getDegrees().get(degree); 
			
			}		
		else 
			return null;
		}
		return null;
	}
	
	
	public Course findCourse(String courseNumber) {
		if(courseNumber.length()>0)
		{
			if(getCourses().get(courseNumber)==null) return null;
			else return getCourses().get(courseNumber);
	}
		else return null;
	}
	public Student findStudent(String sId){
		if(sId.length()>0)
		{ 
			if(getStudents().get(sId)==null) return null;
			else return getStudents().get(sId);
		}
		else return null;
	}
	public Semester findSemester(String semesterName){
		if(semesterName.length()>0){
			if(getSemesters().get(semesterName)==null) return null;
			else return getSemesters().get(semesterName);}
		else return null;
	}
	
	public Faculty findFaculty(String lastName) {
		return getFaculties().get(lastName);
	}
	

}
