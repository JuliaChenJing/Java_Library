package oop.compare.overrideHashcode;

import java.time.LocalDate;
import java.util.HashMap;

public class App {
	public static void main(String[] args) {
		Person p1 = new Person("Joe", "Smith", 100000, LocalDate.of(1988, 5, 5));
		Person p2 = new Person("Anne", "Jones", 80000, LocalDate.of(1986, 3, 9));
		
		Pair key1 = new Pair(p1.getFirstName(), p1.getLastName());
		Pair key2 = new Pair(p2.getFirstName(), p2.getLastName());
		
		HashMap<Pair, Person> map = new HashMap<Pair, Person>();
		map.put(key1, p1);
		map.put(key2, p2);
		
		Pair lookup = new Pair("Joe", "Smith");
		System.out.println(lookup.equals(key1));
		System.out.println(map.containsKey(lookup));
		System.out.println(map.get(lookup));
		
	}

}

/*
false
false
null*/
