package Date9;

import java.util.Scanner;

public class StrongNumber {
	 public static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    public static boolean isStrong(int num) {
	        int temp = num;
	        int sum = 0;
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += factorial(digit);
	            temp /= 10;
	        }
	        return sum == num;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = scanner.nextInt();
	        scanner.close();

	        if (isStrong(num)) {
	            System.out.println(num + " is a strong number.");
	        } else {
	            System.out.println(num + " is not a strong number.");
	        }
	    }

}
