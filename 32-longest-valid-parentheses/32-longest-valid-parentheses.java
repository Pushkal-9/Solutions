class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character>stack=new Stack<>();
        Stack<Integer>stack2=new Stack<>();
        int n=s.length();
        int max=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty() && stack.peek()=='(' && ch==')'){
                stack.pop();
                stack2.pop();
            }
            else{
                stack.push(ch);
                stack2.push(i+1);
            }
        }
        if(stack2.isEmpty()){
            return n;
        }
        int prev=n+1;
        while(!stack2.isEmpty()){
            int k=stack2.pop();
            max=Math.max(max,prev-k-1);
            prev=k;
        }
        
        max=Math.max(max,prev-1);
        return max;
    }
}