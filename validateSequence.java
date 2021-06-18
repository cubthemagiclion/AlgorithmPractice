package src;
import java.util.*;
public class validateSequence {

	public validateSequence() {}

		// TODO Auto-generated constructor stub
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
			int i = 0;
			int j = 0;
			while(i < array.size() && j < sequence.size()){
				if (array.get(i) == sequence.get(j)) {
					i++; j++;
				} else 
					i++;
			}
			// Write your code here.
		if (sequence.size() == j)
			return true;
		else
			return false;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
