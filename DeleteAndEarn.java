import java.util.*;
public class DeleteAndEarn {

	public DeleteAndEarn() {
		// TODO Auto-generated constructor stub
	}
    public int deleteAndEarn(int[] nums) {
        int[] allPossibleNumbers = new int[10001];
        for (int i : nums) {
        	allPossibleNumbers[i]++;
        }
        //in real interview, remember to ask if we can change in place.
        return rob(allPossibleNumbers);

    }
    
    public int rob(int[]nums) {
    	int rob1 = 0;
    	int rob2 = 0;
    	for (int i = 0; i < nums.length; i++) {
    		int max = Math.max(rob1 + nums[i]*i, rob2);
    		rob1 = rob2;
    		rob2 = max;
    	}
    	return rob2;
    }
	public static void main(String[] args) {
		int[] sample = {3,4,2};
		
		// TODO Auto-generated method stub
		DeleteAndEarn a = new DeleteAndEarn();
		System.out.print(a.deleteAndEarn(sample));
	}

}
