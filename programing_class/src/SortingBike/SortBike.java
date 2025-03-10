package SortingBike;

import java.util.Scanner;
import java.util.TreeSet;

public class SortBike {

	public static void main(String[] args) {
		Bike B1=new Bike(100000,"Pulser","Black",150);
		Bike B2=new Bike(120000,"yamaha","grey",350);
		Bike B3=new Bike(130000,"zmr","white",150);
		Bike B4=new Bike(140000,"bullet","Brown",500);
		Bike B5=new Bike(150000,"livo","red",150);

		Scanner s=new Scanner(System.in);
		System.out.println("how many times you want loop?");
		int r=s.nextInt();
		for(int i=1;i<=r;i++) {
			System.out.println("****************************************************");
	System.out.println("Enter your choice");
	System.out.println("Press 1 for sorting by cost");
	System.out.println("press 2 for sorting by Brand");
	System.out.println("press 3 for sorting by colour");
	System.out.println("press 4 for sorting by cc");
	System.out.println("*************************************************");
	int choice=s.nextInt();
	switch(choice) {
	case 1 :SortByCost cost=new SortByCost();
	TreeSet<Bike> t1=new TreeSet(cost);
	t1.add(B1);
	t1.add(B2);
	t1.add(B3);
	t1.add(B4);
	t1.add(B5);
	for(Bike x:t1) {
		System.out.println(x);
	}
	 break;
	
	
	
		case 2 :SortBYBrand Brand=new SortBYBrand();
		TreeSet<Bike> t2=new TreeSet(Brand);
		t2.add(B1);
		t2.add(B2);
		t2.add(B3);
		t2.add(B4);
		t2.add(B5);
		for(Bike x:t2) {
			System.out.println(x);
		}
		 break;
		
		
		case 3 :SortBYColour Colour=new SortBYColour();
		TreeSet<Bike> t3=new TreeSet(Colour);
		t3.add(B1);
		t3.add(B2);
		t3.add(B3);
		t3.add(B4);
		t3.add(B5);
		for(Bike x:t3) {
			System.out.println(x);
		}
		 break;
		
		case 4 :SortBycc cc=new SortBycc();
		TreeSet<Bike> t4=new TreeSet(cc);
		t4.add(B1);
		t4.add(B2);
		t4.add(B3);
		t4.add(B4);
		t4.add(B5);
		for(Bike x:t4) {
			System.out.println(x);
		}
		 break;
		
		}

		}
	}

}
