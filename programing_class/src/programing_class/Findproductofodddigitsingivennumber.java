package programing_class;

import java.util.Scanner;

public class Findproductofodddigitsingivennumber {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number"); 
	int a = s.nextInt();
	int pro=1;
	while(a>0) {
		int b=a%10;
		if(a%2==1) {
			pro=pro*b;	
		}
		a=a/10;
	}
	System.out.println(pro);
}
}
