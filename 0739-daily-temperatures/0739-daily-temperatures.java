class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        Arrays.fill(res,0);
        for(int i=0;i<temperatures.length;i++){
            int val = temperatures[i];
            
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                while(!stack.isEmpty() && temperatures[stack.peek()]< val){
                    int index= stack.pop();
                    res[index]=i-index;
                }
                
                stack.push(i);
            }
        }
        
        return res;
    }
}