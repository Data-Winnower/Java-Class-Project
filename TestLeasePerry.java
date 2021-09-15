import java.util.Scanner;
/** 
 * @author Kale Perry
 * The TestLeasePerry class declares four lease objects.
 */
public class TestLeasePerry {

	public static void main(String[] args) 
	{
		// Create 4 instances of the LeasePerry class.
		LeasePerry test1 = new LeasePerry();
		LeasePerry test2 = new LeasePerry();
		LeasePerry test3 = new LeasePerry();
		LeasePerry test4 = new LeasePerry();
		
		// Get user input values for 3 instances of LeasePerry
		test1.getData();
		test2.getData();
		test3.getData();
		
		// Display the data for the first instance of LeasePerry
		test1.showValues();
		
		// Adds a pet fee to the first instance of LeasePerry
		test1.addPetFee();
		
		// Displays the data for all 4 instances of LeasePerry
		test1.showValues();
		test2.showValues();
		test3.showValues();
		test4.showValues();
		
	}
	
}
