package src;
import java.util.*;
public class MinimumWaitingTime {

	public MinimumWaitingTime() {
		// TODO Auto-generated constructor stub
	}
	
	  public int minimumWaitingTime(int[] queries) {
		  Arrays.sort(queries);
			int len = queries.length;
			if( len<2)
				return 0;
			int sum = 0;
			for(int i = 0; i < len-1; i++){
				sum += (len-i-1)*queries[i];
			}
	    // Write your code here.
	    return sum;
	  }
		

	public static void main(String[] args) {
		int[] queries = {3,2,1,2,6};
		MinimumWaitingTime a = new MinimumWaitingTime();
		System.out.print(a.minimumWaitingTime(queries));
		// TODO Auto-generated method stub

	}

}
