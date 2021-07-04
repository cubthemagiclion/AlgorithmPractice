import java.util.*;

public class LeetCode1438LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimit {

	public LeetCode1438LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimit() {
		// TODO Auto-generated constructor stub
		
	}
    public int longestSubarray(int[] nums, int limit) {
        //corner cases
        int left = 0;
        int right = 0;
        int currentMaxSize = 0;
        ArrayDeque<Integer> min = new ArrayDeque<Integer>();
        ArrayDeque<Integer> max = new ArrayDeque<Integer>();
        while (right < nums.length) {
        	int NewRight = nums[right];
        	while (!max.isEmpty() && NewRight > max.getLast()) {
        		max.pollLast();
        	} 
        	while (!min.isEmpty() && NewRight < min.getLast()) {
        		min.pollLast();
        	} 
        		max.addLast(NewRight);
        		min.addLast(NewRight);
        	
        	while (left <= right && Math.abs(max.getFirst() - min.getFirst()) > limit ) {
        		if (nums[left] == max.getFirst()) max.removeFirst();
        		if (nums[left] == min.getFirst()) min.removeFirst();
        		left++;
        	}
        	currentMaxSize = currentMaxSize > (right - left + 1) ? currentMaxSize : (right - left + 1);
        	right++;
        }

        return currentMaxSize;
    }
	public static void main(String[] args) {
		int[] b = {2,2,2,4,4,2,5,5,5,5,5,2};
		int limit = 2;
		LeetCode1438LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimit a = new LeetCode1438LongestContinuousSubarrayWithAbsoluteDiffLessThanorEqualtoLimit();
		System.out.print(a.longestSubarray(b, limit));
		// TODO Auto-generated method stub

	}

}
