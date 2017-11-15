package jUnitTest;

public class Min {
	
	public static void main(String[] args) {
		int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println("The minimum value in [2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22] is:" );
		System.out.println(""+min(arr));

	}
	/** Assumes that arrayOfInts is not null
	 *  and that length of arrayOfInts is > 0
	 */ 
	static int min(int[] arrayOfInts){
		int minSoFar = arrayOfInts[0];
		int len = arrayOfInts.length;
		for(int i = 1;  i < len; ++i){
			if(arrayOfInts[i]< minSoFar){
				minSoFar = arrayOfInts[i];
			}
		}
		return minSoFar;
	}


}
