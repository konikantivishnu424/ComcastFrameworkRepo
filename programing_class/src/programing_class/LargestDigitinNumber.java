package programing_class;

import java.util.Scanner;

public class LargestDigitinNumber {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int largestDigit = -1;

        while (number > 0) {
            int digit = number % 10; 
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10; 
        }

        System.out.println("The largest digit in the number is: " + largestDigit);
    }
}

