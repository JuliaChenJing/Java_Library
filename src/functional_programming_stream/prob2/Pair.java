package functional_programming_stream.prob2;

public class Pair {
	String name;
	double salary;
	public Pair(String n, double s) {
		name = n;
		salary = s;
	}
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Pair p = (Pair)ob;
		return name.equals(p.name) && salary == p.salary;
	}
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
}
