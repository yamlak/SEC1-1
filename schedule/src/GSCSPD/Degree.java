package GSCSPD;

import java.util.*;



/**
 * A degree plan is a definition of the course of study necessary to fulfill the requirement of graduation. A degree plan is "major specific" and is established through collaboration between the student and the academic advisor for the student's major.
 */
public class Degree
{

	GraduateSchool graduateSchool;
	ArrayList<DegreePlanReq> degreePlanReq;
	/** 
	 * name of the degree plan offered
	 */
	private String name;
	/**
	 * unique code which represents the degree plan
	 */
	private String code;
	/**
	 * Degree program under grad school . This shows different departments available in this university
	 */
	private GraduateSchool gradSchool;
	/**
	 * credit hour is a unit that gives weight to the value, level or time requirement of an academic course taken at a educational institution.
	 */
	private String forecast;

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

	public String getCode()
	{
		return this.code;
	}

	/**
	 * 
	 * @param code
	 */
	public void setCode(String code)
	{
		this.code = code;
	}

	public GraduateSchool getGradSchool()
	{
		return this.gradSchool;
	}

	/**
	 * 
	 * @param department
	 */
	public void setGradSchool(GraduateSchool gradSchool)
	{
		this.gradSchool = gradSchool;
	}

	public String getForecast()
	{
		return this.forecast;
	}
		
/**
	 * 
	 * @param hours
	 */
	public void setHours(String forecast)
	{
		this.forecast = forecast;
	}

	public Degree()
	{
		 degreePlanReq = new ArrayList<DegreePlanReq>();

	}

	/**
	 * 
	 * @param code
	 * @param name
	 */
	public Degree(University univ, String code, String gSchool,String name, String forecast)
	{
		this();
		if(univ.findGradscool(gSchool)!= null){
		this.code = code;
		this.gradSchool = univ.findGradscool(gSchool);
		this.name = name;
		this.forecast = forecast;
		//degreePlanReq = new ArrayList<DegreePlanReq>();
		gradSchool.addDegree(this);}
		
	}
	

	
	public ArrayList<DegreePlanReq> getDegreePlanReqs()
	{
		return this.degreePlanReq;
	}
	
	public void addDegreePlanReq (DegreePlanReq degreePlan)
	{
		if (degreePlan != null)
		{
			getDegreePlanReqs().add(degreePlan);
		}
	}

	public void NumberCourseNeeded()
	{
		// TODO - implement Degree.NumberCourseNeeded
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param student
	 */
	public void listCourseToTake(Student student)
	{
		// TODO - implement Degree.listCourseToTake
		throw new UnsupportedOperationException();
	}
	public String toString()
	{
		return getCode()+" "
				+getGradSchool()+" "
				+getName()+" "
				+getForecast();
	}
}