package programing_class;

import java.util.Scanner;

public class NUMBEROFDIGITSINNUMBER {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int num=s.nextInt();
		int k=num;
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println("the number of digits in "+k+" is "+count);
		s.close();
	}

}
