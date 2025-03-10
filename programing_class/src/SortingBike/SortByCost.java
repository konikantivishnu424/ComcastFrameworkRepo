package SortingBike;

import java.util.Comparator;

public class SortByCost implements Comparator<Bike>{

	@Override
	public int compare(Bike x, Bike y) {
		// TODO Auto-generated method stub
		return x.cost-y.cost;
	}

}
