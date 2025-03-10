package WatchSorting;

import java.util.Comparator;

public class SortByBrand implements Comparator<watch>{

	@Override
	public int compare(watch x, watch y) {
		// TODO Auto-generated method stub
		return x.Brand.compareTo(y.Brand);
	}

}
