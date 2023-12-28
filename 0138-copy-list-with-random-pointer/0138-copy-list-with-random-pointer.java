/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map1 = new HashMap<>();
        HashMap<Node,Node> map2 = new HashMap<>();
        
        Node newHead = new Node(-1);
        Node current = newHead;        

        while(head!=null){
            Node k = new Node(head.val);
            current.next=k;
            map1.put(head,k);
            map2.put(k,head);
            current = current.next;
            head=head.next;
        }
        
        current=newHead.next;
        
        while(current!=null){
            
            current.random = map1.get((map2.get(current)).random);
            current=current.next;
        }
        
        return newHead.next;
        
    }
}