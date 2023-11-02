class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int val = temperatures[i];
                while(!stack.isEmpty() && temperatures[stack.peek()]< val){
                    int index= stack.pop();
                    res[index]=i-index;
                }
                
                stack.push(i);
        }
        
        return res;
    }
}