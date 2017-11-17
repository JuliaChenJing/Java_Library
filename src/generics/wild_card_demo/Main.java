package generics.wild_card_demo;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Manager> list1 = new ArrayList<>();
		list1.add(new Manager("Joe", 110000, 2002, 1, 15));
		//List<Employee> list2 = list1;  //compiler error
		List<? extends Employee> list2 = list1;
		
		List<? super Integer> list = new ArrayList();
		Object o = list.get(0);
		
		

	}

}
