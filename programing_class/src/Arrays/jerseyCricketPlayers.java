package Arrays;

import java.util.Scanner;

public class jerseyCricketPlayers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a no of cricket players");
		int size=sc.nextInt();
		int[]friends=new int [size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the cricketer name");
			friends[i]=sc.nextInt();
		}
		System.out.println("Enter  cricketer jerseyno in forward direction");
		for(int j=0;j<=size-1;j++) {
			System.out.println(friends[j]);
		}
		System.out.println("Enter cricketer jerseyno in  backward direction");
		for(int k=size-1;k>=0;k--) {
			System.out.println(friends[k]);
		}
		

	}

	}


