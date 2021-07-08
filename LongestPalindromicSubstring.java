
public class LongestPalindromicSubstring {

	public LongestPalindromicSubstring() {
		// TODO Auto-generated constructor stub
	}

	    public String longestPalindrome(String s) {
	    	if(s ==null||s=="" ) return "";
	         int resultLeft = 0;
	         int resultRight = -1;
	        //first we do odd cases
	        for (int i = 0; i < s.length(); i++) {
	            int left = i;
	            int right = i;
	            while (left >= 0 && right < s.length() && 
	                  s.charAt(left) == s.charAt(right)){
	            	if ((resultRight - resultLeft) < right - left + 1) {
	            		resultLeft = left;
	            		resultRight = right;
	            	}
	                left--;
	                right++;
	            }
	            left = i;
	            right = i + 1;
	            //then we do even cases
	            while (left >= 0 && right < s.length() && 
	                  s.charAt(left) == s.charAt(right)){
	            	if ((resultRight - resultLeft) < right - left + 1) {
	            		resultLeft = left;
	            		resultRight = right;
	            	}
	                left--;
	                right++;
	            }
	        }
	        return s.substring(resultLeft, resultRight + 1);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring a = new LongestPalindromicSubstring();
		String s = "babad";
		System.out.print(a.longestPalindrome(s));
	}

}
