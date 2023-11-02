class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<operations.length;i++){
            String o = operations[i];
            if(o.equals("+")){
                Integer first = stack.pop();
                Integer second = stack.peek();
                Integer score = first + second;
                stack.push(first);
                stack.push(score);
            }
            else if (o.equals("D")){
                Integer old = stack.peek();
                Integer score = 2 * old;
                stack.push(score);
            }
            else if(o.equals("C")){
                stack.pop();
            }
            else{
                Integer score = Integer.parseInt(o);
                stack.push(score);
            }
        }
        
        int total = 0;
        
        while(!stack.isEmpty()){
            total=total+stack.pop();
        }
        
        return total;
    }
}