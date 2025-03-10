package PatternProgramming;

public class oneZerotwoZero {

	public static void main(String[] args) {
	
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j==1) {
					System.out.print("1 ");
				}
				else if(j==3) {
					System.out.print("2 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
