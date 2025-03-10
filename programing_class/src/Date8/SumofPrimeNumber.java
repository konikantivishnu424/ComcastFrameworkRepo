package Date8;

import java.util.Scanner;

public class SumofPrimeNumber {
	public static boolean  isprime(int num) {
		if(num<=1) {
			return false;
		}
		
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
		
			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter a first number");
				int first=sc.nextInt();
				System.out.println("Enter a lastnumber");
				int last=sc.nextInt();
				int sum=0;
				for (int k=first;k<=last;k++) {
					if(isprime((k))) {
						sum=sum+k;
					}
				}
				System.out.println("the sum of prime numbers");
		}
	}


