
package WatchSorting;

import java.util.Scanner;
import java.util.TreeSet;

import SortingBike.Bike;
import SortingBike.SortByCost;

public class SortBYwatch {
	public static void main(String[] args) {
		watch w1=new watch(2500,"Fasttrack","Black");
		watch w2=new watch(5000,"titan","silver");
		watch w3=new watch(10000,"timex","white");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of times loop rotate");
		int r=sc.nextInt();
		System.out.println("********************************************************");
		System.out.println("Enter your choice");
		System.out.println("press 1 for sort by cost");
		System.out.println("press 2 for sort by Brand");
		System.out.println("press 3 for sort by colour");
		System.out.println("*************************************************");
		int choice =sc.nextInt();
		switch(choice) {
		case 1 :SortByCost cost=new SortByCost();
		TreeSet<watch> t1=new TreeSet(cost);
		t1.add(w1);
		t1.add(w2);
		t1.add(w3);
		for(watch x:t1) {
			System.out.println(x);
		}
		
		case 2 :SortByBrand Brand=new SortByBrand();
		TreeSet<watch> t2=new TreeSet(Brand);
		t2.add(w1);
		t2.add(w2);
		t2.add(w3);
		for(watch x:t2) {
			System.out.println(x);
		}
		case 3 :SortBYColour colour=new SortBYColour();
		TreeSet<watch> t3=new TreeSet(colour);
		t3.add(w1);
		t3.add(w2);
		t3.add(w3);
		for(watch x:t3) {
			System.out.println(x);
		}


		}
	}

}
