package programing_classDate6;

import java.util.Scanner;

public class NeonNumber {
   public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	System.out.println("Enter a number");
	int a = S.nextInt();
	int square =a*a;
	int sum=0;
	while(square!=0) {
		int digit=square%10;
		sum =sum+digit;
		square=square/10;
	}
	if(a==sum) {
		System.out.println("Neon number");
	}
	else {
		System.out.println("Not neon number");
	}
}
}
