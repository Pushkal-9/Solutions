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
       HashMap<Node,Node> map = new HashMap<>();
        Node current = head;
        Node newHead =new Node(-1);
        Node newCurrent = newHead;
        while(current!=null){
            Node node = new Node(current.val);
            newCurrent.next = node;
            map.put(current,node);
            current=current.next;
            newCurrent=newCurrent.next;
        }
        
        newCurrent=newHead.next;
        current=head;
        while(current!=null){
            newCurrent.random = map.get(current.random);
            current=current.next;
            newCurrent=newCurrent.next;
        }
        
        return newHead.next;
    }
}