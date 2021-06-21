package src;

public class LargestOddNumberInString {

	public LargestOddNumberInString() {
		// TODO Auto-generated constructor stub
	}
    public String largestOddNumber(String num) {
        String currentMax = "";
        String currentString = "";
        for(int i = num.length() - 1; i >= 0 ; i--){
            int cur = Integer.parseInt(num.charAt(i)+"");
            //if this is a even digit we just move on
            if(cur %2 == 0)
            	continue;
            //when we find a number that is not even we compare with currentMax
            currentString = num.substring(0, i + 1);
            if(compareString(currentString,currentMax)) {
            	currentMax = currentString;
            }
        }
        	return currentMax;
    }
    
    public boolean compareString(String a, String b) {
    	//return true if a's value is bigger than b
    	if(a.length() > b.length())
    		return true;
    	else if(a.length() < b.length())
    		return false;
    	for(int i = 0; i < a.length(); i ++) {
    		int digitOfA = Integer.parseInt(a.charAt(0)+"");
    		int digitOfB = Integer.parseInt(b.charAt(0)+"");
    		if(digitOfA > digitOfB)
    			return true;
    	}
    	return false;
    }
	public static void main(String[] args) {
		LargestOddNumberInString a = new LargestOddNumberInString();
		System.out.println(a.largestOddNumber("239537672423884969653287101"));
		String b = "62";
		int tests = Integer.parseInt(b.charAt(0)+"");
		System.out.print(tests);
	}

}
