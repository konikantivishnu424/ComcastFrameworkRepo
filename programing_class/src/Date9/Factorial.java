package Date9;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int num =sc.nextInt();

  if (num < 0) {
      System.out.println("Factorial is not defined for negative numbers.");
  } else {
      long factorial = 1; // Use long to handle larger factorials
      for (int i = 1; i <= num; i++) {
          factorial *= i;
      }
      System.out.println("Factorial of " + num + " is: " + factorial);
  }
}
}

