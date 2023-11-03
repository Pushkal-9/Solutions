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
    public void reorderList(ListNode head) {
        ListNode newHead = null;
        ListNode slow = head;
        ListNode fast = head;
        
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow = reverse(slow);
        ListNode current=head;
        int i=0;
        ListNode next=null;
        while(current!=null && slow!=null){
            if(i%2==0){
                next=current.next;
                current.next=slow;
                current=current.next;
                slow=slow.next;
                }
            else{
                current.next=next;
                current=current.next;
            }
            i++;
        }
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next =null;
        
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        
        return prev;
    }
}