	import java.util.*;
public class MergeOverlappingIntervals {

	public MergeOverlappingIntervals() {
		// TODO Auto-generated constructor stub
	}



	  public int[][] mergeOverlappingIntervals(int[][] intervals) {
	    // Write your code here.
			int n = intervals.length;
			int[] beginning = new int[n];
			int[] ending = new int[n];
			for(int i = 0; i < n; i++) {
				int[] each = intervals[i];
				beginning[i] = each[0];
				ending[i] = each[1];
			}
			Arrays.sort(beginning);
			Arrays.sort(ending);
			List<int[]> res = new ArrayList<>();
			int a = 1; int b = 1;
			int cur_beginning = beginning[0];
			int cur_ending = ending[0];
			while(a < n && b < n) {
				if(beginning[a] <= cur_ending) {
					//merge
					cur_ending = ending[b];
				} else {
					res.add(new int[]{cur_beginning, cur_ending});
					cur_beginning = beginning[a];
					cur_ending = ending[b];
				}
					a++;b++;
			}
			res.add(new int[]{cur_beginning, cur_ending});
	        int[][] itemsArray = new int[res.size()][];
	        itemsArray = res.toArray(itemsArray);
	    return itemsArray;
	  }
	

	public static void main(String[] args) {
		int[][] a = {{1,2},{3,5},{4,7},{6,8},{9,10}};
		MergeOverlappingIntervals b = new MergeOverlappingIntervals();
		int[][] res = b.mergeOverlappingIntervals(a);
		for(int[] i : res) {
			System.out.println(i[0] +" " + i[1]);
		}
	}
		// TODO Auto-generated method stub

	
}

