class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;

        for(int i=0;i<operations.length;i++){
            String o = operations[i];
            if(o.equals("+")){
                Integer first = stack.pop();
                Integer score = first + stack.peek();
                stack.push(first);
                stack.push(score);
                total = total +score;
            }
            else if (o.equals("D")){
                Integer score = 2 * stack.peek();
                stack.push(score);
                total = total + score;
                
            }
            else if(o.equals("C")){
                total = total - stack.pop();
            }
            else{
                stack.push(Integer.parseInt(o));
                total = total + Integer.parseInt(o);
            }
        }
        
        return total;
    }
}