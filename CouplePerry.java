import java.time.LocalDate;

/**
 * @author Kale Perry
 * The CouplePerry class contains data
 * about two persons 
 * Fields contain two PersonPerry persons
 */
public class CouplePerry {
	/**
	 * Partner A
	 */
	PersonPerry partnerA;
	/**
	 * Partner B
	 */
	PersonPerry partnerB;
	
	/**
	 *  Constructor
	 */
	public CouplePerry(String firstA, String lastA, int yA, int mA, int dA,String firstB, String lastB, int yB, int mB, int dB)
	{
		partnerA = new PersonPerry (firstA,lastA,yA,mA,dA); // Partner A
		partnerB = new PersonPerry (firstB,lastB,yB,mB,dB); // partner B
	}
	
	
	/**
	 * The setPartnerA method sets the first partner
	 * @param person
	 */
	public void setPartnerA(PersonPerry person)
	{
		partnerA = person; // Partner A
	}
	
	/**
	 * The setPartnerB method sets the second partner
	 * @param person
	 */
	public void setPartnerB(PersonPerry person)
	{
		partnerB = person; // Partner B
	}
	
	/**
	 * The getPartnerA method returns the first partner
	 */
	public PersonPerry getPartnerA()
	{
		return partnerA;
	}
	/**
	 * The getPartnerB method returns the second partner
	 */
	public PersonPerry getPartnerB()
	{
		return partnerB;
	}
	
	/**
	 * The showValues method prints the last names, 
	 * of the partners 
	 */	
	public void showValues()
	{
		System.out.println(partnerA.lName + "/" + partnerB.lName);
	}
	
}
