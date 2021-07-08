	import java.util.*;
public class LongestPeak {

	public LongestPeak() {
		// TODO Auto-generated constructor stub
	}

	  public static int longestPeak(int[] array) {
			// Write your code here.
		if (array.length < 3)
			return 0;

		int result = 0;
		//find all the "peaks" 
		for (int i = 1; i + 1 < array.length; i++) {
			int left = array[i - 1];
			int right = array[i + 1];
			if (left < array[i] && array[i] > right) {
				int curPeakLength = searchPeakLength(i, array);
				result = curPeakLength > result ? curPeakLength : result; 
			}
		}

		return result;
}
	  public static int searchPeakLength(int i, int []array) {
		  int length = 3;
		  int left = i - 2;
		  int previousLeft = i - 1;
		  int right = i + 2;
		  int previousRight = i + 1;
		  while (left >= 0 && array[previousLeft] > array[left]) {
				  length++;
				  left--;
				  previousLeft--;
			  }
		  while (right <array.length && array[previousRight] > array[right]) {
			  length++;
			  right++;
			  previousRight++;
		  }
		  return length;
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
		LongestPeak a = new LongestPeak();
		System.out.print(a.longestPeak(array));

	}

}
