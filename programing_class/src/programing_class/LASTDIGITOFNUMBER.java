package programing_class;

import java.util.Scanner;

public class LASTDIGITOFNUMBER {
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter any number");
			int a=s.nextInt();
			int last=a%10;
			System.out.println("the last digit is "+last);
			s.close();
		}


}
