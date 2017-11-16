package oop.compare.overrideHashcode;

public class Pair {
	String first;
	String second;

	public Pair(String f, String s) {
		first = f;
		second = s;
	}
	//if below does not exist, answer will be false false null
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (ob.getClass() != getClass())
			return false;
		Pair p = (Pair) ob;
		return p.first.equals(first) && p.second.equals(second);
	}
	
	//if below does not exist, answer will be true false null
	 public int hashCode() {
	 int result = 17; // seed
	 int hashFirst = first.hashCode();
	 int hashSecond = second.hashCode();
	 result += 31 * result + hashFirst;
	 result += 31 * result + hashSecond;
	 return result;
	 }

}


