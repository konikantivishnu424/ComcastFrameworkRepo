package Date9;

import java.util.Scanner;

public class ArmstrongNumber {
	 public static int countDigits(int num) {
	        int count = 0;
	        while (num > 0) {
	            num /= 10;
	            count++;
	        }
	        return count;
	    }

	    public static boolean isArmstrong(int num) {
	        int originalNum = num;
	        int count = countDigits(num);
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, count);
	            num /= 10;
	        }

	        return sum == originalNum;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = scanner.nextInt();
	        scanner.close();

	        if (isArmstrong(num)) {
	            System.out.println(num + " is an Armstrong number.");
	        } else {
	            System.out.println(num + " is not an Armstrong number.");
	        }
	    }
}
