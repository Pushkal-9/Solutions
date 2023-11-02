class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            String op = tokens[i];
            
            if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")){
                Integer second = stack.pop();
                //System.out.println(second +" " + stack.size());
                Integer first = stack.pop();
                //System.out.println(first);
                
                if(op.equals("+")){
                    stack.push(first+second);
                }
                else if (op.equals("-")){
                    stack.push(first-second);
                }
                else if(op.equals("*")){
                    stack.push(first*second);
                }
                else if(op.equals("/")){
                    stack.push(first/second);
                }
            }
            else{
                Integer k = Integer.parseInt(op);
                stack.push(k);
            }
        }
        
        return stack.pop();
    }
}