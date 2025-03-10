package Arrays;

import java.util.Scanner;

public class Friends {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a no of friends");
		int size=sc.nextInt();
		String[]friends=new String [size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the friends name");
			friends[i]=sc.next();
		}
		System.out.println("Enter in forward direction");
		for(int j=0;j<=size-1;j++) {
			System.out.println(friends[j]);
		}
		System.out.println("Enter in backward direction");
		for(int k=size-1;k>=0;k--) {
			System.out.println(friends[k]);
		}
		

	}

}
