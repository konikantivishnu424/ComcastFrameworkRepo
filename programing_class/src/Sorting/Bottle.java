package Sorting;

public class Bottle implements Comparable<Bottle> {

	String brand;
	String colour;
	int cost;

	Bottle(String brand,String colour,int cost){
		this.brand=new brand;
		this.colour=new colour;
		this.cost=new cost;
	}

	@Override
	public int compareTo(Bottle B) {
		return this.brand.compareTo(B.brand);
	}

}
