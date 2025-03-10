package programing_classDate6;

import java.util.Scanner;

public class ToCheckLargestnoisEvenorOdd {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	int number = s.nextInt();

    int largestDigit = -1;

    while (number > 0) {
        int digit = number % 10; 
        if (digit > largestDigit) {
            largestDigit = digit;
        }
        number /= 10; 
    }

    System.out.println("The largest digit in the number is: " + largestDigit);

	if(largestDigit%2==0) {
		System.out.println("Even");
	}
	else {
		System.out.println("oddnumber");
	}
	
}
}
