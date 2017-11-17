package generics.Merge.teacher_answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestMain {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10, 11, 12);
		List<String> strlist1 = Arrays.asList("bob", "bill","joseph");
		List<String> strlist2 = Arrays.asList("anita", "cindy","joe");
		System.out.println(GenericMerge_V1.merge1(list1, list2));
//		System.out.println(GenericMerge_V1.merge1(strlist1, strlist2));
		
		BiComparator<Integer, String> bc=new BiComparator<Integer, String>() {
			
			@Override
			public int compare(Integer t, String s) {
				
				return t.compareTo(s.length());
			}
		};
		System.out.println(GenericMerge_V3.merge1(list1, strlist1, bc));
		
		List<Manager> managerList = new ArrayList<Manager>(){
			{
				add(new Manager("andy", 3000));
				add(new Manager("charlie", 3000));
				add(new Manager("Riwaj", 3000));
			}
		};
	}

}
