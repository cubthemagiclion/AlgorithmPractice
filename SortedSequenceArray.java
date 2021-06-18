package src;
import java.util.*;

public class SortedSequenceArray {

	public SortedSequenceArray() {
		// TODO Auto-generated constructor stub
	}
	
	  public int[] sortedSquaredArray(int[] array) {
		  int[] res = new int[array.length];
		  int left = 0;
		  int right = array.length - 1;
		  int resLeft = 0;
		  int resRight = right;
		  while (left <= right) {
			  int leftAbs = Math.abs(array[left]);
			  int rightAbs = Math.abs(array[right]);
			  if (leftAbs > rightAbs) {
				  res[resRight] = array[left] * array[left];
				  resRight--;
				  left++;
			  } else {
				  res[resRight] = array[right] * array[right];
				  resRight--;
				  right--;
			  }
		  }

		    // Write your code here.
		    return res;
		  }
	  

	public static void main(String[] args) {
		SortedSequenceArray a = new SortedSequenceArray();
		int[] b = new int[] {-3, -2, -1};  
		for (int j : a.sortedSquaredArray(b))
			System.out.println(j);
		// TODO Auto-generated method stub

	}

}
