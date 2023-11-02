class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            String op = tokens[i];
            if(op.equals("+")){
                Integer second = stack.pop();
                Integer first = stack.pop();
                stack.push(first+second);
            }
            else if (op.equals("-")){
                Integer second = stack.pop();
                Integer first = stack.pop();
                stack.push(first-second);
            }
            else if(op.equals("*")){
                Integer second = stack.pop();
                Integer first = stack.pop();
                stack.push(first*second);
            }
            else if(op.equals("/")){
                Integer second = stack.pop();
                Integer first = stack.pop();
                stack.push(first/second);
            }
            else{
                Integer k = Integer.parseInt(op);
                stack.push(k);
            }
        }
        
        return stack.pop();
    }
}