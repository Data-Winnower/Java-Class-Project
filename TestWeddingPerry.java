/** 
 * @author Kale Perry
 * The TestWeddingPerry class declares two wedding objects
 * and prints the values.
 */
public class TestWeddingPerry
{
	public static void main(String[] args) 
	{
		// Create 2 instances of the WeddingPerry class.
		// Avoiding all heteronormative codes
		WeddingPerry test1 = new WeddingPerry ("Kim", "Middle", 1986,12,1,"Mary", "Child",1984,03,10,2021,06,18,"Not-Mom's-Favorite Country Club");
		WeddingPerry test2 = new WeddingPerry ("James","Finding",1991,04,17,"John","Nemo",1992,02,14,2021,06,25,"Oceanview Aquarium");
				
			
		test1.showValues();
		test2.showValues();
			
	}	
}
