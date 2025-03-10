package Sorting;

import java.util.Comparator;

public class SortByCost  implements Comparator<Bag>{

	@Override
	public int compare(Bag x, Bag y) {
		// TODO Auto-generated method stub
		return x.cost-y.cost;
	}

}
