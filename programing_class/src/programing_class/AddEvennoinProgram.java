+package programing_class;

import java.util.Scanner;

public class AddEvennoinProgram {
public static void main(String[] args) {
	
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter a number");

	 	 int a =s.nextInt();
	  int sum=0;
	 while(a>0) {
	int b=a%10;
	if(b%2==0) {
	sum=sum+b;
	
	 }
	 a=a/10;
	}
	 System.out.println(sum);

}
	 
}

