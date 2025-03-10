package Date8;

import java.util.Scanner;

public class Primenumber2ndpattern {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter a number");
	int num =s.nextInt();
	if(isprime(num))
	{
	System.out.println("the given no'+num+' is prime");	
	}
	else {
		System.out.println("The given no"+num+" is not prime");
	}
}
	public static boolean isprime(int num)
	{
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
}
