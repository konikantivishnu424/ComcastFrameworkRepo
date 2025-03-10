package programing_class;

import java.util.Scanner;

public class PRINTDIGITSOFNUMBER {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int num=s.nextInt();
		while(num>0) {
			System.out.println(num%10);
			num=num/10;
		}
		s.close();
	}

}

