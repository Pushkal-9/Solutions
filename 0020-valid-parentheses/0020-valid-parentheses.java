class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        int i=0;
        
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.size()==0){
                    return false;
                }
                char ch = stack.pop();
                if((ch=='{' && s.charAt(i)=='}') || (ch=='[' && s.charAt(i)==']') || (ch=='(' && s.charAt(i)==')')){
                    i++;
                    continue;                
                }
                else{ return false;}
            }
            i++;
        }
        
        if(stack.size()==0){
            return true;
        }
        
        return false;
    }
}