package Arrays;

import java.util.Scanner;

public class ToCheckTheArrayElememtsPrimeorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
		System.out.println("enter size of the array");
		int size=sc.nextInt();
		int[]a=new int[size];
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("enter element");
			a[i]=sc.nextInt();
		}
		for(int z:a) {
			if(is_prime(z)) {
				System.out.println("it is prime "+z);
			}
		}
	}
	public static boolean is_prime(int num) {
		boolean t=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				t=false;
			}
		}
		return t;
	}


	}


