package src;
import java.util.*;
public class TandemBicycle {

	public TandemBicycle() {
		// TODO Auto-generated constructor stub
	}

	  public int tandemBicycle(int[] r, int[] b, boolean fastest) {
	    Arrays.sort(r);
			Arrays.sort(b);
			if(fastest)
				reverse(b);
			int sum = 0;
			for(int i = 0; i < r.length; i++){
				sum += Math.max(r[i],b[i]);
			}
	    return sum;
	  }
		
		public void reverse(int[] b){
			for(int i = 0; i < b.length/2; i++){
				int temp = b[i];
				b[i] = b[b.length - 1 - i];
				b[b.length - 1 - i] = temp;
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
