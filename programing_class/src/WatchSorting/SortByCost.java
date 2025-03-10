package WatchSorting;

import java.util.Comparator;

public class SortByCost implements Comparator<watch> {

	@Override
	public int compare(watch x, watch y) {
		// TODO Auto-generated method stub
		return x.cost-y.cost;
	}

}
