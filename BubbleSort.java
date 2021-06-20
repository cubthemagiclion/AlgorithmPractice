package src;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}
	  public static int[] bubbleSort(int[] array) {
			int right = array.length - 1;
			while(right > 0){
				for(int i = 0; i < right; i++){
					if(array[i] > array[i+1])
						swap(i,i+1,array);
				}
				if(right > 0 && array[right] >= array[right-1])
					right--;
			}
	    return array;
	  }
		public static void swap(int i, int j, int[]array){
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	public static void main(String[] args) {
		BubbleSort a = new BubbleSort();
		int[] array = {8, 5, 2, 9, 5, 6, 3};
		int[] array2 = {-4,5,10,8,-10,-6,-4,-2,-5,3,5,-4,-5,-1,1,6,-7,-6,-7,8};
		array = a.bubbleSort(array2);
		for(int i:array)	
			System.out.print(i + " ");
		// TODO Auto-generated method stub

	}

}
