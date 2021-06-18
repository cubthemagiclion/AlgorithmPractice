package src;

import java.util.*;

public class MergeSortedArray {

	public MergeSortedArray() {
		// TODO Auto-generated constructor stub
	}
	
    public void merge(int[] n1, int m, int[] n2, int n) {
    	int totalLength = (m+n);
        int i = m + n - 1;
        int a = m - 1;
        int b = n - 1;

            while(a >= 0 && b >= 0){
            	if(n1[a] >= n2[b]) {
                    n1[i] = n1[a];
                    i--;a--;
                }else{
                    n1[i] = n2[b];
                    b--;i--;
                }
            }
            while(b >= 0){
                n1[i] = n2[b];
                b--;i--;
            }
  
        }
    

	public static void main(String[] args) {
		MergeSortedArray a = new MergeSortedArray();
		int[] b = new int[]{0};
		a.merge(b, 0, new int[]{1}, 1);
		for(int i : b)
			System.out.print(i);
		// TODO Auto-generated method stub

	}

}
