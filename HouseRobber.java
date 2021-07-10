
public class HouseRobber {

	public HouseRobber() {
		// TODO Auto-generated constructor stub
	}
    public int rob(int[] nums) {
    	int rob1 = 0, rob2 = 0;
    	for (int i : nums) {
    		int max = Math.max(rob1 + i, rob2);
    		 //the max so far
    		rob1 = rob2; 
    		rob2 = max;
    	}
    	return rob2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
