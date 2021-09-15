import java.util.Scanner;
/* pseudo code
    Have the user enter three names
    Store the names in an array
    apply the bubble sort algorithm
    (found in the text book on page 420)
    Have the user select output order
    (ascending or descending)
    Display the names in the chosen order.
 */

public class SortedNamesPerry {/**
 * @author kalep
 * The SortedNamesPerry class takes user input
 * of 3 names and displays them in
 * ascending or descending order
 */
    public static void main(String[] args) {

        String[] unsorted = new String[3]; // Array to hold user input unsorted
        // Call the getUserInput method
        // to get 3 names from the user
        unsorted = getUserInput();

        String[] sortedNamesA = new String[3]; // Array to hold user input sorted ascending
        sortedNamesA = sortNames(unsorted);
        String outOrder = "none";
        while (!outOrder.equals("A") && !outOrder.equals("a") && !outOrder.equals("D") && !outOrder.equals("d"))
        {
            // Call the getOutOrder method
            // to get how the user wants the
            // output ordered - ascending or descending
            outOrder = getOutOrder();

            // Call the correct display method
            if (outOrder.equals("A") || outOrder.equals("a")) // user chooses ascending
            {
                displayNamesAscend(sortedNamesA);
            }
            else if (outOrder.equals("D") || outOrder.equals("d")) // user chooses descending
            {
                displayNamesDescend(sortedNamesA);
            }
            else //error checking
            {
                System.out.println("I do not understand your input.\n");
            }

        }

    }

    /**
     * The getOutOrder method asks the user to
     * select output order:
     * Ascending or Descending
     * @return pick The users choice of alpha or anti-alpha order
     */
    private static String getOutOrder() {
        //Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to see the names ");
        System.out.println("in Ascending or Descending order?");
        System.out.println("please enter A or D: ");
        String pick;
        pick = input.nextLine();
        return pick;
    }

    /**
     * The getUserInput method asks the user to
     * input three different names
     * @return names The list of names
     */
    private static String[] getUserInput() {
        //Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        String n1; // To hold input first name
        //Get the first name
        System.out.print("Enter the first name: ");
        n1 = input.nextLine();

        String n2; // To hold input second name
        //Get the second name
        System.out.print("Enter the second name: ");
        n2 = input.nextLine();

        String n3; // To hold input final name
        //Get the final name
        System.out.print("Enter the final name: ");
        n3 = input.nextLine();

        String names[] = {n1, n2, n3};

        return names;

    }

    /**
     * The sortNames method sorts the entered
     *  names into ascending order using
     *  the bubble sort algorithm.
     * @param unsorted The list of names in the order entered
     * @return unsorted The list of names in alphabetical order
     */
    public static String[] sortNames(String[] unsorted) {
        String nameTemp; // To temporarily hold a name during the bubble sort

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (unsorted[j].compareToIgnoreCase(unsorted[j+1])> 0) {
                    nameTemp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = nameTemp;
                }
            }
        }
        return unsorted; // it is actually sorted at this point
    }

    /**
     * The displayNamesAscend methods display the
     * names entered in the correct order.
     * @param sortedList The list of names in ascending order
     *
     */
    public static void displayNamesAscend(String[] sortedList) {
        for (int sub = 0; sub < 3; sub++)
            System.out.println(sortedList[sub]);
    }

    public static void displayNamesDescend(String[] sortedList) {
        for (int sub = 2; sub >= 0; sub--)
            System.out.println(sortedList[sub]);
    }
}