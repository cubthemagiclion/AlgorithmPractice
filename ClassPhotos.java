package src;
import java.util.*;
public class ClassPhotos {

	public ClassPhotos() {
		// TODO Auto-generated constructor stub
	}
	
	  public boolean classPhotos(
		      ArrayList<Integer> r, ArrayList<Integer> b) {
				        Collections.sort(r);
				        Collections.sort(b);
				int sum = 0;
				int l = r.size();
				for(int i = 0; i < l; i++){
					if(b.get(i) > r.get(i))
						sum++;
					else if (b.get(i) < r.get(i))
						sum--;
				}
		    // Write your code here.
		    return (sum == l || sum == -l)? true : false;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
