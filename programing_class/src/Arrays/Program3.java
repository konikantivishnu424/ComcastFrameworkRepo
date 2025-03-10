package Arrays;

import java.util.Scanner;

public class Program3 {

	
		  public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter the size of the array: ");
		        int n = sc.nextInt();
		        int[] arr = new int[n];

		       
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        System.out.println("Numbers with last digit as a prime number:");
		        for (int num : arr) {
		            int lastDigit = Math.abs(num % 10); 
		            if (isPrime(lastDigit)) {
		                System.out.println(num);
		            }
		        }
		    }

		    
		    public static boolean isPrime(int num) {
		        if (num <= 1) return false; // 0 and 1 are not prime
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) return false;
		        }
		        return true;
		    
		


	

	}

}
