class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        int i=0;
        
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
                System.out.println(s.charAt(i));
            }
            else{
                if(stack.size()==0){
                    return false;
                }
                char ch = stack.pop();
                                System.out.println(ch);
                if((ch=='{' && s.charAt(i)=='}')){
                                i++;

                    continue;                
                }
                else if((ch=='[' && s.charAt(i)==']')){
                                i++;

                    continue;                
                }
                else if((ch=='(' && s.charAt(i)==')')){
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