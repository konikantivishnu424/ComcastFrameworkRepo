package SortingBike;

import java.util.Comparator;

public class SortBYBrand implements Comparator<Bike>{

	@Override
	public int compare(Bike x, Bike y) {
		
		return x.Brand.compareTo(y.Brand);
	}

}
