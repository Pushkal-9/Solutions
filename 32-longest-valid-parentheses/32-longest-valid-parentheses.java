class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>stack=new Stack<>();
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty() && s.charAt(stack.peek()-1)=='(' && ch==')'){
                stack.pop();
            }
            else{
                stack.push(i+1);
            }
        }
        if(stack.isEmpty()){
            return n;
        }
        int prev=n+1;
        while(!stack.isEmpty()){
            int k=stack.pop();
            max=Math.max(max,prev-k-1);
            prev=k;
        }
        
        max=Math.max(max,prev-1);
        return max;
    }
}