package programing_classDate6;

import java.util.Scanner;

public class TofindthesmallestdigitintheGivenNumber {
	

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int SmallestDigit = 9;

	        while (number > 0) {
	            int digit = number % 10; 
	            if (digit < SmallestDigit) {
	                SmallestDigit = digit;
	            }
	            number /= 10; 
	        }

	        System.out.println("The smallest digit in the number is: " + SmallestDigit);
	    }
	}




