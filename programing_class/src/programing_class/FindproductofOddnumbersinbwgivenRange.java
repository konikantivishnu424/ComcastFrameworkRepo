package programing_class;

import java.util.Scanner;

public class FindproductofOddnumbersinbwgivenRange {
    public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter  a first number");
		int a =s.nextInt();
		System.out.println("Enter a last number");
		int b =s.nextInt();
		int pro=1;
		for (int i=a;i<=b;i++)
		{
			if(i%2==1) {
				pro *=i;
			}
		}
		System.out.println(pro);
		}
	}

