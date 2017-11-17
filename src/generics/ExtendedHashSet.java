package generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

@SuppressWarnings("serial")
public class ExtendedHashSet<T> extends HashSet<T> {

	public static void main(String[] args) {
		ExtendedHashSet<String> ehs = new ExtendedHashSet<>();
		ehs.add("A");
		ehs.add("B");
		ehs.add("C");
		System.out.println("Number of attempted adds so far (expected 3): " + ehs.getAddCount());
		ehs.remove("B");
		System.out.println("Number of attempted adds so far even after removal (expected 3): " + ehs.getAddCount());
		ehs.addAll(Arrays.asList("D", "E", "F"));
		System.out.println("Elements of current set: " + ehs);
		System.out.println("Number of attempted adds so far (expected 6): " + ehs.getAddCount());

	}

	// The number of attempted element insertions since its creation --
	// this value will not be modified when elements are removed
	private int count = 0;

	public ExtendedHashSet() {
	}

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
