package programing_classDate6;

import java.util.Scanner;

public class ToFindNeonNumberinBetweenGivenRange{
	public static void main(String[] args) {
		
	
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the starting range: ");
int start = scanner.nextInt();

System.out.print("Enter the ending range: ");
int end = scanner.nextInt();

scanner.close();

System.out.println("Neon numbers between " + start + " and " + end + ":");

for (int i = start; i <= end; i++) {
    if (isNeonNumber(i)) {
        System.out.print(i + " ");
    }
}
}

public static boolean isNeonNumber(int num) {
int square = num * num;
int sumOfDigits = 0;

while (square > 0) {
    int digit = square % 10;

}
	
}
