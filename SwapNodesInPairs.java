package src;

public class SwapNodesInPairs {

	public SwapNodesInPairs() {
		// TODO Auto-generated constructor stub
	}
    public ListNode swapPairs(ListNode head) {
        ListNode previous = new ListNode(-1);
        ListNode current = head;
        previous.next = current;
        ListNode ans = null;
        if(head == null || head.next == null)
            return head;
        ans = head.next;
         
        while(current != null){
            ListNode one = current;
            ListNode two = current.next;
            if(two == null)
                break;
            one.next = two.next;
            two.next = one;
            previous.next = two;
            previous = one;
            current =  one.next;
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
