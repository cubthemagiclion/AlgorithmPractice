package src;
import java.util.*;

public class twoSum {

	public twoSum() {
		// TODO Auto-generated constructor stub
	}
	
	  public static int[] twoNumberSum(int[] array, int targetSum) {
				int size = array.length;
				Hashtable<Integer, Integer> res = new Hashtable<>();
				
				for (int i = 0; i < size; i++) {
					res.put(targetSum - array[i], i);
				}
				for (int i = 0; i < size; i++) {
					if (res.get(array[i]) != null && res.get(array[i]) != -1
						 	&& res.get(array[i]) != i) {					
						res.replace(array[i], -1);
						return new int[] {array[i],targetSum - array[i]};
					}
				}
				return null;
	  }
	  
		public static void main(String[] args) {
			int[] array = {3, 5, -4, 8, 11, 1, -1, 6}; 
			int targetSum = 10;
			System.out.print(twoNumberSum(array, targetSum));

		}

}
