package JUnitTest.test_duplicates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDupsClass {
		public static String[] removeDups(String[] array) {
			Map<String, String> map = new HashMap<>();
			for(String str: array){
				if(!map.containsKey(str))
					map.put(str, str);
			}
			return map.keySet().toArray(new String[map.keySet().size()]);
		}
		
		public static void main(String[] args) {
			String[] arr = {"horse", "boy", "horse", "boy", "boy"};
			String[] result = removeDups(arr);
			System.out.println(Arrays.toString(result));
		}
	
}
