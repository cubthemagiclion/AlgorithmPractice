package src;
import java.util.*;
public class ImplementStackusingQueues {
	Queue<Integer> first = new LinkedList<>();
	Queue<Integer> second = new LinkedList<>();
	Queue<Integer> cur;
	Queue<Integer> other; 
    /** Initialize your data structure here. */
	public ImplementStackusingQueues() {
		this.cur = first; 
		this.other = second; 
		// TODO Auto-generated constructor stub
	}
	/*
    public MyStack() {
        
    }*/
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(other.isEmpty() && cur.isEmpty()) //if other is empty
        	cur.add(x);
        else {
        	while(!other.isEmpty())
        		cur.add(other.poll());
        	other.add(x);
        	//switch the pointers
        	cur = (cur == first) ? second : first;
        	other = (cur == first) ? second : first;
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int result = cur.poll();
    	if(!other.isEmpty())
    		cur.add(other.poll());
    	return result;
    }
    
    /** Get the top element. */
    public int top() {
        return cur.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return cur.isEmpty() && other.isEmpty();
    }
	public static void main(String[] args) {
		ImplementStackusingQueues a = new ImplementStackusingQueues();
		a.push(1);
		System.out.print(a.pop());
		System.out.print(a.empty());
		// TODO Auto-generated method stub

	}

}
