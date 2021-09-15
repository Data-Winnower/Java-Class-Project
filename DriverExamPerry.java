import java.util.Scanner;
/* pseudo code
    Student will enter answers to ten exam questions
    Initialize a third array to "99" x 10
    Loop - compare to parallel array of correct answers
    Each question number missed will replace the '99' in that spot
    Print results for each question - '99' yields correct
    Print Total correct answers
    Print Total incorrect answers
    Determine pass fail - 3 or more incorrect yields fail - and print
 */
/**
 * @author kalep
 * The DriverExamPerry class takes user input
 * of answers to 10 exam questions,
 * grades the exam, and displays results
 */
public class DriverExamPerry
{
    public static void main(String[] args)
    {
        // Array to store the student's answer returned from the getStudent Answers method
        Character[] stuAnswers = getStudentAnswers();

        // Correct answers
        Character[] correctAnswers = {'B','D','A','A','C','A','B','A','C','D'};

        // stores which questions were incorrect returned from the compareAnswers method
        int[] questionsMissed = compareAnswers(stuAnswers, correctAnswers);

        // stores the number of questions answered incorrectly returned from the totalIncorrect method
        int countWrong = totalIncorrect(questionsMissed);

        // True for passed, false for failed returned from the passed method
        boolean passFail = passed(countWrong); // True for passed, false for failed

        // stores a count of correct answers returned from the totalCorrect method
        int countCorrect = totalCorrect(countWrong);

        // present results method displays results on the screen
        presentResults(questionsMissed,passFail,countWrong,countCorrect);

    }
    /**
     * The totalCorrect method
     * calculates the number of questions
     * that were answered correctly
     * @param countWrong integer
     * @return totalCorrect
     */
    private static int totalCorrect(int countWrong)
    {
        return (10-countWrong); //The number of correct answers
    }
    /**
     * The totalIncorrect method
     * calculates the number of questions
     * that were answered incorrectly
     * @param missed array
     * @return countWrong
     */
    private static int totalIncorrect(int[] missed)
    {
        int countWrong = 0;
        for (int num = 0; num < 10; num++) // iterate over the array
        {

            if (missed[num] != 99) //values were initialized at 99
            {
                countWrong++;
            }
        }
        return countWrong;// number of wrong answers
    }
    /**
     * The present results method
     * displays the results on the screen.
     * Shows each question number and whether
     * the was answered correct or wrong.
     * Shows total questions answered correctly
     * and total answered incorrectly.
     * Show if the student passed or failed
     * @param questionsMissed array
     * @param  passFail boolean
     * @param countWrong integer
     * @param countCorrect integer
     */
    private static void presentResults(int[] questionsMissed, boolean passFail, int countWrong, int countCorrect)
    {
        System.out.println("Your results are as follows:");
        System.out.println("Question\tResult");
        System.out.println("____________________");

        for (int question =0;question<10;question++)
        {
            if (questionsMissed[question] == 99)
            {
                System.out.println((question+1) + "\t\t\tCORRECT");
            }
            else
            {
                System.out.println((question+1) + "\t\t\tWRONG");
            }
        }
        System.out.println("You answered "+ countCorrect +" questions correctly.");
        System.out.println("You answered "+ countWrong +" questions incorrectly.");
        if (passFail)
        {
            System.out.println("Congratulations - You Passed!");
        }
        else
        {
            System.out.println("Sorry - You Failed.");
        }

    }
    /**
     * The compareAnswers method
     * compares the answer given to each
     * question to the correct answer to
     * that question. Determines if the
     * student provided the correct answer.
     * @param stuAnswers array
     * @param correctAnswers array
     * @return wrongAnswers array
     */
    private static int[] compareAnswers(Character[] stuAnswers, Character[] correctAnswers)
    {
        int[] wrongAnswers = {99,99,99,99,99,99,99,99,99,99}; //initialize all values in the list to 99
        for (int num = 0; num<10; num++)
        {

            if (stuAnswers[num]!=correctAnswers[num]) //if the answer is wrong
            {
                wrongAnswers[num] = num+1; // replace the value in the list with the question number
            }
        }
        return wrongAnswers; //the list of wrong answers
    }
    /**
     * The getStudentAnswers method
     * takes answers to exam questions
     * as input and stores them in an array.
     * @return studAnswers array
     */
    private static Character[] getStudentAnswers()
    {

        Scanner input = new Scanner(System.in);
        Character[] studAnswers = new Character[10]; // list of answers provided by the student
        System.out.println("Enter your answers.");
        for (int quest = 0;quest<10;quest++) //iterate through the questions
        {
            System.out.print((quest+1 ) + ". ");
            String answer = input.nextLine();
            char formattedAnswer = Character.toUpperCase(answer.charAt(0)); //format the answers for accurate checking
            if (formattedAnswer != 'A'&& formattedAnswer != 'B'&& formattedAnswer!= 'C'&&formattedAnswer != 'D')// input validation
            {
                System.out.println("The only response options are A, B, C, & D");//error message
                quest--;
            }
            else
                studAnswers[quest]= formattedAnswer; //add each valid answer to the list

        }
        return studAnswers; //array of student answers
    }
    /**
     * The passed method
     * determines if the student
     * passed or failed the exam.
     * @return boolean true if passed or false if failed
     */
    private static boolean passed(int countWrong)
    {
        return countWrong <= 3; //3 or less incorrect yields a passing grade
    }
}
