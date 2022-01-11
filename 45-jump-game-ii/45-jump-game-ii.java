class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        
        for(int i=1;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<i;j++){
                if(nums[j]>=i-j){
                    min=Math.min(min,dp[j]+1);
                }
            }
            dp[i]=min;
        }
        
        return dp[n-1];
    }
}