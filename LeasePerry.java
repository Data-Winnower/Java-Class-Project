import java.util.Scanner;
/**
 * @author Kale Perry
 * The LeasePerry class contains data about
 * an apartment lease. 
 * Fields contain tenent's name, apartment number, monthly rent, 
 * and term of the lease.
 */
public class LeasePerry 
{
	/**
	 * Monthly fee for having a pet
	 */
	final static int PETFEE = 10;
	/**
	 * Tenant Name
	 */
	String tenantName;
	/**
	 * Apartment Number
	 */
	int aptNum;
	/**
	 * Monthly Rent
	 */
	int rent;
	/**
	 * Lease Term in Months
	 */
	int term;
	
	/**
	 *  Constructor
	 *  sets default values 
	 */
	public LeasePerry()
	{
		tenantName = "XXX"; // Tenant Name
		aptNum = 0; // Apartment Number
		rent = 1000; // Monthly Rent
		term = 12; // Lease Term in Months
	}
	
	/**
	 * The setTenantName method sets the tenants name
	 * @param name
	 */
	public void setTenantName(String name)
	{
		tenantName = name;
	}
	
	/**
	 * The setAptNum method sets the apartment number
	 * @param num
	 */
	public void setAptNum(int num)
	{
		aptNum = num;
	}
	
	/**
	 * The setRent method sets the monthly rent
	 * @param monthly
	 */
	public void setRent(int monthly)
	{
		rent = monthly;
	}
	
	/**
	 * The setTerm method sets the lease term in months
	 * @param months
	 */
	public void setTerm(int months)
	{
		term = months;
	
	}
	
	/**
	 * The getTenantName method returns the tenant name
	 */
	public String getTenantName()
	{
		return tenantName;
	}
	
	/**
	 * The getAptNum method returns the apartment number
	 */
	public int getAptNum()
	{
		return aptNum;
	}
	
	/**
	 * The getRent method returns the monthly rent
	 */
	public int getRent()
	{
		return rent;
	}
	
	/**
	 * The getTerm method returns the lease term in months
	 */
	public int getTerm()
	{
		return term;
	
	}
	
	/**
	 * The getData method takes user inputs
	 * for tenant name, apartment number, monthly rent,
	 * and lease term on months
	 */
	public void getData()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nPlease enter the name of the tenant: ");
		tenantName = input.nextLine();
		
		
		System.out.print("Please enter the apartment number: ");
		aptNum= input.nextInt();
		
		System.out.print("Please enter the monthly rent: ");
		rent = input.nextInt();
		
		System.out.print("Please enter the lease term in months: ");
		term = input.nextInt();
	}
	
	/**
	 * The addPetFee method adds a monthly charge 
	 * to the base rent for having a pet
	 * and prints an explanation.
	 */	
	public int addPetFee()
	{
		explainPetPolicy();		
		rent = rent + PETFEE;
		return rent;
	}
	
	/**
	 * The explainPetPolicy method prints a statement 
	 * that explains that  
	 * a monthly charge is added to 
	 * the base rent for having a pet.
	 */	
	public static void explainPetPolicy()
	{
		System.out.println("\nA pet fee of $" + PETFEE +  " is added to the monthly rent");
	}
	
	/**
	 * The showValues method prints tenent's name, 
	 * apartment number, monthly rent, 
	 * and term of the lease.
	 */	
	public void showValues()
	{
		System.out.println("\nYour lease results:");
		System.out.println("Name       : " + tenantName);
		System.out.println("Apartment  : " + aptNum);
		System.out.println("Rent       : " + rent);
		System.out.println("Term       : " + term);
	}

	
}