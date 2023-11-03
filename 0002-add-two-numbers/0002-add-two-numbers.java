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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1);
        ListNode current = head;
        int carry=0;
        while(l1!=null && l2!=null){
            ListNode node = new ListNode((carry+l1.val+l2.val)%10);
            carry=(carry+l1.val+l2.val)/10;
            current.next=node;
            current=current.next;
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!=null){
            ListNode node = new ListNode((carry+l1.val)%10);
            carry=(carry+l1.val)/10;
            current.next=node;
            current=current.next;
            l1=l1.next;
        }
        
        while(l2!=null){
            ListNode node = new ListNode((carry+l2.val)%10);
            carry=(carry+l2.val)/10;
            current.next=node;
            current=current.next;
            l2=l2.next;
        }
        
        if(carry!=0){
            ListNode node = new ListNode((carry)%10);
            current.next=node;
            current=current.next;
        }
        
        return head.next;
        
    }
}