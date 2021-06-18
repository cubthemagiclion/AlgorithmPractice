package src;

public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}
	
	  public static int binarySearch(int[] array, int target) {
			int left = 0;
			int right = array.length - 1;
			int midpoint = (left + right)/2;
			while(left < right){
				int curVal = array[midpoint];
				if(target == curVal)
					return midpoint;
				if(target > curVal){
					left = midpoint + 1;
					midpoint = (left + right + 1)/2;
				}else{
					right = midpoint;
					midpoint = (left + right)/2;
				}
			}
			
	    // Write your code here.
	    return -1;
	  }

	public static void main(String[] args) {
		int[] a = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73, 355};
		BinarySearch b = new BinarySearch();
		
		System.out.print(b.binarySearch(a, 355));

		// TODO Auto-generated method stub

	}

}
