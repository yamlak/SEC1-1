/**
 * courses taken by students
 */
public class StudentCourses
{

	Semester semester;
	course course;
	Student student;
	/**
	 * student grades in a course
	 */
	private string grade;

	public string getGrade()
	{
		return this.grade;
	}

	/**
	 * 
	 * @param grade
	 */
	public void setGrade(string grade)
	{
		this.grade = grade;
	}

	public StudentCourses()
	{
		// TODO - implement StudentCourses.StudentCourses
		throw new UnsupportedOperationException();
	}

}