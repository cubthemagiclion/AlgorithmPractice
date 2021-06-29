package src;
import java.util.*;

public class TrappingRainWater {

	public TrappingRainWater() {
		// TODO Auto-generated constructor stub
	}
	
    public int trap(int[] height) {
        if (height.length == 0)
            return 0;
        int left = 0;
        int right = height.length - 1;
        int sum = 0;
        int left_max_value = height[left];
        int right_max_value = height[right];
        while(left <= right) {
        	if (left_max_value < right_max_value) {
        		//if left is smaller
        		if(left_max_value - height[left] > 0)
        			sum += left_max_value - height[left];
        		if (height[left] > left_max_value)
        			left_max_value = height[left];
        		left++;
        	} else {
        		if(right_max_value - height[right] > 0)
        			sum += right_max_value - height[right];
        		if (height[right] > right_max_value)
        			right_max_value = height[right];
        		right--;
        	}
        }
        
        return sum;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrappingRainWater a = new TrappingRainWater();
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.print(a.trap(height));

	}

}
