class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int m=aliceSizes.length;
        int n=bobSizes.length;
        
        int bobCandies=0;
        int aliceCandies=0;
        
        for(int i=0;i<m;i++){
            aliceCandies=aliceCandies+aliceSizes[i];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            bobCandies=bobCandies+bobSizes[i];
            
            map.put(bobSizes[i],i);
        }
        
        int dif=(aliceCandies-bobCandies)/2;
        
        int[]res=new int[2];
        for(int i=0;i<m;i++){
            if(map.containsKey(aliceSizes[i]-dif)){
                res[0]=aliceSizes[i];
                res[1]=aliceSizes[i]-dif;
            }
        }
        
        return res;
    }
}
