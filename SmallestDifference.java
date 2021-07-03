import java.util.*;
public class SmallestDifference {

	public SmallestDifference() {
		// TODO Auto-generated constructor stub
	}
	  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		    // Write your code here.
				Arrays.sort(arrayOne);
				Arrays.sort(arrayTwo);
				int min = Integer.MAX_VALUE;
				int[] res = {-1, -1};
				int i = 0;
				int j = 0;
				while (i < arrayOne.length && j < arrayTwo.length){
					int currentDifference = Math.abs(arrayOne[i] - arrayTwo[j]);
					int valueOfOne = arrayOne[i];
					int valueOfTwo = arrayTwo[j];
					//if current difference is smaller than the minimum we find so far
					if(currentDifference < min){
						min = currentDifference;
						res[0] = valueOfOne;
						res[1] = valueOfTwo;
					}
					//if left is smaller than right
					if(valueOfOne < valueOfTwo)
						i++;
					else if (valueOfTwo < valueOfOne)
						j++;
					else{
						return new int[]{valueOfOne, valueOfTwo};
					}
				}
		    return res;
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
