import java.util.*;

public class ExpressiveWords {

	public ExpressiveWords() {
		// TODO Auto-generated constructor stub
	}
    public int expressiveWords(String s, String[] words) {
    	int count = 0;
    	for (String currentWord:words) {
    		if(checked(s, currentWord))
    			count++;
    	}
    	return count;
    }
    
    private boolean checked (String s, String word) {
    	//only return false if the difference of frequency is -1 or 1.
    	int indexOfWord = 0;
    	int indexOfS = 0;
    	while (indexOfWord < word.length()) {
    		int curWordCount = 1;
    		char curWordChar = word.charAt(indexOfWord);
    		while (indexOfWord + 1 < word.length() && 
    				word.charAt(indexOfWord + 1) == curWordChar) {
    			curWordCount++;
    			indexOfWord++;
    		}
    		int sameCharCount = 0;
    		while (indexOfS < s.length() && s.charAt(indexOfS) == curWordChar) {
    			sameCharCount++;
    			indexOfS++;
    		}
			indexOfWord++;
    		if (sameCharCount - curWordCount == 0 ||
    				(sameCharCount >= 3 && curWordCount <= sameCharCount))
    			continue;
    		else
    			return false;
    	}
    	if(indexOfS < s.length())
    		return false;
    	return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressiveWords a = new ExpressiveWords();
		String s = "dddiiiinnssssssoooo";
		String[] words ={"dinnssoo","ddinso","ddiinnso","ddiinnssoo","ddiinso","dinsoo","ddiinsso","dinssoo","dinso"};
		System.out.print(a.expressiveWords(s, words));
	}

}
