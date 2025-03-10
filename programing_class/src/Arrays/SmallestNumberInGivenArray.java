package Arrays;

import java.util.Scanner;

public class SmallestNumberInGivenArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("enter element");
			a[i]=sc.nextInt();
		}
		int small=9;
		for(int z:a) {
			if(z<=small) {
				small=z;
			}
		}
		System.out.println("smallest number is "+small);
	}




	}

