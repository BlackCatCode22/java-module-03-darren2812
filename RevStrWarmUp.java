// ReversedStrings.java (reupload from Module 2)
// dD 09/09/2025

// importing the scanner
import java.util.Scanner;

public class RevStrWarmUp {
    public static void main(String[] args){
        // creating scanner object to accept input
        Scanner scanner = new Scanner(System.in);
        // asks user for a string to input
        System.out.println("Please enter a string to reverse: ");
        String input = scanner.nextLine();
        // prints out the string in reversed order of characters
        System.out.println("This is your string reversed: ");
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
