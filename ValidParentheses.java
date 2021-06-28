package src;
import java.util.*;
public class ValidParentheses {

	public ValidParentheses() {
		// TODO Auto-generated constructor stub
	}
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(cur == '(')
                ss.push(')');
            else if(cur == '{')
                ss.push('}');
            else if(cur == '[')
                ss.push(']');
            else{
                if(!(cur == ss.pop()))
                    return false;
            }
            }
        return true;
            
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses a = new ValidParentheses();
		System.out.print(a.isValid("{[[]]]}"));

	}

}
