
import java.util.Scanner;

/*
 * A program converts a binary number of base 2, entered as a string, into the equivalent decimal version in
 * base 10
 *
 * @author Md. Riad Arifin (A00395462)
 */
public class Convert {

    public static void main(String[] args) {

        // Creating some variables
        Scanner kbd = new Scanner(System.in);
        String number;
        int result = 0;
        boolean allbinary = true;

        //taking binary number from the user
        System.out.print("Enter a binary number: ");
        number = kbd.next();
        kbd.nextLine();

        //nested if else control to check whether the number has more than 31 characters
        if (number.length() <= 31) {
            
            //for loop to check whether the characters are binary
            for (int i = 0; i < number.length(); ++i) {
                
                //nested if else control to convert only binary numbers to decimal numbers of 
                if (number.charAt(i) == '1') {
                    result = (result * 2) + 1;
                } else if (number.charAt(i) == '0') {
                    result = result * 2;
                } else {
                    
                    //to report user that there is a non binary digit
                    System.out.println("Invalid character: " + number.charAt(i) + " not a binary digit (0 or 1).");
                    
                    allbinary = false;
                }
            }
        } else {
            
            //report the user the input is more than 31 characters long
            System.out.println("Invalid input: " + number + ": length greater than 31 characters.");
            allbinary = false;
        }

        //giving user the result of coversion only if all the digits in the number are binary
        if (allbinary == true) {
            System.out.println(number + " (base 2) " + " = " + result + " (base 10)");
        }
    }

}
