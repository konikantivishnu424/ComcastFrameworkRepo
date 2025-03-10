package programing_class;

import java.util.Scanner;

public class findproductofdigits {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter any number");
	int num =s.nextInt(); 
	int pro=1;
	while(num>0) {
		pro=pro*(num%10);
		num=num/10;
		
	}
	System.out.println(pro);
}
	
}
