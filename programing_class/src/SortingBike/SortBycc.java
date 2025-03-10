package SortingBike;

import java.util.Comparator;

public class SortBycc  implements Comparator<Bike>{

	@Override
	public int compare(Bike x, Bike y) {
		// TODO Auto-generated method stub
		return x.cc-y.cc;
	}



}
