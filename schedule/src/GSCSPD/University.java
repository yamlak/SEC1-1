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
	private TreeMap<String, Degree> degrees;
	private TreeMap<String, Department> departments;
	private TreeMap<String, Course> courses;
	private TreeMap<String, Student> students;
	private TreeMap<String, DegreePlanReq> degreePlan;
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
		departments = new TreeMap<String, Department>();
		degrees = new TreeMap<String, Degree>();
		courses = new TreeMap<String, Course>();
		students = new TreeMap<String, Student>();
		degreePlan = new TreeMap<String, DegreePlanReq>();
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
			departments = new TreeMap<String, Department>();
			degrees = new TreeMap<String, Degree>();
			courses = new TreeMap<String, Course>();
			students = new TreeMap<String, Student>();
			degreePlan = new TreeMap<String, DegreePlanReq>();
			
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
	
	public TreeMap<String,Degree> getDegrees()
	{
		return this.degrees;
	}
	
	public TreeMap<String,DegreePlanReq> getDegreePlans()
	{
		return this.degreePlan;
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
	        degreeList[i] = (entry.getValue().getCode());
	        i++;
		}
		return degreeList;
	}
	
	public String[] getDegreePlanList()
	{
		String[] degreePlanList = new String[getDegrees().entrySet().size()]; 
		int i =0;
		for (Entry<String, DegreePlanReq> entry : getDegreePlans().entrySet())
		{
	        degreePlanList[i] = (entry.getValue().getCourses());
	        i++;
		}
		return degreePlanList;
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
	

	/**
	 * Loads the university.
	 */
	public void openUniversity()
	{
		UniversityDM.loadUniversity(this);
	}
	
	

}