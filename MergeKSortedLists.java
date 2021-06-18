package src;

import java.util.*;

/*
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

Example 1:
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:
Input: lists = []
Output: []

Example 3:
Input: lists = [[]]
Output: []
 */
public class MergeKSortedLists {

	public MergeKSortedLists() {
		// TODO Auto-generated constructor stub
	}
    public static ListNode mergeKLists(ListNode[] lists) {

    	ListNode head = new ListNode(0);
    	ListNode cur = head;

        PriorityQueue<ListNode> a= new PriorityQueue<ListNode>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                if (o1.val<o2.val)
                    return -1;
                else if (o1.val==o2.val)
                    return 0;
                else 
                    return 1;
            }
        });
    	for(ListNode i : lists){
            if (i!=null)
                a.add(i);
        }

    	while(!a.isEmpty()) {
    		ListNode temp = a.poll();
    		cur.next = temp;
    		if(temp.next != null)
    			a.add(temp.next);
    		cur = cur.next;
    	}

		    return head.next;
    }
    
    

	public static void main(String[] args) {
		// [[1,4,5],[1,3,4],[2,6]]
		ListNode head1 = new ListNode(1);
		ListNode one_two = new ListNode(4);
		head1.next = one_two;
		ListNode one_three = new ListNode(5);one_two.next = one_three; one_three.next = null;
		
		ListNode head2 = new ListNode(1);
		ListNode two_two = new ListNode(3);
		head2.next = two_two;
		ListNode two_three = new ListNode(4);
		two_two.next = two_three; two_three.next = null;
		
		ListNode head3 = new ListNode(2);
		ListNode three_two = new ListNode(6);
		head3.next = three_two; three_two.next = null;
		ListNode[] lists = new ListNode[3];
		lists[0] = head1;
		lists[1] = head2;
		lists[2] = head3;
		
		ListNode finals = null;
		finals = mergeKLists(lists);
		
		ListNode curr = finals;
		while(curr!=null) {
			System.out.println(curr.val);
			curr = curr.next;
		}

	}

}
