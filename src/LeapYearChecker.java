import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a year
        System.out.println("Enter a year: ");
        // Read the input as an integer
        int year = scanner.nextInt();

        // Check if the entered year is a leap year and display the result
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // If the year is divisible by 4
        if (year % 4 == 0) {
            // If the year is also divisible by 100
            if (year % 100 == 0) {
                // If the year is divisible by 400, it's a leap year
                return year % 400 == 0;
            } else {
                // If the year is not divisible by 100, but divisible by 4, it's a leap year
                return true;
            }
        } else {
            // If the year is not divisible by 4, it's not a leap year
            return false;
        }
    }
}
