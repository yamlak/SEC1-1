package GSCSPD;

import java.util.*;

/**
 * A person who is in charge of the activity, department
 */
public class User
{

	Department department;
	ArrayList<Schedule> schedule;
	/**
	 * name of the user
	 */
	private String name;
	/**
	 * a unique number is given for his identity
	 */
	private String number;
	/**
	 * authorized password is used by user
	 */
	private String password;

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

	public String getNumber()
	{
		return this.number;
	}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(String number)
	{
		this.number = number;
	}

	public String getPassword()
	{
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * 
	 * @param password
	 */
	public Boolean isAuthorized(int password)
	{
		// TODO - implement User.isAuthorized
		throw new UnsupportedOperationException();
	}

}