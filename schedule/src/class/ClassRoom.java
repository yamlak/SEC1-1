/**
 * a room in which, a class of students is thought
 */
public class ClassRoom
{

	University University;
	/**
	 * number of the classroom
	 */
	private String number;
	/**
	 * building where the classroom is located
	 */
	private string building;
	/**
	 * maximum number of students fit in a classroom
	 */
	private int capacity;

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

	public string getBuilding()
	{
		return this.building;
	}

	/**
	 * 
	 * @param building
	 */
	public void setBuilding(string building)
	{
		this.building = building;
	}

	public int getCapacity()
	{
		return this.capacity;
	}

	/**
	 * 
	 * @param capacity
	 */
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

}