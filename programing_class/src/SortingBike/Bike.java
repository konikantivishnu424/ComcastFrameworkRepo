package SortingBike;

public class Bike {
	
	//Brand,cost,colour,cc and main method create 6 bike objects and with help of switch
	//case and sort with all four properties using switch cases

	int cost;
	String Brand;
	String Colour;
	int cc;
	public Bike(int cost, String brand, String colour, int cc) {
		
		this.cost = cost;
		this.Brand = brand;
		this.Colour = colour;
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Bike [cost=" + cost + ", Brand=" + Brand + ", Colour=" + Colour + ", cc=" + cc + "]";
	}
	
	
	
	
}
