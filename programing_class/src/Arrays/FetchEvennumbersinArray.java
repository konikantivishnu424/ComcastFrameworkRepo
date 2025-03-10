package Arrays;

public class FetchEvennumbersinArray {

	public static void main(String[] args) {
		int[]number= {12,13,18,9,17};
		for(int i=0;i<=number.length-1;i++)
		if(number[i]%2==0) {
			System.out.println(number[i]);
		}
		

	}

}
