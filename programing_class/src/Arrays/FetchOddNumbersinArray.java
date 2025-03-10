package Arrays;

public class FetchOddNumbersinArray {

	public static void main(String[] args) {
		int[]number= {12,13,18,19,17};
		for(int i=0;i<=number.length-1;i++) {
			if(number[i]%2==1) {
				System.out.println(number[i]);
			}
		}
		

	}

}
