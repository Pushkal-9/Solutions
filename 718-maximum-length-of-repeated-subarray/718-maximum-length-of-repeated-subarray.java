class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int max=0;
        int m=nums1.length;
        int n=nums2.length;
        int[][]dp=new int[m+1][n+1];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]){
                    dp[i+1][j+1]=dp[i][j]+1;
                }
                max=Math.max(dp[i+1][j+1],max);
            }
        }
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         int t=0;
        //         int k=i,l=j;
        //         while(k<nums1.length && l<nums2.length && nums1[k]==nums2[l]){
        //             t++;
        //             k++;
        //             l++;
        //         }
        //         max=Math.max(max,t);
        //     }
        // }
        
        
        return max;
    }
}