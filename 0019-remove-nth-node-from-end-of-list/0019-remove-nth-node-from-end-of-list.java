/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = new ListNode(-1);
        current.next=head;
        int size = 0;

        ListNode k = head;
        while(k!=null){
            size=size+1;
            k=k.next;
        }
        

        int p = size-n;
        
        if(p==0){
            return head.next;
        }
        
        while(p>0){
            current = current.next;
            p--;
        }
        
        current.next = current.next.next;
        
        return head;
    }
}