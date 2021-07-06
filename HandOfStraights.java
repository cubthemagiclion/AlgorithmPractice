import java.util.*;

public class HandOfStraights {

	public HandOfStraights() {
		// TODO Auto-generated constructor stub
	}
    public boolean isNStraightHand(int[] hand, int groupSize) {
    	if (hand.length % groupSize != 0)
    		return false;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i:hand) {
        	int count = hashMap.containsKey(i) ? hashMap.get(i) : 0;
        	hashMap.put(i, count + 1);
        }
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        hashMap.forEach((k, v) -> {
        	p.add(k);
        });
        
        while(!p.isEmpty()) {
        	//for each group
    		int curMin = p.peek();
        	for (int i = 0; i < groupSize; i++) {
        		if(!hashMap.containsKey(curMin))
        			return false;
            	hashMap.replace(curMin, hashMap.get(curMin) - 1);
            	if (hashMap.get(curMin) == 0) {
            		if(p.peek() == curMin)
            			p.poll();
            		else
            			return false;
            	}
            	curMin++;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,1,2,2,3,3};
		int n = 2;
		HandOfStraights a = new HandOfStraights();
		System.out.print(a.isNStraightHand(list, n));
	}

}
