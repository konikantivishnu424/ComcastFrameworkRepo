package PatternProgramming;

public class Zigzag1To5 {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1) {
					System.out.print(i+" ");
				}
				
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
