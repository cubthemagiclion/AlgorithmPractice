
public class MaximumPointsYouCanObtainFromCards {

	public MaximumPointsYouCanObtainFromCards() {
		// TODO Auto-generated constructor stub
	}
    public int maxScore2(int[] cardPoints, int k) {
    	//old solution, 2ms.
        int [] newCards = new int[2*k];
        for (int i = k - 1; i >= 0; i--){
            newCards[k - 1 - i] = cardPoints[i];
        }
        
        for (int i = cardPoints.length - 1; i > cardPoints.length - 1 - k; i--){
            newCards[cardPoints.length - 1 - i + k] = cardPoints[i];
        }
        int biggestSum = 0;
        int left = 0;
        int right = k - 1;
        int curSum = 0;
        while (right < newCards.length){
            if (right == k - 1) {
            	while (left <= right) {
                curSum += newCards[left];
                left++;
            	}
            	left = right - k + 1;
            } else {
            	curSum += newCards[right];
            	curSum -= newCards[left - 1];
            	}
            biggestSum = curSum > biggestSum ? curSum : biggestSum;
            right++;
            left++; 
        }
        return biggestSum;
    }
	
    public int maxScore(int[] cardPoints, int k) {
    	//optimized solution 1ms
    	int right = cardPoints.length - k;
    	int curSum = 0;
    	for (int i = right; i < cardPoints.length; i++)
    		curSum+= cardPoints[i];
    	int curMax = curSum;
    	int left = 0;
    	right++;
    	while (left < k) {
    		curSum-= cardPoints[right - 1];
    		curSum+= cardPoints[left];
    		curMax = curMax > curSum ? curMax : curSum;
    		left++; right++;
    	}
    	return curMax;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cardPoints = {96,90,41,82,39,74,64,50,30};
				
		int k = 8;
		MaximumPointsYouCanObtainFromCards a = new MaximumPointsYouCanObtainFromCards();
		System.out.print(a.maxScore(cardPoints, k));
	}

}
