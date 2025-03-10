package programing_class;

import java.util.Scanner;

public class FindsumofEvennoinbwGivenrange {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a startingnumber");
	int a = s.nextInt();
	System.out.println("Enter a lastnumber");
	int b = s.nextInt();
	int sum=0;
	for(int i =a;i<=b;i++  ) {
		if(i%2==0) {
			sum=sum+i;
		}
		
	}
	System.out.println(sum);
}

}
