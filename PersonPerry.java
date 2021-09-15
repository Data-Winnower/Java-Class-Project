import java.time.LocalDate;
/**
 * @author Kale Perry
 * The PersonPerry class contains 
 * data about a person.
 * Fields contain person's's first name, last name,  
 * and date of birth.
 */
public class PersonPerry {
	/**
	 * First Name
	 */
	String fName;
	/**
	 * Last Name
	 */
	String lName;
	/**
	 * Date of Birth
	 */
	LocalDate dob;
	
	
	/**
	 *  Constructor
	 */
	public PersonPerry(String first, String last, int y, int m, int d)
	{
		fName = first; // First name
		lName = last; // Last name
		dob = LocalDate.of(y,m, d); // Date of Birth
	}
	
	/**
	 * The setFName method sets the person's first name
	 * @param name
	 */
	
	public void setFName(String name)
	{
		fName = name; // First name
	}
	
	/**
	 * The setLName method sets the person's last name
	 * @param name
	 */
	public void setAptNum(String name)
	{
		lName = name; // Last name
	}
	/**
	 * The setDoB method sets the person's date of birth.
	 * @param date
	 */
	public void setAptNum(int y, int m, int d)
	{
		dob = LocalDate.of(y, m, d); // Date of birth
	}
	
		
	/**
	 * The getFName method returns the person's first name.
	 */
	public String getFName()
	{
		return fName;
	}
	/**
	 * The getLName method returns the person's last name.
	 */
	
	public String getLName()
	{
		return lName;
	}
	
	/**	 * The getDoB method returns the person's date of birth
	 */
	public LocalDate getDoB()
	{
		return dob;
	}
	
	
	/**
	 * The showValues method prints the person's  
	 * first name, last name, and date of birth.
	 */	
	public void showValues()
	{
		System.out.println("Name: "+ fName + " " + lName  + " " + dob);
	
	}

	
}