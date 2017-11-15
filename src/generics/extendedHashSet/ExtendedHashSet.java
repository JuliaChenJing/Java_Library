package generics.extendedHashSet;

import java.util.Collection;
import java.util.HashSet;

@SuppressWarnings("serial")
public class ExtendedHashSet<T> extends HashSet<T> {
	//The number of attempted element insertions since its creation --
	//this value will not be modified when elements are removed
	private int count = 0;
	
	public ExtendedHashSet() {}
	
	@Override
	public boolean add(T a) {
		count++;
		return super.add(a);
	}
	
	@Override
	public boolean addAll(Collection<? extends T> c) {
		return super.addAll(c);
	}
	
	public int getAddCount() {
		return count;
	}
}
