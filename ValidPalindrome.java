package src;

public class ValidPalindrome {

	public ValidPalindrome() {
		// TODO Auto-generated constructor stub
	}

	    public boolean isPalindrome(String s) {
	        int l = 0;
	        int r = s.length() - 1;
	        while(l < r){
	            if(!(Character.isLetter(s.charAt(l)) 
	            		|| Character.isDigit(s.charAt(l)))){
	                l++; continue;
	            }
	            if(!(Character.isLetter(s.charAt(r)) 
	            		|| Character.isDigit(s.charAt(r)))){
	                r--; continue;
	            }
	        char left = s.charAt(l);
	        char right = s.charAt(r);    
	        left = Character.toLowerCase(left);
	        right = Character.toLowerCase(right);  
	        if(!(left == right))
	            return false;
	        l++;
	        r--;
	        }

	            return true;
	    }
	

	public static void main(String[] args) {
		ValidPalindrome a = new ValidPalindrome();
		System.out.print(a.isPalindrome("race a car"));
		// TODO Auto-generated method stub

	}

}
