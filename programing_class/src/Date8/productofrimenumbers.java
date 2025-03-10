package Date8;

import java.util.Scanner;

public class productofrimenumbers {
	   public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of prime numbers: ");
	        int n = scanner.nextInt();
	        scanner.close();

	        int count = 0;
	        int product = 1;
	        int num = 2; // Start with the first prime number (2)

	        while (count < n) {
	            if (isPrime(num)) {
	                product *= num;
	                count++;
	            }
	            num++;
	        }

	        System.out.println("Product of the first " + n + " prime numbers: " + product);
	    }
}
