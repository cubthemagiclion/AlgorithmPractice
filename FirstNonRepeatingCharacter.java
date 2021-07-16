import java.util.*;

public class FirstNonRepeatingCharacter {

	public FirstNonRepeatingCharacter() {
		// TODO Auto-generated constructor stub
	}
	
	  public int firstNonRepeatingCharacter(String string) {
			HashMap<Character, Integer> t = new HashMap<Character, Integer>();
			for (int i = 0; i < string.length(); i++) {
				char c = string.charAt(i);
				if (t.containsKey(c)) {
					t.replace(c, -1);
				} else
					t.put(c, i);
			}
			int min = Integer.MAX_VALUE;
	for (Map.Entry<Character, Integer> entry : t.entrySet()) {
			Integer index = entry.getValue();
	    if(index != -1)
				min = min < index ? min : index;
	  }
	//remember to check the -1 situation
			return min == Integer.MAX_VALUE ? -1 : min;
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
