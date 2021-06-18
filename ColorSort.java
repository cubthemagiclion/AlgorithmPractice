package src;

public class ColorSort {

	
	    public void sortColors(int[] n) {
	        int l = 0;
	        int r = n.length - 1;
	        int i = 0;
	        while (i <= r){
	            if(n[i] == 1) {
	                i++;
	            }
	            else if(n[i] == 2){
	                swap(i, r, n);
	                r--;
	            }
	            else{
	                swap(i, l, n);
	                l++;
	                i++;
	            }
	        }
	        
	        /*
	        //solution 2
	        int numberOfZero = 0;
	        int numberOfOne = 0;
	        int numberOfTwo = 0;
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] == 0)
	                numberOfZero++;
	            else if (nums[i] == 1)
	                numberOfOne++;
	            else
	                numberOfTwo++;
	        }

	        for(int i = 0; i< numberOfZero; i++)
	            nums[i] = 0;
	        for(int i = numberOfZero; i< numberOfZero + numberOfOne; i++)
	            nums[i] = 1;
	        for(int i = numberOfZero + numberOfOne; i < numberOfZero + numberOfOne + numberOfTwo; i++)
	            nums[i] = 2;
	            */
	    }
	    
	    public void swap(int index, int index_two, int[] nums){
	        int temp = nums[index];
	        nums[index] = nums[index_two];
	        nums[index_two] = temp;
	    }
	    public static void main(String[] args) {
	    	ColorSort a = new ColorSort();
	    	int[] b = {2,0,2,1,1,0};
	    	a.sortColors(b);
	    	for(int i: b)
	    		System.out.print(i);
	        // code
	    }
	    
	}


