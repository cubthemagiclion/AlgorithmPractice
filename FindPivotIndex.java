
public class FindPivotIndex {

	public FindPivotIndex() {
		// TODO Auto-generated constructor stub
	}

	    public int pivotIndex(int[] nums) {
	    	//O(n) time & O(n) space.
	        int[] rightSum = new int[nums.length];

	        int pre = 0;
	        for (int i = nums.length - 1; i >= 0; i--) {
	            rightSum[i] = pre;
	            pre += nums[i];
	        }
	        pre = 0;
	        for (int i = 0; i < nums.length; i++) {
	            rightSum[i] -= pre;
	            if (rightSum[i] == 0)
	                return i;
	            pre += nums[i];
	        }

	        return -1;

	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
