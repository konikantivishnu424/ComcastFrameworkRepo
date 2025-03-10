package SortingBike;

import java.util.Comparator;

public class SortBYColour implements Comparator<Bike>{



	@Override
	public int compare(Bike x, Bike y) {
		
		return x.Colour.compareTo(y.Colour);
	}
	

}
