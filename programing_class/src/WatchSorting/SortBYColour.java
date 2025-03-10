package WatchSorting;

import java.util.Comparator;

public class SortBYColour implements Comparator<watch>{

	@Override
	public int compare(watch x, watch y) {
		
		return x.colour.compareTo(y.colour);
	}

}
