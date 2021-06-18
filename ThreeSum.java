package src;
import java.util.*;
public class ThreeSum {

	public ThreeSum() {
		// TODO Auto-generated constructor stub
	}
	
	  public static List<Integer[]> threeNumberSum(int[] n, int target) {
	    // Write your code here.
			Arrays.sort(n);
			ArrayList<Integer[]> res = new ArrayList<Integer[]>();
			if(n.length < 3)
				return res;
			for(int i = 0 ; i < n.length - 2; i++){
				int l = i + 1;
				int r = n.length - 1;
				int t = target - n[i];
				while(l < r){
					int sum = n[l] + n[r];
					if(sum > t)
						r--;
					else if (sum < t)
						l++;
						else{
							Integer[] rr = {(n[i]),(n[l]),(n[r])};
							res.add(rr);
							l++;r--;
						}

				}
			}
	    return res;
	  }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
