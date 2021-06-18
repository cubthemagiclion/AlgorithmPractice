package src;

public class Merge2SortedLists {

	public Merge2SortedLists() {
		// TODO Auto-generated constructor stub
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode head = new ListNode(0);
		ListNode current = head;
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				current.next = l1;
				l1 = l1.next;
			}else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}
		if(l1 != null)
			current.next = l1;
		else
			current.next = l2;
		
		return head.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
