package Arrays;

import java.util.Scanner;

public class ProductofGivenArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("enter element");
			a[i]=sc.nextInt();
		}
		int pro=1;
		for(int z:a) {
			pro=pro*z;
		}
		System.out.println(pro);
	}


	}


