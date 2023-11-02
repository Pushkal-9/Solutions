class MyStack {
    int top;
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
        this.top=-1;
    }
    
    public void push(int x) {
        if(!q2.isEmpty()){
            q2.add(x);
        }
        else{
            q1.add(x);
        }
        this.top = x;
    }
    
    public int pop() {
        
        if(q1.isEmpty()){
            while(q2.size()!=1){
                this.top = q2.poll();
                q1.add(this.top);
            }
            
            return q2.poll();
        }
        else {
            while(q1.size()!=1){
                this.top = q1.poll();
                q2.add(this.top);
            }

            return q1.poll();
        }
        
    }
    
    public int top() {
        return this.top;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */