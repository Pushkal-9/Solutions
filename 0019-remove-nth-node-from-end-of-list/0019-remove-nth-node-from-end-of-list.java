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
        int len =0 ;
        
        ListNode counter = head;
        
        while(counter!=null){
            len++;
            counter = counter.next;
        }
        
        counter=head;
        
        if(len-n==0){
            return head.next;
        }
        
        for(int i=0;i<len-n-1;i++){
            counter=counter.next;
        }
        counter.next=counter.next.next;
        
        return head;
    }
}