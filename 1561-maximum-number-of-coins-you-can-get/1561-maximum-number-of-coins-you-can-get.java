class Solution {
    public int maxCoins(int[] piles) {
        int n=piles.length;
        Arrays.sort(piles);
        
        int count=0;
        for(int i=0;i<n/3;i++){
            count=count+piles[n-2 -(2*i)];
        }
        
        return count;
    }
}
