package Date9;

import java.util.Scanner;

public class FactSirMethod {
	public static void main(String[] args) {
		
	
  Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
  
  int fact =factorial(num);
  System.out.println(fact);
}
	public static int factorial(int num) {
		int pro=1;
		for(int i=1;i<=num;i++) {
			pro *=i;
		}
		return pro;
	}
}