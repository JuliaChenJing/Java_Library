package generics.mergeIt;

import java.util.Comparator;

public class NumComparator implements Comparator<Number>{

	@Override
	public int compare(Number o1, Number o2) {
	
		return o1.intValue()-o2.intValue();
	}

}
