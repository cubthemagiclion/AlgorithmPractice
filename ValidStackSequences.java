import java.util.*;
public class ValidStackSequences {

	public ValidStackSequences() {
		// TODO Auto-generated constructor stub
	}
    public boolean validateStackSequences(int[] pushed, int[] popped) 
    {
        Stack<Integer> s = new Stack<>();
        int indexPopped = 0;
        for(int cur:pushed)
        {
            s.push(cur);
            while (indexPopped < popped.length && !s.isEmpty() && s.peek() == popped[indexPopped]) {
            	s.pop();
            	indexPopped++;
            }
        }
        return s.isEmpty() ? true : false;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidStackSequences a = new ValidStackSequences();
		int[] pushed = {1,2,3,4,5};
		int[] poped = {4,5,3,2,1};
		System.out.print(a.validateStackSequences(pushed, poped));

	}

}
