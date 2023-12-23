class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int[] right = new int[prices.length];
        right[prices.length-1] = prices[prices.length-1];
        
        for(int i= prices.length-2;i>=0;i--){
            right[i] = Math.max(prices[i+1],right[i+1]);
        }
        
        for(int i=0;i<prices.length;i++){
            max=Math.max(max,right[i]-prices[i]);
        }
        
        
        return max;
    }
}