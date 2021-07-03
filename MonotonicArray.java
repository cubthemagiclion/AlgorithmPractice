
public class MonotonicArray {


	  public static boolean isMonotonic(int[] array) {
			if (array.length == 0 || array.length == 1)
				return true;
	    // Write your code here.
			boolean found_trend = false;
			boolean increasing = false;
			int i = 0;
			while (i < array.length - 1 && !found_trend){
					if (array[i] > array[i+1]) {
						found_trend = true;
					} 
					else if (array[i] < array[i+1]) {
						increasing = true;
						found_trend = true;
				} else
					i++; //if they are same value
			}
			
			if(increasing){
				while(i < array.length - 1 ) {
						if (array[i] > array[i+1]) {
							return false;
				}
					i++;
			}
			} else {
					while(i < array.length - 1 ) {
						if (array[i] < array[i+1]) {
							return false;
				}
						i++;
			}
			}
			
	    return true;
	  }
	  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MonotonicArray a = new MonotonicArray();
			int[] list = {1, 1, 2, 3, 4, 5};
			System.out.print(a.isMonotonic(list));

		}
}
