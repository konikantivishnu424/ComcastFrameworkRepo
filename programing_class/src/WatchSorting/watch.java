package WatchSorting;

public class watch {

	int cost;
	String Brand;
	String colour;
	
	watch(int cost,String Brand,String colour){
		this.cost=cost;
		this.Brand=Brand;
		this.colour=colour;
		
	}

	@Override
	public String toString() {
		return "watch [cost=" + cost + ", Brand=" + Brand + ", colour=" + colour + "]";
	}
}
