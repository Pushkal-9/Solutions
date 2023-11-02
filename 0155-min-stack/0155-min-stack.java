class MinStack {
    Node head;

    public MinStack() {
        this.head = null;
    }
    
    public void push(int val) {
        if(head==null){
            Node node = new Node(val,val);
            head =node;
            }
        else{
            Node node = new Node(val,Math.min(val,head.min));
            node.next = head;
            this.head = node;
        }
    }
    
    public void pop() {
        this.head=head.next;
    }
    
    public int top() {
        return this.head.val;
    }
    
    public int getMin() {
        return this.head.min;
    }
    
    public class Node{
        int val;
        int min;
        Node next;
        public Node(int val,int min){
            this.val=val;
            this.min=min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */