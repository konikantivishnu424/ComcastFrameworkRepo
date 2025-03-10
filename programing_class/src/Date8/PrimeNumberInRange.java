package Date8;

import java.util.Scanner;

public class PrimeNumberInRange
{
public static boolean isprime(int num) {
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
	for(int i=first;i<=last;i++) {
		if(isprime(i)) {
			System.out.println(i);
		}
	}

}
	}

