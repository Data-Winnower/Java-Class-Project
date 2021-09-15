import java.time.LocalDate;
/**
 * @author Kale Perry
 * The WeddingPerry class contains data
 * about a wedding including the couple,
 * the wedding date, and the wedding location 
 * Fields contain a CouplePerry, a LocalDate,
 * and a location
 */
public class WeddingPerry {
	/**
	 * The couple
	 */
	CouplePerry couple;
	String firstA; // Partner A's first name
	String lastA; // Partner A's last name
	LocalDate dateA; // Partner A's date of birth
	String firstB; // Partner B's first name
	String lastB; // Partner B's last name
	LocalDate dateB; // Partner B's date of birth
	
	/**
	 * The wedding date
	 */
	LocalDate wedDate;
	/**
	 * The wedding location
	 */
	String wedPlace;
	
	/**
	 *  Constructor
	 */
	public WeddingPerry(String first1, String last1, 
			int y1,int m1, int d1,String first2, String last2, 
			int y2, int m2, int d2, int yW, int mW, int dW, String locW)
	{
		couple = new CouplePerry(first1,last1, 
				 y1,m1,d1,first2, last2, y2,m2,d2); // The couple
		wedDate = LocalDate.of(yW, mW, dW); // The wedding date
		wedPlace = locW; // The wedding location
	}

	
	/**
	 * The setCouple method sets the couple
	 * @param them
	 */
	public void setCouple(CouplePerry them)
	{
		couple = them; // The couple
	}
	
	/**
	 * The setWedDate method sets the wedding date
	 * @param date
	 */
	public void setWedDate(LocalDate date)
	{
		wedDate = date; // The wedding date
	}
	
	/**
	 * The setWedPlace method sets the wedding location
	 * @param loc
	 */
	public void setWedPlace(String loc)
	{
		wedPlace = loc; // The wedding location
	}
	
	
	/**
	 * The getCouple method returns the couple
	 */
	public CouplePerry getCouple()
	{
		return couple;
	}
	
	/**
	 * The getWedDate method returns the wedding date
	 */
	public LocalDate getWedDate()
	{
		return wedDate;
	}
	
	/**
	 * The getWedPlace method returns the wedding location
	 */
	public String getWedPlace()
	{
		return wedPlace;
	}
	/**
	 * The showValues method prints the couple, 
	 * the wedding date, the wedding location,
	 * the names and date of birth for each partner 
	 */	
	public void showValues()
	{
		System.out.println("\nThe " + couple.partnerA.lName + "/" + couple.partnerB.lName + " Wedding");
		System.out.println("Date: " + wedDate + "   Location: " + wedPlace);
		System.out.println("Partner A: " + couple.partnerA.fName + " " + couple.partnerA.lName + " " + couple.partnerA.dob);
		System.out.println("Partner B: " + couple.partnerB.fName + " " + couple.partnerB.lName + " " + couple.partnerB.dob);
	}
	
}
