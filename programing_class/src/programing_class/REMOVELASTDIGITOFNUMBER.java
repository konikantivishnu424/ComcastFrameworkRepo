package programing_class;

import java.util.Scanner;

public class REMOVELASTDIGITOFNUMBER {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
		int num=s.nextInt();
		int fin=num/10;
		System.out.println("after removing last digit "+fin);
		s.close();
				
	}


}
